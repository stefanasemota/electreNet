package ch.albertlegrand.service.pluginCatalogue.elenet;

import ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator;
import ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap;
import ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator;
import ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap;
import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.service.businesslogic.AlgOnlineServices;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.rmi.RemoteException;

/**
 * This class retrieves the electre service object and initializes the electre connection
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 26.08.11
 * Time: 18:28
 * To change this template use File | Settings | File Templates.
 */
public class ElectreAdaptorImpl implements ElectreAdaptor {
    private static final Logger LOGGER = Logger.getLogger(ElectreAdaptor.class);

    private SearchSoap searchSoap = null;

    private String sessionId = null;

    private LoginSoap loginSoap = null;

    public boolean keepConnectionOpen;

    @Autowired
    private AlgOnlineServices algOnlineService;

    private AlgOnlineService onlineService;

    @Override
    public void initializeConnection(boolean keepConnectionOpen) {
        //get service
        this.onlineService = algOnlineService.getById(Long.valueOf(3));
        //set service object if need be
        setServiceObject();
        // construct the proxy for the loginSoap
        LoginLocator loginLocator = new LoginLocator();
        try {
            // get Login interface
            loginSoap = loginLocator.getLoginSoap();
            sessionId = loginSoap.loginUser(this.onlineService.getLoginref(), this.onlineService.getLoginByLoginref().getPassword());

            // Use the locator to construct the proxy
            SearchLocator searchLocator = new SearchLocator();

            // get searchSoap interface
            this.searchSoap = searchLocator.getSearchSoap();
        } catch (RemoteException e) {
            LOGGER.log(Level.ERROR, "Can not initializeConnection!");
        } catch (javax.xml.rpc.ServiceException e) {
            e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
        }
    }

    @Override
    public void killConnection() {
        if (loginSoap != null) {
            // kill session
            try {
                loginSoap.logoutUser(sessionId);
            } catch (RemoteException e) {
                LOGGER.log(Level.ERROR, "Can not close connection!");
            }
        }
    }

    /**
     * Sets the particular server object
     */
    void setServiceObject() {
        if (this.algOnlineService == null) {
            try {
                this.onlineService = algOnlineService.getById(3);
                LOGGER.log(Level.DEBUG, "Electre service object has being loaded!");
            } catch (Exception e) {
                LOGGER.log(Level.ERROR, "Error:" + e.getMessage());
            }
        }
    }

    public SearchSoap getSearchSoap() {
        return searchSoap;
    }

    public String getSessionId() {
        return sessionId;
    }

}
