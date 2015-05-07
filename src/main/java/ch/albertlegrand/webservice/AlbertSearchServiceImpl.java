package ch.albertlegrand.webservice;

import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import ch.albertlegrand.business.utility.impl.ALGSearchTermImpl;
import ch.albertlegrand.business.utility.impl.ReadPropertyFileImpl;
import ch.albertlegrand.service.businesslogic.PluginServiceBC;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.jws.WebService;
import javax.xml.stream.XMLStreamException;
import java.io.IOException;
import java.util.List;

/**
 * Access the WSDL via http://localhost:8080/services/searchService?wsdl
 * URL CALL : http://localhost:8080/services/searchService/searchBookEan?bookEan=0073999541700
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 30.03.12
 * Time: 20:58
 * To change this template use File | Settings | File Templates.
 */
@WebService(endpointInterface = "ch.albertlegrand.webservice.AlbertSearchService")
public class AlbertSearchServiceImpl implements AlbertSearchService {
    private static final Logger LOGGER = Logger.getLogger(AlbertSearchServiceImpl.class);
    public static final Integer RET_CODE_OK = Integer.valueOf(0);
    public static final Integer RET_CODE_ERROR = Integer.valueOf(1);
    @Autowired
    private PluginServiceBC pluginServiceBC;

    @Override
    public String searchBookEan(String bookean) {
        if (bookean != null) {
            ALGSearchTermImpl algSearchTerm = new ALGSearchTermImpl();
            algSearchTerm.setSearchTerm(bookean);
            LOGGER.debug("Starting Webservice search with EAN: " + bookean);
            RawHitListObject item = pluginServiceBC.mockSearchEan(algSearchTerm);
            return "Title found : " + item.getBookTitle();
        } else {
            LOGGER.debug("Webservice attribute is invalid: " + bookean);
        }
        return "";
    }

    @Override
    public AlbertSearchTO searchBookTitle(String booktitle) {
        boolean paramok = false;
        AlbertSearchTO albertSearchTO = new AlbertSearchTO();
        if (booktitle != null) {
            paramok = true;
            ALGSearchTermImpl algSearchTerm = new ALGSearchTermImpl();
            algSearchTerm.setSearchTerm(booktitle);
            LOGGER.debug("Starting Webservice search with book title: " + booktitle);
            List<RawHitListObject> item = null;

            try {
                item = pluginServiceBC.mockSearchTitle(algSearchTerm);
            } catch (XMLStreamException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (IOException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            } catch (TechnicalException e) {
                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
            }
            albertSearchTO.setReturncode(RET_CODE_OK);
            albertSearchTO.getResults().addAll(item);
        }
        if (!paramok)
            albertSearchTO.setReturncode(RET_CODE_ERROR);


        return albertSearchTO;
    }

    @Override
    public String webserviceVersion() {
        //find out app environment version!!
        String environment = ReadPropertyFileImpl.getCurrentInstance().getValueForKey("appVersion");
        return environment;
    }
}
