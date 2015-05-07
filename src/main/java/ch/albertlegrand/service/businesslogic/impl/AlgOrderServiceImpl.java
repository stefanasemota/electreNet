package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.service.businesslogic.AlgOrderService;
import ch.albertlegrand.data.dao.DAOAlgOrder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:10
 * To change this template use File | Settings | File Templates.
 */
@Component
public class AlgOrderServiceImpl implements AlgOrderService {
    @Autowired(required = true)
    private DAOAlgOrder daoAlgOrder;
}
