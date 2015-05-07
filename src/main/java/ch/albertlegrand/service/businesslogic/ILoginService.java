package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.data.model.Login;

public interface ILoginService {

	Login getByLoginInformation(String username, String password);

}
