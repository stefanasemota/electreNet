package ch.albertlegrand.business.bc.impl;

import ch.albertlegrand.business.bc.PersonBC;
import ch.albertlegrand.business.bc.ServiceBC;
import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.data.model.Person;
import ch.albertlegrand.service.businesslogic.AlgOnlineServices;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public class ServiceBCImpl implements ServiceBC {

    private AlgOnlineServices algOnlineService;

    public ServiceBCImpl() {
    }

    /**
     * @param newService
     */
    public void addService(AlgOnlineService newService) {
        algOnlineService.addService(newService);
    }

    /**
     * @param deleteService
     */
    public void deleteService(AlgOnlineService deleteService) {
        algOnlineService.deleteService(deleteService);
    }

    @Override
    public AlgOnlineService findService(AlgOnlineService service) {
        return algOnlineService.findService(service);
    }

    /**
     * @param newPersonForService
     * @param oldperson
     * @param newperson
     */
    public void modifyPerson(AlgOnlineService newPersonForService, Person oldperson,
                             PersonBC newperson) {

    }

    /**
     * @param modifyService
     */
    public void modifyService(AlgOnlineService modifyService) {
        algOnlineService.modifyService(modifyService);
    }

    /**
     * @param modifyServiceStatus
     * @param newStatus
     */
    public void modifyServiceStatus(AlgOnlineService modifyServiceStatus,
                                    boolean newStatus) {
        algOnlineService.modifyServiceStatus(modifyServiceStatus, newStatus);
    }

}