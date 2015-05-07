package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.dao.DAOScheduler;

/**
 * Provides basic methods and operations for a scheduler
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
public interface SchedulerBC {

    public DAOScheduler schedulerDAO = null;
    public ServiceBC m_ServiceBC = null;

    /**
     * Creates a new scheduler
     *
     * @param newScheduler new object
     */
    public void addScheduler(SchedulerBC newScheduler);

    /**
     * Modifies a schudeler
     *
     * @param modifyScheduler object to change
     */
    public void modifiyScheduler(SchedulerBC modifyScheduler);

    /**
     * Modify a status of a scheduler
     *
     * @param changeSchedulerStatus object
     * @param newBooleanStatus      new status
     */
    public void modifySchedulerStatus(SchedulerBC changeSchedulerStatus,
                                      boolean newBooleanStatus);

    /**
     * Deletes a scheduler
     *
     * @param deleteScheduler object to delete
     */
    public void deleteSchedelur(SchedulerBC deleteScheduler);

}