package ch.albertlegrand.business.bc;

import ch.albertlegrand.data.model.ScrapBook;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 16:11
 * To change this template use File | Settings | File Templates.
 */
public interface ScrapBookBC {

    public void addBulkInsertsAfterExtraction();

    /**
     * Deletes all entries in table
     */
    public void deleteAll();

    /**
     * Adds new scrapBook
     */
    public void addScrapBook(ScrapBook scrapBook);

    public void convertedToBookAndInsert(Collection<ScrapBook> scrapBookCollection);

}
