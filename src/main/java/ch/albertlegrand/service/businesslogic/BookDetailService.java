package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.data.model.BookDetail;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 11:56
 * To change this template use File | Settings | File Templates.
 */
public interface BookDetailService {
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

    /**
     * Searches for a book detail
     *
     * @return
     */
    public List<BookDetail> findAll();
}
