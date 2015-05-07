package ch.albertlegrand.business.bc;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.data.model.Book;

import java.util.Collection;

/**
 * Provides basic methods and operations for book object
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:07
 */
public interface BookBC {
    /**
     * Creates a book object
     *
     * @param addBook new book
     */
    public void addBook(Book addBook);

    /**
     * Updates or modifies an existing book
     *
     * @param updateBook modified book
     */
    public void updateBook(Book updateBook);

    /**
     * Deletes an existing book object
     *
     * @param deleteBook book to be deleted
     */
    public void deleteBook(Book deleteBook);

    /**
     * Returns a list of all books
     *
     * @return List of HitListRowObjects
     */
    public Collection<HitListRowObject> findAllBook(ALGSearchTerm algSearch);

}