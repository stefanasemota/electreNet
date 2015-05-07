package ch.albertlegrand.business.utility.impl;

import ch.albertlegrand.business.utility.SendMail;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 01:48
 * To change this template use File | Settings | File Templates.
 */
public class SendMailImpl implements SendMail {
    private static final Logger LOGGER = Logger.getLogger(SendMail.class);

    private static final String SMTP_HOST_NAME = "smtp.asemota.ch";
    private static final String SMTP_PORT = "25"; // default port is  465 !
    private static final String SMTP_AUTH_USER = "stefan@asemota.ch";
    private static final String SMTP_AUTH_PWD = "lausanne";
    private static final String SMTP_FROM_ADDRESS = SMTP_AUTH_USER;

    @Override
    public boolean sendEmail(String recipient, String subject, String messageText) throws TechnicalException {
        boolean debug = true;
        boolean emailSuccessfullySent = false;
        if ((recipient == null) && (subject == null))
            return false;

        if (messageText == null)
            messageText = "";

        String[] emailList = new String[1];
        emailList[0] = recipient;
        Properties props = new Properties();

        props.put("mail.smtp.host", SMTP_HOST_NAME);
        props.put("mail.smtp.auth", "true");
        props.put("mail.debug", "true");
        props.put("mail.smtp.user", SMTP_AUTH_USER);
        props.put("mail.smtp.password", SMTP_AUTH_PWD);
        props.put("mail.smtp.port", SMTP_PORT);

        Authenticator auth = new SMTPAuthenticator();

        Session session = Session.getDefaultInstance(props, auth);
        session.setDebug(debug);
        Message msg = new MimeMessage(session);

        try {
            InternetAddress addressFrom = new InternetAddress(SMTP_FROM_ADDRESS);
            msg.setFrom(addressFrom);
            InternetAddress[] addressTo = new InternetAddress[emailList.length];

            for (int i = 0; i < emailList.length; i++) {
                addressTo[i] = new InternetAddress(emailList[i]);
            }

            msg.setRecipients(Message.RecipientType.TO, addressTo);

            msg.setSubject(subject);
            msg.setContent(messageText, "text/plain");
            Transport.send(msg);
        } catch (Exception tE) {
            LOGGER.log(Level.ERROR, "Can not send email " + tE.getLocalizedMessage());
        }
        return emailSuccessfullySent;
    }

    /**
     * Setups an email authenticator object
     */
    private class SMTPAuthenticator extends javax.mail.Authenticator {
        public PasswordAuthentication getPasswordAuthentication() {
            String username = SMTP_AUTH_USER;
            String password = SMTP_AUTH_PWD;
            return new PasswordAuthentication(username, password);
        }
    }
}
