package ch.albertlegrand.business.utility.exceptions;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Provides basic methods and operations for a technical exception
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 */
public class TechnicalException extends FaultException {
    private static final Logger LOGGER = Logger.getLogger(TechnicalException.class);

    public TechnicalException(String string) {
        super(string);
    }

    /**
     * Constructor
     *
     * @param string    name or cause of exception
     * @param throwable is throwable
     */
    public TechnicalException(String string, Throwable throwable) {
        super(string, throwable);
        logTechnicalStackTrace();
    }

    /**
     * logs the error
     */
    public void logTechnicalStackTrace() {
        //super.printStackTrace();

        LOGGER.log(Level.ERROR, " " + getCause().getMessage());

    }

}
