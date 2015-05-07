package ch.albertlegrand.business.catalogue.impl;

import ch.albertlegrand.business.catalogue.ComeLivresBC;
import ch.albertlegrand.business.utility.AlbertOrderFile;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:07
 */
public class ComeLivresBCImpl implements ComeLivresBC {

    public ComeLivresBCImpl() {

    }

    public void finalize() throws Throwable {
        super.finalize();
    }

    public AlbertOrderFile retrieveTransmissionFeedback() {
        return null;
    }

    /**
     * @param orderFile an order file
     * @return boolean
     */
    public boolean sendOrderFile(AlbertOrderFile orderFile) {
        return false;
    }

}