package ch.albertlegrand.business.catalogue.impl;

import ch.albertlegrand.business.catalogue.WorldCatBC;
import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import ch.albertlegrand.business.utility.impl.CheckInternetConnectionImpl;
import ch.albertlegrand.business.utility.validators.ALGValidator;
import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.service.businesslogic.AlgOnlineServices;
import ch.albertlegrand.service.pluginCatalogue.worldcat.WorldCatAdaptorImpl;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.XMLEvent;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:10
 */
//@Service
public class WorldCatBCImpl implements WorldCatBC {
    private RawHitListObject rawHitListObject;
    @Autowired
    private WorldCatAdaptorImpl worldCatAdaptor;

    @Autowired
    private AlgOnlineServices algOnlineService;

    private int totalResult;

    /**
     * Default constructor
     */
    public WorldCatBCImpl() {

    }

    @Override
    public List search(ALGSearchTerm searchItem) throws IOException, XMLStreamException, TechnicalException {
        String searchString = "http://worldcat.org/webservices/catalog/search/opensearch?q=" + ALGValidator.cleanSearchItem(searchItem) + "&wskey=gRbqoei0BIKdKEWmHIQDv7nvwSnhkoCvZXoFRZBHGnpQBGZgijNlH5yyLJe4u50StgkRkx59xwtDOvUl";
        boolean internetConnectionPresent = CheckInternetConnectionImpl.getDefaultInstance().isConnectionPresent();
        //check if there is an internet connection
        if (internetConnectionPresent && getQueryLimit() <= 1000) {
            return constructBook(searchString);
        }
        return null;
    }

    /**
     * Reduces the Worldcat query limit by 1
     */
    private void downGrandQueryLimit() {
        AlgOnlineService service = (AlgOnlineService) algOnlineService.getById((long) 5);
        long newLimit = service.getUsagelimit() - 1;
        service.setUsagelimit(newLimit);
        algOnlineService.modifyService(service);
    }

    /**
     * Get the current query limit
     *
     * @return int
     */
    private int getQueryLimit() {
        AlgOnlineService service = (AlgOnlineService) algOnlineService.getById((long) 5);
        return (int) service.getUsagelimit();
    }

    /**


    /**
     * Constructs a list of books form an atom object
     *
     * @param urlString search url
     * @throws XMLStreamException xml
     */
    List constructBook(String urlString) throws XMLStreamException {
        List results = null;
        //Value object that contains all the books
        try {
            XMLInputFactory inputFactory = XMLInputFactory.newInstance();
            InputStream in = new URL(urlString).openStream();
            XMLEventReader eventReader = inputFactory.createXMLEventReader(in);
            boolean inEntry = false;
            while (eventReader.hasNext()) {
                XMLEvent event = eventReader.nextEvent();
                if (event.isStartElement()) {
                    System.out.println(event.asStartElement().getName().getLocalPart());
                    /**
                     * NAME
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("name")) {
                        event = eventReader.nextEvent();
                        String authorname = event.asCharacters().getData();
                        if (!inEntry) {

                        } else {
                            if (!ALGValidator.IsNullOrEmpty(authorname)) {
                                if (authorname.length() > 100) {
                                    String truncatedTitle = authorname.substring(0, 90);
                                    rawHitListObject.setAuthorName(truncatedTitle);
                                } else
                                    rawHitListObject.setAuthorName(authorname);
                            }
                        }
                        continue;
                    }
                    /**
                     * TITLE
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("title")) {
                        event = eventReader.nextEvent();
                        String title = event.asCharacters().getData();
                        if (!inEntry) {
                        } else {
                            if (!ALGValidator.IsNullOrEmpty(title)) {
                                if (title.length() > 100) {
                                    String truncatedTitle = title.substring(0, 90);
                                    rawHitListObject.setBookTitle(truncatedTitle);
                                } else
                                    rawHitListObject.setBookTitle(title);
                            }
                        }
                        continue;
                    }
                    /**
                     * TOTAL RESULTS
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("totalResults")) {
                        event = eventReader.nextEvent();
                        String totalResults = event.asCharacters().getData();
                        if (!inEntry) {
                            totalResult = Integer.parseInt(totalResults);
                        } else {
                            totalResult = Integer.parseInt(totalResults);
                        }
                        results = new ArrayList();
                        continue;
                    }
                    /**
                     * SUBTITLE
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("subtitle")) {
                        event = eventReader.nextEvent();
                        String subtitle = event.asCharacters().getData();
                        if (!inEntry) {
                        } else {
                            rawHitListObject.setBookTitle(subtitle);
                        }
                        continue;
                    }
                    /**
                     * ISBN
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("identifier")) {
                        event = eventReader.nextEvent();
                        String isbn = event.asCharacters().getData();
                        if (!inEntry) {
                        } else {
                            String[] splitValue = isbn.split(":");
                            String tmpisbn = splitValue[2];
                            if (!ALGValidator.IsNullOrEmpty(tmpisbn)) {
                                if (tmpisbn.length() > 9) {
                                    String truncatedTitle = tmpisbn.substring(0, 9);
                                    rawHitListObject.setIsbnNumber(truncatedTitle);
                                } else
                                    rawHitListObject.setIsbnNumber(tmpisbn);
                            }
                        }
                        continue;
                    }

                    /**
                     * CONTENT
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("content")) {
                        event = eventReader.nextEvent();
                        String content = event.asCharacters().getData();
                        if (!inEntry) {
                        } else {
                            String convertedValue = ALGValidator.convertHtmlToString(content);
                            //worldCatbook.set(convertedValue);
                        }
                        continue;
                    }

                    /**
                     * AUTHOR
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("author")) {
                        event = eventReader.nextEvent();
                        String author = event.asCharacters().getData();
                        if (!inEntry) {
                        } else {
                            rawHitListObject.setAuthorName(author);
                        }
                        continue;
                    }
                    /**
                     * ENTRY
                     */
                    if (event.asStartElement().getName().getLocalPart().equals("entry")) {
                        inEntry = true;
                        rawHitListObject = new RawHitListObject();
                        rawHitListObject.setBookSource(WorldCatBC.class.getSimpleName());
                    }
                } else if (event.isEndElement()) {
                    if (event.asEndElement().getName().getLocalPart().equals("entry")) {
                        inEntry = false;
                        results.add(rawHitListObject);
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //if query is successful, decrement query limit
        downGrandQueryLimit();
        return results;
    }
}