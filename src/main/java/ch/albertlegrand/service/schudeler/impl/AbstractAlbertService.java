package ch.albertlegrand.service.schudeler.impl;

import ch.albertlegrand.service.schudeler.Service;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.util.concurrent.atomic.AtomicBoolean;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 12:55
 * To change this template use File | Settings | File Templates.
 */
public abstract class AbstractAlbertService implements Service {
    protected Logger logger = Logger.getLogger(AbstractAlbertService.class);
    protected AtomicBoolean started = new AtomicBoolean(false);
    protected AtomicBoolean initialized = new AtomicBoolean(false);

    @Override
    public void init() {
        if (!isInitialized()) {
            initService();
            initialized.set(true);
            logger.log(Level.DEBUG, "Service " + this + " initialized.");
        }
    }

    @Override
    public void destroy() {
        if (isInitialized()) {
            destroyService();
            initialized.set(false);
            logger.log(Level.DEBUG, "Service " + this + " destroyed.");
        }
    }

    @Override
    public void start() {
        if (!isStarted()) {
            startService();
            started.set(true);
            logger.log(Level.DEBUG, "Service " + this + " started.");
        }
    }

    @Override
    public void stop() {
        if (isStarted()) {
            stopService();
            started.set(false);
            logger.log(Level.DEBUG, "Service " + this + " stopped.");
        }
    }

    @Override
    public boolean isStarted() {
        return started.get();
    }

    @Override
    public boolean isInitialized() {
        return initialized.get();
    }

    abstract protected void initService();

    abstract protected void destroyService();

    abstract protected void startService();

    abstract protected void stopService();
}
