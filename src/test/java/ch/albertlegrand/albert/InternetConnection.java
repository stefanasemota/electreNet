package ch.albertlegrand.albert;

import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import ch.albertlegrand.business.utility.impl.CheckInternetConnectionImpl;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Test;

/**
 * This class tests the availability of internet connection
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.03.12
 * Time: 23:40
 * To change this template use File | Settings | File Templates.
 */
public class InternetConnection {
    private static final Logger LOGGER = Logger.getLogger(InternetConnection.class);

    @Test
    public void testCheckInternetConnection() throws TechnicalException {
        LOGGER.log(Level.INFO, "TEST | Checking Internet connectivity present.");
        LOGGER.log(Level.INFO, "Is Internet connectivity present? " + CheckInternetConnectionImpl.getDefaultInstance().isConnectionPresent());
        LOGGER.log(Level.INFO, "TEST Terminated.");
    }
}
