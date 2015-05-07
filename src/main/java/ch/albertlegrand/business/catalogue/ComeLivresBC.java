package ch.albertlegrand.business.catalogue;

import ch.albertlegrand.business.utility.AlbertOrderFile;

/**
 * Provides basic methods and operations for the comelivres service
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:07
 */
public interface ComeLivresBC {

    /**
     * Sends an order file to comelivres
     *
     * @param orderFile file to send
     * @return boolean
     */
    public boolean sendOrderFile(AlbertOrderFile orderFile);

    /**
     * Retrieves the transmission status
     *
     * @return File object
     */
    public AlbertOrderFile retrieveTransmissionFeedback();

}