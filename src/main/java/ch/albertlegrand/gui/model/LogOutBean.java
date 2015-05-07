package ch.albertlegrand.gui.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


@Component
@Scope("request")
public class LogOutBean extends BaseBean {
	
	private static final long serialVersionUID = 1977779L;

    @Autowired
    private SessionBean sessionBean;
    
    public String doLogout(){
    	sessionBean.setUser(null);
    	return "/page/start";
    }
    
    public SessionBean getSessionBean() {
		return sessionBean;
	}

	public void setSessionBean(SessionBean sessionBean) {
		this.sessionBean = sessionBean;
	}
	
}
