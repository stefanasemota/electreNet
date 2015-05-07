package ch.albertlegrand.business.utility;

import ch.albertlegrand.business.utility.validators.ALGValidator;
import ch.albertlegrand.data.model.Book;
import org.apache.commons.lang.StringUtils;

/**
 * @deprecated
 * Hist list row object representation
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 29.08.11
 * Time: 22:38
 * To change this template use File | Settings | File Templates.
 */
public class HitListRowObject {
    private static String BOOK_IDENTIFIER_EAN = "EAN";
    private static String BOOK_IDENTIFIER_ISBN_10 = "ISBN-10";
    private static String BOOK_IDENTIFIER_ISBN_13 = "ISBN-13";
    private static String BOOK_IDENTIFIER_ISSN_8 = "ISSN";
    private static String BOOK_IDENTIFIER_LCCN_6 = "LCCN";
    private static String BOOK_NO_IDENTIFIER = "";


    private Book book;

    /**
     * Default constructor
     */
    public HitListRowObject() {
    }

    public HitListRowObject(Book abook) {
        this.book = abook;
    }

    public String getActualBookIdentifier() {
        String value = "";
        if (book.getAlgOnlineServiceRef() == 2 || book.getAlgOnlineServiceRef() == 3) {
            value = book.getEan();
        } else if (book.getAlgOnlineServiceRef() == 5) {
            value = book.getIsbn();
        }
        return value;
    }

    public String getActualBookIdentifierType() {
        String value = "";
        switch ((int) book.getAlgOnlineServiceRef()) {
            //dilicom
            case 2:
                value = BOOK_IDENTIFIER_EAN;
                break;

            //electre
            case 3:
                value = BOOK_IDENTIFIER_EAN;
                break;

            //worldcat
            case 5:
                value = retrieveCorrectDCIdentifier();
                break;
        }
        return value;
    }

    private String retrieveCorrectDCIdentifier() {
        String value = book.getIsbn();
        String dcIdentifierType = "";
        if (value == null || StringUtils.isEmpty(value))
            return BOOK_NO_IDENTIFIER;

        if (ALGValidator.checkISBN13(value))
            dcIdentifierType = BOOK_IDENTIFIER_ISBN_13;
        else if (ALGValidator.checkISBN10(value))
            dcIdentifierType = BOOK_IDENTIFIER_ISBN_10;
        else if (value.length() == 8)
            dcIdentifierType = BOOK_IDENTIFIER_ISSN_8;
        else if (value.length() == 6)
            dcIdentifierType = BOOK_IDENTIFIER_LCCN_6;
        return dcIdentifierType;
    }

    public String getActualBookTitle() {
        String value = "";
        int switchServiceReference = (int) book.getAlgOnlineServiceRef();
        switch (switchServiceReference) {
            //dilicom
            case 2:
                value = book.getDiliCwordingStandard();
                break;

            //electre
            case 3:
                value = book.getEleNetTitle();
                break;

            //worldcat
            case 5:
                value = book.getwCatBtitle();
                break;
        }
        return value;
    }

    public String getActualBookSource() {
        String value = "";
        int switchServiceReference = (int) book.getAlgOnlineServiceRef();
        switch (switchServiceReference) {
            //dilicom
            case 2:
                value = "Dilicom";
                break;

            //electre
            case 3:
                value = "Electre";
                break;

            //worldcat
            case 5:
                value = "WorldCat";
                break;
        }
        return value;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
