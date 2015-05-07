package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.data.model.Quantum;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 00:30
 * To change this template use File | Settings | File Templates.
 */
public interface QuantumService {
    public Quantum addQuantum(Quantum addQuantum);

    @Transactional
    public Object getById(long id);

    @Transactional
    public void updateQuantum(Quantum updateQuantum);

    /**
     * @param deleteQuantum Quantum to be deleted
     */
    @Transactional
    public void deleteQuantum(Quantum deleteQuantum);

    /**
     * Searches for all Quantum
     *
     * @return a list of Quantum
     */
    @Transactional
    public List<Quantum> findAll();
}
