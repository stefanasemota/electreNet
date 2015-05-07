package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.business.bc.ScrapBookBC;
import ch.albertlegrand.business.catalogue.ElectreNetBC;
import ch.albertlegrand.business.catalogue.WorldCatBC;
import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.RawHitListObject;
import ch.albertlegrand.business.utility.SpringJdbcTemplateExtractor;
import ch.albertlegrand.data.dao.DAOScrapBook;
import ch.albertlegrand.data.model.ScrapBook;
import ch.albertlegrand.service.businesslogic.BookService;
import ch.albertlegrand.service.businesslogic.ScrapBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 15:25
 * To change this template use File | Settings | File Templates.
 */
@Component
public class ScrapBookServiceImpl implements ScrapBookService {


    @Autowired(required = true)
    private DAOScrapBook daoScrapBook;

    @Autowired
    private BookService bookService;

    @Autowired
    private SpringJdbcTemplateExtractor springJdbcTemplateExtractor;

    @Autowired
    private ScrapBookBC scrapBookBCImpl;

    @Autowired
    private JdbcDaoSupportServices jdbcDaoSupportServices;

    @Override
    @Transactional
    public void deleteAll() {
        daoScrapBook.deleteAll();
    }

    @Override
    public void addScrapBook(ScrapBook scrapBook) {
        daoScrapBook.addScrapBook(scrapBook);
    }

    @Override
    /**
     * This implementation SHALL NOT USE HIBERNATE FOR INSERTIONS DUE TO THE LATENCY
     */
    public void addCollectionScrapBook(Collection<ScrapBook> scrapBookCollection) {
        jdbcDaoSupportServices.insertBookBulk(scrapBookCollection);
    }

    @Override
    public RawHitListObject findEan(ALGSearchTerm algSearch) {
        ScrapBook scrapBook = daoScrapBook.findEan(algSearch);
        RawHitListObject rawHitListObject = new RawHitListObject();
        rawHitListObject.setBookTitle(scrapBook.getP20DiliCwordingStandard());
        rawHitListObject.setBookSource("");
        rawHitListObject.setDatePublished(scrapBook.getP17DiliCdatePublished().toString());
        rawHitListObject.setEanNumber(scrapBook.getP02DiliCean());
        return rawHitListObject;
    }

    @Override
    public void createSearchItem(List<RawHitListObject> rawHitListObject) {
        ScrapBook newSearchItem = new ScrapBook();
        // TODO prepare the scrap book before calling the persistence method
        for (RawHitListObject newBook : rawHitListObject) {
            if (WorldCatBC.class.getSimpleName().equals(newBook.getBookSource())) {
                newSearchItem.setwCatBtitle(newBook.getBookTitle());
                newSearchItem.setwCatBauthorName(newBook.getAuthorName());
                newSearchItem.setwCatBisbn(newBook.getIsbnNumber());
            } else if (ElectreNetBC.class.getSimpleName().equals(newBook.getBookSource())) {
                newSearchItem.setEleNetTitle(newBook.getBookTitle());
                newSearchItem.setEleNetAuthor(newBook.getAuthorName());
                newSearchItem.setEleNetIsbnUsed(newBook.getIsbnNumber());
            }
            newSearchItem.setP02DiliCean("");
            addScrapBook(newSearchItem);
        }
    }

    @Override
    public List findTitle(ALGSearchTerm algSearch) {
        List<RawHitListObject> titleLists = new ArrayList<RawHitListObject>();
        List<ScrapBook> tmpList = daoScrapBook.findTitle(algSearch);
        for (ScrapBook scrapBook : tmpList) {
            RawHitListObject newItem = new RawHitListObject();
            newItem.setBookTitle(scrapBook.getP20DiliCwordingStandard());
            titleLists.add(newItem);
        }
        return titleLists;
    }
}
