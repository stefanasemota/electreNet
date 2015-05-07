package ch.albertlegrand.data.model;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class FutureUpdate {
    private long futureupdateid;

    public long getFutureupdateid() {
        return futureupdateid;
    }

    public void setFutureupdateid(long futureupdateid) {
        this.futureupdateid = futureupdateid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private Date diliCdateApplicable;

    public Date getDiliCdateApplicable() {
        return diliCdateApplicable;
    }

    public void setDiliCdateApplicable(Date diliCdateApplicable) {
        this.diliCdateApplicable = diliCdateApplicable;
    }

    private int diliCavailabilityCode;

    public int getDiliCavailabilityCode() {
        return diliCavailabilityCode;
    }

    public void setDiliCavailabilityCode(int diliCavailabilityCode) {
        this.diliCavailabilityCode = diliCavailabilityCode;
    }

    private int diliCpriceType;

    public int getDiliCpriceType() {
        return diliCpriceType;
    }

    public void setDiliCpriceType(int diliCpriceType) {
        this.diliCpriceType = diliCpriceType;
    }

    private double diliCpriceAndVat;

    public double getDiliCpriceAndVat() {
        return diliCpriceAndVat;
    }

    public void setDiliCpriceAndVat(double diliCpriceAndVat) {
        this.diliCpriceAndVat = diliCpriceAndVat;
    }

    private String diliCdiscountClassification;

    public String getDiliCdiscountClassification() {
        return diliCdiscountClassification;
    }

    public void setDiliCdiscountClassification(String diliCdiscountClassification) {
        this.diliCdiscountClassification = diliCdiscountClassification;
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

    private int diliCreturnCode;

    public int getDiliCreturnCode() {
        return diliCreturnCode;
    }

    public void setDiliCreturnCode(int diliCreturnCode) {
        this.diliCreturnCode = diliCreturnCode;
    }

    private String diliCpriceCode;

    public String getDiliCpriceCode() {
        return diliCpriceCode;
    }

    public void setDiliCpriceCode(String diliCpriceCode) {
        this.diliCpriceCode = diliCpriceCode;
    }

    private long diliCbookRef;

    public long getDiliCbookRef() {
        return diliCbookRef;
    }

    public void setDiliCbookRef(long diliCbookRef) {
        this.diliCbookRef = diliCbookRef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        FutureUpdate that = (FutureUpdate) o;

        if (Double.compare(that.diliCamountTaxExempt1, diliCamountTaxExempt1) != 0) return false;
        if (Double.compare(that.diliCamountTaxExempt2, diliCamountTaxExempt2) != 0) return false;
        if (Double.compare(that.diliCamountTaxExempt3, diliCamountTaxExempt3) != 0) return false;
        if (diliCavailabilityCode != that.diliCavailabilityCode) return false;
        if (diliCbookRef != that.diliCbookRef) return false;
        if (Double.compare(that.diliCpriceAndVat, diliCpriceAndVat) != 0) return false;
        if (diliCpriceType != that.diliCpriceType) return false;
        if (diliCreturnCode != that.diliCreturnCode) return false;
        if (Double.compare(that.diliCvat1, diliCvat1) != 0) return false;
        if (Double.compare(that.diliCvat2, diliCvat2) != 0) return false;
        if (Double.compare(that.diliCvat3, diliCvat3) != 0) return false;
        if (futureupdateid != that.futureupdateid) return false;
        if (version != that.version) return false;
        if (diliCdateApplicable != null ? !diliCdateApplicable.equals(that.diliCdateApplicable) : that.diliCdateApplicable != null) return false;
        if (diliCdiscountClassification != null ? !diliCdiscountClassification.equals(that.diliCdiscountClassification) : that.diliCdiscountClassification != null)
            return false;
        if (diliCpriceCode != null ? !diliCpriceCode.equals(that.diliCpriceCode) : that.diliCpriceCode != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (futureupdateid ^ (futureupdateid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (diliCdateApplicable != null ? diliCdateApplicable.hashCode() : 0);
        result = 31 * result + diliCavailabilityCode;
        result = 31 * result + diliCpriceType;
        temp = diliCpriceAndVat != +0.0d ? Double.doubleToLongBits(diliCpriceAndVat) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        result = 31 * result + (diliCdiscountClassification != null ? diliCdiscountClassification.hashCode() : 0);
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
        result = 31 * result + diliCreturnCode;
        result = 31 * result + (diliCpriceCode != null ? diliCpriceCode.hashCode() : 0);
        result = 31 * result + (int) (diliCbookRef ^ (diliCbookRef >>> 32));
        return result;
    }
}
