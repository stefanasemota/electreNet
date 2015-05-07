package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.service.businesslogic.AddressService;
import ch.albertlegrand.data.dao.DAOAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:09
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AddressServiceImpl implements AddressService {
    @Autowired(required = true)
    private DAOAddress daoAddress;
}
