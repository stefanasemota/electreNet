package ch.albertlegrand.business.utility.exceptions;

import com.sun.jersey.api.NotFoundException;

import java.net.URI;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 26.11.11
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */
public class AlgNotFoundException extends NotFoundException {
    public AlgNotFoundException() {
        super();
    }


    public AlgNotFoundException(String message) {
        super(message);
    }

    public AlgNotFoundException(String message, URI uri) {
        super(message, uri);
    }


}
