package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOBookDetail;
import ch.albertlegrand.data.model.BookDetail;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 05.09.11
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DAOBookDetailImpl implements DAOBookDetail {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(BookDetail.class, id);
    }

    @Override
    public BookDetail addBookDetail(BookDetail addBookDetail) {
        Transaction transaction;
        if (findByExample(addBookDetail) == null) {
            transaction = this.sessionFactory.getCurrentSession().beginTransaction();
            this.sessionFactory.getCurrentSession().save(addBookDetail);
            transaction.commit();
        }
        BookDetail persisted = findByExample(addBookDetail);
        return persisted;
    }

    @Override
    public BookDetail findByExample(BookDetail bookDetail) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(BookDetail.class);
        Example example = Example.create(bookDetail);
        criteria.add(example);
        return (BookDetail) criteria.uniqueResult();
    }

    @Override
    public void updateBookDetail(BookDetail updateBookDetail) {
    }

    @Override
    public void deleteBookDetail(BookDetail deleteBookDetail) {
    }

    @Override
    public BookDetail findObject(BookDetail bookDetail) {
        return (BookDetail) this.sessionFactory.getCurrentSession().createQuery(
                "from BookDetail bookdetail where bookdetail.bookdetailid=?").setParameter(0, bookDetail.getBookdetailid());
    }

    @Override
    public List<BookDetail> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from BookDetail").list();
    }
}
