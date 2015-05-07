package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.model.Login;
import ch.albertlegrand.persistence.dao.IUserDao;
import ch.albertlegrand.service.businesslogic.ILoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoginService implements ILoginService {

    private IUserDao userDao;


    public Login getByLoginInformation(final String username, final String password) {
        Login user = userDao.getByLoginInformation(username, password);
        return user;
    }


    @Autowired()
    public void setUserDao(IUserDao userDao) {
        this.userDao = userDao;
    }

}