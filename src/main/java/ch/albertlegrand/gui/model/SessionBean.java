package ch.albertlegrand.gui.model;

import ch.albertlegrand.data.model.Login;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.Serializable;



@Component
@Scope("session")
public class SessionBean extends BaseBean implements Serializable {

	private static final long serialVersionUID = -2477891600149910534L;
	private String mandant = "default";
	private Login user;


	public SessionBean() { }


	public String getMandant() {
        return mandant;
	}

	public void setMandant(String mandant) {
		this.mandant = mandant;		
	}
	
	public Login getUser() {
		return user;
	}

	public void setUser(Login user) {
		this.user = user;
	}

}