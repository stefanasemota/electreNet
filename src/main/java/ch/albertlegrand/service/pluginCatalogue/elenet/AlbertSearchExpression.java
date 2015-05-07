package ch.albertlegrand.service.pluginCatalogue.elenet;

import ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression;
import ch.albertlegrand.business.utility.ALGSearchTerm;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 19:09
 * To change this template use File | Settings | File Templates.
 */
public class AlbertSearchExpression extends SearchExpression {

    public AlbertSearchExpression() {

    }

    public AlbertSearchExpression(ALGSearchTerm searchItem, boolean phonetic) {
        setExpression(searchItem.getSearchTerm());
        setPhonetic(phonetic);
    }
}
