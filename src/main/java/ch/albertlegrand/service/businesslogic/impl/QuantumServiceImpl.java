package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.dao.DAOQuantum;
import ch.albertlegrand.data.model.Quantum;
import ch.albertlegrand.service.businesslogic.QuantumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 00:31
 * To change this template use File | Settings | File Templates.
 */
@Component
public class QuantumServiceImpl implements QuantumService {

    @Autowired(required = true)
    private DAOQuantum daoQuantum;

    @Override
    @Transactional
    public Quantum addQuantum(Quantum addQuantum) {
        return daoQuantum.addQuantum(addQuantum);
    }


    @Transactional
    public Object getById(long id) {
        return daoQuantum.getById(id);
    }

    @Transactional
    public void updateQuantum(Quantum updateQuantum) {
        daoQuantum.updateQuantum(updateQuantum);
    }

    /**
     * @param deleteQuantum Quantum to be deleted
     */
    @Transactional
    public void deleteQuantum(Quantum deleteQuantum) {
        daoQuantum.deleteQuantum(deleteQuantum);
    }

    /**
     * Searches for all Quantum
     *
     * @return a list of Quantum
     */
    public List<Quantum> findAll() {
        return daoQuantum.findAll();
    }
}
