package ch.albertlegrand.scheduler.impl;

import ch.albertlegrand.scheduler.DilicomTask;
import ch.albertlegrand.scheduler.ISchedulerService;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 12.04.12
 * Time: 18:18
 * To change this template use File | Settings | File Templates.
 */
public class SchedulerService implements ISchedulerService {
    private DilicomTask dilicomTask;

    @Override
    public void executeDilicomTask() {
        getDilicomTask().execute();
    }

    public DilicomTask getDilicomTask() {
        return dilicomTask;
    }

    public void setDilicomTask(DilicomTask dilicomTask) {
        this.dilicomTask = dilicomTask;
    }
}
