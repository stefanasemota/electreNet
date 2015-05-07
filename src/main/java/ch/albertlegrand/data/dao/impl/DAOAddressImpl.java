package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOAddress;
import ch.albertlegrand.data.model.Address;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 11.08.11
 * Time: 22:50
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DAOAddressImpl implements DAOAddress {
    @Autowired(required = true)
    private SessionFactory sessionFactory;

    public DAOAddressImpl() {

    }

    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(Address.class,id);
    }

    @Override
    public List findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from Address").list();
    }
}
