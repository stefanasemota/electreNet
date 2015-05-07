package ch.albertlegrand.data.dao;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * Address entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:07
 */
public interface DAOAddress {

    public Object getById(long id) ;

    public List findAll() ;
}