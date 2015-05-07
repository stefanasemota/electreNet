package ch.albertlegrand.business.catalogue.impl;

import ch.albertlegrand.business.catalogue.ElectreNetBC;
import ch.albertlegrand.business.catalogue.com.electreNet.*;
import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.HitListRowObject;
import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.exceptions.TechnicalException;
import ch.albertlegrand.service.pluginCatalogue.elenet.*;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import javax.xml.rpc.ServiceException;
import java.rmi.RemoteException;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public class ElectreNetBCImpl implements ElectreNetBC {
    private static final Logger LOGGER = Logger.getLogger(ElectreNetBC.class);

    @Autowired
    private ElectreAdaptorImpl electreAdaptor;

    /**
     * default constructor
     */
    public ElectreNetBCImpl() {
    }

    /**
     * Executes a search using the Electre SearchSoap class
     *
     * @param searchItem item to search for
     */
    public List<HitListRowObject> search(ALGSearchTerm searchItem) throws TechnicalException {
        SearchFilter searchFilter = new AlbertSearchFilter(true, false);
        String searchId;
        ListOption[] options;
        List list = null;
        RawHitListObject rawHitListObject;

        //TODO check if there is an internet connection, this method shall be removed
        electreAdaptor.initializeConnection(false);
        try {
            searchId = electreAdaptor.getSearchSoap().rapideSearch(electreAdaptor.getSessionId(), new AlbertSearchExpression(searchItem, false), true, searchFilter);
            options = new ListOption[]{ListOption.ListEan};
            ListEntry[] listArray;
            listArray = electreAdaptor.getSearchSoap().getNoticeList(electreAdaptor.getSessionId(), searchId, 0, 10, null, options);
            list = new ArrayList<HitListRowObject>(listArray.length);
            for (ListEntry listEntry : listArray) {
                rawHitListObject = new RawHitListObject();
                rawHitListObject.setBookSource("Electre");
                rawHitListObject.setEanNumber(listEntry.getNoNotice());
                list.add(rawHitListObject);
            }
            if (!electreAdaptor.keepConnectionOpen) {
                electreAdaptor.killConnection();
            }
        } catch (RemoteException e) {
            LOGGER.log(Level.ERROR, "RemoteException!" + e.getMessage());
        }
        return list;
    }

    @Override
    //TODO THIS METHOD WILL BE BE REMOVED
    public List mockSearch(ALGSearchTerm searchItem) throws TechnicalException {
        SearchFilter searchFilter = new AlbertSearchFilter(true, false);
        String searchId;
        ListOption[] options;
        List rawHitListObjects = null;
        RawHitListObject hitListRowObject;

        //TODO check if there is an internet connection, this method shall be removed
        electreAdaptor.initializeConnection(false);
        try {
            searchId = electreAdaptor.getSearchSoap().rapideSearch(electreAdaptor.getSessionId(), new AlbertSearchExpression(searchItem, false), true, searchFilter);
            options = new ListOption[]{ListOption.ListEan};
            ListEntry[] listArray;

            listArray = electreAdaptor.getSearchSoap().getNoticeList(electreAdaptor.getSessionId(), searchId, 0, 10, null, options);
            if (listArray.length > 0) {
                rawHitListObjects = new ArrayList<RawHitListObject>(listArray.length);
                for (ListEntry listEntry : listArray) {
                    hitListRowObject = new RawHitListObject();
                    //check title
                    String title = (String) listEntry.getFields()[0];
                    if (title.length() > 99) {
                        String truncatedTitle = title.substring(0, 99);
                        hitListRowObject.setBookTitle(truncatedTitle);
                    } else
                        hitListRowObject.setBookTitle(title);

                    hitListRowObject.setBookSource(ElectreNetBC.class.getSimpleName());
                    hitListRowObject.setEanNumber(listEntry.getNoNotice());
                    rawHitListObjects.add(hitListRowObject);
                }
            }
            if (!electreAdaptor.keepConnectionOpen) {
                electreAdaptor.killConnection();
            }
        } catch (RemoteException e) {
            LOGGER.log(Level.ERROR, "RemoteException: " + e.getMessage());
        }
        return rawHitListObjects;
    }

    public void search() throws ServiceException, RemoteException {
        electreAdaptor.initializeConnection(false);
        String sessionId = electreAdaptor.getSessionId();
        // utiliser notre nouvelle objet "Locator" pour construe le proxy du service Search
        SearchLocator searchLocator = new SearchLocator();
        // obtenir l'interface du service Search
        SearchSoap search = electreAdaptor.getSearchSoap();
        SearchFilter filter = new SearchFilter();
        //SearchFilter filter = new AlbertSearchFilter(true, false);

        GregorianCalendar apres = new GregorianCalendar(2008, 1, 1);
        GregorianCalendar avant = new GregorianCalendar(2009, 1, 2);
        // formatteur pour date en ISO8601
        //SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
        //filter.setAvant(formatter.format(avant.getTime()));
        //filter.setApres(formatter.format(apres.getTime()));
        filter.setM_Famille(new AlbertTFilterFamille("FILTERFAMILLE_ALL"));
        filter.setFiction(new AlbertFiction("Tout"));
        //WordType wordTypes[] = {com.electre.WORDTYPE_RAPIDE};
        String searchId = search.rapideSearch(sessionId, null, true, filter);
        ListOption options[] = {ListOption.ListEan};
        ListEntry[] listArray = search.getNoticeList(sessionId, searchId, 0, 10, null, options);
        for (ListEntry listEntry : listArray) {
            LOGGER.log(Level.INFO, "Notice " + listEntry.getNoNotice().toString());
            System.out.print("\t");
            Object val = listEntry.getFields()[0];
            LOGGER.log(Level.INFO, "Title " + val);
        }
    }

    @Override
    /**
     * Search for a particular ean
     */
    public void searchForEAN() throws RemoteException {
        electreAdaptor.initializeConnection(false);
        String value = electreAdaptor.getSearchSoap().searchIsbnEan(electreAdaptor.getSessionId(), true, new AlbertSearchFilter(), "978-2-266-13032-5");
        LOGGER.log(Level.INFO, "ISBN " + value);
    }


    public void finalize() throws Throwable {
        super.finalize();
    }
}