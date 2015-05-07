package ch.albertlegrand.scheduler;

import ch.albertlegrand.business.catalogue.DilicomBC;
import ch.albertlegrand.data.model.AlgSystem;
import ch.albertlegrand.service.businesslogic.AlgSystemService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 12.04.12
 * Time: 18:15
 * To change this template use File | Settings | File Templates.
 */
public class DilicomTask {
    private static final Logger LOGGER = Logger.getLogger(DilicomTask.class);

    @Autowired
    private DilicomBC dilicomBC;

    @Autowired
    private AlgSystemService algSystemService;

    /**
     * Execute this task
     */
    public void execute() {
        LOGGER.debug("About to run the Dilcome Task : Check for updates ...");
        //pick up the Dilicom system references
        AlgSystem algSystem = (AlgSystem) algSystemService.getById(2);
        try {
            dilicomBC.executeDilicomJobs(algSystem);
        } catch (IOException e) {
            LOGGER.error(e.getMessage());
        }
    }
}
