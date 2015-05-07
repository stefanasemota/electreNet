package ch.albertlegrand.electre;

import ch.albertlegrand.business.catalogue.impl.ElectreNetBCImpl;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * This class connects to electre webservice and executes a simple search
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.03.12
 * Time: 23:24
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:juniTest.xml")
public class ElectreSearch {
    @Autowired
    private ElectreNetBCImpl electreNetBC;
    private static final Logger LOGGER = Logger.getLogger(ElectreSearch.class);

    /**
     * Connects to the electre webservice and searches for a EAN
     */
    @Test
    @Ignore
    public void testElectreLoginAndSearch() {
        String word = "Civil";
        LOGGER.debug("Starting a search on Electre with this word:" + word);
        try {
            // List<HitListRowObject> list = electreNetBC.search(new ALGSearchTermImpl("Civil"));
            electreNetBC.search();
            Assert.assertNotNull(electreNetBC);
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "RemoteException!" + e.getMessage());
        }
    }
}
