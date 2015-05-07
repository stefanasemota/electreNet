package ch.albertlegrand.service.pluginCatalogue.elenet;

import ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter;

/**
 * This class over rides the electre search filter class
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 18:59
 * To change this template use File | Settings | File Templates.
 */
public class AlbertSearchFilter extends SearchFilter {

    public AlbertSearchFilter() {
        setDefaultAttributes();
    }

    public AlbertSearchFilter(boolean available, boolean sendImage) {
        super.setDisponible(available);
        super.setRestrictionImage(sendImage);
        setDefaultAttributes();
    }

    private void setDefaultAttributes() {
        setM_Famille(new AlbertTFilterFamille("FILTERFAMILLE_ALL"));
        setFiction(new AlbertFiction("Tout"));
    }

}
