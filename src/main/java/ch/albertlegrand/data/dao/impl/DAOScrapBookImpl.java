package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOScrapBook;
import ch.albertlegrand.business.catalogue.impl.DilicomBCImpl;
import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.data.model.ScrapBook;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 08.09.11
 * Time: 20:02
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DAOScrapBookImpl implements DAOScrapBook {
    private Integer VERSION_INCREMENTATION = 1;
    private static final Logger LOGGER = Logger.getLogger(DAOScrapBookImpl.class);

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(ScrapBook.class, id);
    }

    @Override
    public void deleteObject(Collection<ScrapBook> scrapBook) {
        ScrapBook scrapBookCrit;
        Transaction transaction;

        transaction = this.sessionFactory.getCurrentSession().beginTransaction();
        for (ScrapBook deletebook : scrapBook) {
            scrapBookCrit = (ScrapBook) this.sessionFactory.getCurrentSession().createCriteria(ScrapBook.class)
                    .add(Restrictions.eq("scrapbookid", deletebook.getScrapbookid())).uniqueResult();
            this.sessionFactory.getCurrentSession().delete(deletebook);
            transaction.commit();
        }
    }

    @Override
    public void deleteAll() {
        LOGGER.log(Level.DEBUG, "About to delete all entries in table scrap, time starting: " + System.currentTimeMillis());
        this.sessionFactory.getCurrentSession().delete("from ScrapBook");
        LOGGER.log(Level.DEBUG, "Deleted all entries in table scrap, time finished: " + System.currentTimeMillis());
    }

    @Override
    public void addScrapBook(Collection<ScrapBook> scrapBook) {
        for (ScrapBook scrapbook : scrapBook) {
            if (DilicomBCImpl.MOVEMENT_CODE_CREATION == scrapbook.getP01DiliCmovementCode().charAt(0) ||
                    DilicomBCImpl.MOVEMENT_CODE_EXTRACTION == scrapbook.getP01DiliCmovementCode().charAt(0)) {
                addScrapBook(scrapbook);
            }
        }
    }

    @Override
    public ScrapBook findEan(ALGSearchTerm algSearch) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(ScrapBook.class)
                .add(Restrictions.like("p02DiliCean", algSearch.getSearchTerm()));
        return (ScrapBook) criteria.uniqueResult();
    }

    @Override
    public List findTitle(ALGSearchTerm algSearch) {
        //Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(ScrapBook.class);
        return this.sessionFactory.getCurrentSession().createCriteria(ScrapBook.class)
                .add(Restrictions.like("p20DiliCwordingStandard", "%" + algSearch.getSearchTerm() + "%"))
                .add(Restrictions.or(
                        Restrictions.eq("eleNetTitle", algSearch.getSearchTerm()),
                        Restrictions.isNull("eleNetTitle")
                ))
                .add(Restrictions.or(
                        Restrictions.eq("wCatBtitle", algSearch.getSearchTerm()),
                        Restrictions.isNull("wCatBtitle")
                ))
                .list();
    }

    @Override
    public void addScrapBook(ScrapBook scrapBook) {
        //guard against book source type
        this.sessionFactory.getCurrentSession().saveOrUpdate(scrapBook);
        this.sessionFactory.getCurrentSession().flush();
        this.sessionFactory.getCurrentSession().clear();
    }

    @Override
    public List findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from ScrapBook").list();
    }
}
