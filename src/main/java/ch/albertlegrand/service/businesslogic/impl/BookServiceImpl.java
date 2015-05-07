package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.data.dao.DAOBook;
import ch.albertlegrand.data.model.Book;
import ch.albertlegrand.service.businesslogic.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 21.01.12
 * Time: 21:12
 * To change this template use File | Settings | File Templates.
 */

@Component
public class BookServiceImpl implements BookService {

    @Autowired(required = true)
    private DAOBook daoBook;

    @Override
    @Transactional
    public void addBook(Book book) {
        daoBook.addBook(book);
    }

    @Override
    @Transactional
    public void updateBook(Book book) {
        daoBook.updateBook(book);
    }

    @Override
    @Transactional
    public void addBulkInsertsForExtraction(Collection<Book> list) {
        daoBook.addBulkInsertsAfterExtraction(list);
    }

    @Override
    @Transactional
    public void deleteBook(Book deleteBook) {
        daoBook.deleteBook(deleteBook);
    }

    @Override
    @Transactional
    public List findAllBook() {
        return daoBook.findAll();
    }

    @Override
    @Transactional
    public Collection<HitListRowObject> findAllBook(ALGSearchTerm algSearch) {
        List<Book> list = daoBook.findAllBook(algSearch);
        Collection<HitListRowObject> results = new ArrayList<HitListRowObject>(list.size());
        for (Book book : list) {
            results.add(new HitListRowObject(book));
        }
        return results;
    }
}
