package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.dao.DAOFutureUpdate;

/**
 * Provides basic methods and operations for a Future update object
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface FutureUpdateBC {

    public DAOFutureUpdate futureUpdateDAO = null;
    public BookBC M___BOOK_BC = null;

    public void addFutureUpdate();

    public void deleteFutureUpdate();

    /**
     * Searches for all possible Books to be updated
     *
     * @param findBook a book bussiness obect
     */
    public BookBC searchForBookReference(BookBC findBook);

}