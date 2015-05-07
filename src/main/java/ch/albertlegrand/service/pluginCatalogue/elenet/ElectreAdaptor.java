package ch.albertlegrand.service.pluginCatalogue.elenet;

/**
 * This is an Adaptor class that setups retrieves the electre object and sets the instance
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface ElectreAdaptor {

    /**
     * Setup a connection with the webservice
     *
     * @param keepConnectionOpen
     */
    void initializeConnection(boolean keepConnectionOpen);

    /**
     * Ends the connection with the webservice
     */
    void killConnection();

}