package ch.albertlegrand.service.schudeler.impl;

import ch.albertlegrand.business.utility.exceptions.ErrorCodeException;
import ch.albertlegrand.business.utility.exceptions.SCHEDULER_PROBLEM;
import ch.albertlegrand.service.schudeler.Service;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 13:35
 * To change this template use File | Settings | File Templates.
 */
public class ServiceContainer implements ApplicationContextAware, InitializingBean, DisposableBean {
    protected Logger logger = Logger.getLogger(getClass());

    /**
     * Service list that's registered in the application.
     */
    protected List<Service> services;

    protected boolean autoStart = true;

    /**
     * Service list that's got initialized.
     */
    protected List<Service> initializedServices = new ArrayList<Service>();

    public void setAutoStart(boolean autoStart) {
        this.autoStart = autoStart;
    }

    public void setServices(List<Service> services) {
        this.services = services;
    }

    public void init() {
        // Initialize all services
        for (Service service : services) {
            try {
                service.init();
                initializedServices.add(service);
                logger.log(Level.INFO, "Service " + service + " initialized.");
            } catch (Exception e) {
                throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.SERVICE_PROBLEM, "Failed to initialize service " + service, e);
            }
        }

        if (autoStart) {
            // Start all services
            for (Service service : initializedServices) {
                try {
                    service.start();
                    logger.log(Level.INFO, "Service " + service + " started.");
                } catch (Exception e) {
                    throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.SERVICE_PROBLEM, "Failed to start service " + service, e);
                }
            }
        }
    }

    @Override
    public void destroy() {
        if (autoStart) {
            // Stop all services in reverse order.
            for (int i = initializedServices.size() - 1; i > 0; i--) {
                Service service = initializedServices.get(i);
                try {
                    service.stop();
                    logger.log(Level.DEBUG, "Service " + service + " stopped.");
                } catch (Exception e) {
                    logger.log(Level.ERROR, "Failed to stop service " + service, e);
                }
            }
        }

        // Destroying services in reverse order.
        for (int i = initializedServices.size() - 1; i > 0; i--) {
            Service service = initializedServices.get(i);
            try {
                service.destroy();
                logger.log(Level.INFO, "Service " + service + " destroyed.");
            } catch (Exception e) {
                logger.log(Level.ERROR, "Failed to destroy service " + service, e);
            }
        }
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        init();
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        Map<String, Service> serviceBeans = applicationContext.getBeansOfType(Service.class);
        services = new ArrayList<Service>(serviceBeans.values());
        logger.log(Level.DEBUG, "Spring context initialized, detected " + services.size() + " Service instances.");
    }
}
