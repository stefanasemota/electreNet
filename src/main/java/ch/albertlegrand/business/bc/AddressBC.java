package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.dao.DAOAddress;

/**
 * Provides basic methods and operations for an Address object
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:06
 */
public interface AddressBC {

    /**
     * DAOAddress Member object
     */
    public DAOAddress addressDAO = null;

    /**
     * Creates an Address
     *
     * @param newAddress a new address
     */
    public void addAddress(AddressBC newAddress);

}