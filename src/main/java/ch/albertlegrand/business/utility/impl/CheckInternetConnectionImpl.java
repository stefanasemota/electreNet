package ch.albertlegrand.business.utility.impl;

import ch.albertlegrand.business.utility.CheckInternetConnection;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import org.apache.log4j.Logger;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.URL;
import java.net.URLConnection;
import java.nio.CharBuffer;
import java.util.Date;

/**
 * This class sends an email to the administrator
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 */
public class CheckInternetConnectionImpl implements CheckInternetConnection {

    private final Logger LOG = Logger.getLogger(CheckInternetConnectionImpl.class.getName());
    private static final String URL_TO_CHECK = "http://www.google.com/";
    private static final long CHECK_EVERY = 30 * 60 * 1000; /* 30 minutes */
    private static final int BUF_SIZE = 1024;
    private static CheckInternetConnection ref;

    private Date lastCheck;
    private Boolean lastState;

    public CheckInternetConnectionImpl() {
    }

    private boolean isStateValid() {
        if (lastState == null)
            return false;
        if (lastCheck.getTime() == System.currentTimeMillis() + CHECK_EVERY)
            return false;
        return true;
    }

    @Override
    public boolean isConnectionPresent() throws TechnicalException {
        if (!isStateValid()) {
            checkConnection();
        }
        return lastState;
    }

    /**
     * checks if an internet connection is present
     *
     * @param forceCheck
     * @return
     */
    @Override
    public boolean isConnectionPresent(boolean forceCheck) throws TechnicalException {
        if (forceCheck)

            invalidateState();
        return isConnectionPresent();
    }

    /**
     * resets the check state status
     */
    private void invalidateState() {
        lastCheck = null;
        lastState = null;
    }

    /**
     * Checks if there is an available internet connection
     */
    @Override
    public void checkConnection() throws TechnicalException {
        lastCheck = new Date();
        try {
            URL url = new URL(URL_TO_CHECK);
            URLConnection urlConnection = url.openConnection();

            InputStream inputStream = urlConnection.getInputStream();
            Reader reader = new InputStreamReader(inputStream);

            StringBuilder contents = new StringBuilder();
            CharBuffer buf = CharBuffer.allocate(BUF_SIZE);

            while (true) {
                reader.read(buf);
                if (!buf.hasRemaining())
                    break;

                contents = contents.append(buf);
            }
            inputStream.close();
            lastState = true;
        } catch (Exception e) {
            lastState = false;
            // throw new TechnicalException("Internet connectivity not present, an email shall be sent", e);
        }
    }

    public synchronized static CheckInternetConnection getDefaultInstance() {
        ref = new CheckInternetConnectionImpl();
        return ref;
    }
}
