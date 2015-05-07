package ch.albertlegrand.business.utility.exceptions;

/**
 * Provides basic methods and operations for a scheduler problem
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 13:09
 * To change this template use File | Settings | File Templates.
 */
public class SCHEDULER_PROBLEM {

    /**
     * Enum containing possible faults types
     */
    public enum ErrorCode {
        WEB_UI_PROBLEM,
        DATA_ACCESS_PROBLEM,
        SERVICE_PROBLEM,
        CONFIGURATION_MISSING,
        SCHEDULER_SERVICE_NOT_FOUND,
        SCHEDULER_PROBLEM,
        GENERAL_PROBLEM
    }
}
