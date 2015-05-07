package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOBookTitle;
import ch.albertlegrand.data.model.Booktitle;
import org.hibernate.Criteria;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.criterion.Example;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 05.09.11
 * Time: 10:32
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DAOBookTitleImpl implements DAOBookTitle {
    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(Booktitle.class, id);
    }

    @Override
    public Booktitle addBookTitle(Booktitle addBookTitle) {
        Transaction transaction;
        transaction = this.sessionFactory.getCurrentSession().beginTransaction();
        this.sessionFactory.getCurrentSession().save(addBookTitle);
        transaction.commit();
        Booktitle persisted = (Booktitle) findByExample(addBookTitle);
        return persisted;
    }

    @Override
    public void updateBookTitle(Booktitle updateBookTitle) {
        this.sessionFactory.getCurrentSession().update(updateBookTitle);
    }

    @Override
    public void deleteBookTitle(Booktitle deleteBookTitle) {
        this.sessionFactory.getCurrentSession().delete(deleteBookTitle);
    }

    @Override
    public List<Booktitle> findPossibleMatch(String booktitle) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Booktitle.class)
                .add(Restrictions.like("diliCwordingStandard", booktitle));
        return criteria.list();
    }


    @Override
    public Booktitle findByExample(Booktitle booktitle) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Booktitle.class);
        Example example = Example.create(booktitle);
        criteria.add(example);
        return (Booktitle) criteria.uniqueResult();
    }

    @Override
    public List<Booktitle> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from Booktitle").list();
    }
}
