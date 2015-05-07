package ch.albertlegrand.data.dao;

import ch.albertlegrand.data.model.BookDistributor;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * BookDistributor entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public interface DAOBookDistributor {

    public BookDistributor findByExample(BookDistributor bookDetail);

    /**
     * @param addBookDistributor book to added or created
     */
    public BookDistributor addBookDistributor(BookDistributor addBookDistributor);

    /**
     * @param updateBookDistributor book to be updated
     */
    public void updateBookDistributor(BookDistributor updateBookDistributor);

    /**
     * @param deleteBookDistributor book to be deleted
     */
    public void deleteBookDistributor(BookDistributor deleteBookDistributor);


    public Object getById(long id);

    /**
     * Returns the cooresponding object
     *
     * @param bookDetail
     * @return
     */
    public BookDistributor findObject(BookDistributor bookDetail);

    /**
     * Searches for a boook
     *
     * @return
     */
    public List<BookDistributor> findAll();
}
