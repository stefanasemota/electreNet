package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.data.model.Book;

import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 21.01.12
 * Time: 21:07
 * To change this template use File | Settings | File Templates.
 */
public interface BookService {

    public void addBook(Book book);

    public void updateBook(Book book);

    public void addBulkInsertsForExtraction(Collection<Book> list);

    public void deleteBook(Book deleteBook);

    public List findAllBook();

    public Collection<HitListRowObject> findAllBook(ALGSearchTerm algSearch);
}
