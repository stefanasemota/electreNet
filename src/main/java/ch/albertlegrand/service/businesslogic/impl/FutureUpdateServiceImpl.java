package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.dao.DAOFutureUpdate;
import ch.albertlegrand.data.model.FutureUpdate;
import ch.albertlegrand.service.businesslogic.FutureUpdateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:22
 * To change this template use File | Settings | File Templates.
 */
@Component
public class FutureUpdateServiceImpl implements FutureUpdateService {
    @Autowired(required = true)
    private DAOFutureUpdate daoFutureUpdate;

    @Override
    @Transactional
    public List<FutureUpdate> findUpdatesForDate(Date givenDate) {
        return daoFutureUpdate.findUpdatesForDate(givenDate);
    }

    @Override
    @Transactional
    public void addFutureUpdate(FutureUpdate futureUpdate) {
        daoFutureUpdate.addFutureUpdate(futureUpdate);
    }

    @Override
    @Transactional
    public List findAll() {
        return daoFutureUpdate.findAll();
    }
}
