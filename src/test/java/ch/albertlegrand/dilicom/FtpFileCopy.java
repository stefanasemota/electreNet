package ch.albertlegrand.dilicom;

import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.service.businesslogic.AlgOnlineServices;
import ch.albertlegrand.service.pluginCatalogue.ftp.AlbertFTPClientAdaptor;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * This use case copies a particular file from the dilicom server to the alg ftp
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.03.12
 * Time: 23:04
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:juniTest.xml")
public class FtpFileCopy {
    private static final Logger LOGGER = Logger.getLogger(FtpFileCopy.class);
    @Autowired
    private AlbertFTPClientAdaptor albertFTPClientAdaptor;
    private AlgOnlineServices algSystemService;

    @Test
    @Ignore
    public void testDilicomConnection() throws IOException {
        AlgOnlineService service = (AlgOnlineService) algSystemService.getById((long) 2);
        Assert.assertTrue(albertFTPClientAdaptor.connectAndLogin(service));
    }

    @Test
    @Ignore
    public void testTestFTPFileCopy() throws IOException {
        //connection
        AlgOnlineService service = (AlgOnlineService) algSystemService.getById((long) 2);
        Assert.assertTrue(albertFTPClientAdaptor.connectAndLogin(service));
        LOGGER.log(Level.DEBUG, albertFTPClientAdaptor.printWorkingDirectory());
    }
}
