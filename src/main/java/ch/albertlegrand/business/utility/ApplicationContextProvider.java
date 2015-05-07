package ch.albertlegrand.business.utility;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:07
 */
public class ApplicationContextProvider implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    /**
     * Loaded during Spring initialization
     */
    public void setApplicationContext(ApplicationContext applicationcontext) throws BeansException {
        applicationContext = applicationcontext;
    }

    /**
     * Returns the particular bean with the given name
     *
     * @param beanName name of bean
     * @return bean object
     */
    public static Object getBean(String beanName) {
        Object object = null;
        if (containsBean(beanName)) {
            return applicationContext.getBean(beanName);
        }
        return object;
    }

    /**
     * Checks if the bean exits in the context
     *
     * @param beanName bean name
     * @return boolean
     */
    private static boolean containsBean(String beanName) {
        return applicationContext.containsBean(beanName);
    }

    public static ApplicationContext getApplicationContext() {
        return applicationContext;
    }
}