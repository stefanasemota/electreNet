package ch.albertlegrand.business.utility;

/**
 * Provides basic methods for the sending of a mail
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 01:47
 * To change this template use File | Settings | File Templates.
 */
public interface SendMail {

    /**
     * Sends an escalation email to the recipient
     *
     * @param recipient a person to recieve the mail
     * @param subject   title of email header
     * @param message   content
     * @return boolean if sent
     * @throws Exception conneciton
     */
    public boolean sendEmail(String recipient, String subject, String message) throws Exception;
}
