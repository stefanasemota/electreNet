package ch.albertlegrand.persistence.dao.hibernate;

import ch.albertlegrand.data.model.Login;
import ch.albertlegrand.persistence.dao.IUserDao;
import ch.albertlegrand.persistence.entity.User;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


@Repository
public class UserDao extends GenericDao<User, Long> implements IUserDao {

    private static Log log = LogFactory.getLog(UserDao.class);

    @Autowired
    public UserDao(@Qualifier("sessionFactory") SessionFactory sessionFactory) {
        setSessionFactory(sessionFactory);
    }

    @Transactional(readOnly = true)
    public Login getByUserName(String userName) {
        try {
            Query query = getSession().createQuery(
                    "FROM Login where username = :name");
            query.setString("name", userName);
            return (Login) query.uniqueResult();
        } catch (Exception e) {
            log.error(" ERROR Exception in getByUserName(String userName ", e);
            return null;
        }
    }

    @Transactional(readOnly = true)
    public Login getByLoginInformation(String userName, String password) {
        try {
            Query query = getSession().createQuery(
                    "FROM Login where username = :name AND password = :pass");
            query.setString("name", userName);
            query.setString("pass", password);
//            query.setBoolean("en", Boolean.TRUE);
            return (Login) query.uniqueResult();
        } catch (Exception e) {
            log.error(" ERROR Exception in getByLoginInformation(final String userName, final String password)", e);
            return null;
        }
    }

}
