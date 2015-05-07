package ch.albertlegrand.service.schudeler.impl;

import ch.albertlegrand.business.utility.exceptions.ErrorCodeException;
import ch.albertlegrand.business.utility.exceptions.SCHEDULER_PROBLEM;
import ch.albertlegrand.service.schudeler.SchedulerService;
import org.apache.log4j.Logger;

import javax.servlet.http.HttpSession;
import java.util.Collections;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 19.08.11
 * Time: 03:14
 * To change this template use File | Settings | File Templates.
 */
public class SchedulerServiceFinder {
    public static final String SESSION_DATA_KEY = "sessionData";

    protected Logger logger = Logger.getLogger(getClass());

    protected SchedulerService defaultSchedulerService;

    protected SchedulerServiceContainer schedulerServiceContainer;

    public void setDefaultSchedulerService(SchedulerService defaultSchedulerService) {
        this.defaultSchedulerService = defaultSchedulerService;
    }

    public SchedulerService getDefaultSchedulerService() {
        return defaultSchedulerService;
    }

    public void setSchedulerServiceContainer(SchedulerServiceContainer schedulerServiceContainer) {
        this.schedulerServiceContainer = schedulerServiceContainer;
    }

    public SchedulerService find(HttpSession session) {
        SchedulerSessionData data = getOrCreateSessionData(session);
        SchedulerService result = findBySessionData(data);
        if (result == null) {
            // Not found, try the default scheduler.
            if (defaultSchedulerService == null)
                throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.SCHEDULER_SERVICE_NOT_FOUND, "Unable to findByAttribute any scheduler service.");

            // We have a default scheduler
            result = defaultSchedulerService;
            logger.debug("Using default scheduler service.");

            // Need to update session with default scheduler.
            data.setCurrentSchedulerName(result.getName());
            logger.info("Added default scheduler service " + result.getName() + " into session data.");
        }

        logger.debug("Found scheduler service: " + result.getName());
        return result;
    }


    private SchedulerService findBySessionData(SchedulerSessionData data) {
        String name = data.getCurrentSchedulerName();
        if (name == null) {
            return null;
        }

        SchedulerService schedulerService = null;

        // We might have multiple threads access this part of code from controller.
        synchronized (schedulerServiceContainer) {
            if (schedulerServiceContainer.hasSchedulerService(name)) {
                schedulerService = schedulerServiceContainer.getSchedulerService(name);
            }
        }
        return schedulerService;
    }

    protected SchedulerSessionData createSessionData() {
        String name = findCurrentSchedulerName();
        SchedulerSessionData data = new SchedulerSessionData();
        data.setCurrentSchedulerName(name);
        logger.info("New session data created: " + data);
        return data;
    }

    protected String findCurrentSchedulerName() {
        String name = null;
        if (defaultSchedulerService != null && defaultSchedulerService.isInit()) {
            name = defaultSchedulerService.getName();
        } else {
            List<String> names = schedulerServiceContainer.getInitializedSchedulerServiceNames();
            Collections.sort(names); // Let's sort the names.
            if (names.size() > 0) {
                name = names.get(0);
            }
        }
        return name;
    }

    protected boolean hasSessionData(HttpSession session) {
        return session.getAttribute(SESSION_DATA_KEY) != null;
    }

    public SchedulerSessionData getOrCreateSessionData(HttpSession session) {
        SchedulerSessionData data = (SchedulerSessionData) session.getAttribute(SESSION_DATA_KEY);
        if (data == null) {
            data = createSessionData();
            session.setAttribute(SESSION_DATA_KEY, data);
        }
        return data;
    }

    public SchedulerService switchSchedulerService(String newSchedulerName, HttpSession session) {
        SchedulerSessionData data = getOrCreateSessionData(session);
        String currentSchedulerName = data.getCurrentSchedulerName();
        SchedulerService schedulerService = schedulerServiceContainer.getSchedulerService(newSchedulerName);
        data.setCurrentSchedulerName(newSchedulerName);
        session.setAttribute(SESSION_DATA_KEY, data);
        logger.info("Switched scheduler service in session data from " +
                currentSchedulerName + " to " + newSchedulerName);
        return schedulerService;
    }
}
