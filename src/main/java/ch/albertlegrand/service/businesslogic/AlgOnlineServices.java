package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.business.bc.PersonBC;
import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.data.model.Person;

/**
 * Interfaces with the dao
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:40
 * To change this template use File | Settings | File Templates.
 */
public interface AlgOnlineServices {

    public AlgOnlineService getById(long id);

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
     * Deletes a service
     *
     * @param deleteService to be deleted
     */
    public void deleteService(AlgOnlineService deleteService);

    /**
     * Finds a service
     *
     * @param service object
     * @return a service
     */
    public AlgOnlineService findService(AlgOnlineService service);
}
