package ch.albertlegrand.business.utility.logging;

import org.apache.log4j.AppenderSkeleton;
import org.apache.log4j.spi.LoggingEvent;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 * <p/>
 * making asserts against logs.
 * <p/>
 * Example how to use:
 * final Log4jDatabaseAppender log4jDatabaseAppender = new Log4jDatabaseAppender();
 * final Logger logger = Logger.getLogger(MyClass.class.getName());
 * try {
 * logger.addAppender(log4jDatabaseAppender);
 * // do something
 * assertEquals(Lists.newArrayList("Attempted to read such-and-such, but could not: oops"), log4jDatabaseAppender.getMessagesLogged());
 * } finally {
 * logger.removeAppender(log4jDatabaseAppender);
 * }
 */
public class Log4jDatabaseAppender extends AppenderSkeleton {
    private List messages = new ArrayList();

    @Override
    protected void append(LoggingEvent event) {
        messages.add(event.getRenderedMessage());
    }

    /**
     * Check if a log message contains a value
     *
     * @param snippet
     * @return boolean
     */
    public boolean doMessagesContain(String snippet) {
        boolean isFound = false;
        for (Object message : messages) {
            String messageItem = (String) message;
            if (messageItem.indexOf(snippet) >= 0) {
                isFound = true;
            }
        }
        return isFound;
    }

    @Override
    public void close() {
    }

    @Override
    public boolean requiresLayout() {
        return false;
    }

    public List getMessagesLogged() {
        return messages;
    }
}
