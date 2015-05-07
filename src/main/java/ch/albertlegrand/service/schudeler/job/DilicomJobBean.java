package ch.albertlegrand.service.schudeler.job;

import ch.albertlegrand.business.catalogue.DilicomBC;
import ch.albertlegrand.data.dao.DAOAlgSystem;
import ch.albertlegrand.data.model.AlgSystem;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * A plain java bean that can be called by scheduler as job execution.
 * This class contains a method for the update of books on a daily bases.
 * For more configuration information please see the [resources/config/springContext/scheduler-services-database.xml] configuration in the
 * resources folder of the project
 * <p/>
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 16:40
 * To change this template use File | Settings | File Templates.
 */
public class DilicomJobBean implements Job {
    protected Logger LOGGER = Logger.getLogger(DilicomJobBean.class);

    @Autowired
    DilicomBC dilicomBC;

    @Autowired
    DAOAlgSystem daoAlgSystem;

    /**
     * This executes a daily dilicom update task
     *
     * @param context
     * @throws JobExecutionException
     */
    public void execute(JobExecutionContext context)
            throws JobExecutionException {
        try {
            //get alg service
            AlgSystem algSystem = daoAlgSystem.findById((long) 2);
            //execute daily Dilicom Task
            dilicomBC.executeDilicomJobs(algSystem);
        } catch (IOException e) {
            LOGGER.log(Level.DEBUG, "Error " + e.getMessage());
        }
        LOGGER.debug("Job name:" + context.getJobDetail().getName());
        LOGGER.debug("Group name:" + context.getJobDetail().getGroup());
        LOGGER.debug("Trigger name:" + context.getTrigger().getName());
        LOGGER.debug("Firing Time:" + context.getFireTime());
    }
}
