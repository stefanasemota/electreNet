package ch.albertlegrand.service.schudeler;

/**
 * Lifecycle for init/destroy and start/stop a service.
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 12:57
 * To change this template use File | Settings | File Templates.
 */
public interface Service {
    void init();

    void destroy();

    void start();

    void stop();

    boolean isStarted();

    boolean isInitialized();
}
