package ch.albertlegrand.business.utility.impl;

import ch.albertlegrand.data.model.Book;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 31.08.11
 * Time: 23:50
 * To change this template use File | Settings | File Templates.
 */
public class DilcomParsedFileComp {
    private Book book;
    private char movementCode;

    public DilcomParsedFileComp(char crudMovementCode, Book parsedBook) {
        this.book = parsedBook;
        this.movementCode = crudMovementCode;
    }

    public char getMovementCode() {
        return movementCode;
    }

    public Book getBook() {
        return book;
    }
}
