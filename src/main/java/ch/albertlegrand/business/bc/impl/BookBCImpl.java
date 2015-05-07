package ch.albertlegrand.business.bc.impl;

import ch.albertlegrand.business.bc.BookBC;
import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.data.model.Book;
import ch.albertlegrand.service.businesslogic.BookService;
import org.apache.log4j.Logger;

import java.util.Collection;
import java.util.List;

/**
 * @author Asemota Stefan
 * @version 1.0
 */
public class BookBCImpl implements BookBC {
    private static final Logger LOGGER = Logger.getLogger(BookBCImpl.class);
    private BookService bookService;

    public BookBCImpl() {
    }

    @Override
    public void addBook(Book book) {
        bookService.addBook(book);
    }

    @Override
    public void updateBook(Book updateBook) {
        bookService.updateBook(updateBook);
    }

    @Override
    public void deleteBook(Book deleteBook) {
        bookService.deleteBook(deleteBook);
    }

    @Override
    public Collection<HitListRowObject> findAllBook(ALGSearchTerm algSearch) {
        return bookService.findAllBook(algSearch);
    }

    public List findAllBook() {
        return bookService.findAllBook();
    }

}