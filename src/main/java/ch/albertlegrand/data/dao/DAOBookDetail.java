package ch.albertlegrand.data.dao;

import ch.albertlegrand.data.model.BookDetail;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * BookDetail entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 13:20
 * To change this template use File | Settings | File Templates.
 */
public interface DAOBookDetail {
    /**
     * @param addBookDetail book to added or created
     */
    public BookDetail addBookDetail(BookDetail addBookDetail);

    /**
     * @param updateBookDetail book to be updated
     */
    public void updateBookDetail(BookDetail updateBookDetail);

    /**
     * @param deleteBookDetail book to be deleted
     */
    public void deleteBookDetail(BookDetail deleteBookDetail);

    /**
     * Find an existing BookDetail
     *
     * @param bookDetail object
     * @return BookDetail
     */
    public BookDetail findObject(BookDetail bookDetail);

    public Object getById(long id);

    public BookDetail findByExample(BookDetail bookDetail);
    /**
     * Searches for a book detail
     *
     * @return
     */
    public List<BookDetail> findAll();
}
