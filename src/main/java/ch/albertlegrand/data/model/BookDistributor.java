package ch.albertlegrand.data.model;

import java.sql.Date;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class BookDistributor {
    private long bookdistributorId;

    public long getBookdistributorId() {
        return bookdistributorId;
    }

    public void setBookdistributorId(long bookdistributorId) {
        this.bookdistributorId = bookdistributorId;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private double algInlandTax;

    public double getAlgInlandTax() {
        return algInlandTax;
    }

    public void setAlgInlandTax(double algInlandTax) {
        this.algInlandTax = algInlandTax;
    }

    private double algTaxExempt;

    public double getAlgTaxExempt() {
        return algTaxExempt;
    }

    public void setAlgTaxExempt(double algTaxExempt) {
        this.algTaxExempt = algTaxExempt;
    }

    private double diliCvat1;

    public double getDiliCvat1() {
        return diliCvat1;
    }

    public void setDiliCvat1(double diliCvat1) {
        this.diliCvat1 = diliCvat1;
    }

    private double diliCamountTaxExempt1;

    public double getDiliCamountTaxExempt1() {
        return diliCamountTaxExempt1;
    }

    public void setDiliCamountTaxExempt1(double diliCamountTaxExempt1) {
        this.diliCamountTaxExempt1 = diliCamountTaxExempt1;
    }

    private double diliCvat2;

    public double getDiliCvat2() {
        return diliCvat2;
    }

    public void setDiliCvat2(double diliCvat2) {
        this.diliCvat2 = diliCvat2;
    }

    private double diliCamountTaxExempt2;

    public double getDiliCamountTaxExempt2() {
        return diliCamountTaxExempt2;
    }

    public void setDiliCamountTaxExempt2(double diliCamountTaxExempt2) {
        this.diliCamountTaxExempt2 = diliCamountTaxExempt2;
    }

    private double diliCvat3;

    public double getDiliCvat3() {
        return diliCvat3;
    }

    public void setDiliCvat3(double diliCvat3) {
        this.diliCvat3 = diliCvat3;
    }

    private double diliCamountTaxExempt3;

    public double getDiliCamountTaxExempt3() {
        return diliCamountTaxExempt3;
    }

    public void setDiliCamountTaxExempt3(double diliCamountTaxExempt3) {
        this.diliCamountTaxExempt3 = diliCamountTaxExempt3;
    }

    private String diliCpriceCode;

    public String getDiliCpriceCode() {
        return diliCpriceCode;
    }

    public void setDiliCpriceCode(String diliCpriceCode) {
        this.diliCpriceCode = diliCpriceCode;
    }

    private int diliCreturnCode;

    public int getDiliCreturnCode() {
        return diliCreturnCode;
    }

    public void setDiliCreturnCode(int diliCreturnCode) {
        this.diliCreturnCode = diliCreturnCode;
    }

    private int diliCpriceType;

    public int getDiliCpriceType() {
        return diliCpriceType;
    }

    public void setDiliCpriceType(int diliCpriceType) {
        this.diliCpriceType = diliCpriceType;
    }

    private int diliCavailabilityCode;

    public int getDiliCavailabilityCode() {
        return diliCavailabilityCode;
    }

    public void setDiliCavailabilityCode(int diliCavailabilityCode) {
        this.diliCavailabilityCode = diliCavailabilityCode;
    }

    private String diliCBookDistributorReference;

    public String getDiliCBookDistributorReference() {
        return diliCBookDistributorReference;
    }

    public void setDiliCBookDistributorReference(String diliCBookDistributorReference) {
        this.diliCBookDistributorReference = diliCBookDistributorReference;
    }

    private String diliCdiscountClassification;

    public String getDiliCdiscountClassification() {
        return diliCdiscountClassification;
    }

    public void setDiliCdiscountClassification(String diliCdiscountClassification) {
        this.diliCdiscountClassification = diliCdiscountClassification;
    }

    private long diliCgencod;

    public long getDiliCgencod() {
        return diliCgencod;
    }

    public void setDiliCgencod(long diliCgencod) {
        this.diliCgencod = diliCgencod;
    }

    private Date diliCdateOfTariffApplication;

    public Date getDiliCdateOfTariffApplication() {
        return diliCdateOfTariffApplication;
    }

    public void setDiliCdateOfTariffApplication(Date diliCdateOfTariffApplication) {
        this.diliCdateOfTariffApplication = diliCdateOfTariffApplication;
    }

    private Date diliCdatePublished;

    public Date getDiliCdatePublished() {
        return diliCdatePublished;
    }

    public void setDiliCdatePublished(Date diliCdatePublished) {
        this.diliCdatePublished = diliCdatePublished;
    }

    private String diliCtypeOfProduct;

    public String getDiliCtypeOfProduct() {
        return diliCtypeOfProduct;
    }

    public void setDiliCtypeOfProduct(String diliCtypeOfProduct) {
        this.diliCtypeOfProduct = diliCtypeOfProduct;
    }

    private int diliCuniqueOrMultitpleDistribution;

    public int getDiliCuniqueOrMultitpleDistribution() {
        return diliCuniqueOrMultitpleDistribution;
    }

    public void setDiliCuniqueOrMultitpleDistribution(int diliCuniqueOrMultitpleDistribution) {
        this.diliCuniqueOrMultitpleDistribution = diliCuniqueOrMultitpleDistribution;
    }

    private Date diliCdateEndOfCommercialization;

    public Date getDiliCdateEndOfCommercialization() {
        return diliCdateEndOfCommercialization;
    }

    public void setDiliCdateEndOfCommercialization(Date diliCdateEndOfCommercialization) {
        this.diliCdateEndOfCommercialization = diliCdateEndOfCommercialization;
    }

    private double diliCpriceAndVat;

    public double getDiliCpriceAndVat() {
        return diliCpriceAndVat;
    }

    public void setDiliCpriceAndVat(double diliCpriceAndVat) {
        this.diliCpriceAndVat = diliCpriceAndVat;
    }

    private long eleNetCurrency;

    public long getEleNetCurrency() {
        return eleNetCurrency;
    }

    public void setEleNetCurrency(long eleNetCurrency) {
        this.eleNetCurrency = eleNetCurrency;
    }

    private double eleNetForeignTax;

    public double getEleNetForeignTax() {
        return eleNetForeignTax;
    }

    public void setEleNetForeignTax(double eleNetForeignTax) {
        this.eleNetForeignTax = eleNetForeignTax;
    }

    private double eleNetVat;

    public double getEleNetVat() {
        return eleNetVat;
    }

    public void setEleNetVat(double eleNetVat) {
        this.eleNetVat = eleNetVat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookDistributor that = (BookDistributor) o;

        if (Double.compare(that.algInlandTax, algInlandTax) != 0) return false;
        if (Double.compare(that.algTaxExempt, algTaxExempt) != 0) return false;
        if (bookdistributorId != that.bookdistributorId) return false;
        if (Double.compare(that.diliCamountTaxExempt1, diliCamountTaxExempt1) != 0) return false;
        if (Double.compare(that.diliCamountTaxExempt2, diliCamountTaxExempt2) != 0) return false;
        if (Double.compare(that.diliCamountTaxExempt3, diliCamountTaxExempt3) != 0) return false;
        if (diliCavailabilityCode != that.diliCavailabilityCode) return false;
        if (diliCgencod != that.diliCgencod) return false;
        if (Double.compare(that.diliCpriceAndVat, diliCpriceAndVat) != 0) return false;
        if (diliCpriceType != that.diliCpriceType) return false;
        if (diliCreturnCode != that.diliCreturnCode) return false;
        if (diliCuniqueOrMultitpleDistribution != that.diliCuniqueOrMultitpleDistribution) return false;
        if (Double.compare(that.diliCvat1, diliCvat1) != 0) return false;
        if (Double.compare(that.diliCvat2, diliCvat2) != 0) return false;
        if (Double.compare(that.diliCvat3, diliCvat3) != 0) return false;
        if (eleNetCurrency != that.eleNetCurrency) return false;
        if (Double.compare(that.eleNetForeignTax, eleNetForeignTax) != 0) return false;
        if (Double.compare(that.eleNetVat, eleNetVat) != 0) return false;
        if (version != that.version) return false;
        if (diliCBookDistributorReference != null ? !diliCBookDistributorReference.equals(that.diliCBookDistributorReference) : that.diliCBookDistributorReference != null)
            return false;
        if (diliCdateEndOfCommercialization != null ? !diliCdateEndOfCommercialization.equals(that.diliCdateEndOfCommercialization) : that.diliCdateEndOfCommercialization != null)
            return false;
        if (diliCdateOfTariffApplication != null ? !diliCdateOfTariffApplication.equals(that.diliCdateOfTariffApplication) : that.diliCdateOfTariffApplication != null)
            return false;
        if (diliCdatePublished != null ? !diliCdatePublished.equals(that.diliCdatePublished) : that.diliCdatePublished != null) return false;
        if (diliCdiscountClassification != null ? !diliCdiscountClassification.equals(that.diliCdiscountClassification) : that.diliCdiscountClassification != null)
            return false;
        if (diliCpriceCode != null ? !diliCpriceCode.equals(that.diliCpriceCode) : that.diliCpriceCode != null) return false;
        if (diliCtypeOfProduct != null ? !diliCtypeOfProduct.equals(that.diliCtypeOfProduct) : that.diliCtypeOfProduct != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (bookdistributorId ^ (bookdistributorId >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        temp = algInlandTax != +0.0d ? Double.doubleToLongBits(algInlandTax) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = algTaxExempt != +0.0d ? Double.doubleToLongBits(algTaxExempt) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = diliCvat1 != +0.0d ? Double.doubleToLongBits(diliCvat1) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = diliCamountTaxExempt1 != +0.0d ? Double.doubleToLongBits(diliCamountTaxExempt1) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = diliCvat2 != +0.0d ? Double.doubleToLongBits(diliCvat2) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = diliCamountTaxExempt2 != +0.0d ? Double.doubleToLongBits(diliCamountTaxExempt2) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = diliCvat3 != +0.0d ? Double.doubleToLongBits(diliCvat3) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = diliCamountTaxExempt3 != +0.0d ? Double.doubleToLongBits(diliCamountTaxExempt3) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (diliCpriceCode != null ? diliCpriceCode.hashCode() : 0);
        result = 31 * result + diliCreturnCode;
        result = 31 * result + diliCpriceType;
        result = 31 * result + diliCavailabilityCode;
        result = 31 * result + (diliCBookDistributorReference != null ? diliCBookDistributorReference.hashCode() : 0);
        result = 31 * result + (diliCdiscountClassification != null ? diliCdiscountClassification.hashCode() : 0);
        result = 31 * result + (int) (diliCgencod ^ (diliCgencod >>> 32));
        result = 31 * result + (diliCdateOfTariffApplication != null ? diliCdateOfTariffApplication.hashCode() : 0);
        result = 31 * result + (diliCdatePublished != null ? diliCdatePublished.hashCode() : 0);
        result = 31 * result + (diliCtypeOfProduct != null ? diliCtypeOfProduct.hashCode() : 0);
        result = 31 * result + diliCuniqueOrMultitpleDistribution;
        result = 31 * result + (diliCdateEndOfCommercialization != null ? diliCdateEndOfCommercialization.hashCode() : 0);
        temp = diliCpriceAndVat != +0.0d ? Double.doubleToLongBits(diliCpriceAndVat) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (int) (eleNetCurrency ^ (eleNetCurrency >>> 32));
        temp = eleNetForeignTax != +0.0d ? Double.doubleToLongBits(eleNetForeignTax) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = eleNetVat != +0.0d ? Double.doubleToLongBits(eleNetVat) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private Collection<Book> booksByBookdistributorId;

    public Collection<Book> getBooksByBookdistributorId() {
        return booksByBookdistributorId;
    }

    public void setBooksByBookdistributorId(Collection<Book> booksByBookdistributorId) {
        this.booksByBookdistributorId = booksByBookdistributorId;
    }
}
