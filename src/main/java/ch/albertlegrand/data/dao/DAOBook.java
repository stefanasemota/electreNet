package ch.albertlegrand.data.dao;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.data.model.Book;
import org.springframework.transaction.annotation.Transactional;

import java.util.Collection;
import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * Book entities. Transaction control of the save(), update() and delete()
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
public interface DAOBook {
    public Book findBookUsingTitleId(String id);

    public List findBookUsingEanId(String ean);

    /**
     * @param addBook book to added or created
     */
    public void addBook(Book addBook);

    /**
     * Persist a previously saved Book entity and return it or a copy of it
     * to the sender. A copy of the Book entity parameter is returned when
     * the JPA persistence mechanism has not previously been tracking the
     * updated entity. This operation must be performed within the a database
     * transaction context for the entity's data to be permanently saved to the
     * persistence store, i.e., database. This method uses the
     * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
     * operation
     *
     * @param updateBook Book entity to update
     * @return Book the persisted Book entity instance, may not be the
     *         same
     * @throws RuntimeException if the operation fails
     */
    public void updateBook(Book updateBook);

    /**
     * @param deleteBook book to be deleted
     */
    public void deleteBook(Book deleteBook);

    public void addBulkInsertsAfterExtraction(Collection<Book> list);

    /**
     * Searches for a boook
     *
     * @return a list of books
     */
    public List findAll();

    /**
     * Find all books
     *
     * @param algSearch search item
     * @return a list of books
     */
    public List<Book> findAllBook(ALGSearchTerm algSearch);

}
