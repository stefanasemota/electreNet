package ch.albertlegrand.data.dao;

import org.hibernate.SessionFactory;

import java.io.Serializable;

/**
 * An abstract class that contains the important methods that all subclasses must implement!
 * classes.
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:06
 */
public interface AbstractSpringDao extends Serializable {


    /**
     * @param session sets the hibernate session
     */
    public void setSessionFactory(SessionFactory session);

    /**
     * Returns the object corresponding to the id
     *
     * @param id
     * @return
     */
    public Object getById(long id);

    /**
     * @param objectName@return the particular object
     */
    public Object findByAttribute(String objectName);


}