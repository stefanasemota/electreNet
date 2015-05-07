package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOPerson;
import ch.albertlegrand.data.model.Person;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 29.08.11
 * Time: 21:48
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DAOPersonImpl implements DAOPerson {
    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public Person findById(Long id) {
        return (Person) this.sessionFactory.getCurrentSession().get(Person.class,id);
    }

    @Override
    public List<Person> findAll() {
         return this.sessionFactory.getCurrentSession().createQuery(
                "from Person").list();
    }

}
