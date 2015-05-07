package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.dao.DAOLogin;

/**
 * Provides basic methods and operations for a Login object
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:09
 */
public interface LoginBC {

    /**
     * Dao login support Entity, provides persistence for login objects
     */
    public DAOLogin loginDAO = null;
    /**
     * Authority member object
     */
    //public AlbertGrantedAuthorityBC albertGrantedAuthorityBC = null;

}