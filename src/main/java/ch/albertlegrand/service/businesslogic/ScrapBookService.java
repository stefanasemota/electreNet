package ch.albertlegrand.service.businesslogic;

import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.data.model.ScrapBook;

import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 12:01
 * To change this template use File | Settings | File Templates.
 */
public interface ScrapBookService {

    public void deleteAll();

    public void addScrapBook(ScrapBook scrapBook);

    public void addCollectionScrapBook(Collection<ScrapBook> scrapBookCollection);

    public RawHitListObject findEan(ALGSearchTerm algSearch);

    public void createSearchItem(List<RawHitListObject> rawHitListObject);

    public List findTitle(ALGSearchTerm algSearch);
}
