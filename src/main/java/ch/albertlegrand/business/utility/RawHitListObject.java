package ch.albertlegrand.business.utility;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 16.02.12
 * Time: 10:53
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class RawHitListObject {
    private String eanNumber;
    private String bookTitle;
    private String datePublished;
    private String bookSource;
    private String authorName;
    private String isbnNumber;

    public RawHitListObject(){}

    @XmlElement(nillable = true)
    public String getEanNumber() {
        return eanNumber;
    }

    public void setEanNumber(String eanNumber) {
        this.eanNumber = eanNumber;
    }

    @XmlElement(nillable = true)
    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
     @XmlElement(nillable = true)
    public String getDatePublished() {
        return datePublished;
    }

    public void setDatePublished(String datePublished) {
        this.datePublished = datePublished;
    }
    @XmlElement(nillable = true)
    public String getBookSource() {
        return bookSource;
    }

    public void setBookSource(String bookSource) {
        this.bookSource = bookSource;
    }
    @XmlElement(nillable = true)
    public String getAuthorName() {
        return authorName;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setIsbnNumber(String isbnNumber) {
        this.isbnNumber = isbnNumber;
    }
    @XmlElement(nillable = true)
    public String getIsbnNumber() {
        return isbnNumber;
    }
}
