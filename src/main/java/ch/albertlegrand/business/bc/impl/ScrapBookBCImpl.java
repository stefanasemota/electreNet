package ch.albertlegrand.business.bc.impl;

import ch.albertlegrand.business.bc.ScrapBookBC;
import ch.albertlegrand.business.utility.SpringJdbcTemplateExtractor;
import ch.albertlegrand.data.model.*;
import ch.albertlegrand.service.businesslogic.*;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.01.12
 * Time: 17:35
 * To change this template use File | Settings | File Templates.
 */
public class ScrapBookBCImpl implements ScrapBookBC {
    private Integer VERSION_INCREMENTATION = 1;
    @Autowired
    private ScrapBookService scrapBookService;

    @Autowired
    private BookDetailService bookDetailService;

    @Autowired
    private BookTitleService bookTitleService;

    @Autowired
    private QuantumService quantumService;

    @Autowired
    private BookService bookService;

    @Autowired
    private BookDistributorService bookDistributorService;

    @Autowired
    private SpringJdbcTemplateExtractor springJdbcTemplateExtractor;

    @Override
    public void deleteAll() {
        scrapBookService.deleteAll();
    }

    @Override
    public void addScrapBook(ScrapBook scrapBook) {
        scrapBookService.addScrapBook(scrapBook);
    }

    @Override
    @Transactional
    public void addBulkInsertsAfterExtraction() {
        //Get 150 per data from scrapbook
        List<ScrapBook> scrapBooks = new ArrayList<ScrapBook>();
        boolean jobDone = false;
        boolean pause = false;
        while (!jobDone) {
            pause = false;
            int lineCount = 0;
            while (!pause) {
                ++lineCount;
                if (lineCount % 30 == 0) {
                    scrapBooks = springJdbcTemplateExtractor.getPaginationList("SELECT * FROM ScrapBook", 1, 30);
                    pause = true;
                }
            }
            //convert scrapbook to book and insert into db
            convertedToBookAndInsert(scrapBooks);
            // delete all inserted scrapbooks
            springJdbcTemplateExtractor.deleteCollection(scrapBooks);
            scrapBooks = null;
            if (0 == springJdbcTemplateExtractor.findTotalScrapBook()) {
                jobDone = true;
            }
        }
    }

    public void convertedToBookAndInsert(Collection<ScrapBook> scrapBookCollection) {
        Collection<Book> bookCollection = new ArrayList<Book>();
        for (ScrapBook scrapBook : scrapBookCollection) {
            bookCollection.add(convertScrapBookToBook(scrapBook));
        }

        //INSERT INTO DATABASE
        bookService.addBulkInsertsForExtraction(bookCollection);
    }

    /**
     * This method does the following tasks
     * creates a transient book
     * Inserts the various references into the database
     * Update the various book object references / relations
     *
     * @param newScrapBook
     * @return a Complete book object
     */
    private Book convertScrapBookToBook(ScrapBook newScrapBook) {
        Book transientNewBook = new Book();

        /**
         * general settings
         */
        transientNewBook.setVersion((long) VERSION_INCREMENTATION);
        transientNewBook.setAlgOnlineServiceRef((long) 2);

        /**
         * Quantum
         */
        Quantum quantum = new Quantum();
        quantum.setVersion(VERSION_INCREMENTATION);
        quantum.setHeight(newScrapBook.getP25DiliCheight());
        quantum.setWeight(newScrapBook.getP26DiliCweight());
        quantum.setThickness(newScrapBook.getP23DiliCthickness());
        quantum.setWidth(newScrapBook.getP24DiliCwidth());

        /**
         * Guard for dilicom
         */
        if (newScrapBook.getP02DiliCean() != null) {
            transientNewBook.setAuthorName(newScrapBook.getP30DiliCauthor());
            transientNewBook.setBookBinding(newScrapBook.getP31DiliCbinding());
            //transientNewBook.setDateExtraction(ALGValidator.getTodaysDate());
            transientNewBook.setDiliCwordingCounter(newScrapBook.getP21DiliCwordingCounter());
            transientNewBook.setDiliCwordingExtended(newScrapBook.getP27DiliCwordingExtended());
            transientNewBook.setDiliCwordingStandard(newScrapBook.getP20DiliCwordingStandard());
            transientNewBook.setEan(newScrapBook.getP02DiliCean());
            transientNewBook.setDatePublished(newScrapBook.getP17DiliCdatePublished());
            transientNewBook.setDateUpdated(newScrapBook.getP45DiliCdateOfLastModification());
            transientNewBook.setMarkAsDeleted(false);
            transientNewBook.setProductType(Integer.valueOf(newScrapBook.getP18DiliCtypeProduct()));
            transientNewBook.setPublisherName(newScrapBook.getP28DiliCpublisher());

            /**
             * Book title
             */
            Booktitle bookTitle = new Booktitle();
            bookTitle.setVersion(VERSION_INCREMENTATION);
            bookTitle.setDiliCwordingCounter(newScrapBook.getP21DiliCwordingCounter());
            bookTitle.setDiliCwordingExtended(newScrapBook.getP27DiliCwordingExtended());
            bookTitle.setDiliCwordingStandard(newScrapBook.getP20DiliCwordingStandard());

            /**
             * book detail
             */
            BookDetail bookDetail = new BookDetail();
            bookDetail.setVersion(VERSION_INCREMENTATION);

            bookDetail.setDiliCauthor(newScrapBook.getP30DiliCauthor());
            bookDetail.setDiliCcollectionName(newScrapBook.getP29DiliCcollectionName());
            bookDetail.setDiliCcomandableUnit(newScrapBook.getP39DiliCcommandableUnit());
            bookDetail.setDiliCjointSalesPackage(newScrapBook.getP40DiliCjointSalesPackage());
            bookDetail.setDiliClinkingCodes(newScrapBook.getP37DiliClinkingCodes());
            bookDetail.setDiliCmovementCode(newScrapBook.getP01DiliCmovementCode());
            bookDetail.setDiliCnumberOfReference(newScrapBook.getP43DiliCnumberOfReference());
            bookDetail.setDiliCpublisher(newScrapBook.getP28DiliCpublisher());
            bookDetail.setDiliCserialCollection(newScrapBook.getP34DiliCserialCollection());
            bookDetail.setDiliCstoreDisplay(new Integer(StringUtils.isBlank(newScrapBook.getP22DiliCstoreDisplay()) ? "0" : newScrapBook.getP22DiliCstoreDisplay()));
            bookDetail.setDiliCsymbolization(newScrapBook.getP41DiliCsymbolization());
            bookDetail.setDiliCtheme(newScrapBook.getP35DiliCtheme());
            bookDetail.setQuantumByDiliCquantum(quantum);

            /**
             * book distributor
             */

            BookDistributor bookDistributor = new BookDistributor();
            bookDistributor.setVersion(VERSION_INCREMENTATION);
            bookDistributor.setDiliCamountTaxExempt1(newScrapBook.getP10DiliCamountTaxExempt1());
            bookDistributor.setDiliCamountTaxExempt2(newScrapBook.getP12DiliCamountTaxExempt2());
            bookDistributor.setDiliCamountTaxExempt3(newScrapBook.getP14DiliCamountTaxExempt3());
            bookDistributor.setDiliCavailabilityCode(newScrapBook.getP05DiliCavailabilityCode());
            bookDistributor.setDiliCdateEndOfCommercialization(newScrapBook.getP19DiliCdateEndOfCommercialization());
            bookDistributor.setDiliCdateOfTariffApplication(newScrapBook.getP04DiliCdateOfTariffApplicable());
            bookDistributor.setDiliCdatePublished(newScrapBook.getP17DiliCdatePublished());
            bookDistributor.setDiliCBookDistributorReference(newScrapBook.getP33DiliCbookDistributorReference());

            bookDistributor.setDiliCdiscountClassification(newScrapBook.getP08DiliCdiscountClassification());
            bookDistributor.setDiliCgencod(newScrapBook.getP03DiliCgencode());
            bookDistributor.setDiliCpriceAndVat(newScrapBook.getP07DiliCpriceAndVat());
            bookDistributor.setDiliCpriceCode(newScrapBook.getP16DiliCpriceCode());

            bookDistributor.setDiliCpriceType(newScrapBook.getP06DiliCpriceType());
            bookDistributor.setDiliCreturnCode(newScrapBook.getP15DiliCreturnCode());
            bookDistributor.setDiliCtypeOfProduct(newScrapBook.getP18DiliCtypeProduct());
            //change in table distributor to int
            bookDistributor.setDiliCuniqueOrMultitpleDistribution(newScrapBook.getP42DiliCuniqueOrMultitpleDistribution());
            bookDistributor.setDiliCvat1(newScrapBook.getP09DiliCvat1());
            bookDistributor.setDiliCvat2(newScrapBook.getP11DiliCvat2());
            bookDistributor.setDiliCvat3(newScrapBook.getP13DiliCvat3());

            transientNewBook.setBookDetailByBookDetailRef(bookDetail);
            transientNewBook.setBookDistributorByBookDistributorRef(bookDistributor);
            transientNewBook.getBookDetailByBookDetailRef().setQuantumByDiliCquantum(quantum);
        }
        return transientNewBook;
    }

}
