package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.service.businesslogic.AlgOnlineServices;
import ch.albertlegrand.business.bc.PersonBC;
import ch.albertlegrand.data.dao.DAOAlgOnlineService;
import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.data.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:41
 * To change this template use File | Settings | File Templates.
 */

@Component
public class AlgOnlineServiceImpl implements AlgOnlineServices {

    @Autowired(required = true)
    private DAOAlgOnlineService daoAlgOnlineService;

    @Override
    @Transactional
    public AlgOnlineService getById(long id) {
        return daoAlgOnlineService.getById(id);
    }

    @Transactional
    public void addService(AlgOnlineService newService) {
        daoAlgOnlineService.addService(newService);
    }

    @Override
    @Transactional
    public void modifyPerson(AlgOnlineService newPersonForService, Person oldperson, PersonBC newperson) {
        daoAlgOnlineService.updateService(newPersonForService);
    }

    @Override
    @Transactional
    public void modifyService(AlgOnlineService modifyService) {
        daoAlgOnlineService.updateService(modifyService);
    }

    @Override
    @Transactional
    public void modifyServiceStatus(AlgOnlineService modifyServiceStatus, boolean newStatus) {
        daoAlgOnlineService.updateService(modifyServiceStatus);
    }

    @Override
    @Transactional
    public void deleteService(AlgOnlineService deleteService) {
        daoAlgOnlineService.removeService(deleteService);
    }

    @Override
    @Transactional
    public AlgOnlineService findService(AlgOnlineService service) {
        return (AlgOnlineService) daoAlgOnlineService.getById(service.getAlgonlineserviceid());
    }
}
