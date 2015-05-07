package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.data.dao.*;
import ch.albertlegrand.data.model.*;
import ch.albertlegrand.service.businesslogic.impl.JdbcDaoSupportServices;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 30.08.11
 * Time: 08:59
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DAOBookImpl implements DAOBook {
    private static final Logger LOGGER = Logger.getLogger(DAOBook.class);

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    private Integer VERSION_INCREMENTATION = 1;

    @Autowired
    private DAOBookTitle daoBookTitle;

    @Autowired
    private DAOQuantum daoQuantum;

    @Autowired
    private JdbcDaoSupportServices daoExtractBook;

    @Autowired
    private DAOBookDetail daoBookDetail;

    @Autowired
    private DAOBookDistributor daoBookDistributor;

    @Autowired
    private DAOScrapBook daoScrapBook;

    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(Book.class, id);
    }

    @Override
    public Book findBookUsingTitleId(String id) {
        long castedValue = Long.valueOf(id);
        return (Book) this.sessionFactory.getCurrentSession().createQuery(
                "from Book book where book.id=?").setParameter(0, id)
                .uniqueResult();
    }

    @Override
    public List findBookUsingEanId(String ean) {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from Book book where book.ean=?").setParameter(0, ean)
                .list();
    }

    @Override
    public void addBulkInsertsAfterExtraction(Collection<Book> list) {
        for (Book newBook : list) {
            addBook(newBook);
        }
    }

    @Override
    public void addBook(Book newBook) {
        try {

            //create / reattach quantum object to bookDetail object
            Quantum persistedQuantum = daoQuantum.addQuantum(newBook.getBookDetailByBookDetailRef().getQuantumByDiliCquantum());
             //create  reattach daoBookDistributor object for a book
            BookDistributor persistedBookDistributorId = daoBookDistributor.addBookDistributor(newBook.getBookDistributorByBookDistributorRef());
            newBook.setBookDistributorByBookDistributorRef(persistedBookDistributorId);
            newBook.setBookDistributorRef(persistedBookDistributorId.getBookdistributorId());

            //Set quantum references for book detail object
            newBook.getBookDetailByBookDetailRef().setQuantumByDiliCquantum(persistedQuantum);
            newBook.getBookDetailByBookDetailRef().setDiliCquantum(persistedQuantum.getQuantumid());

            BookDetail persistedBookDetail = daoBookDetail.addBookDetail(newBook.getBookDetailByBookDetailRef());
            newBook.setBookDetailByBookDetailRef(persistedBookDetail);
            newBook.setBookDetailRef(persistedBookDetail.getBookdetailid());

            //save object
            this.sessionFactory.getCurrentSession().save(newBook);
            this.sessionFactory.getCurrentSession().flush();
            this.sessionFactory.getCurrentSession().clear();
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Error: " + e.getMessage());
        }
    }

    @Override
    public void updateBook(Book updateBook) {
        LOGGER.log(Level.DEBUG, "About to seudo-update a book");
        //Guard against un existing books

        this.sessionFactory.getCurrentSession().update(updateBook);
        LOGGER.log(Level.DEBUG, "Seudo-update is ok");
    }

    @Override
    public void deleteBook(Book deleteBook) {
        LOGGER.log(Level.DEBUG, "About to seudo-delete a book");
        this.sessionFactory.getCurrentSession().delete(deleteBook);
        LOGGER.log(Level.DEBUG, "Ended delete");
    }

    /**
     * Find all books related to a specific EAN number
     *
     * @param algSearch search item  an EAN number
     * @return a list of entries
     */
    public List<Book> findAllBook(ALGSearchTerm algSearch) {
        List<Book> bookList = null;
        List<Booktitle> booktitleList;
        if (algSearch.isSearchingForEan()) {
            bookList = findBookUsingEanId(algSearch.getSearchTerm());
        } else {
            bookList = new ArrayList<Book>();
            booktitleList = daoBookTitle.findPossibleMatch(algSearch.getSearchTerm());
            for (Booktitle booktitle : booktitleList) {
                bookList.add(findBookUsingTitleId(String.valueOf(booktitle.getBooktitleid())));
            }
        }
        return bookList;
    }

    @Override
    public List findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from Book").list();
    }
}
