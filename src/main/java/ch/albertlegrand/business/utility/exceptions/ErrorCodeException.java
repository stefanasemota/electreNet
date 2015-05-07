package ch.albertlegrand.business.utility.exceptions;

/**
 * Provides basic methods and operations for an Error code exception
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 13:07
 * To change this template use File | Settings | File Templates.
 */
public class ErrorCodeException extends RuntimeException {
    /**
     * serialVersionUID - long
     */
    protected static final long serialVersionUID = 1L;

    protected SCHEDULER_PROBLEM.ErrorCode errorCode = SCHEDULER_PROBLEM.ErrorCode.GENERAL_PROBLEM;

    public void setErrorCode(SCHEDULER_PROBLEM.ErrorCode errorCode) {
        this.errorCode = errorCode;
    }

    public SCHEDULER_PROBLEM.ErrorCode getErrorCode() {
        return errorCode;
    }

    public ErrorCodeException() {
    }

    public ErrorCodeException(String message) {
        super(message);
    }

    public ErrorCodeException(Throwable cause) {
        super(cause);
    }

    public ErrorCodeException(String message, Throwable cause) {
        super(message, cause);
    }

    public ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode errorCode, String message) {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode errorCode, Throwable cause) {
        super(cause);
        this.errorCode = errorCode;
    }

    public ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode errorCode, String message, Throwable cause) {
        super(message, cause);
        this.errorCode = errorCode;
    }

    @Override
    public String getMessage() {
        return errorCode + ": " + super.getMessage();
    }
}
