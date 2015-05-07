package ch.albertlegrand.data.model;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class Book {
    private long bookid;

    public long getBookid() {
        return bookid;
    }

    public void setBookid(long bookid) {
        this.bookid = bookid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String albertLeGrandTitle;

    public String getAlbertLeGrandTitle() {
        return albertLeGrandTitle;
    }

    public void setAlbertLeGrandTitle(String albertLeGrandTitle) {
        this.albertLeGrandTitle = albertLeGrandTitle;
    }

    private String diliCwordingExtended;

    public String getDiliCwordingExtended() {
        return diliCwordingExtended;
    }

    public void setDiliCwordingExtended(String diliCwordingExtended) {
        this.diliCwordingExtended = diliCwordingExtended;
    }

    private String diliCwordingStandard;

    public String getDiliCwordingStandard() {
        return diliCwordingStandard;
    }

    public void setDiliCwordingStandard(String diliCwordingStandard) {
        this.diliCwordingStandard = diliCwordingStandard;
    }

    private String diliCwordingCounter;

    public String getDiliCwordingCounter() {
        return diliCwordingCounter;
    }

    public void setDiliCwordingCounter(String diliCwordingCounter) {
        this.diliCwordingCounter = diliCwordingCounter;
    }

    private String eleNetTitle;

    public String getEleNetTitle() {
        return eleNetTitle;
    }

    public void setEleNetTitle(String eleNetTitle) {
        this.eleNetTitle = eleNetTitle;
    }

    private String eleNetCompleteTitle;

    public String getEleNetCompleteTitle() {
        return eleNetCompleteTitle;
    }

    public void setEleNetCompleteTitle(String eleNetCompleteTitle) {
        this.eleNetCompleteTitle = eleNetCompleteTitle;
    }

    private String wCatBtitle;

    public String getwCatBtitle() {
        return wCatBtitle;
    }

    public void setwCatBtitle(String wCatBtitle) {
        this.wCatBtitle = wCatBtitle;
    }

    private String ean;

    public String getEan() {
        return ean;
    }

    public void setEan(String ean) {
        this.ean = ean;
    }

    private String isbn;

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    private boolean markAsDeleted;

    public boolean isMarkAsDeleted() {
        return markAsDeleted;
    }

    public void setMarkAsDeleted(boolean markAsDeleted) {
        this.markAsDeleted = markAsDeleted;
    }

    private Date dateUpdated;

    public Date getDateUpdated() {
        return dateUpdated;
    }

    public void setDateUpdated(Date dateUpdated) {
        this.dateUpdated = dateUpdated;
    }

    private Date dateExtraction;

    public Date getDateExtraction() {
        return dateExtraction;
    }

    public void setDateExtraction(Date dateExtraction) {
        this.dateExtraction = dateExtraction;
    }

    private Date datePublished;

    public Date getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(Date datePublished) {
        this.datePublished = datePublished;
    }

    private String authorName;

    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    private String publisherName;

    public String getPublisherName() {
        return publisherName;
    }

    public void setPublisherName(String publisherName) {
        this.publisherName = publisherName;
    }

    private String bookBinding;

    public String getBookBinding() {
        return bookBinding;
    }

    public void setBookBinding(String bookBinding) {
        this.bookBinding = bookBinding;
    }

    private int productType;

    public int getProductType() {
        return productType;
    }

    public void setProductType(int productType) {
        this.productType = productType;
    }

    private long bookDetailRef;

    public long getBookDetailRef() {
        return bookDetailRef;
    }

    public void setBookDetailRef(long bookDetailRef) {
        this.bookDetailRef = bookDetailRef;
    }

    private long bookDistributorRef;

    public long getBookDistributorRef() {
        return bookDistributorRef;
    }

    public void setBookDistributorRef(long bookDistributorRef) {
        this.bookDistributorRef = bookDistributorRef;
    }

    private long algOnlineServiceRef;

    public long getAlgOnlineServiceRef() {
        return algOnlineServiceRef;
    }

    public void setAlgOnlineServiceRef(long algOnlineServiceRef) {
        this.algOnlineServiceRef = algOnlineServiceRef;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Book book = (Book) o;

        if (algOnlineServiceRef != book.algOnlineServiceRef) return false;
        if (bookDetailRef != book.bookDetailRef) return false;
        if (bookDistributorRef != book.bookDistributorRef) return false;
        if (bookid != book.bookid) return false;
        if (markAsDeleted != book.markAsDeleted) return false;
        if (productType != book.productType) return false;
        if (version != book.version) return false;
        if (albertLeGrandTitle != null ? !albertLeGrandTitle.equals(book.albertLeGrandTitle) : book.albertLeGrandTitle != null) return false;
        if (authorName != null ? !authorName.equals(book.authorName) : book.authorName != null) return false;
        if (bookBinding != null ? !bookBinding.equals(book.bookBinding) : book.bookBinding != null) return false;
        if (dateExtraction != null ? !dateExtraction.equals(book.dateExtraction) : book.dateExtraction != null) return false;
        if (datePublished != null ? !datePublished.equals(book.datePublished) : book.datePublished != null) return false;
        if (dateUpdated != null ? !dateUpdated.equals(book.dateUpdated) : book.dateUpdated != null) return false;
        if (diliCwordingCounter != null ? !diliCwordingCounter.equals(book.diliCwordingCounter) : book.diliCwordingCounter != null) return false;
        if (diliCwordingExtended != null ? !diliCwordingExtended.equals(book.diliCwordingExtended) : book.diliCwordingExtended != null) return false;
        if (diliCwordingStandard != null ? !diliCwordingStandard.equals(book.diliCwordingStandard) : book.diliCwordingStandard != null) return false;
        if (ean != null ? !ean.equals(book.ean) : book.ean != null) return false;
        if (eleNetCompleteTitle != null ? !eleNetCompleteTitle.equals(book.eleNetCompleteTitle) : book.eleNetCompleteTitle != null) return false;
        if (eleNetTitle != null ? !eleNetTitle.equals(book.eleNetTitle) : book.eleNetTitle != null) return false;
        if (isbn != null ? !isbn.equals(book.isbn) : book.isbn != null) return false;
        if (publisherName != null ? !publisherName.equals(book.publisherName) : book.publisherName != null) return false;
        if (wCatBtitle != null ? !wCatBtitle.equals(book.wCatBtitle) : book.wCatBtitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (bookid ^ (bookid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (albertLeGrandTitle != null ? albertLeGrandTitle.hashCode() : 0);
        result = 31 * result + (diliCwordingExtended != null ? diliCwordingExtended.hashCode() : 0);
        result = 31 * result + (diliCwordingStandard != null ? diliCwordingStandard.hashCode() : 0);
        result = 31 * result + (diliCwordingCounter != null ? diliCwordingCounter.hashCode() : 0);
        result = 31 * result + (eleNetTitle != null ? eleNetTitle.hashCode() : 0);
        result = 31 * result + (eleNetCompleteTitle != null ? eleNetCompleteTitle.hashCode() : 0);
        result = 31 * result + (wCatBtitle != null ? wCatBtitle.hashCode() : 0);
        result = 31 * result + (ean != null ? ean.hashCode() : 0);
        result = 31 * result + (isbn != null ? isbn.hashCode() : 0);
        result = 31 * result + (markAsDeleted ? 1 : 0);
        result = 31 * result + (dateUpdated != null ? dateUpdated.hashCode() : 0);
        result = 31 * result + (dateExtraction != null ? dateExtraction.hashCode() : 0);
        result = 31 * result + (datePublished != null ? datePublished.hashCode() : 0);
        result = 31 * result + (authorName != null ? authorName.hashCode() : 0);
        result = 31 * result + (publisherName != null ? publisherName.hashCode() : 0);
        result = 31 * result + (bookBinding != null ? bookBinding.hashCode() : 0);
        result = 31 * result + productType;
        result = 31 * result + (int) (bookDetailRef ^ (bookDetailRef >>> 32));
        result = 31 * result + (int) (bookDistributorRef ^ (bookDistributorRef >>> 32));
        result = 31 * result + (int) (algOnlineServiceRef ^ (algOnlineServiceRef >>> 32));
        return result;
    }

    private BookDistributor bookDistributorByBookDistributorRef;

    public BookDistributor getBookDistributorByBookDistributorRef() {
        return bookDistributorByBookDistributorRef;
    }

    public void setBookDistributorByBookDistributorRef(BookDistributor bookDistributorByBookDistributorRef) {
        this.bookDistributorByBookDistributorRef = bookDistributorByBookDistributorRef;
    }

    private BookDetail bookDetailByBookDetailRef;

    public BookDetail getBookDetailByBookDetailRef() {
        return bookDetailByBookDetailRef;
    }

    public void setBookDetailByBookDetailRef(BookDetail bookDetailByBookDetailRef) {
        this.bookDetailByBookDetailRef = bookDetailByBookDetailRef;
    }
}
