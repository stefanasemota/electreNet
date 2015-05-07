package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOQuantum;
import ch.albertlegrand.data.model.Quantum;
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
 * Time: 13:03
 * To change this template use File | Settings | File Templates.
 */
@Repository
public class DAOQuantumImpl implements DAOQuantum {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(Quantum.class, id);
    }

    @Override
    public Quantum addQuantum(Quantum addQuantum) {
        Transaction transaction;
        Quantum persistedObject = findMatchingQuantum(addQuantum);
        if (persistedObject == null) {
            transaction = sessionFactory.getCurrentSession().beginTransaction();
            this.sessionFactory.getCurrentSession().save(addQuantum);
            transaction.commit();
            persistedObject = findMatchingQuantum(addQuantum);
            return persistedObject;
        } else
            return persistedObject;
    }

    @Override
    public void updateQuantum(Quantum updateQuantum) {
        this.sessionFactory.getCurrentSession().update(updateQuantum);
    }

    @Override
    public void deleteQuantum(Quantum deleteQuantum) {
        this.sessionFactory.getCurrentSession().delete(deleteQuantum);
    }

    @Override
    public List<Quantum> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from Quantum").list();
    }

    @Override
    public Quantum findMatchingQuantum(Quantum quantum) {
        Criteria criteria = this.sessionFactory.getCurrentSession().createCriteria(Quantum.class);
        Example example = Example.create(quantum);
        criteria.add(example);
        return (Quantum) criteria.uniqueResult();
    }
}
