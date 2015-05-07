package ch.albertlegrand.business.utility;

/**
 * Provides basic methods and operations for a Search term for the application.
 * This search term can be an ean or title
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 18.08.11
 * Time: 10:20
 * To change this template use File | Settings | File Templates.
 */
public interface ALGSearchTerm {

    /**
     * return the search term
     *
     * @return the search term
     */
    String getSearchTerm();

    /**
     * Returns true if we are searching of an ean
     *
     * @return boolean
     */
    public boolean isSearchingForEan();

    /**
     * Sets the serch term to search for
     *
     * @param searchTerm the new search term
     */
    void setSearchTerm(String searchTerm);
}
