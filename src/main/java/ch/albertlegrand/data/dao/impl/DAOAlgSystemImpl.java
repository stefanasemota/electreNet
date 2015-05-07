package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOAlgSystem;
import ch.albertlegrand.data.model.AlgSystem;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 27.08.11
 * Time: 19:29
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DAOAlgSystemImpl implements DAOAlgSystem {

    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public void update(AlgSystem entity) {
        this.sessionFactory.getCurrentSession().save(entity);
    }

    @Override
    public void changeExtractionFlag(boolean flag, Long id) {
        AlgSystem system = findById(id);
        if (system != null) {
            system.setFirstExtraction(flag);
            update(system);
        }
    }


    @Override
    public void addAlgSystem(AlgSystem algSystem) {
        this.sessionFactory.getCurrentSession().persist(algSystem);
    }

    @Override
    public AlgSystem findById(Long id) {
        return (AlgSystem) this.sessionFactory.getCurrentSession().createQuery(
                "from AlgSystem algsy where algsy.algsystemid=?").setParameter(0, id).uniqueResult();
    }

    public List<AlgSystem> findAll() {
        return this.sessionFactory.getCurrentSession().createQuery(
                "from AlgSystem").list();
    }
}
