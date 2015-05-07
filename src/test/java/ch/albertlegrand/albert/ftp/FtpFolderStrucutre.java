package ch.albertlegrand.albert.ftp;

import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import ch.albertlegrand.data.dao.impl.DAOAlgOnlineServiceImpl;
import ch.albertlegrand.service.pluginCatalogue.ftp.AlbertFTPClientAdaptor;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * This classs tests the albert le grand ftp adapter class
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.03.12
 * Time: 23:33
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:juniTest.xml")
public class FtpFolderStrucutre {
    private static final Logger LOGGER = Logger.getLogger(FtpFolderStrucutre.class);
    @Autowired
    private AlbertFTPClientAdaptor albertFTPClientAdaptor;
    private DAOAlgOnlineServiceImpl daoService;

    @Test
    /**
     * Connects to the ALG ftp server and prints out the folder structure
     */
    @Ignore
    public void testAlgFtpFolderStructure() throws TechnicalException {
        try {
            //Assert.assertTrue(albertFTPClientAdaptor.connectAndLogin(new Service("Alg", "10.97.109.41", new Person("guest", "yeebCus2"))));
            albertFTPClientAdaptor.setPassiveMode(true);
            LOGGER.log(Level.DEBUG, "Working directory: " + albertFTPClientAdaptor.printWorkingDirectory());
            LOGGER.log(Level.DEBUG, albertFTPClientAdaptor.listSubdirNamesString());
            albertFTPClientAdaptor.disconnectFromHost();
        } catch (IOException e) {
            LOGGER.log(Level.ERROR, "Working directory: " + e.getMessage());
            throw new TechnicalException(e.getMessage());
        }
    }
}
