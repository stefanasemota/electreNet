package ch.albertlegrand.data.dao;


import ch.albertlegrand.data.model.FutureUpdate;

import java.util.Date;
import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * FutureUpdate entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface DAOFutureUpdate {

    /**
     * Finds all the updates that should be executed today
     *
     * @param givenDate particular date
     * @return a list of FutureUpdate
     */
    public List<FutureUpdate> findUpdatesForDate(Date givenDate);

    /**
     * Adds a future update
     */
    public void addFutureUpdate(FutureUpdate futureUpdate);

    /**
     * Find all future updates
     *
     * @return
     */
    public List findAll();
}