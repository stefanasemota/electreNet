package ch.albertlegrand.data.dao;


import ch.albertlegrand.data.model.AlgSystem;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * AlgSystem entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface DAOAlgSystem {
    /**
     * Persist a previously saved Algsystem entity and return it or a copy of it
     * to the sender. A copy of the Algsystem entity parameter is returned when
     * the JPA persistence mechanism has not previously been tracking the
     * updated entity. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
     * operation.
     *
     * @param entity AlgSystem entity to update
     * @return AlgSystem the persisted AlgSystem entity instance, may not be the
     *         same
     * @throws RuntimeException if the operation fails
     */
    public void update(AlgSystem entity);

    public void changeExtractionFlag(boolean flag,Long id);

    public void addAlgSystem(AlgSystem algSystem);

    public AlgSystem findById(Long id);

    /**
     * Find all AlgSystem entities.
     *
     * @return List<AlgSystem> all AlgSystem entities
     */
    public List<AlgSystem> findAll();
}