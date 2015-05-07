package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.data.dao.DAOLogin;
import ch.albertlegrand.data.model.Authority;
import ch.albertlegrand.data.model.Login;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 30.08.11
 * Time: 20:55
 * To change this template use File | Settings | File Templates.
 */
@Component
public class DAOLoginImpl implements DAOLogin {
    @Autowired(required = true)
    private SessionFactory sessionFactory;

    @Override
    public Object findUsernameAndCorrespondingAuthority(String username) {
        return (Authority) this.sessionFactory.getCurrentSession().createQuery(
                "from Authority user where user.username=?").setParameter(0, username)
                .uniqueResult();
    }

    @Override
    public Object getById(long id) {
        return this.sessionFactory.getCurrentSession().get(Login.class, id);
    }
}
