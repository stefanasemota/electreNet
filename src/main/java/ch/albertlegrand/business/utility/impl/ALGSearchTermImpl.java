package ch.albertlegrand.business.utility.impl;

import ch.albertlegrand.business.utility.ALGSearchTerm;
import ch.albertlegrand.business.utility.validators.ALGValidator;
import ch.albertlegrand.data.model.Book;
import ch.albertlegrand.data.model.Booktitle;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.08.11
 * Time: 14:12
 * To change this template use File | Settings | File Templates.
 */
public class ALGSearchTermImpl implements ALGSearchTerm {
    private Book book = new Book();
    private Booktitle booktitle;
    private boolean searchingForEan = false;
    private String searchTerm = "";

    /**
     * default
     */
    public ALGSearchTermImpl() {
    }

    /**
     * constructor with a search term
     *
     * @param searchTerm
     */
    public ALGSearchTermImpl(String searchTerm) {
        setSearchTerm(searchTerm);
    }

    /**
     * returns the current search term
     *
     * @return the search item of type string
     */
    @Override
    public String getSearchTerm() {
        return searchTerm;
    }

    /**
     * Sets the current search term to  searchTerm
     *
     * @param searchTerm item to search for
     */
    @Override
    public void setSearchTerm(String searchTerm) {
        //check what we are searching for an EAN
        if (ALGValidator.containsOnlyNumbers(searchTerm)) {
            searchingForEan = true;
        } else
            searchingForEan = false;

        this.searchTerm = searchTerm;
    }

    public Book getBook() {
        return book;
    }

    public Booktitle getBooktitle() {
        return booktitle;
    }

    public boolean isSearchingForEan() {
        return searchingForEan;
    }
}
