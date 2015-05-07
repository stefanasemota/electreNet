package ch.albertlegrand.data.dao;

import ch.albertlegrand.service.schudeler.SchedulerService;
import ch.albertlegrand.service.schudeler.Service;

import java.util.List;

/**
 * A data access object (DAO) providing persistence and search support for
 * SchedulerService entities. Transaction control of the save(), update() and delete()
 * operations must be handled externally by senders of these methods or must be
 * manually added to each of these methods for data to be persisted to the JPA
 * datastore.
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 13:41
 * To change this template use File | Settings | File Templates.
 */
public interface DaoSchedulerService extends Service {
    void saveSchedulerService(SchedulerService schedulerService, String origConfigPropsText, boolean update);

    void deleteSchedulerService(String schedulerServiceName);

    String getConfigPropsText(String schedulerServiceName);

    SchedulerService getSchedulerService(String schedulerServiceName);

    boolean hasSchedulerService(String schedulerServiceName);

    List<String> getSchedulerServiceNames();
}
