package ch.albertlegrand.business.catalogue;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;

import java.rmi.RemoteException;
import java.util.List;

/**
 * Provides basic methods and operations for the communication with the french electre service
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface ElectreNetBC {

    /**
     * Executes a search
     *
     * @param searchItem
     */
    public List<HitListRowObject> search(ALGSearchTerm searchItem) throws TechnicalException;

    public List<RawHitListObject> mockSearch(ALGSearchTerm searchItem) throws TechnicalException;
    /**
     * Search for an ean
     *
     * @throws RemoteException soap exception
     */
    public void searchForEAN() throws RemoteException;

}