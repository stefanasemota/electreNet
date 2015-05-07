package ch.albertlegrand.business.catalogue;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

/**
 * Provides basic methods and operations for the online worlcat service
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public interface WorldCatBC {

    /**
     *
     * @param searchItem item to search for
     * @return a collection
     * @throws ch.albertlegrand.business.utility.exceptions.TechnicalException
     *
     * @throws java.io.IOException query exception
     * @throws javax.xml.stream.XMLStreamException
     *                             connection exception
     */
    public List search(ALGSearchTerm searchItem) throws IOException, XMLStreamException, TechnicalException;
}