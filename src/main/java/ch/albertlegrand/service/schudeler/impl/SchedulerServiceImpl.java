package ch.albertlegrand.service.schudeler.impl;

import ch.albertlegrand.business.utility.exceptions.ErrorCodeException;
import ch.albertlegrand.business.utility.exceptions.SCHEDULER_PROBLEM;
import ch.albertlegrand.service.schudeler.SchedulerService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.impl.StdSchedulerFactory;

import java.util.Properties;
import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Provide Quartz implementation of SchedulerService.
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 13:04
 * To change this template use File | Settings | File Templates.
 */
public class SchedulerServiceImpl implements SchedulerService {
    public static final String NAME_KEY = "org.quartz.scheduler.instanceName";
    public static final String AUTO_START_KEY = "schedule.schedulerService.autoStart";
    public static final String WAIT_FOR_JOBS_KEY = "schedule.schedulerService.waitForJobsToComplete";

    protected Logger logger = Logger.getLogger(getClass());

    protected AtomicBoolean paused = new AtomicBoolean(false);

    protected Scheduler scheduler;

    protected String name;

    protected boolean autoStart;

    protected boolean configModifiable = true; // default to true

    protected Properties configProps;

    /**
     * Used during shutdown of scheduler.
     */
    protected boolean waitForJobsToComplete = true;

    @Override
    public String toString() {
        return "SchedulerService[" + name + "]";
    }

    public void setConfigModifiable(boolean configModifiable) {
        this.configModifiable = configModifiable;
    }

    public boolean isConfigModifiable() {
        return configModifiable;
    }

    @Override
    public boolean isAutoStart() {
        return autoStart;
    }

    @Override
    public boolean isWaitForJobsToComplete() {
        return waitForJobsToComplete;
    }


    @Override
    public void setConfigProps(Properties configProps) {
        this.configProps = configProps;
    }

    public void setScheduler(Scheduler scheduler) {
        this.scheduler = scheduler;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getConfigSchedulerName() {
        if (configProps == null)
            return null;
        return configProps.getProperty(NAME_KEY, "QuartzScheduler");
    }

    public Properties getConfigProps() {
        return configProps;
    }

    @Override
    public Scheduler getUnderlyingScheduler() {
        return scheduler;
    }

    @Override
    public void init() throws ErrorCodeException {
        if (configProps == null) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.CONFIGURATION_MISSING, "configProps is missing.");
        }
        try {
            // Init scheduler
            StdSchedulerFactory schedulerFactory = new StdSchedulerFactory(configProps);
            scheduler = schedulerFactory.getScheduler();

            // Init service
            name = scheduler.getSchedulerName();
            autoStart = Boolean.parseBoolean(configProps.getProperty(AUTO_START_KEY, "true"));
            waitForJobsToComplete = Boolean.parseBoolean(configProps.getProperty(WAIT_FOR_JOBS_KEY, "true"));
            logger.info("Scheduler service " + name + " has been initialized.");

            // Auto start if possible.
            if (autoStart && !isRemote()) {
                try {
                    start();
                    logger.log(Level.DEBUG, "Scheduler service " + name + " has auto started.");
                    // JobDetail jDetail = new JobDetail(DilicomJobBean.class.getSimpleName(), "Dilicom", DilicomJobBean.class);
                    // CronTrigger crTrigger = new CronTrigger("CronTrigger", "Dilicom", "0 0/2 * * * ?");
                    // scheduler.scheduleJob(jDetail, crTrigger);
                } catch (Exception e) {
                    // Just log error, do not re-throw.
                    logger.log(Level.ERROR, "Failed to auto start scheduler service " + name, e);
                }
            }
        } catch (SchedulerException e) {
            if (scheduler != null) {
                destroy();
            }
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.SCHEDULER_SERVICE_NOT_FOUND, e);
        }
    }

    @Override
    public void start() {
        try {
            scheduler.start();
            logger.log(Level.DEBUG, "Scheduler service " + name + " started.");
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public void standby() {
        try {
            scheduler.standby();
            logger.info("Scheduler service " + name + " standby.");
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public void pause() {
        try {
            scheduler.pauseAll();
            paused.set(true);
            logger.log(Level.DEBUG, "Scheduler service " + name + " standby.");
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public void resume() {
        try {
            scheduler.resumeAll();
            paused.set(false);
            logger.log(Level.DEBUG, "Scheduler service " + name + " standby.");
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public void shutdown() {
        try {
            scheduler.shutdown(waitForJobsToComplete);
            logger.log(Level.DEBUG, "Scheduler service " + name + " is shutdown. Called with waitForJobsToComplete=" + waitForJobsToComplete);
            scheduler = null;
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public void destroy() {
        // Try to auto shutdown if possible.
        if (isInit() && !isShutdown() && !isRemote()) {
            shutdown();
            logger.log(Level.DEBUG, "Scheduler service " + name + " has been auto shutdown.");
        }
    }

    @Override
    public boolean isPaused() {
        return paused.get();
    }

    @Override
    public boolean isInit() {
        return scheduler != null;
    }

    @Override
    public boolean isRemote() {
        try {
            return scheduler.getMetaData().isSchedulerRemote();
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public boolean isShutdown() {
        try {
            return scheduler.isShutdown();
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public boolean isStarted() {
        try {
            return scheduler.isStarted();
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }

    @Override
    public boolean isStandby() {
        try {
            return scheduler.isInStandbyMode();
        } catch (SchedulerException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM, e);
        }
    }
}
