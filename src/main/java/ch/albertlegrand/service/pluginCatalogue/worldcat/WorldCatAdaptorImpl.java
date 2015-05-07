package ch.albertlegrand.service.pluginCatalogue.worldcat;

import ch.albertlegrand.data.dao.impl.DAOAlgOnlineServiceImpl;
import ch.albertlegrand.data.model.AlgOnlineService;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 27.08.11
 * Time: 17:04
 * To change this template use File | Settings | File Templates.
 */
public class WorldCatAdaptorImpl implements WorldCatAdaptor {
    private static final Logger LOGGER = Logger.getLogger(WorldCatAdaptor.class);

    private AlgOnlineService service;
    private DAOAlgOnlineServiceImpl daoService;

    @Override
    public void initializeConnection() {
        if (service == null) {
            try {
                this.service = (AlgOnlineService) daoService.getById(5);
                LOGGER.log(Level.DEBUG, "Electre service object has being loaded!");
            } catch (Exception e) {
                LOGGER.log(Level.ERROR, "Error:" + e.getMessage());
            }
        }
    }

    public AlgOnlineService getService() {
        return service;
    }
}
