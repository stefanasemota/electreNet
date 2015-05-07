package ch.albertlegrand.business.bc.impl;

/**
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:06
 */
public class AlbertGrantedAuthorityBCImpl  {

    private static final long serialVersionUID = -7321966520660727113L;
    private String authority;

    public AlbertGrantedAuthorityBCImpl(String authority) {
        this.authority = authority;
    }

    public String getAuthority() {
        return authority;
    }

}