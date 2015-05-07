package ch.albertlegrand.webservice;

import org.apache.log4j.Logger;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.03.12
 * Time: 22:53
 * To change this template use File | Settings | File Templates.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:juniTest.xml")
public class AlbertSearchServiceImplTest {
    private static final Logger LOGGER = Logger.getLogger(AlbertSearchServiceImplTest.class);

    private AlbertSearchService albertSearchService;

    @Before
    public void initialize() {
        albertSearchService = new AlbertSearchServiceImpl();
    }

    @Test
    public void testEanSearch() {
        String expected = "Hello World!";
        String actual = albertSearchService.searchBookEan("World");
        assertEquals(expected, actual);
    }
}
