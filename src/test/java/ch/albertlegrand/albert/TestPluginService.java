package ch.albertlegrand.albert;

import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.impl.ALGSearchTermImpl;
import ch.albertlegrand.service.businesslogic.PluginServiceBC;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 04.04.12
 * Time: 00:57
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:juniTest.xml")
public class TestPluginService {
    private static final Logger LOGGER = Logger.getLogger(TestPluginService.class);

    @Autowired
    private PluginServiceBC pluginServiceBC;

    @Test
    @Ignore
    public void eanSearch() {
        String ean = "0073999541700";
        ALGSearchTermImpl algSearchTerm = new ALGSearchTermImpl();
        algSearchTerm.setSearchTerm(ean);
        LOGGER.debug("Starting a search with this EAN: " + ean);
        RawHitListObject result = pluginServiceBC.mockSearchEan(algSearchTerm);
        Assert.assertNotNull(result);
        LOGGER.debug("" + result.getBookTitle());
    }

}
