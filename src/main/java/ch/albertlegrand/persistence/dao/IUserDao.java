package ch.albertlegrand.persistence.dao;

import ch.albertlegrand.data.model.Login;
import ch.albertlegrand.persistence.entity.User;


public interface IUserDao extends IGenericDao<User, Long>{


	Login getByUserName(String userName);

	Login getByLoginInformation(String userName, String password);


}
