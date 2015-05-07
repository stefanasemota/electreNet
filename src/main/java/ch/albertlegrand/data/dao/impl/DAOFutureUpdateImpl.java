package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOFutureUpdate;
import ch.albertlegrand.data.model.FutureUpdate;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 08.09.11
 * Time: 20:04
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DAOFutureUpdateImpl implements DAOFutureUpdate {
    private static final Logger LOGGER = Logger.getLogger(DAOFutureUpdateImpl.class);
    @Autowired(required = true)
    private SessionFactory sessionFactory;
    @Override
    public List<FutureUpdate> findUpdatesForDate(Date givenDate) {
        return  this.sessionFactory.getCurrentSession().createQuery(
                "from FutureUpdate futureupdate where futureupdate.diliCdateApplicable=?").setParameter(0, givenDate).list();
    }

    @Override
    public void addFutureUpdate(FutureUpdate futureUpdate) {
        this.sessionFactory.getCurrentSession().save(futureUpdate);
    }

    @Override
    public List findAll() {
       return this.sessionFactory.getCurrentSession().createQuery(
                "from FutureUpdate").list();
    }
}
