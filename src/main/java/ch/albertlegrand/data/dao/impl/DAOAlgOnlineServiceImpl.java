package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOAlgOnlineService;
import ch.albertlegrand.data.model.AlgOnlineService;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 19.08.11
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DAOAlgOnlineServiceImpl implements DAOAlgOnlineService {

    @Autowired(required = true)
    private SessionFactory sessionFactory;


    @Override
    public void addService(AlgOnlineService service) {
        this.sessionFactory.getCurrentSession().persist(service);
    }

    public AlgOnlineService getById(long id) {
        return (AlgOnlineService) this.sessionFactory.getCurrentSession().get(AlgOnlineService.class, id);
    }

    @Override
    public void updateService(AlgOnlineService modifiedService) {
        this.sessionFactory.getCurrentSession().update(modifiedService);
    }

    @Override
    public void updateServiceWithStatus(AlgOnlineService modifiedService, boolean newStatus) {
        AlgOnlineService service = (AlgOnlineService) this.sessionFactory.getCurrentSession().get(AlgOnlineService.class, modifiedService.getAlgonlineserviceid());
        service.setActive(newStatus);
        updateService(service);
    }

    @Override
    public void removeService(AlgOnlineService modifiedService) {
        this.sessionFactory.getCurrentSession().delete(modifiedService);
    }

    /**
     * Returns all the service objects of the system
     *
     * @return a list of objects
     */
    @Override
    public List findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from AlgOnlineService").list();
    }

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
