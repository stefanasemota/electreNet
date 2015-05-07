package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.dao.DAOAlgSystem;
import ch.albertlegrand.data.model.AlgSystem;

import java.util.List;

/**
 * Provides basic methods and operations for an AlgSystem object
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public interface AlgSystemBC {


    /**
     * Member class DAOAlgSystem object
     */
    public DAOAlgSystem SYSTEM_DAO_ALG = null;

    /**
     * Looks up all AlgSystem
     *
     * @return a List of Systems
     */
    public List<AlgSystem> findAllSystems();

}