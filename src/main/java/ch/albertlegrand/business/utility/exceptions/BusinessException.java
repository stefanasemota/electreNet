package ch.albertlegrand.business.utility.exceptions;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Provides basic methods and operations for an Exception
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 14:14
 * To change this template use File | Settings | File Templates.
 */
public class BusinessException extends FaultException {
    private static final Logger LOGGER = Logger.getLogger(BusinessException.class);

    public BusinessException(String string) {
        super(string);
    }

    /**
     * Constructor
     *
     * @param string    error name
     * @param throwable is throwable
     */
    public BusinessException(String string, Throwable throwable) {
        super(string, throwable);
        logTechnicalStackTrace();
    }

    /**
     * logs the stack trace
     */
    public void logTechnicalStackTrace() {
        //super.printStackTrace();

        LOGGER.log(Level.ERROR, " " + getCause().getMessage());

    }

}
