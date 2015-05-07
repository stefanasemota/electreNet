package ch.albertlegrand.business.utility;

/**
 * Provides basic methods for the sending of a mail
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 01:47
 * To change this template use File | Settings | File Templates.
 */
public interface ReadPropertyFile {

    /**
     * Returns the value of the key from the property file
     *
     *
     * @param recipient a person to recieve the mail
     * @return boolean if sent
     */
    public String getValueForKey(String recipient) ;
}
