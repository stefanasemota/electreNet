package ch.albertlegrand.data.dao;

import ch.albertlegrand.data.model.Person;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * Person entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface DAOPerson {

    /**
     * findByAttribute person according to id
     *
     * @param id of a person
     * @return a person
     */
    public Person findById(Long id);

    /**
     * Find all Persons entities.
     *
     * @return List<Person> all Persons entities
     */
    public List<Person> findAll();

}