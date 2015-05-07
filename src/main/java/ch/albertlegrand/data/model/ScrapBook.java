package ch.albertlegrand.data.model;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class ScrapBook implements Serializable{
    private long scrapbookid;

    public long getScrapbookid() {
        return scrapbookid;
    }

    public void setScrapbookid(long scrapbookid) {
        this.scrapbookid = scrapbookid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String p01DiliCmovementCode;

    public String getP01DiliCmovementCode() {
        return p01DiliCmovementCode;
    }

    public void setP01DiliCmovementCode(String p01DiliCmovementCode) {
        this.p01DiliCmovementCode = p01DiliCmovementCode;
    }

    private String p02DiliCean;

    public String getP02DiliCean() {
        return p02DiliCean;
    }

    public void setP02DiliCean(String p02DiliCean) {
        this.p02DiliCean = p02DiliCean;
    }

    private long p03DiliCgencode;

    public long getP03DiliCgencode() {
        return p03DiliCgencode;
    }

    public void setP03DiliCgencode(long p03DiliCgencode) {
        this.p03DiliCgencode = p03DiliCgencode;
    }

    private Date p04DiliCdateOfTariffApplicable;

    public Date getP04DiliCdateOfTariffApplicable() {
        return p04DiliCdateOfTariffApplicable;
    }

    public void setP04DiliCdateOfTariffApplicable(Date p04DiliCdateOfTariffApplicable) {
        this.p04DiliCdateOfTariffApplicable = p04DiliCdateOfTariffApplicable;
    }

    private int p05DiliCavailabilityCode;

    public int getP05DiliCavailabilityCode() {
        return p05DiliCavailabilityCode;
    }

    public void setP05DiliCavailabilityCode(int p05DiliCavailabilityCode) {
        this.p05DiliCavailabilityCode = p05DiliCavailabilityCode;
    }

    private int p06DiliCpriceType;

    public int getP06DiliCpriceType() {
        return p06DiliCpriceType;
    }

    public void setP06DiliCpriceType(int p06DiliCpriceType) {
        this.p06DiliCpriceType = p06DiliCpriceType;
    }

    private double p07DiliCpriceAndVat;

    public double getP07DiliCpriceAndVat() {
        return p07DiliCpriceAndVat;
    }

    public void setP07DiliCpriceAndVat(double p07DiliCpriceAndVat) {
        this.p07DiliCpriceAndVat = p07DiliCpriceAndVat;
    }

    private String p08DiliCdiscountClassification;

    public String getP08DiliCdiscountClassification() {
        return p08DiliCdiscountClassification;
    }

    public void setP08DiliCdiscountClassification(String p08DiliCdiscountClassification) {
        this.p08DiliCdiscountClassification = p08DiliCdiscountClassification;
    }

    private double p09DiliCvat1;

    public double getP09DiliCvat1() {
        return p09DiliCvat1;
    }

    public void setP09DiliCvat1(double p09DiliCvat1) {
        this.p09DiliCvat1 = p09DiliCvat1;
    }

    private double p10DiliCamountTaxExempt1;

    public double getP10DiliCamountTaxExempt1() {
        return p10DiliCamountTaxExempt1;
    }

    public void setP10DiliCamountTaxExempt1(double p10DiliCamountTaxExempt1) {
        this.p10DiliCamountTaxExempt1 = p10DiliCamountTaxExempt1;
    }

    private double p11DiliCvat2;

    public double getP11DiliCvat2() {
        return p11DiliCvat2;
    }

    public void setP11DiliCvat2(double p11DiliCvat2) {
        this.p11DiliCvat2 = p11DiliCvat2;
    }

    private double p12DiliCamountTaxExempt2;

    public double getP12DiliCamountTaxExempt2() {
        return p12DiliCamountTaxExempt2;
    }

    public void setP12DiliCamountTaxExempt2(double p12DiliCamountTaxExempt2) {
        this.p12DiliCamountTaxExempt2 = p12DiliCamountTaxExempt2;
    }

    private double p13DiliCvat3;

    public double getP13DiliCvat3() {
        return p13DiliCvat3;
    }

    public void setP13DiliCvat3(double p13DiliCvat3) {
        this.p13DiliCvat3 = p13DiliCvat3;
    }

    private double p14DiliCamountTaxExempt3;

    public double getP14DiliCamountTaxExempt3() {
        return p14DiliCamountTaxExempt3;
    }

    public void setP14DiliCamountTaxExempt3(double p14DiliCamountTaxExempt3) {
        this.p14DiliCamountTaxExempt3 = p14DiliCamountTaxExempt3;
    }

    private int p15DiliCreturnCode;

    public int getP15DiliCreturnCode() {
        return p15DiliCreturnCode;
    }

    public void setP15DiliCreturnCode(int p15DiliCreturnCode) {
        this.p15DiliCreturnCode = p15DiliCreturnCode;
    }

    private String p16DiliCpriceCode;

    public String getP16DiliCpriceCode() {
        return p16DiliCpriceCode;
    }

    public void setP16DiliCpriceCode(String p16DiliCpriceCode) {
        this.p16DiliCpriceCode = p16DiliCpriceCode;
    }

    private Date p17DiliCdatePublished;

    public Date getP17DiliCdatePublished() {
        return p17DiliCdatePublished;
    }

    public void setP17DiliCdatePublished(Date p17DiliCdatePublished) {
        this.p17DiliCdatePublished = p17DiliCdatePublished;
    }

    private String p18DiliCtypeProduct;

    public String getP18DiliCtypeProduct() {
        return p18DiliCtypeProduct;
    }

    public void setP18DiliCtypeProduct(String p18DiliCtypeProduct) {
        this.p18DiliCtypeProduct = p18DiliCtypeProduct;
    }

    private Date p19DiliCdateEndOfCommercialization;

    public Date getP19DiliCdateEndOfCommercialization() {
        return p19DiliCdateEndOfCommercialization;
    }

    public void setP19DiliCdateEndOfCommercialization(Date p19DiliCdateEndOfCommercialization) {
        this.p19DiliCdateEndOfCommercialization = p19DiliCdateEndOfCommercialization;
    }

    private String p20DiliCwordingStandard;

    public String getP20DiliCwordingStandard() {
        return p20DiliCwordingStandard;
    }

    public void setP20DiliCwordingStandard(String p20DiliCwordingStandard) {
        this.p20DiliCwordingStandard = p20DiliCwordingStandard;
    }

    private String p21DiliCwordingCounter;

    public String getP21DiliCwordingCounter() {
        return p21DiliCwordingCounter;
    }

    public void setP21DiliCwordingCounter(String p21DiliCwordingCounter) {
        this.p21DiliCwordingCounter = p21DiliCwordingCounter;
    }

    private String p22DiliCstoreDisplay;

    public String getP22DiliCstoreDisplay() {
        return p22DiliCstoreDisplay;
    }

    public void setP22DiliCstoreDisplay(String p22DiliCstoreDisplay) {
        this.p22DiliCstoreDisplay = p22DiliCstoreDisplay;
    }

    private double p23DiliCthickness;

    public double getP23DiliCthickness() {
        return p23DiliCthickness;
    }

    public void setP23DiliCthickness(double p23DiliCthickness) {
        this.p23DiliCthickness = p23DiliCthickness;
    }

    private double p24DiliCwidth;

    public double getP24DiliCwidth() {
        return p24DiliCwidth;
    }

    public void setP24DiliCwidth(double p24DiliCwidth) {
        this.p24DiliCwidth = p24DiliCwidth;
    }

    private double p25DiliCheight;

    public double getP25DiliCheight() {
        return p25DiliCheight;
    }

    public void setP25DiliCheight(double p25DiliCheight) {
        this.p25DiliCheight = p25DiliCheight;
    }

    private double p26DiliCweight;

    public double getP26DiliCweight() {
        return p26DiliCweight;
    }

    public void setP26DiliCweight(double p26DiliCweight) {
        this.p26DiliCweight = p26DiliCweight;
    }

    private String p27DiliCwordingExtended;

    public String getP27DiliCwordingExtended() {
        return p27DiliCwordingExtended;
    }

    public void setP27DiliCwordingExtended(String p27DiliCwordingExtended) {
        this.p27DiliCwordingExtended = p27DiliCwordingExtended;
    }

    private String p28DiliCpublisher;

    public String getP28DiliCpublisher() {
        return p28DiliCpublisher;
    }

    public void setP28DiliCpublisher(String p28DiliCpublisher) {
        this.p28DiliCpublisher = p28DiliCpublisher;
    }

    private String p29DiliCcollectionName;

    public String getP29DiliCcollectionName() {
        return p29DiliCcollectionName;
    }

    public void setP29DiliCcollectionName(String p29DiliCcollectionName) {
        this.p29DiliCcollectionName = p29DiliCcollectionName;
    }

    private String p30DiliCauthor;

    public String getP30DiliCauthor() {
        return p30DiliCauthor;
    }

    public void setP30DiliCauthor(String p30DiliCauthor) {
        this.p30DiliCauthor = p30DiliCauthor;
    }

    private String p31DiliCbinding;

    public String getP31DiliCbinding() {
        return p31DiliCbinding;
    }

    public void setP31DiliCbinding(String p31DiliCbinding) {
        this.p31DiliCbinding = p31DiliCbinding;
    }

    private String p32DiliCIsbn;

    public String getP32DiliCIsbn() {
        return p32DiliCIsbn;
    }

    public void setP32DiliCIsbn(String p32DiliCIsbn) {
        this.p32DiliCIsbn = p32DiliCIsbn;
    }

    private String p33DiliCbookDistributorReference;

    public String getP33DiliCbookDistributorReference() {
        return p33DiliCbookDistributorReference;
    }

    public void setP33DiliCbookDistributorReference(String p33DiliCbookDistributorReference) {
        this.p33DiliCbookDistributorReference = p33DiliCbookDistributorReference;
    }

    private String p34DiliCserialCollection;

    public String getP34DiliCserialCollection() {
        return p34DiliCserialCollection;
    }

    public void setP34DiliCserialCollection(String p34DiliCserialCollection) {
        this.p34DiliCserialCollection = p34DiliCserialCollection;
    }

    private String p35DiliCtheme;

    public String getP35DiliCtheme() {
        return p35DiliCtheme;
    }

    public void setP35DiliCtheme(String p35DiliCtheme) {
        this.p35DiliCtheme = p35DiliCtheme;
    }

    private String p36DiliCIsbnPublisher;

    public String getP36DiliCIsbnPublisher() {
        return p36DiliCIsbnPublisher;
    }

    public void setP36DiliCIsbnPublisher(String p36DiliCIsbnPublisher) {
        this.p36DiliCIsbnPublisher = p36DiliCIsbnPublisher;
    }

    private int p37DiliClinkingCodes;

    public int getP37DiliClinkingCodes() {
        return p37DiliClinkingCodes;
    }

    public void setP37DiliClinkingCodes(int p37DiliClinkingCodes) {
        this.p37DiliClinkingCodes = p37DiliClinkingCodes;
    }

    private String p38DiliCeanRelatedProducts;

    public String getP38DiliCeanRelatedProducts() {
        return p38DiliCeanRelatedProducts;
    }

    public void setP38DiliCeanRelatedProducts(String p38DiliCeanRelatedProducts) {
        this.p38DiliCeanRelatedProducts = p38DiliCeanRelatedProducts;
    }

    private int p39DiliCcommandableUnit;

    public int getP39DiliCcommandableUnit() {
        return p39DiliCcommandableUnit;
    }

    public void setP39DiliCcommandableUnit(int p39DiliCcommandableUnit) {
        this.p39DiliCcommandableUnit = p39DiliCcommandableUnit;
    }

    private int p40DiliCjointSalesPackage;

    public int getP40DiliCjointSalesPackage() {
        return p40DiliCjointSalesPackage;
    }

    public void setP40DiliCjointSalesPackage(int p40DiliCjointSalesPackage) {
        this.p40DiliCjointSalesPackage = p40DiliCjointSalesPackage;
    }

    private int p41DiliCsymbolization;

    public int getP41DiliCsymbolization() {
        return p41DiliCsymbolization;
    }

    public void setP41DiliCsymbolization(int p41DiliCsymbolization) {
        this.p41DiliCsymbolization = p41DiliCsymbolization;
    }

    private int p42DiliCuniqueOrMultitpleDistribution;

    public int getP42DiliCuniqueOrMultitpleDistribution() {
        return p42DiliCuniqueOrMultitpleDistribution;
    }

    public void setP42DiliCuniqueOrMultitpleDistribution(int p42DiliCuniqueOrMultitpleDistribution) {
        this.p42DiliCuniqueOrMultitpleDistribution = p42DiliCuniqueOrMultitpleDistribution;
    }

    private int p43DiliCnumberOfReference;

    public int getP43DiliCnumberOfReference() {
        return p43DiliCnumberOfReference;
    }

    public void setP43DiliCnumberOfReference(int p43DiliCnumberOfReference) {
        this.p43DiliCnumberOfReference = p43DiliCnumberOfReference;
    }

    private Date p44DiliCdateOfCreation;

    public Date getP44DiliCdateOfCreation() {
        return p44DiliCdateOfCreation;
    }

    public void setP44DiliCdateOfCreation(Date p44DiliCdateOfCreation) {
        this.p44DiliCdateOfCreation = p44DiliCdateOfCreation;
    }

    private Date p45DiliCdateOfLastModification;

    public Date getP45DiliCdateOfLastModification() {
        return p45DiliCdateOfLastModification;
    }

    public void setP45DiliCdateOfLastModification(Date p45DiliCdateOfLastModification) {
        this.p45DiliCdateOfLastModification = p45DiliCdateOfLastModification;
    }

    private Date p46DiliCfuDateOfTariffApplicable;

    public Date getP46DiliCfuDateOfTariffApplicable() {
        return p46DiliCfuDateOfTariffApplicable;
    }

    public void setP46DiliCfuDateOfTariffApplicable(Date p46DiliCfuDateOfTariffApplicable) {
        this.p46DiliCfuDateOfTariffApplicable = p46DiliCfuDateOfTariffApplicable;
    }

    private int p47DiliCfuAvailabilityCode;

    public int getP47DiliCfuAvailabilityCode() {
        return p47DiliCfuAvailabilityCode;
    }

    public void setP47DiliCfuAvailabilityCode(int p47DiliCfuAvailabilityCode) {
        this.p47DiliCfuAvailabilityCode = p47DiliCfuAvailabilityCode;
    }

    private int p48DiliCfuPriceType;

    public int getP48DiliCfuPriceType() {
        return p48DiliCfuPriceType;
    }

    public void setP48DiliCfuPriceType(int p48DiliCfuPriceType) {
        this.p48DiliCfuPriceType = p48DiliCfuPriceType;
    }

    private double p49DiliCfuPriceAndVat;

    public double getP49DiliCfuPriceAndVat() {
        return p49DiliCfuPriceAndVat;
    }

    public void setP49DiliCfuPriceAndVat(double p49DiliCfuPriceAndVat) {
        this.p49DiliCfuPriceAndVat = p49DiliCfuPriceAndVat;
    }

    private String p50DiliCfuDiscountClassification;

    public String getP50DiliCfuDiscountClassification() {
        return p50DiliCfuDiscountClassification;
    }

    public void setP50DiliCfuDiscountClassification(String p50DiliCfuDiscountClassification) {
        this.p50DiliCfuDiscountClassification = p50DiliCfuDiscountClassification;
    }

    private double p51DiliCfuVat1;

    public double getP51DiliCfuVat1() {
        return p51DiliCfuVat1;
    }

    public void setP51DiliCfuVat1(double p51DiliCfuVat1) {
        this.p51DiliCfuVat1 = p51DiliCfuVat1;
    }

    private double p52DiliCfuAmountTaxExempt1;

    public double getP52DiliCfuAmountTaxExempt1() {
        return p52DiliCfuAmountTaxExempt1;
    }

    public void setP52DiliCfuAmountTaxExempt1(double p52DiliCfuAmountTaxExempt1) {
        this.p52DiliCfuAmountTaxExempt1 = p52DiliCfuAmountTaxExempt1;
    }

    private double p53DiliCfuVat2;

    public double getP53DiliCfuVat2() {
        return p53DiliCfuVat2;
    }

    public void setP53DiliCfuVat2(double p53DiliCfuVat2) {
        this.p53DiliCfuVat2 = p53DiliCfuVat2;
    }

    private double p54DiliCfuAmountTaxExempt2;

    public double getP54DiliCfuAmountTaxExempt2() {
        return p54DiliCfuAmountTaxExempt2;
    }

    public void setP54DiliCfuAmountTaxExempt2(double p54DiliCfuAmountTaxExempt2) {
        this.p54DiliCfuAmountTaxExempt2 = p54DiliCfuAmountTaxExempt2;
    }

    private double p55DiliCfuVat3;

    public double getP55DiliCfuVat3() {
        return p55DiliCfuVat3;
    }

    public void setP55DiliCfuVat3(double p55DiliCfuVat3) {
        this.p55DiliCfuVat3 = p55DiliCfuVat3;
    }

    private double p56DiliCfuAmountTaxExempt3;

    public double getP56DiliCfuAmountTaxExempt3() {
        return p56DiliCfuAmountTaxExempt3;
    }

    public void setP56DiliCfuAmountTaxExempt3(double p56DiliCfuAmountTaxExempt3) {
        this.p56DiliCfuAmountTaxExempt3 = p56DiliCfuAmountTaxExempt3;
    }

    private int p57DiliCfuReturnCode;

    public int getP57DiliCfuReturnCode() {
        return p57DiliCfuReturnCode;
    }

    public void setP57DiliCfuReturnCode(int p57DiliCfuReturnCode) {
        this.p57DiliCfuReturnCode = p57DiliCfuReturnCode;
    }

    private String p58DiliCfuPriceCode;

    public String getP58DiliCfuPriceCode() {
        return p58DiliCfuPriceCode;
    }

    public void setP58DiliCfuPriceCode(String p58DiliCfuPriceCode) {
        this.p58DiliCfuPriceCode = p58DiliCfuPriceCode;
    }

    private String eleNetTitle;

    public String getEleNetTitle() {
        return eleNetTitle;
    }

    public void setEleNetTitle(String eleNetTitle) {
        this.eleNetTitle = eleNetTitle;
    }

    private String eleNetCompleteBookTitle;

    public String getEleNetCompleteBookTitle() {
        return eleNetCompleteBookTitle;
    }

    public void setEleNetCompleteBookTitle(String eleNetCompleteBookTitle) {
        this.eleNetCompleteBookTitle = eleNetCompleteBookTitle;
    }

    private String eleNetEanFaulty;

    public String getEleNetEanFaulty() {
        return eleNetEanFaulty;
    }

    public void setEleNetEanFaulty(String eleNetEanFaulty) {
        this.eleNetEanFaulty = eleNetEanFaulty;
    }

    private String eleNetIsbnFaulty;

    public String getEleNetIsbnFaulty() {
        return eleNetIsbnFaulty;
    }

    public void setEleNetIsbnFaulty(String eleNetIsbnFaulty) {
        this.eleNetIsbnFaulty = eleNetIsbnFaulty;
    }

    private String eleNetEanUsed;

    public String getEleNetEanUsed() {
        return eleNetEanUsed;
    }

    public void setEleNetEanUsed(String eleNetEanUsed) {
        this.eleNetEanUsed = eleNetEanUsed;
    }

    private String eleNetIsbnUsed;

    public String getEleNetIsbnUsed() {
        return eleNetIsbnUsed;
    }

    public void setEleNetIsbnUsed(String eleNetIsbnUsed) {
        this.eleNetIsbnUsed = eleNetIsbnUsed;
    }

    private double eleNetCurrency;

    public double getEleNetCurrency() {
        return eleNetCurrency;
    }

    public void setEleNetCurrency(double eleNetCurrency) {
        this.eleNetCurrency = eleNetCurrency;
    }

    private int eleNetForeignTax;

    public int getEleNetForeignTax() {
        return eleNetForeignTax;
    }

    public void setEleNetForeignTax(int eleNetForeignTax) {
        this.eleNetForeignTax = eleNetForeignTax;
    }

    private double eleNetVat;

    public double getEleNetVat() {
        return eleNetVat;
    }

    public void setEleNetVat(double eleNetVat) {
        this.eleNetVat = eleNetVat;
    }

    private String eleNetResume;

    public String getEleNetResume() {
        return eleNetResume;
    }

    public void setEleNetResume(String eleNetResume) {
        this.eleNetResume = eleNetResume;
    }

    private byte[] eleNetImage;

    public byte[] getEleNetImage() {
        return eleNetImage;
    }

    public void setEleNetImage(byte[] eleNetImage) {
        this.eleNetImage = eleNetImage;
    }

    private String eleNetCritic;

    public String getEleNetCritic() {
        return eleNetCritic;
    }

    public void setEleNetCritic(String eleNetCritic) {
        this.eleNetCritic = eleNetCritic;
    }

    private String eleNetTheme;

    public String getEleNetTheme() {
        return eleNetTheme;
    }

    public void setEleNetTheme(String eleNetTheme) {
        this.eleNetTheme = eleNetTheme;
    }

    private String eleNetPublisher;

    public String getEleNetPublisher() {
        return eleNetPublisher;
    }

    public void setEleNetPublisher(String eleNetPublisher) {
        this.eleNetPublisher = eleNetPublisher;
    }

    private String eleNetAuthor;

    public String getEleNetAuthor() {
        return eleNetAuthor;
    }

    public void setEleNetAuthor(String eleNetAuthor) {
        this.eleNetAuthor = eleNetAuthor;
    }

    private String eleNetResponsible;

    public String getEleNetResponsible() {
        return eleNetResponsible;
    }

    public void setEleNetResponsible(String eleNetResponsible) {
        this.eleNetResponsible = eleNetResponsible;
    }

    private String eleNetShelf;

    public String getEleNetShelf() {
        return eleNetShelf;
    }

    public void setEleNetShelf(String eleNetShelf) {
        this.eleNetShelf = eleNetShelf;
    }

    private int eleNetSupportCode;

    public int getEleNetSupportCode() {
        return eleNetSupportCode;
    }

    public void setEleNetSupportCode(int eleNetSupportCode) {
        this.eleNetSupportCode = eleNetSupportCode;
    }

    private int eleNetExtraDispo;

    public int getEleNetExtraDispo() {
        return eleNetExtraDispo;
    }

    public void setEleNetExtraDispo(int eleNetExtraDispo) {
        this.eleNetExtraDispo = eleNetExtraDispo;
    }

    private int eleNetBookBinding;

    public int getEleNetBookBinding() {
        return eleNetBookBinding;
    }

    public void setEleNetBookBinding(int eleNetBookBinding) {
        this.eleNetBookBinding = eleNetBookBinding;
    }

    private String wCatBtitle;

    public String getwCatBtitle() {
        return wCatBtitle;
    }

    public void setwCatBtitle(String wCatBtitle) {
        this.wCatBtitle = wCatBtitle;
    }

    private String wCatBisbn;

    public String getwCatBisbn() {
        return wCatBisbn;
    }

    public void setwCatBisbn(String wCatBisbn) {
        this.wCatBisbn = wCatBisbn;
    }

    private Date wCatBdateUpdated;

    public Date getwCatBdateUpdated() {
        return wCatBdateUpdated;
    }

    public void setwCatBdateUpdated(Date wCatBdateUpdated) {
        this.wCatBdateUpdated = wCatBdateUpdated;
    }

    private String wCatBauthorName;

    public String getwCatBauthorName() {
        return wCatBauthorName;
    }

    public void setwCatBauthorName(String wCatBauthorName) {
        this.wCatBauthorName = wCatBauthorName;
    }

    private long optionalFieldPersistedRefQuantum;

    public long getOptionalFieldPersistedRefQuantum() {
        return optionalFieldPersistedRefQuantum;
    }

    public void setOptionalFieldPersistedRefQuantum(long optionalFieldPersistedRefQuantum) {
        this.optionalFieldPersistedRefQuantum = optionalFieldPersistedRefQuantum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ScrapBook scrapBook = (ScrapBook) o;

        if (eleNetBookBinding != scrapBook.eleNetBookBinding) return false;
        if (Double.compare(scrapBook.eleNetCurrency, eleNetCurrency) != 0) return false;
        if (eleNetExtraDispo != scrapBook.eleNetExtraDispo) return false;
        if (eleNetForeignTax != scrapBook.eleNetForeignTax) return false;
        if (eleNetSupportCode != scrapBook.eleNetSupportCode) return false;
        if (Double.compare(scrapBook.eleNetVat, eleNetVat) != 0) return false;
        if (optionalFieldPersistedRefQuantum != scrapBook.optionalFieldPersistedRefQuantum) return false;
        if (p03DiliCgencode != scrapBook.p03DiliCgencode) return false;
        if (p05DiliCavailabilityCode != scrapBook.p05DiliCavailabilityCode) return false;
        if (p06DiliCpriceType != scrapBook.p06DiliCpriceType) return false;
        if (Double.compare(scrapBook.p07DiliCpriceAndVat, p07DiliCpriceAndVat) != 0) return false;
        if (Double.compare(scrapBook.p09DiliCvat1, p09DiliCvat1) != 0) return false;
        if (Double.compare(scrapBook.p10DiliCamountTaxExempt1, p10DiliCamountTaxExempt1) != 0) return false;
        if (Double.compare(scrapBook.p11DiliCvat2, p11DiliCvat2) != 0) return false;
        if (Double.compare(scrapBook.p12DiliCamountTaxExempt2, p12DiliCamountTaxExempt2) != 0) return false;
        if (Double.compare(scrapBook.p13DiliCvat3, p13DiliCvat3) != 0) return false;
        if (Double.compare(scrapBook.p14DiliCamountTaxExempt3, p14DiliCamountTaxExempt3) != 0) return false;
        if (p15DiliCreturnCode != scrapBook.p15DiliCreturnCode) return false;
        if (Double.compare(scrapBook.p23DiliCthickness, p23DiliCthickness) != 0) return false;
        if (Double.compare(scrapBook.p24DiliCwidth, p24DiliCwidth) != 0) return false;
        if (Double.compare(scrapBook.p25DiliCheight, p25DiliCheight) != 0) return false;
        if (Double.compare(scrapBook.p26DiliCweight, p26DiliCweight) != 0) return false;
        if (p37DiliClinkingCodes != scrapBook.p37DiliClinkingCodes) return false;
        if (p39DiliCcommandableUnit != scrapBook.p39DiliCcommandableUnit) return false;
        if (p40DiliCjointSalesPackage != scrapBook.p40DiliCjointSalesPackage) return false;
        if (p41DiliCsymbolization != scrapBook.p41DiliCsymbolization) return false;
        if (p42DiliCuniqueOrMultitpleDistribution != scrapBook.p42DiliCuniqueOrMultitpleDistribution) return false;
        if (p43DiliCnumberOfReference != scrapBook.p43DiliCnumberOfReference) return false;
        if (p47DiliCfuAvailabilityCode != scrapBook.p47DiliCfuAvailabilityCode) return false;
        if (p48DiliCfuPriceType != scrapBook.p48DiliCfuPriceType) return false;
        if (Double.compare(scrapBook.p49DiliCfuPriceAndVat, p49DiliCfuPriceAndVat) != 0) return false;
        if (Double.compare(scrapBook.p51DiliCfuVat1, p51DiliCfuVat1) != 0) return false;
        if (Double.compare(scrapBook.p52DiliCfuAmountTaxExempt1, p52DiliCfuAmountTaxExempt1) != 0) return false;
        if (Double.compare(scrapBook.p53DiliCfuVat2, p53DiliCfuVat2) != 0) return false;
        if (Double.compare(scrapBook.p54DiliCfuAmountTaxExempt2, p54DiliCfuAmountTaxExempt2) != 0) return false;
        if (Double.compare(scrapBook.p55DiliCfuVat3, p55DiliCfuVat3) != 0) return false;
        if (Double.compare(scrapBook.p56DiliCfuAmountTaxExempt3, p56DiliCfuAmountTaxExempt3) != 0) return false;
        if (p57DiliCfuReturnCode != scrapBook.p57DiliCfuReturnCode) return false;
        if (scrapbookid != scrapBook.scrapbookid) return false;
        if (version != scrapBook.version) return false;
        if (eleNetAuthor != null ? !eleNetAuthor.equals(scrapBook.eleNetAuthor) : scrapBook.eleNetAuthor != null) return false;
        if (eleNetCompleteBookTitle != null ? !eleNetCompleteBookTitle.equals(scrapBook.eleNetCompleteBookTitle) : scrapBook.eleNetCompleteBookTitle != null)
            return false;
        if (eleNetCritic != null ? !eleNetCritic.equals(scrapBook.eleNetCritic) : scrapBook.eleNetCritic != null) return false;
        if (eleNetEanFaulty != null ? !eleNetEanFaulty.equals(scrapBook.eleNetEanFaulty) : scrapBook.eleNetEanFaulty != null) return false;
        if (eleNetEanUsed != null ? !eleNetEanUsed.equals(scrapBook.eleNetEanUsed) : scrapBook.eleNetEanUsed != null) return false;
        if (!Arrays.equals(eleNetImage, scrapBook.eleNetImage)) return false;
        if (eleNetIsbnFaulty != null ? !eleNetIsbnFaulty.equals(scrapBook.eleNetIsbnFaulty) : scrapBook.eleNetIsbnFaulty != null) return false;
        if (eleNetIsbnUsed != null ? !eleNetIsbnUsed.equals(scrapBook.eleNetIsbnUsed) : scrapBook.eleNetIsbnUsed != null) return false;
        if (eleNetPublisher != null ? !eleNetPublisher.equals(scrapBook.eleNetPublisher) : scrapBook.eleNetPublisher != null) return false;
        if (eleNetResponsible != null ? !eleNetResponsible.equals(scrapBook.eleNetResponsible) : scrapBook.eleNetResponsible != null) return false;
        if (eleNetResume != null ? !eleNetResume.equals(scrapBook.eleNetResume) : scrapBook.eleNetResume != null) return false;
        if (eleNetShelf != null ? !eleNetShelf.equals(scrapBook.eleNetShelf) : scrapBook.eleNetShelf != null) return false;
        if (eleNetTheme != null ? !eleNetTheme.equals(scrapBook.eleNetTheme) : scrapBook.eleNetTheme != null) return false;
        if (eleNetTitle != null ? !eleNetTitle.equals(scrapBook.eleNetTitle) : scrapBook.eleNetTitle != null) return false;
        if (p01DiliCmovementCode != null ? !p01DiliCmovementCode.equals(scrapBook.p01DiliCmovementCode) : scrapBook.p01DiliCmovementCode != null)
            return false;
        if (p02DiliCean != null ? !p02DiliCean.equals(scrapBook.p02DiliCean) : scrapBook.p02DiliCean != null) return false;
        if (p04DiliCdateOfTariffApplicable != null ? !p04DiliCdateOfTariffApplicable.equals(scrapBook.p04DiliCdateOfTariffApplicable) : scrapBook.p04DiliCdateOfTariffApplicable != null)
            return false;
        if (p08DiliCdiscountClassification != null ? !p08DiliCdiscountClassification.equals(scrapBook.p08DiliCdiscountClassification) : scrapBook.p08DiliCdiscountClassification != null)
            return false;
        if (p16DiliCpriceCode != null ? !p16DiliCpriceCode.equals(scrapBook.p16DiliCpriceCode) : scrapBook.p16DiliCpriceCode != null) return false;
        if (p17DiliCdatePublished != null ? !p17DiliCdatePublished.equals(scrapBook.p17DiliCdatePublished) : scrapBook.p17DiliCdatePublished != null)
            return false;
        if (p18DiliCtypeProduct != null ? !p18DiliCtypeProduct.equals(scrapBook.p18DiliCtypeProduct) : scrapBook.p18DiliCtypeProduct != null)
            return false;
        if (p19DiliCdateEndOfCommercialization != null ? !p19DiliCdateEndOfCommercialization.equals(scrapBook.p19DiliCdateEndOfCommercialization) : scrapBook.p19DiliCdateEndOfCommercialization != null)
            return false;
        if (p20DiliCwordingStandard != null ? !p20DiliCwordingStandard.equals(scrapBook.p20DiliCwordingStandard) : scrapBook.p20DiliCwordingStandard != null)
            return false;
        if (p21DiliCwordingCounter != null ? !p21DiliCwordingCounter.equals(scrapBook.p21DiliCwordingCounter) : scrapBook.p21DiliCwordingCounter != null)
            return false;
        if (p22DiliCstoreDisplay != null ? !p22DiliCstoreDisplay.equals(scrapBook.p22DiliCstoreDisplay) : scrapBook.p22DiliCstoreDisplay != null)
            return false;
        if (p27DiliCwordingExtended != null ? !p27DiliCwordingExtended.equals(scrapBook.p27DiliCwordingExtended) : scrapBook.p27DiliCwordingExtended != null)
            return false;
        if (p28DiliCpublisher != null ? !p28DiliCpublisher.equals(scrapBook.p28DiliCpublisher) : scrapBook.p28DiliCpublisher != null) return false;
        if (p29DiliCcollectionName != null ? !p29DiliCcollectionName.equals(scrapBook.p29DiliCcollectionName) : scrapBook.p29DiliCcollectionName != null)
            return false;
        if (p30DiliCauthor != null ? !p30DiliCauthor.equals(scrapBook.p30DiliCauthor) : scrapBook.p30DiliCauthor != null) return false;
        if (p31DiliCbinding != null ? !p31DiliCbinding.equals(scrapBook.p31DiliCbinding) : scrapBook.p31DiliCbinding != null) return false;
        if (p32DiliCIsbn != null ? !p32DiliCIsbn.equals(scrapBook.p32DiliCIsbn) : scrapBook.p32DiliCIsbn != null) return false;
        if (p33DiliCbookDistributorReference != null ? !p33DiliCbookDistributorReference.equals(scrapBook.p33DiliCbookDistributorReference) : scrapBook.p33DiliCbookDistributorReference != null)
            return false;
        if (p34DiliCserialCollection != null ? !p34DiliCserialCollection.equals(scrapBook.p34DiliCserialCollection) : scrapBook.p34DiliCserialCollection != null)
            return false;
        if (p35DiliCtheme != null ? !p35DiliCtheme.equals(scrapBook.p35DiliCtheme) : scrapBook.p35DiliCtheme != null) return false;
        if (p36DiliCIsbnPublisher != null ? !p36DiliCIsbnPublisher.equals(scrapBook.p36DiliCIsbnPublisher) : scrapBook.p36DiliCIsbnPublisher != null)
            return false;
        if (p38DiliCeanRelatedProducts != null ? !p38DiliCeanRelatedProducts.equals(scrapBook.p38DiliCeanRelatedProducts) : scrapBook.p38DiliCeanRelatedProducts != null)
            return false;
        if (p44DiliCdateOfCreation != null ? !p44DiliCdateOfCreation.equals(scrapBook.p44DiliCdateOfCreation) : scrapBook.p44DiliCdateOfCreation != null)
            return false;
        if (p45DiliCdateOfLastModification != null ? !p45DiliCdateOfLastModification.equals(scrapBook.p45DiliCdateOfLastModification) : scrapBook.p45DiliCdateOfLastModification != null)
            return false;
        if (p46DiliCfuDateOfTariffApplicable != null ? !p46DiliCfuDateOfTariffApplicable.equals(scrapBook.p46DiliCfuDateOfTariffApplicable) : scrapBook.p46DiliCfuDateOfTariffApplicable != null)
            return false;
        if (p50DiliCfuDiscountClassification != null ? !p50DiliCfuDiscountClassification.equals(scrapBook.p50DiliCfuDiscountClassification) : scrapBook.p50DiliCfuDiscountClassification != null)
            return false;
        if (p58DiliCfuPriceCode != null ? !p58DiliCfuPriceCode.equals(scrapBook.p58DiliCfuPriceCode) : scrapBook.p58DiliCfuPriceCode != null)
            return false;
        if (wCatBauthorName != null ? !wCatBauthorName.equals(scrapBook.wCatBauthorName) : scrapBook.wCatBauthorName != null) return false;
        if (wCatBdateUpdated != null ? !wCatBdateUpdated.equals(scrapBook.wCatBdateUpdated) : scrapBook.wCatBdateUpdated != null) return false;
        if (wCatBisbn != null ? !wCatBisbn.equals(scrapBook.wCatBisbn) : scrapBook.wCatBisbn != null) return false;
        if (wCatBtitle != null ? !wCatBtitle.equals(scrapBook.wCatBtitle) : scrapBook.wCatBtitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (scrapbookid ^ (scrapbookid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (p01DiliCmovementCode != null ? p01DiliCmovementCode.hashCode() : 0);
        result = 31 * result + (p02DiliCean != null ? p02DiliCean.hashCode() : 0);
        result = 31 * result + (int) (p03DiliCgencode ^ (p03DiliCgencode >>> 32));
        result = 31 * result + (p04DiliCdateOfTariffApplicable != null ? p04DiliCdateOfTariffApplicable.hashCode() : 0);
        result = 31 * result + p05DiliCavailabilityCode;
        result = 31 * result + p06DiliCpriceType;
        temp = p07DiliCpriceAndVat != +0.0d ? Double.doubleToLongBits(p07DiliCpriceAndVat) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (p08DiliCdiscountClassification != null ? p08DiliCdiscountClassification.hashCode() : 0);
        temp = p09DiliCvat1 != +0.0d ? Double.doubleToLongBits(p09DiliCvat1) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p10DiliCamountTaxExempt1 != +0.0d ? Double.doubleToLongBits(p10DiliCamountTaxExempt1) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p11DiliCvat2 != +0.0d ? Double.doubleToLongBits(p11DiliCvat2) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p12DiliCamountTaxExempt2 != +0.0d ? Double.doubleToLongBits(p12DiliCamountTaxExempt2) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p13DiliCvat3 != +0.0d ? Double.doubleToLongBits(p13DiliCvat3) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p14DiliCamountTaxExempt3 != +0.0d ? Double.doubleToLongBits(p14DiliCamountTaxExempt3) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + p15DiliCreturnCode;
        result = 31 * result + (p16DiliCpriceCode != null ? p16DiliCpriceCode.hashCode() : 0);
        result = 31 * result + (p17DiliCdatePublished != null ? p17DiliCdatePublished.hashCode() : 0);
        result = 31 * result + (p18DiliCtypeProduct != null ? p18DiliCtypeProduct.hashCode() : 0);
        result = 31 * result + (p19DiliCdateEndOfCommercialization != null ? p19DiliCdateEndOfCommercialization.hashCode() : 0);
        result = 31 * result + (p20DiliCwordingStandard != null ? p20DiliCwordingStandard.hashCode() : 0);
        result = 31 * result + (p21DiliCwordingCounter != null ? p21DiliCwordingCounter.hashCode() : 0);
        result = 31 * result + (p22DiliCstoreDisplay != null ? p22DiliCstoreDisplay.hashCode() : 0);
        temp = p23DiliCthickness != +0.0d ? Double.doubleToLongBits(p23DiliCthickness) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p24DiliCwidth != +0.0d ? Double.doubleToLongBits(p24DiliCwidth) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p25DiliCheight != +0.0d ? Double.doubleToLongBits(p25DiliCheight) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p26DiliCweight != +0.0d ? Double.doubleToLongBits(p26DiliCweight) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (p27DiliCwordingExtended != null ? p27DiliCwordingExtended.hashCode() : 0);
        result = 31 * result + (p28DiliCpublisher != null ? p28DiliCpublisher.hashCode() : 0);
        result = 31 * result + (p29DiliCcollectionName != null ? p29DiliCcollectionName.hashCode() : 0);
        result = 31 * result + (p30DiliCauthor != null ? p30DiliCauthor.hashCode() : 0);
        result = 31 * result + (p31DiliCbinding != null ? p31DiliCbinding.hashCode() : 0);
        result = 31 * result + (p32DiliCIsbn != null ? p32DiliCIsbn.hashCode() : 0);
        result = 31 * result + (p33DiliCbookDistributorReference != null ? p33DiliCbookDistributorReference.hashCode() : 0);
        result = 31 * result + (p34DiliCserialCollection != null ? p34DiliCserialCollection.hashCode() : 0);
        result = 31 * result + (p35DiliCtheme != null ? p35DiliCtheme.hashCode() : 0);
        result = 31 * result + (p36DiliCIsbnPublisher != null ? p36DiliCIsbnPublisher.hashCode() : 0);
        result = 31 * result + p37DiliClinkingCodes;
        result = 31 * result + (p38DiliCeanRelatedProducts != null ? p38DiliCeanRelatedProducts.hashCode() : 0);
        result = 31 * result + p39DiliCcommandableUnit;
        result = 31 * result + p40DiliCjointSalesPackage;
        result = 31 * result + p41DiliCsymbolization;
        result = 31 * result + p42DiliCuniqueOrMultitpleDistribution;
        result = 31 * result + p43DiliCnumberOfReference;
        result = 31 * result + (p44DiliCdateOfCreation != null ? p44DiliCdateOfCreation.hashCode() : 0);
        result = 31 * result + (p45DiliCdateOfLastModification != null ? p45DiliCdateOfLastModification.hashCode() : 0);
        result = 31 * result + (p46DiliCfuDateOfTariffApplicable != null ? p46DiliCfuDateOfTariffApplicable.hashCode() : 0);
        result = 31 * result + p47DiliCfuAvailabilityCode;
        result = 31 * result + p48DiliCfuPriceType;
        temp = p49DiliCfuPriceAndVat != +0.0d ? Double.doubleToLongBits(p49DiliCfuPriceAndVat) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (p50DiliCfuDiscountClassification != null ? p50DiliCfuDiscountClassification.hashCode() : 0);
        temp = p51DiliCfuVat1 != +0.0d ? Double.doubleToLongBits(p51DiliCfuVat1) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p52DiliCfuAmountTaxExempt1 != +0.0d ? Double.doubleToLongBits(p52DiliCfuAmountTaxExempt1) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p53DiliCfuVat2 != +0.0d ? Double.doubleToLongBits(p53DiliCfuVat2) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p54DiliCfuAmountTaxExempt2 != +0.0d ? Double.doubleToLongBits(p54DiliCfuAmountTaxExempt2) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p55DiliCfuVat3 != +0.0d ? Double.doubleToLongBits(p55DiliCfuVat3) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = p56DiliCfuAmountTaxExempt3 != +0.0d ? Double.doubleToLongBits(p56DiliCfuAmountTaxExempt3) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + p57DiliCfuReturnCode;
        result = 31 * result + (p58DiliCfuPriceCode != null ? p58DiliCfuPriceCode.hashCode() : 0);
        result = 31 * result + (eleNetTitle != null ? eleNetTitle.hashCode() : 0);
        result = 31 * result + (eleNetCompleteBookTitle != null ? eleNetCompleteBookTitle.hashCode() : 0);
        result = 31 * result + (eleNetEanFaulty != null ? eleNetEanFaulty.hashCode() : 0);
        result = 31 * result + (eleNetIsbnFaulty != null ? eleNetIsbnFaulty.hashCode() : 0);
        result = 31 * result + (eleNetEanUsed != null ? eleNetEanUsed.hashCode() : 0);
        result = 31 * result + (eleNetIsbnUsed != null ? eleNetIsbnUsed.hashCode() : 0);
        temp = eleNetCurrency != +0.0d ? Double.doubleToLongBits(eleNetCurrency) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + eleNetForeignTax;
        temp = eleNetVat != +0.0d ? Double.doubleToLongBits(eleNetVat) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (eleNetResume != null ? eleNetResume.hashCode() : 0);
        result = 31 * result + (eleNetImage != null ? Arrays.hashCode(eleNetImage) : 0);
        result = 31 * result + (eleNetCritic != null ? eleNetCritic.hashCode() : 0);
        result = 31 * result + (eleNetTheme != null ? eleNetTheme.hashCode() : 0);
        result = 31 * result + (eleNetPublisher != null ? eleNetPublisher.hashCode() : 0);
        result = 31 * result + (eleNetAuthor != null ? eleNetAuthor.hashCode() : 0);
        result = 31 * result + (eleNetResponsible != null ? eleNetResponsible.hashCode() : 0);
        result = 31 * result + (eleNetShelf != null ? eleNetShelf.hashCode() : 0);
        result = 31 * result + eleNetSupportCode;
        result = 31 * result + eleNetExtraDispo;
        result = 31 * result + eleNetBookBinding;
        result = 31 * result + (wCatBtitle != null ? wCatBtitle.hashCode() : 0);
        result = 31 * result + (wCatBisbn != null ? wCatBisbn.hashCode() : 0);
        result = 31 * result + (wCatBdateUpdated != null ? wCatBdateUpdated.hashCode() : 0);
        result = 31 * result + (wCatBauthorName != null ? wCatBauthorName.hashCode() : 0);
        result = 31 * result + (int) (optionalFieldPersistedRefQuantum ^ (optionalFieldPersistedRefQuantum >>> 32));
        return result;
    }
}
