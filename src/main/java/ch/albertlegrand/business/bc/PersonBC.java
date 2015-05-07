package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.dao.DAOPerson;

/**
 * Provides basic methods and operations for a person object
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:09
 */
public interface PersonBC {

    public DAOPerson personDAO = null;
    public LoginBC m_LoginBC = null;
    public AddressBC m_AddressBC = null;

    /**
     * Creates a new person
     *
     * @param newPerson new object
     */
    public void addPerson(PersonBC newPerson);

    /**
     * Searches for a person
     *
     * @param searchPerson person to search for
     */
    public void searchPerson(PersonBC searchPerson);

    /**
     * modifies a person
     *
     * @param modifyPerson person to modify
     */
    public void modifiyPerson(PersonBC modifyPerson);

    /**
     * @param deletePerson
     */
    public void deletePerson(PersonBC deletePerson);

}