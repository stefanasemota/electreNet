/**
 * Login.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

import java.net.URL;

public interface Login extends javax.xml.rpc.Service {
    public String getLoginSoap12Address();

    public LoginSoap getLoginSoap12() throws javax.xml.rpc.ServiceException;

    public LoginSoap getLoginSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException;

    public String getLoginSoapAddress();

    public LoginSoap getLoginSoap() throws javax.xml.rpc.ServiceException;

    public LoginSoap getLoginSoap(URL portAddress) throws javax.xml.rpc.ServiceException;
}
