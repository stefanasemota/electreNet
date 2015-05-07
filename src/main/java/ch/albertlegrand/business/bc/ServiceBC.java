package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.data.model.Person;

/**
 * Provides basic methods and operations for a service
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public interface ServiceBC {

    public PersonBC personBC = null;
    public AlgSystemBC algSystemBc = null;

    /**
     * Creates a new service
     *
     * @param newService new service
     */
    public void addService(AlgOnlineService newService);

    /**
     * Modifies a service
     *
     * @param newPersonForService
     * @param oldperson           old person
     * @param newperson           new person
     */
    public void modifyPerson(AlgOnlineService newPersonForService, Person oldperson,
                             PersonBC newperson);

    /**
     * Modifies a service
     *
     * @param modifyService object to modify
     */
    public void modifyService(AlgOnlineService modifyService);

    /**
     * Modifies a service status
     *
     * @param modifyServiceStatus to be modified
     * @param newStatus           new status
     */
    public void modifyServiceStatus(AlgOnlineService modifyServiceStatus,
                                    boolean newStatus);

    /**
     * Deletets a service
     *
     * @param deleteService to be deleted
     */
    public void deleteService(AlgOnlineService deleteService);

    /**
     * Findes a service
     *
     * @param service object
     * @return a service
     */
    public AlgOnlineService findService(AlgOnlineService service);
}