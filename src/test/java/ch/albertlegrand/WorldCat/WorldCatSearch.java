package ch.albertlegrand.WorldCat;

import ch.albertlegrand.business.catalogue.WorldCatBC;
import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import ch.albertlegrand.business.utility.impl.ALGSearchTermImpl;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * This Unit test class tests the following WorldCat cases:
 * 1) connection
 * 2) search
 * <p/>
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.03.12
 * Time: 23:07
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:juniTest.xml")
public class WorldCatSearch {
   // @Autowired
    private WorldCatBC worldCatBC;
    private static final Logger LOGGER = Logger.getLogger(WorldCatSearch.class);

    /**
     * Connects to the world cat service and executes a search query
     */
    @Test
    @Ignore
    public void testWorldcatOpenSearch() throws TechnicalException {
        Assert.assertNotNull(worldCatBC);
        try {
            List<RawHitListObject> listOfBooks = worldCatBC.search(new ALGSearchTermImpl("War"));
            Assert.assertNotNull(listOfBooks);
            for (RawHitListObject book : listOfBooks) {
                LOGGER.log(Level.DEBUG, book.getAuthorName());
            }
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Check log files for more details");
            throw new TechnicalException(e.getMessage(), e);
        }
    }

    @Test
    @Ignore
    public void testQueryLimit() throws TechnicalException {
        int countDownLimit = 1000;
        while (countDownLimit > 0) {
            try {
                testWorldcatOpenSearch();
                --countDownLimit;
            } catch (TechnicalException e) {
                LOGGER.log(Level.ERROR, "Query limit reached for World Cat, current limit is at " + countDownLimit);
                throw new TechnicalException(e.getMessage(), e);
            }
        }
    }
}
