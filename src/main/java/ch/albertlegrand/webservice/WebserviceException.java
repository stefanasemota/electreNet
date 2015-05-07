package ch.albertlegrand.webservice;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 07.04.12
 * Time: 23:22
 * To change this template use File | Settings | File Templates.
 */
public class WebserviceException extends Exception {
    private static final long serialVersionUID = 1L;

    // (der dummy-Parameter wird erst spaeter benoetigt)
    public WebserviceException(String err, Object dummy) {
        super(err);
    }
}
