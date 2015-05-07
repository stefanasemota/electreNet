package ch.albertlegrand.business.utility.exceptions;

/**
 * Provides basic methods and operations for a Fault exception
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 14:06
 * To change this template use File | Settings | File Templates.
 */
public class FaultException extends Exception {
    private Throwable throwable;

    public FaultException() {
        super();
    }

    public FaultException(String string) {
        super(string);
    }

    public FaultException(String string, Throwable throwable) {
        super(string);
        this.throwable = throwable;
    }

    public Throwable getThrowable() {
        return throwable;
    }
}
