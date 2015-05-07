package ch.albertlegrand.dilicom;

import ch.albertlegrand.business.catalogue.DilicomBC;
import ch.albertlegrand.data.model.AlgSystem;
import ch.albertlegrand.service.businesslogic.AlgSystemService;
import org.apache.log4j.Logger;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.03.12
 * Time: 23:36
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:juniTest.xml")
public class Extraction {
    private static final Logger LOGGER = Logger.getLogger(Extraction.class);

    @Autowired
    private DilicomBC dilicomBC;

    @Autowired
    private AlgSystemService algSystemService;

    /**
     * Test the dilicom scheduler jobs
     */
    @Test
    @Ignore
    public void testDilicomScheduler() {
        //pick up the Dilicom system references
        AlgSystem algSystem = (AlgSystem) algSystemService.getById(2);
        try {
            dilicomBC.executeDilicomJobs(algSystem);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Test
    @Ignore
    public void testDilicomExtraction() {
        //pick up the Dilicom system references
        AlgSystem algSystem = (AlgSystem) algSystemService.getById(1);
        dilicomBC.executeExtraction(algSystem);
    }

    @Test
    @Ignore
    public void testBookInsertionsAfterExtraction() {
        AlgSystem algSystem = (AlgSystem) algSystemService.getById(1);
        dilicomBC.insertIntoDatabaseAfterSuccessfulExtraction(algSystem);
    }
}
