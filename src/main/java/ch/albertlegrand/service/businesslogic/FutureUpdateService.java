package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.data.model.FutureUpdate;

import java.util.Date;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 11:59
 * To change this template use File | Settings | File Templates.
 */
public interface FutureUpdateService {
    /**
     * Finds all the updates that should be executed today
     *
     * @param givenDate particular date
     * @return a list of FutureUpdate
     */
    public List<FutureUpdate> findUpdatesForDate(Date givenDate);

    /**
     * Adds a future update
     */
    public void addFutureUpdate(FutureUpdate futureUpdate);

    /**
     * Find all future updates
     *
     * @return
     */
    public List findAll();
}
