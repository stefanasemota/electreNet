package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.business.catalogue.ElectreNetBC;
import ch.albertlegrand.service.businesslogic.PluginServiceBC;
import ch.albertlegrand.business.catalogue.WorldCatBC;
import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.ApplicationFacesUtils;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import ch.albertlegrand.business.utility.impl.CheckInternetConnectionImpl;
import ch.albertlegrand.service.businesslogic.BookService;
import ch.albertlegrand.service.businesslogic.ScrapBookService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * This class exposes search methods for the search of books both locally and online
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 19:00
 * To change this template use File | Settings | File Templates.
 */
@Service
public class PluginServiceBCImpl implements PluginServiceBC {
    private static final Logger LOGGER = Logger.getLogger(PluginServiceBC.class);
    @Autowired()
    private BookService bookService;
    @Autowired
    private ScrapBookService scrapBookService;

    private boolean searchTermNotFound = false;
    private boolean isInternetConnectionPresent;
    private boolean scrapBookModus = true;

    /**
     * Default constructor
     */
    public PluginServiceBCImpl() {
    }

    @Override
    public Collection<HitListRowObject> search(ALGSearchTerm algSearchTerm) throws XMLStreamException, IOException, TechnicalException {
        LOGGER.log(Level.INFO, "Searching locally... " + algSearchTerm.getSearchTerm());
        Collection<HitListRowObject> books = bookService.findAllBook(algSearchTerm);
        //if no results then we shall search online
        if (books.size() == 0) {
            //books = searchOnline(algSearchTerm);
            //check for internet connection
            isInternetConnectionPresent = CheckInternetConnectionImpl.getDefaultInstance().isConnectionPresent();
            if (isInternetConnectionPresent) {
                this.searchTermNotFound = true;
                //createSearchItem(book);
            }
        }
        LOGGER.log(Level.INFO, "Local search Terminated.");
        return books;
    }

    @Override
    // TODO THE METHOD SHOULD BE REMOVED LATER
    public RawHitListObject mockSearchEan(ALGSearchTerm algSearchTerm) {
        LOGGER.log(Level.INFO, "Searching Scrapbook EAN locally... " + algSearchTerm.getSearchTerm());
        RawHitListObject books = scrapBookService.findEan(algSearchTerm);
        LOGGER.log(Level.INFO, "Local search Terminated.");
        return books;
    }

    @Override
    // TODO THE METHOD SHOULD BE REMOVED LATER
    public List<RawHitListObject> mockSearchTitle(ALGSearchTerm algSearchTerm) throws XMLStreamException, IOException, TechnicalException {
        LOGGER.log(Level.INFO, "Searching Scrapbook Titles locally... " + algSearchTerm.getSearchTerm());
        List books = scrapBookService.findTitle(algSearchTerm);
        //if no results then we shall search online
        if (books.size() == 0 && CheckInternetConnectionImpl.getDefaultInstance().isConnectionPresent()) {
            this.searchTermNotFound = true;
            //search on line
            books = searchOnline(algSearchTerm);
            createSearchItem(books);
        }
        LOGGER.log(Level.INFO, "Local search Terminated.");
        return books;
    }

    /**
     * Combines a search on the book network network Electre and Worldcat
     *
     * @param algSearchTerm a search term
     * @return A book
     * @throws java.io.IOException io exception
     * @throws ch.albertlegrand.business.utility.exceptions.TechnicalException
     *                             alg exception
     * @throws javax.xml.stream.XMLStreamException
     *                             xml stream
     */
    private List searchOnline(ALGSearchTerm algSearchTerm) throws XMLStreamException, IOException, TechnicalException {
        LOGGER.log(Level.INFO, "Searching Online ...");
        // World Cat search
        List worldcatResults = searchWorldCat(algSearchTerm);
        List searchResults = new ArrayList<RawHitListObject>();
        // Electre search
        List electreResults = searchElectre(algSearchTerm);

        //join collections
        if (worldcatResults != null && worldcatResults.size() != 0) {
            searchResults.addAll(worldcatResults);
        }
        if (electreResults != null && electreResults.size() != 0) {
            searchResults.addAll(electreResults);
        }
        LOGGER.log(Level.INFO, "Online search Terminated.");
        return searchResults;
    }

    @Override
    public void createSearchItem(List algSearchTerm) {
        scrapBookService.createSearchItem(algSearchTerm);
    }

    /**
     * Executes a search on the world cat online catalogue
     *
     * @param algSearchTerm search term
     * @return a list of books
     * @throws java.io.IOException io
     * @throws javax.xml.stream.XMLStreamException
     *                             stream
     * @throws ch.albertlegrand.business.utility.exceptions.TechnicalException
     *                             alg exception
     */
    private List searchWorldCat(ALGSearchTerm algSearchTerm) throws XMLStreamException, IOException, TechnicalException {
        WorldCatBC worldCatBC;
        List list = null;
        try {
            worldCatBC = (WorldCatBC) ApplicationFacesUtils.getBusinessController(WorldCatBC.class);
            list = worldCatBC.search(algSearchTerm);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Electre search exception using word " + algSearchTerm.getSearchTerm());
        }
        return list;
    }

    /**
     * Executes a search on the electre online catalogue
     *
     * @param algSearchTerm a term to search for
     * @return a list of electre books
     * @throws ch.albertlegrand.business.utility.exceptions.TechnicalException
     *          an exception
     */
    private List searchElectre(ALGSearchTerm algSearchTerm) throws TechnicalException {
        ElectreNetBC electreNetBC;
        List list = null;
        try {
            electreNetBC = (ElectreNetBC) ApplicationFacesUtils.getBusinessController(ElectreNetBC.class);
            list = electreNetBC.mockSearch(algSearchTerm);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Electre search exception using word " + algSearchTerm.getSearchTerm());
        }
        return list;
    }

    public boolean isSearchTermNotFound() {
        return searchTermNotFound;
    }
}
