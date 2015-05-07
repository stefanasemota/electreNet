package ch.albertlegrand.business.utility;

import org.apache.log4j.Logger;

import javax.el.ValueExpression;
import javax.faces.FactoryFinder;
import javax.faces.component.UIComponent;
import javax.faces.component.UIForm;
import javax.faces.context.FacesContext;
import javax.faces.context.ResponseWriter;
import javax.faces.render.RenderKit;
import javax.faces.render.RenderKitFactory;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:07
 */
public class ApplicationFacesUtils {

    private static final Logger LOGGER = Logger.getLogger(ApplicationFacesUtils.class);

    /**
     * Used the FacesContext.getCurrentInstance() to get a bean
     *
     * @param object backing bean
     */
    public static Object getBackingBean(Object object) {
        FacesContext facesContext = FacesContext.getCurrentInstance();
        ValueExpression ve = facesContext.getApplication().getExpressionFactory().createValueExpression(facesContext.getELContext(), "#{" + object + "}", Object.class);
        return ve.getValue(facesContext.getELContext());
    }

    /**
     * This function looks up a BusinessController InterfaceBC implementation
     * from the spring configuration.
     *
     * @param cAClass BusinessController Interface Class
     * @return Instantiated Business Controller Implementation
     */
    public static Object getBusinessController(Class<?> cAClass) {
        Object returnValue = ApplicationContextProvider.getBean(cAClass.getName());
        return returnValue;

    }

    public static ResponseWriter setupResponseWriter(FacesContext context) throws IOException {

        ResponseWriter writer = context.getResponseWriter();
        if (writer == null) {
            HttpServletRequest request = (HttpServletRequest)
                    context.getExternalContext().getRequest();
            HttpServletResponse response = (HttpServletResponse)
                    context.getExternalContext().getResponse();

            RenderKitFactory renderFactory = (RenderKitFactory)
                    FactoryFinder.getFactory(FactoryFinder.RENDER_KIT_FACTORY);
            RenderKit renderKit = renderFactory.getRenderKit(context, context.getViewRoot().getRenderKitId());

            writer = renderKit.createResponseWriter(response.getWriter(), "text/html", request.getCharacterEncoding());
            context.setResponseWriter(writer);
        }

        return writer;
    }

    public static UIForm getForm(FacesContext context, UIComponent component) {

        //Try to get a containing form
        List<UIForm> forms = new ArrayList<UIForm>();
        findSubForms(context, component, forms);

        if (forms.isEmpty()) {
            //We have not found any sub forms inside this component, therefore we need
            //search for any parent forms.
            UIComponent parent = component.getParent();
            while (parent != null) {
                if (parent instanceof UIForm) {
                    break;
                }
                parent = parent.getParent();
            }
            if (parent != null) {
                forms.add((UIForm) parent);
            }
        }

        if (forms.isEmpty()) {
            return null;
        } else {
            return forms.get(0);
        }
    }

    private static void findSubForms(FacesContext context, UIComponent component, List<UIForm> forms) {
        List<UIComponent> children = component.getChildren();
        for (UIComponent comp : children) {
            if (comp instanceof UIForm) {
                forms.add((UIForm) comp);
            }
            findSubForms(context, comp, forms);
        }
    }

    public static void encodeRecursive(FacesContext context, UIComponent component) throws IOException {
        if (!component.isRendered()) return;
        // Render this component and its children recursively
        component.encodeBegin(context);
        if (component.getRendersChildren()) {
            component.encodeChildren(context);
        } else {
            Iterator kids = component.getChildren().iterator();
            while (kids.hasNext()) {
                UIComponent kid = (UIComponent) kids.next();
                encodeRecursive(context, kid);
            }
        }
        component.encodeEnd(context);
    }


}