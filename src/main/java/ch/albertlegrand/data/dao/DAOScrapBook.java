package ch.albertlegrand.data.dao;


import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.data.model.ScrapBook;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * ScrapBook entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
@Transactional
public interface DAOScrapBook {

    public void deleteObject(Collection<ScrapBook> scrapBook);

    /**
     * Deletes all entries in table
     */
    public void deleteAll();

    /**
     * Adds new scrapBook
     */
    public void addScrapBook(ScrapBook scrapBook);

    /**
     * Addes a list of scrap books to database
     *
     * @param scrapBook
     */
    public void addScrapBook(Collection<ScrapBook> scrapBook);

    public ScrapBook findEan(ALGSearchTerm algSearch);

    public List findTitle(ALGSearchTerm algSearch);

    /**
     * Find all scrapBook
     *
     * @return
     */
    public List findAll();


}