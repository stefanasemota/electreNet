/**
 * SearchLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SearchLocator extends org.apache.axis.client.Service implements ch.albertlegrand.business.catalogue.com.electreNet.Search {

    public SearchLocator() {
    }


    public SearchLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public SearchLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for SearchSoap
    private String SearchSoap_address = "http://www.electre.com/WebService/search.asmx";

    public String getSearchSoapAddress() {
        return SearchSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String SearchSoapWSDDServiceName = "SearchSoap";

    public String getSearchSoapWSDDServiceName() {
        return SearchSoapWSDDServiceName;
    }

    public void setSearchSoapWSDDServiceName(String name) {
        SearchSoapWSDDServiceName = name;
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchSoap(endpoint);
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub(portAddress, this);
            _stub.setPortName(getSearchSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchSoapEndpointAddress(String address) {
        SearchSoap_address = address;
    }


    // Use to get a proxy class for SearchSoap12
    private String SearchSoap12_address = "http://www.electre.com/WebService/search.asmx";

    public String getSearchSoap12Address() {
        return SearchSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String SearchSoap12WSDDServiceName = "SearchSoap12";

    public String getSearchSoap12WSDDServiceName() {
        return SearchSoap12WSDDServiceName;
    }

    public void setSearchSoap12WSDDServiceName(String name) {
        SearchSoap12WSDDServiceName = name;
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(SearchSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getSearchSoap12(endpoint);
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap getSearchSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub(portAddress, this);
            _stub.setPortName(getSearchSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setSearchSoap12EndpointAddress(String address) {
        SearchSoap12_address = address;
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     * This service has multiple ports for a given interface;
     * the proxy implementation returned may be indeterminate.
     */
    public java.rmi.Remote getPort(Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        try {
            if (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub(new java.net.URL(SearchSoap_address), this);
                _stub.setPortName(getSearchSoapWSDDServiceName());
                return _stub;
            }
            if (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub(new java.net.URL(SearchSoap12_address), this);
                _stub.setPortName(getSearchSoap12WSDDServiceName());
                return _stub;
            }
        } catch (Throwable t) {
            throw new javax.xml.rpc.ServiceException(t);
        }
        throw new javax.xml.rpc.ServiceException("There is no stub implementation for the interface:  " + (serviceEndpointInterface == null ? "null" : serviceEndpointInterface.getName()));
    }

    /**
     * For the given interface, get the stub implementation.
     * If this service has no port for the given interface,
     * then ServiceException is thrown.
     */
    public java.rmi.Remote getPort(javax.xml.namespace.QName portName, Class serviceEndpointInterface) throws javax.xml.rpc.ServiceException {
        if (portName == null) {
            return getPort(serviceEndpointInterface);
        }
        String inputPortName = portName.getLocalPart();
        if ("SearchSoap".equals(inputPortName)) {
            return getSearchSoap();
        } else if ("SearchSoap12".equals(inputPortName)) {
            return getSearchSoap12();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "Search");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchSoap"));
            ports.add(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchSoap12"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("SearchSoap".equals(portName)) {
            setSearchSoapEndpointAddress(address);
        } else if ("SearchSoap12".equals(portName)) {
            setSearchSoap12EndpointAddress(address);
        } else { // Unknown Port Name
            throw new javax.xml.rpc.ServiceException(" Cannot set Endpoint Address for Unknown Port" + portName);
        }
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(javax.xml.namespace.QName portName, String address) throws javax.xml.rpc.ServiceException {
        setEndpointAddress(portName.getLocalPart(), address);
    }

}
