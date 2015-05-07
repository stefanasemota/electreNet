/**
 * Search.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public interface Search extends javax.xml.rpc.Service {
    public String getSearchSoapAddress();

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap() throws javax.xml.rpc.ServiceException;

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

    public String getSearchSoap12Address();

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap12() throws javax.xml.rpc.ServiceException;

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;
}
