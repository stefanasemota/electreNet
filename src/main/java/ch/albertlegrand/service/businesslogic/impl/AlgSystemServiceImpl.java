package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.dao.DAOAlgSystem;
import ch.albertlegrand.data.model.AlgSystem;
import ch.albertlegrand.service.businesslogic.AlgSystemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:12
 * To change this template use File | Settings | File Templates.
 */
@Service
public class AlgSystemServiceImpl implements AlgSystemService {

    @Autowired(required = true)
    private DAOAlgSystem daoAlgSystem;

    @Override
    @Transactional
    public void addAlgSystem(AlgSystem algSystem) {
        daoAlgSystem.addAlgSystem(algSystem);
    }

    @Override
    @Transactional
    public void changeExtractionFlag(boolean flag, Long id) {
        daoAlgSystem.changeExtractionFlag(flag, id);
    }

    @Override
    @Transactional
    public void updateAlgSystem(AlgSystem algSystem) {
        daoAlgSystem.update(algSystem);
    }

    @Override
    @Transactional
    public AlgSystem findObject(AlgSystem algSystem) {
        return daoAlgSystem.findById(algSystem.getAlgsystemid());
    }

    @Override
    @Transactional
    public AlgSystem getById(long id) {
        return daoAlgSystem.findById(id);
    }

    @Override
    @Transactional
    public List<AlgSystem> findAll() {
        return daoAlgSystem.findAll();
    }
}
