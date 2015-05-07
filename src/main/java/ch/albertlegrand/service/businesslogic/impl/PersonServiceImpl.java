package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.dao.DAOPerson;
import ch.albertlegrand.service.businesslogic.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:24
 * To change this template use File | Settings | File Templates.
 */
@Component
public class PersonServiceImpl implements PersonService {
    @Autowired(required = true)
    private DAOPerson daoPerson;

}
