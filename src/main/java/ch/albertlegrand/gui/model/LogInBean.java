package ch.albertlegrand.gui.model;

import ch.albertlegrand.data.model.Login;
import ch.albertlegrand.service.businesslogic.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("request")
public class LogInBean extends BaseBean {
    private static final long serialVersionUID = 199L;

    @Autowired
    private SessionBean sessionBean;

    @Autowired
    private ILoginService loginService;
    private String loginName;
    private String password;

    public String doLogin() {
        Login user = null;
        user = loginService.getByLoginInformation(loginName, password);
        if (user.getUsername().equals(loginName) && user.getPassword().equals(password)) {
            sessionBean.setUser(user);
        }
        if (user == null) {
            //addErrorMessage("ERROR.WRONG.LOGINDATA_"); // from resourceBundle
            // addErrorMessageText("ERROR", "Username or password wrong.");
            return null;
        }

        return "/page/welcome";
    }

    public SessionBean getSessionBean() {
        return sessionBean;
    }

    public void setSessionBean(SessionBean sessionBean) {
        this.sessionBean = sessionBean;
    }

    public String getLoginName() {
        return loginName;
    }

    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setLoginService(ILoginService loginService) {
        this.loginService = loginService;
    }

}
