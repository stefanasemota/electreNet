package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.dao.DAOLogin;
import ch.albertlegrand.service.businesslogic.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:23
 * To change this template use File | Settings | File Templates.
 */
@Component
public class LoginServiceImpl implements LoginService {
    @Autowired(required = true)
    private DAOLogin daoLogin;

    @Override
    @Transactional
    public Object findUsernameAndCorrespondingAuthority(String username) {
        try {
            return daoLogin.findUsernameAndCorrespondingAuthority(username);
        } catch (Exception e) {
            System.out.print(e.getMessage());
        }
        return null;
    }

    @Override
    @Transactional
    public Object getById(long id) {
        return daoLogin.getById(id);
    }
}
