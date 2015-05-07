package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.Collection;
import java.util.List;

/**
 * Provides basic methods and operations for the Albert le Grand Search plugin service.
 * This is the principal search method for all objects
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public interface PluginServiceBC {

    /**
     * Search for a search term / item
     *
     * @param algSearchTerm item to search for
     * @return a colleciton of HitListRowObjects
     * @throws ch.albertlegrand.business.utility.exceptions.TechnicalException
     *
     * @throws java.io.IOException input exception
     * @throws javax.xml.stream.XMLStreamException
     *                             streaming exception
     */
    public Collection<HitListRowObject> search(ALGSearchTerm algSearchTerm) throws XMLStreamException, IOException, TechnicalException;

    /**
     * Exectutes a lookup in the
     *
     * @param algSearchTerm
     * @return
     */
    public RawHitListObject mockSearchEan(ALGSearchTerm algSearchTerm);

    public List mockSearchTitle(ALGSearchTerm algSearchTerm) throws XMLStreamException, IOException, TechnicalException;
    /**
     * Creates a search term
     *
     * @param algSearchTerm
     */
    void createSearchItem(List algSearchTerm);

}