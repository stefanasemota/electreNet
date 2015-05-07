package ch.albertlegrand.data.dao;


import ch.albertlegrand.data.model.AlgOnlineService;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * Service entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface DAOAlgOnlineService {
    public void addService(AlgOnlineService service);

    public AlgOnlineService getById(long id);

    /**
     * Persist a previously saved Service entity and return it or a copy of it
     * to the sender. A copy of the Service entity parameter is returned when
     * the JPA persistence mechanism has not previously been tracking the
     * updated entity. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
     * operation
     *
     * @param modifiedService service modified
     */
    public void updateService(AlgOnlineService modifiedService);

    public void updateServiceWithStatus(AlgOnlineService modifiedService,boolean newstatus);

    public void removeService(AlgOnlineService modifiedService);
    /**
     * Find all AlgSystem entities.
     *
     * @return List<AlgSystem> all AlgSystem entities
     */
    public List findAll();
}