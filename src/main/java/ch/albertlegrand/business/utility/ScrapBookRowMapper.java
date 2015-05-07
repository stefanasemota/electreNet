package ch.albertlegrand.business.utility;

import ch.albertlegrand.data.model.ScrapBook;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 20.01.12
 * Time: 22:40
 * To change this template use File | Settings | File Templates.
 */

public class ScrapBookRowMapper implements RowMapper {
    @Override
    /**
     * A personalized rowmapper interface for the scrapbook object
     */
    public Object mapRow(ResultSet resultSet, int i) throws SQLException {
        ScrapBook scrapBook = new ScrapBook();
        scrapBook.setScrapbookid(resultSet.getLong("scrapbookid"));
        scrapBook.setP01DiliCmovementCode(resultSet.getString("P01_diliCmovementCode"));
        scrapBook.setP02DiliCean(resultSet.getString("P02_diliCean"));
        scrapBook.setP03DiliCgencode(resultSet.getLong("P03_diliCgencode"));
        scrapBook.setP04DiliCdateOfTariffApplicable(resultSet.getDate("P04_diliCdateOfTariffApplicable"));
        scrapBook.setP05DiliCavailabilityCode(resultSet.getInt("P05_diliCavailabilityCode"));
        scrapBook.setP06DiliCpriceType(resultSet.getInt("P06_diliCpriceType"));
        scrapBook.setP07DiliCpriceAndVat(resultSet.getDouble("P07_diliCpriceAndVat"));
        scrapBook.setP08DiliCdiscountClassification(resultSet.getString("P08_diliCdiscountClassification"));
        scrapBook.setP09DiliCvat1(resultSet.getDouble("P09_diliCvat_1"));
        scrapBook.setP10DiliCamountTaxExempt1(resultSet.getDouble("P10_diliCamountTaxExempt_1"));
        scrapBook.setP11DiliCvat2(resultSet.getDouble("P11_diliCvat_2"));
        scrapBook.setP12DiliCamountTaxExempt2(resultSet.getDouble("P12_diliCamountTaxExempt_2"));
        scrapBook.setP13DiliCvat3(resultSet.getDouble("P13_diliCvat_3"));
        scrapBook.setP14DiliCamountTaxExempt3(resultSet.getDouble("P14_diliCamountTaxExempt_3"));
        scrapBook.setP15DiliCreturnCode(resultSet.getInt("P15_diliCreturnCode"));
        scrapBook.setP16DiliCpriceCode(resultSet.getString("P16_diliCpriceCode"));
        scrapBook.setP17DiliCdatePublished(resultSet.getDate("P17_diliCdatePublished"));
        scrapBook.setP18DiliCtypeProduct(resultSet.getString("P18_diliCtypeProduct"));
        scrapBook.setP19DiliCdateEndOfCommercialization(resultSet.getDate("P19_diliCdateEndOfCommercialization"));
        scrapBook.setP20DiliCwordingStandard(resultSet.getString("P20_diliCwordingStandard"));
        scrapBook.setP21DiliCwordingCounter(resultSet.getString("P21_diliCwordingCounter"));
        scrapBook.setP22DiliCstoreDisplay(resultSet.getString("P22_diliCstoreDisplay"));
        scrapBook.setP23DiliCthickness(resultSet.getDouble("P23_diliCthickness"));
        scrapBook.setP24DiliCwidth(resultSet.getDouble("P24_diliCwidth"));
        scrapBook.setP25DiliCheight(resultSet.getDouble("P25_diliCheight"));
        scrapBook.setP26DiliCweight(resultSet.getDouble("P26_diliCweight"));
        scrapBook.setP27DiliCwordingExtended(resultSet.getString("P27_diliCwordingExtended"));
        scrapBook.setP28DiliCpublisher(resultSet.getString("P28_diliCpublisher"));
        scrapBook.setP29DiliCcollectionName(resultSet.getString("P29_diliCcollectionName"));
        scrapBook.setP30DiliCauthor(resultSet.getString("P30_diliCauthor"));
        scrapBook.setP31DiliCbinding(resultSet.getString("P31_diliCbinding"));
        scrapBook.setP32DiliCIsbn(resultSet.getString("P32_diliCIsbn"));
        scrapBook.setP33DiliCbookDistributorReference(resultSet.getString("P33_diliCbookDistributorReference"));
        scrapBook.setP34DiliCserialCollection(resultSet.getString("P34_diliCserialCollection"));
        scrapBook.setP35DiliCtheme(resultSet.getString("P35_diliCtheme"));
        scrapBook.setP36DiliCIsbnPublisher(resultSet.getString("P36_diliCIsbnPublisher"));
        scrapBook.setP37DiliClinkingCodes(resultSet.getInt("P37_diliClinkingCodes"));
        scrapBook.setP38DiliCeanRelatedProducts(resultSet.getString("P38_diliCeanRelatedProducts"));
        scrapBook.setP39DiliCcommandableUnit(resultSet.getInt("P39_diliCcommandableUnit"));
        scrapBook.setP40DiliCjointSalesPackage(resultSet.getInt("P40_diliCjointSalesPackage"));
        scrapBook.setP41DiliCsymbolization(resultSet.getInt("P41_diliCsymbolization"));
        scrapBook.setP42DiliCuniqueOrMultitpleDistribution(resultSet.getInt("P42_diliCuniqueOrMultitpleDistribution"));
        scrapBook.setP43DiliCnumberOfReference(resultSet.getInt("P43_diliCnumberOfReference"));
        scrapBook.setP44DiliCdateOfCreation(resultSet.getDate("P44_diliCdateOfCreation"));
        scrapBook.setP45DiliCdateOfLastModification(resultSet.getDate("P45_diliCdateOfLastModification"));
        scrapBook.setP46DiliCfuDateOfTariffApplicable(resultSet.getDate("P46_diliCfuDateOfTariffApplicable"));
        scrapBook.setP47DiliCfuAvailabilityCode(resultSet.getInt("P47_diliCfuAvailabilityCode"));
        scrapBook.setP48DiliCfuPriceType(resultSet.getInt("P48_diliCfuPriceType"));
        scrapBook.setP49DiliCfuPriceAndVat(resultSet.getDouble("P49_diliCfuPriceAndVat"));
        scrapBook.setP50DiliCfuDiscountClassification(resultSet.getString("P50_diliCfuDiscountClassification"));
        scrapBook.setP51DiliCfuVat1(resultSet.getDouble("P51_diliCfuVat_1"));
        scrapBook.setP52DiliCfuAmountTaxExempt1(resultSet.getDouble("P52_diliCfuAmountTaxExempt_1"));
        scrapBook.setP53DiliCfuVat2(resultSet.getDouble("P53_diliCfuVat_2"));
        scrapBook.setP54DiliCfuAmountTaxExempt2(resultSet.getDouble("P54_diliCfuAmountTaxExempt_2"));
        scrapBook.setP55DiliCfuVat3(resultSet.getDouble("P55_diliCfuVat_3"));
        scrapBook.setP56DiliCfuAmountTaxExempt3(resultSet.getDouble("P56_diliCfuAmountTaxExempt_3"));
        scrapBook.setP57DiliCfuReturnCode(resultSet.getInt("P57_diliCfuReturnCode"));
        scrapBook.setP58DiliCfuPriceCode(resultSet.getString("P58_diliCfuPriceCode"));
        return scrapBook;
    }
}
