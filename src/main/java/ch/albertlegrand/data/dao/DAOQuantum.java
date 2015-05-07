package ch.albertlegrand.data.dao;

import ch.albertlegrand.data.model.Quantum;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * Quantum entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public interface DAOQuantum {
    /**
     * @param addQuantum Quantum to added or created
     */
    public Quantum addQuantum(Quantum addQuantum);

    public Object getById(long id);

    /**
     * Persist a previously saved DAOQuantum entity and return it or a copy of it
     * to the sender. A copy of the DAOQuantum entity parameter is returned when
     * the JPA persistence mechanism has not previously been tracking the
     * updated entity. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
     * operation
     *
     * @param updateQuantum Quantum to be updated
     */
    public void updateQuantum(Quantum updateQuantum);

    /**
     * @param deleteQuantum Quantum to be deleted
     */
    public void deleteQuantum(Quantum deleteQuantum);

    /**
     * Searches for all Quantum
     *
     * @return a list of Quantum
     */
    public List<Quantum> findAll();

    public Quantum findMatchingQuantum(Quantum quantum);
}
