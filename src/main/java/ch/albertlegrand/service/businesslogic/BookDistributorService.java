package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.data.model.BookDistributor;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public interface BookDistributorService {
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
