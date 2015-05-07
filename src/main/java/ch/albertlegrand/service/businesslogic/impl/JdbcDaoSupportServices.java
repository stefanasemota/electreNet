package ch.albertlegrand.service.businesslogic.impl;

import ch.albertlegrand.data.model.ScrapBook;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.jdbc.support.nativejdbc.SimpleNativeJdbcExtractor;

import java.util.Collection;

/**
 * This class usese the conventional  JdbcDaoSupport for persistence and not hibernate
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 19.08.11
 * Time: 19:28
 * To change this template use File | Settings | File Templates.
 */
public class JdbcDaoSupportServices extends JdbcDaoSupport {
    private Integer VERSION_INCREMENTATION = 1;

    protected void initDao() throws Exception {
        super.initDao();
        getJdbcTemplate().setNativeJdbcExtractor(new SimpleNativeJdbcExtractor());
    }

    /**
     * This method setup a bulk insert for books
     *
     * @param scrapbookCollection a collection of books
     */
    public void insertBookBulk(Collection<ScrapBook> scrapbookCollection) {
        //set up insert query for scrap book
        String sqlInsertQuery = "Insert into ScrapBook(" +
                "version," +
                "P01_diliCmovementCode," +
                "P02_diliCean," +
                "P03_diliCgencode," +
                "P04_diliCdateOfTariffApplicable," +
                "P05_diliCavailabilityCode," +
                "P06_diliCpriceType," +
                "P07_diliCpriceAndVat," +
                "P08_diliCdiscountClassification," +
                "P09_diliCvat_1," +
                "P10_diliCamountTaxExempt_1," +
                "P11_diliCvat_2," +
                "P12_diliCamountTaxExempt_2," +
                "P13_diliCvat_3," +
                "P14_diliCamountTaxExempt_3," +
                "P15_diliCreturnCode," +
                "P16_diliCpriceCode," +
                "P17_diliCdatePublished," +
                "P18_diliCtypeProduct," +
                "P19_diliCdateEndOfCommercialization," +
                "P20_diliCwordingStandard," +
                "P21_diliCwordingCounter," +
                "P22_diliCstoreDisplay," +
                "P23_diliCthickness," +
                "P24_diliCwidth," +
                "P25_diliCheight," +
                "P26_diliCweight," +
                "P27_diliCwordingExtended," +
                "P28_diliCpublisher," +
                "P29_diliCcollectionName," +
                "P30_diliCauthor," +
                "P31_diliCbinding," +
                "P32_diliCIsbn," +
                "P33_diliCbookDistributorReference," +
                "P34_diliCserialCollection," +
                "P35_diliCtheme," +
                "P36_diliCIsbnPublisher," +
                "P37_diliClinkingCodes," +
                "P38_diliCeanRelatedProducts," +
                "P39_diliCcommandableUnit," +
                "P40_diliCjointSalesPackage," +
                "P41_diliCsymbolization," +
                "P42_diliCuniqueOrMultitpleDistribution," +
                "P43_diliCnumberOfReference," +
                "P44_diliCdateOfCreation," +
                "P45_diliCdateOfLastModification)" +
                "VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";

        for (ScrapBook newBook : scrapbookCollection) {
            //prepare to insert book
            newBook.setVersion((long) VERSION_INCREMENTATION);
            Object[] parameters = new Object[]{
                    newBook.getVersion(),
                    newBook.getP01DiliCmovementCode(),
                    newBook.getP02DiliCean(),
                    newBook.getP03DiliCgencode(),
                    newBook.getP04DiliCdateOfTariffApplicable(),
                    newBook.getP05DiliCavailabilityCode(),
                    newBook.getP06DiliCpriceType(),
                    newBook.getP07DiliCpriceAndVat(),
                    newBook.getP08DiliCdiscountClassification(),
                    newBook.getP09DiliCvat1(),
                    newBook.getP10DiliCamountTaxExempt1(),
                    newBook.getP11DiliCvat2(),
                    newBook.getP12DiliCamountTaxExempt2(),
                    newBook.getP13DiliCvat3(),
                    newBook.getP14DiliCamountTaxExempt3(),
                    newBook.getP15DiliCreturnCode(),
                    newBook.getP16DiliCpriceCode(),
                    newBook.getP17DiliCdatePublished(),
                    newBook.getP18DiliCtypeProduct(),
                    newBook.getP19DiliCdateEndOfCommercialization(),
                    newBook.getP20DiliCwordingStandard(),
                    newBook.getP21DiliCwordingCounter(),
                    newBook.getP22DiliCstoreDisplay(),
                    newBook.getP23DiliCthickness(),
                    newBook.getP24DiliCwidth(),
                    newBook.getP25DiliCheight(),
                    newBook.getP26DiliCweight(),
                    newBook.getP27DiliCwordingExtended(),
                    newBook.getP28DiliCpublisher(),
                    newBook.getP29DiliCcollectionName(),
                    newBook.getP30DiliCauthor(),
                    newBook.getP31DiliCbinding(),
                    newBook.getP32DiliCIsbn(),
                    newBook.getP33DiliCbookDistributorReference(),
                    newBook.getP34DiliCserialCollection(),
                    newBook.getP35DiliCtheme(),
                    newBook.getP36DiliCIsbnPublisher(),
                    newBook.getP37DiliClinkingCodes(),
                    newBook.getP38DiliCeanRelatedProducts(),
                    newBook.getP39DiliCcommandableUnit(),
                    newBook.getP40DiliCjointSalesPackage(),
                    newBook.getP41DiliCsymbolization(),
                    newBook.getP42DiliCuniqueOrMultitpleDistribution(),
                    newBook.getP43DiliCnumberOfReference(),
                    newBook.getP44DiliCdateOfCreation(),
                    newBook.getP45DiliCdateOfLastModification()
            };
            //insert book;
            getJdbcTemplate().update(sqlInsertQuery, parameters);
        }
    }


}
