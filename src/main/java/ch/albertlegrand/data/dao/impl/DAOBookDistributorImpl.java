package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOBookDistributor;
import ch.albertlegrand.data.model.BookDistributor;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 05.09.11
 * Time: 10:33
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DAOBookDistributorImpl implements DAOBookDistributor {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(BookDistributor.class, id);
    }

    @Override
    public BookDistributor findByExample(BookDistributor bookDistributor) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(BookDistributor.class);
        Example example = Example.create(bookDistributor);
        criteria.add(example);
        return (BookDistributor) criteria.uniqueResult();
    }

    @Override
    public BookDistributor addBookDistributor(BookDistributor addBookDistributor) {
        Transaction transaction;
        if (findByExample(addBookDistributor) == null) {
            transaction = this.sessionFactory.getCurrentSession().beginTransaction();
            this.sessionFactory.getCurrentSession().save(addBookDistributor);
            transaction.commit();
        }
        BookDistributor persisted = findByExample(addBookDistributor);
        return persisted;
    }

    @Override
    public void updateBookDistributor(BookDistributor updateBookDistributor) {
        this.sessionFactory.getCurrentSession().update(updateBookDistributor);
    }

    @Override
    public void deleteBookDistributor(BookDistributor deleteBookDistributor) {
        this.sessionFactory.getCurrentSession().delete(deleteBookDistributor);
    }

    @Override
    public BookDistributor findObject(BookDistributor bookDistributor) {
        return findByExample(bookDistributor);
    }

    @Override
    @Transactional
    public List<BookDistributor> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from BookDistributor").list();
    }
}
