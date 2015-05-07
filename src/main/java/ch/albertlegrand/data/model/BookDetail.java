package ch.albertlegrand.data.model;

import java.sql.Date;
import java.util.Arrays;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class BookDetail {
    private long bookdetailid;

    public long getBookdetailid() {
        return bookdetailid;
    }

    public void setBookdetailid(long bookdetailid) {
        this.bookdetailid = bookdetailid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String diliCtheme;

    public String getDiliCtheme() {
        return diliCtheme;
    }

    public void setDiliCtheme(String diliCtheme) {
        this.diliCtheme = diliCtheme;
    }

    private String diliCpublisher;

    public String getDiliCpublisher() {
        return diliCpublisher;
    }

    public void setDiliCpublisher(String diliCpublisher) {
        this.diliCpublisher = diliCpublisher;
    }

    private String diliCauthor;

    public String getDiliCauthor() {
        return diliCauthor;
    }

    public void setDiliCauthor(String diliCauthor) {
        this.diliCauthor = diliCauthor;
    }

    private String diliCmovementCode;

    public String getDiliCmovementCode() {
        return diliCmovementCode;
    }

    public void setDiliCmovementCode(String diliCmovementCode) {
        this.diliCmovementCode = diliCmovementCode;
    }

    private String diliCcollectionName;

    public String getDiliCcollectionName() {
        return diliCcollectionName;
    }

    public void setDiliCcollectionName(String diliCcollectionName) {
        this.diliCcollectionName = diliCcollectionName;
    }

    private String diliCserialCollection;

    public String getDiliCserialCollection() {
        return diliCserialCollection;
    }

    public void setDiliCserialCollection(String diliCserialCollection) {
        this.diliCserialCollection = diliCserialCollection;
    }

    private int diliCsymbolization;

    public int getDiliCsymbolization() {
        return diliCsymbolization;
    }

    public void setDiliCsymbolization(int diliCsymbolization) {
        this.diliCsymbolization = diliCsymbolization;
    }

    private int diliCnumberOfReference;

    public int getDiliCnumberOfReference() {
        return diliCnumberOfReference;
    }

    public void setDiliCnumberOfReference(int diliCnumberOfReference) {
        this.diliCnumberOfReference = diliCnumberOfReference;
    }

    private int diliClinkingCodes;

    public int getDiliClinkingCodes() {
        return diliClinkingCodes;
    }

    public void setDiliClinkingCodes(int diliClinkingCodes) {
        this.diliClinkingCodes = diliClinkingCodes;
    }

    private int diliCjointSalesPackage;

    public int getDiliCjointSalesPackage() {
        return diliCjointSalesPackage;
    }

    public void setDiliCjointSalesPackage(int diliCjointSalesPackage) {
        this.diliCjointSalesPackage = diliCjointSalesPackage;
    }

    private int diliCstoreDisplay;

    public int getDiliCstoreDisplay() {
        return diliCstoreDisplay;
    }

    public void setDiliCstoreDisplay(int diliCstoreDisplay) {
        this.diliCstoreDisplay = diliCstoreDisplay;
    }

    private int diliCcomandableUnit;

    public int getDiliCcomandableUnit() {
        return diliCcomandableUnit;
    }

    public void setDiliCcomandableUnit(int diliCcomandableUnit) {
        this.diliCcomandableUnit = diliCcomandableUnit;
    }

    private String diliCeanRelatedProducts;

    public String getDiliCeanRelatedProducts() {
        return diliCeanRelatedProducts;
    }

    public void setDiliCeanRelatedProducts(String diliCeanRelatedProducts) {
        this.diliCeanRelatedProducts = diliCeanRelatedProducts;
    }

    private String diliCIsbnPublisher;

    public String getDiliCIsbnPublisher() {
        return diliCIsbnPublisher;
    }

    public void setDiliCIsbnPublisher(String diliCIsbnPublisher) {
        this.diliCIsbnPublisher = diliCIsbnPublisher;
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

    private String eleNetCritics;

    public String getEleNetCritics() {
        return eleNetCritics;
    }

    public void setEleNetCritics(String eleNetCritics) {
        this.eleNetCritics = eleNetCritics;
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

    private String eleNetIsbnUsed;

    public String getEleNetIsbnUsed() {
        return eleNetIsbnUsed;
    }

    public void setEleNetIsbnUsed(String eleNetIsbnUsed) {
        this.eleNetIsbnUsed = eleNetIsbnUsed;
    }

    private String eleNetEanUsed;

    public String getEleNetEanUsed() {
        return eleNetEanUsed;
    }

    public void setEleNetEanUsed(String eleNetEanUsed) {
        this.eleNetEanUsed = eleNetEanUsed;
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

    private long diliCquantum;

    public long getDiliCquantum() {
        return diliCquantum;
    }

    public void setDiliCquantum(long diliCquantum) {
        this.diliCquantum = diliCquantum;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BookDetail that = (BookDetail) o;

        if (bookdetailid != that.bookdetailid) return false;
        if (diliCcomandableUnit != that.diliCcomandableUnit) return false;
        if (diliCjointSalesPackage != that.diliCjointSalesPackage) return false;
        if (diliClinkingCodes != that.diliClinkingCodes) return false;
        if (diliCnumberOfReference != that.diliCnumberOfReference) return false;
        if (diliCquantum != that.diliCquantum) return false;
        if (diliCstoreDisplay != that.diliCstoreDisplay) return false;
        if (diliCsymbolization != that.diliCsymbolization) return false;
        if (eleNetBookBinding != that.eleNetBookBinding) return false;
        if (eleNetExtraDispo != that.eleNetExtraDispo) return false;
        if (eleNetSupportCode != that.eleNetSupportCode) return false;
        if (version != that.version) return false;
        if (diliCIsbnPublisher != null ? !diliCIsbnPublisher.equals(that.diliCIsbnPublisher) : that.diliCIsbnPublisher != null) return false;
        if (diliCauthor != null ? !diliCauthor.equals(that.diliCauthor) : that.diliCauthor != null) return false;
        if (diliCcollectionName != null ? !diliCcollectionName.equals(that.diliCcollectionName) : that.diliCcollectionName != null) return false;
        if (diliCeanRelatedProducts != null ? !diliCeanRelatedProducts.equals(that.diliCeanRelatedProducts) : that.diliCeanRelatedProducts != null)
            return false;
        if (diliCmovementCode != null ? !diliCmovementCode.equals(that.diliCmovementCode) : that.diliCmovementCode != null) return false;
        if (diliCpublisher != null ? !diliCpublisher.equals(that.diliCpublisher) : that.diliCpublisher != null) return false;
        if (diliCserialCollection != null ? !diliCserialCollection.equals(that.diliCserialCollection) : that.diliCserialCollection != null)
            return false;
        if (diliCtheme != null ? !diliCtheme.equals(that.diliCtheme) : that.diliCtheme != null) return false;
        if (eleNetAuthor != null ? !eleNetAuthor.equals(that.eleNetAuthor) : that.eleNetAuthor != null) return false;
        if (eleNetCritics != null ? !eleNetCritics.equals(that.eleNetCritics) : that.eleNetCritics != null) return false;
        if (eleNetEanUsed != null ? !eleNetEanUsed.equals(that.eleNetEanUsed) : that.eleNetEanUsed != null) return false;
        if (!Arrays.equals(eleNetImage, that.eleNetImage)) return false;
        if (eleNetIsbnUsed != null ? !eleNetIsbnUsed.equals(that.eleNetIsbnUsed) : that.eleNetIsbnUsed != null) return false;
        if (eleNetPublisher != null ? !eleNetPublisher.equals(that.eleNetPublisher) : that.eleNetPublisher != null) return false;
        if (eleNetResponsible != null ? !eleNetResponsible.equals(that.eleNetResponsible) : that.eleNetResponsible != null) return false;
        if (eleNetResume != null ? !eleNetResume.equals(that.eleNetResume) : that.eleNetResume != null) return false;
        if (eleNetShelf != null ? !eleNetShelf.equals(that.eleNetShelf) : that.eleNetShelf != null) return false;
        if (eleNetTheme != null ? !eleNetTheme.equals(that.eleNetTheme) : that.eleNetTheme != null) return false;
        if (wCatBauthorName != null ? !wCatBauthorName.equals(that.wCatBauthorName) : that.wCatBauthorName != null) return false;
        if (wCatBdateUpdated != null ? !wCatBdateUpdated.equals(that.wCatBdateUpdated) : that.wCatBdateUpdated != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (bookdetailid ^ (bookdetailid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (diliCtheme != null ? diliCtheme.hashCode() : 0);
        result = 31 * result + (diliCpublisher != null ? diliCpublisher.hashCode() : 0);
        result = 31 * result + (diliCauthor != null ? diliCauthor.hashCode() : 0);
        result = 31 * result + (diliCmovementCode != null ? diliCmovementCode.hashCode() : 0);
        result = 31 * result + (diliCcollectionName != null ? diliCcollectionName.hashCode() : 0);
        result = 31 * result + (diliCserialCollection != null ? diliCserialCollection.hashCode() : 0);
        result = 31 * result + diliCsymbolization;
        result = 31 * result + diliCnumberOfReference;
        result = 31 * result + diliClinkingCodes;
        result = 31 * result + diliCjointSalesPackage;
        result = 31 * result + diliCstoreDisplay;
        result = 31 * result + diliCcomandableUnit;
        result = 31 * result + (diliCeanRelatedProducts != null ? diliCeanRelatedProducts.hashCode() : 0);
        result = 31 * result + (diliCIsbnPublisher != null ? diliCIsbnPublisher.hashCode() : 0);
        result = 31 * result + (eleNetResume != null ? eleNetResume.hashCode() : 0);
        result = 31 * result + (eleNetImage != null ? Arrays.hashCode(eleNetImage) : 0);
        result = 31 * result + (eleNetCritics != null ? eleNetCritics.hashCode() : 0);
        result = 31 * result + (eleNetTheme != null ? eleNetTheme.hashCode() : 0);
        result = 31 * result + (eleNetPublisher != null ? eleNetPublisher.hashCode() : 0);
        result = 31 * result + (eleNetAuthor != null ? eleNetAuthor.hashCode() : 0);
        result = 31 * result + (eleNetResponsible != null ? eleNetResponsible.hashCode() : 0);
        result = 31 * result + (eleNetShelf != null ? eleNetShelf.hashCode() : 0);
        result = 31 * result + eleNetSupportCode;
        result = 31 * result + eleNetExtraDispo;
        result = 31 * result + eleNetBookBinding;
        result = 31 * result + (eleNetIsbnUsed != null ? eleNetIsbnUsed.hashCode() : 0);
        result = 31 * result + (eleNetEanUsed != null ? eleNetEanUsed.hashCode() : 0);
        result = 31 * result + (wCatBdateUpdated != null ? wCatBdateUpdated.hashCode() : 0);
        result = 31 * result + (wCatBauthorName != null ? wCatBauthorName.hashCode() : 0);
        result = 31 * result + (int) (diliCquantum ^ (diliCquantum >>> 32));
        return result;
    }

    private Collection<Book> booksByBookdetailid;

    public Collection<Book> getBooksByBookdetailid() {
        return booksByBookdetailid;
    }

    public void setBooksByBookdetailid(Collection<Book> booksByBookdetailid) {
        this.booksByBookdetailid = booksByBookdetailid;
    }

    private Quantum quantumByDiliCquantum;

    public Quantum getQuantumByDiliCquantum() {
        return quantumByDiliCquantum;
    }

    public void setQuantumByDiliCquantum(Quantum quantumByDiliCquantum) {
        this.quantumByDiliCquantum = quantumByDiliCquantum;
    }
}
