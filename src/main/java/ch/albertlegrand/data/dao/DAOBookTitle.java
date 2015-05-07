package ch.albertlegrand.data.dao;

import ch.albertlegrand.data.model.Booktitle;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * BookTitle entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public interface DAOBookTitle {

    public Booktitle findByExample(Booktitle booktitle);

    /**
     * @param addBook book to added or created
     */
    public Booktitle addBookTitle(Booktitle addBook);

    public Object getById(long id);

    /**
     * @param updateBookTitle book to be updated
     */
    public void updateBookTitle(Booktitle updateBookTitle);

    /**
     * @param deleteBookTitle book to be deleted
     */
    public void deleteBookTitle(Booktitle deleteBookTitle);

    public List<Booktitle> findPossibleMatch(String booktitle);

    /**
     * Searches for all book title
     *
     * @return a list of book titles
     */
    public List<Booktitle> findAll();
}
