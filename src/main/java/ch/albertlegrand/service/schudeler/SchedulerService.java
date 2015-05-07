package ch.albertlegrand.service.schudeler;

import ch.albertlegrand.business.utility.exceptions.ErrorCodeException;
import org.quartz.Scheduler;

import java.util.Properties;

/**
 * Lifecycle for a scheduler service. This is not the same as the {@link Service} due to special
 * needs of the scheduler.
 * <p/>
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 13:01
 * To change this template use File | Settings | File Templates.
 */
public interface SchedulerService {
    void setConfigProps(Properties configProps);

    boolean isConfigModifiable();

    String getConfigSchedulerName();

    boolean isAutoStart();

    boolean isWaitForJobsToComplete();

    Scheduler getUnderlyingScheduler();

    String getName();

    Properties getConfigProps();

    void pause();

    void resume();

    void standby();

    void start();

    void shutdown();

    void init() throws ErrorCodeException;

    void destroy();

    boolean isInit();

    boolean isPaused();

    boolean isRemote();

    boolean isStarted();

    boolean isStandby();

    boolean isShutdown();
}
