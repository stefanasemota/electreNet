package ch.albertlegrand.business.utility;

import ch.albertlegrand.business.utility.exceptions.TechnicalException;

/**
 * Provides basic methods and operations for checking the conneciton of the internet or access to the internet
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 23:41
 * To change this template use File | Settings | File Templates.
 */
public interface CheckInternetConnection {
    boolean isConnectionPresent() throws TechnicalException;

    boolean isConnectionPresent(boolean forceCheck) throws TechnicalException;

    /**
     * Check if there is an internet connection
     *
     * @throws TechnicalException
     */
    void checkConnection() throws TechnicalException;
}
