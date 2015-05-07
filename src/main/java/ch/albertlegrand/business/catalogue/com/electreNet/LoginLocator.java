/**
 * LoginLocator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class LoginLocator extends org.apache.axis.client.Service implements ch.albertlegrand.business.catalogue.com.electreNet.Login {

    public LoginLocator() {
    }


    public LoginLocator(org.apache.axis.EngineConfiguration config) {
        super(config);
    }

    public LoginLocator(String wsdlLoc, javax.xml.namespace.QName sName) throws javax.xml.rpc.ServiceException {
        super(wsdlLoc, sName);
    }

    // Use to get a proxy class for LoginSoap12
    private String LoginSoap12_address = "http://www.electre.com/WebService/login.asmx";

    public String getLoginSoap12Address() {
        return LoginSoap12_address;
    }

    // The WSDD service name defaults to the port name.
    private String LoginSoap12WSDDServiceName = "LoginSoap12";

    public String getLoginSoap12WSDDServiceName() {
        return LoginSoap12WSDDServiceName;
    }

    public void setLoginSoap12WSDDServiceName(String name) {
        LoginSoap12WSDDServiceName = name;
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap getLoginSoap12() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginSoap12_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginSoap12(endpoint);
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap getLoginSoap12(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub(portAddress, this);
            _stub.setPortName(getLoginSoap12WSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginSoap12EndpointAddress(String address) {
        LoginSoap12_address = address;
    }


    // Use to get a proxy class for LoginSoap
    private String LoginSoap_address = "http://www.electre.com/WebService/login.asmx";

    public String getLoginSoapAddress() {
        return LoginSoap_address;
    }

    // The WSDD service name defaults to the port name.
    private String LoginSoapWSDDServiceName = "LoginSoap";

    public String getLoginSoapWSDDServiceName() {
        return LoginSoapWSDDServiceName;
    }

    public void setLoginSoapWSDDServiceName(String name) {
        LoginSoapWSDDServiceName = name;
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap getLoginSoap() throws javax.xml.rpc.ServiceException {
        java.net.URL endpoint;
        try {
            endpoint = new java.net.URL(LoginSoap_address);
        } catch (java.net.MalformedURLException e) {
            throw new javax.xml.rpc.ServiceException(e);
        }
        return getLoginSoap(endpoint);
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap getLoginSoap(java.net.URL portAddress) throws javax.xml.rpc.ServiceException {
        try {
            ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub(portAddress, this);
            _stub.setPortName(getLoginSoapWSDDServiceName());
            return _stub;
        } catch (org.apache.axis.AxisFault e) {
            return null;
        }
    }

    public void setLoginSoapEndpointAddress(String address) {
        LoginSoap_address = address;
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
            if (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub(new java.net.URL(LoginSoap12_address), this);
                _stub.setPortName(getLoginSoap12WSDDServiceName());
                return _stub;
            }
            if (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap.class.isAssignableFrom(serviceEndpointInterface)) {
                ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub _stub = new ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub(new java.net.URL(LoginSoap_address), this);
                _stub.setPortName(getLoginSoapWSDDServiceName());
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
        if ("LoginSoap12".equals(inputPortName)) {
            return getLoginSoap12();
        } else if ("LoginSoap".equals(inputPortName)) {
            return getLoginSoap();
        } else {
            java.rmi.Remote _stub = getPort(serviceEndpointInterface);
            ((org.apache.axis.client.Stub) _stub).setPortName(portName);
            return _stub;
        }
    }

    public javax.xml.namespace.QName getServiceName() {
        return new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "Login");
    }

    private java.util.HashSet ports = null;

    public java.util.Iterator getPorts() {
        if (ports == null) {
            ports = new java.util.HashSet();
            ports.add(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "LoginSoap12"));
            ports.add(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "LoginSoap"));
        }
        return ports.iterator();
    }

    /**
     * Set the endpoint address for the specified port name.
     */
    public void setEndpointAddress(String portName, String address) throws javax.xml.rpc.ServiceException {

        if ("LoginSoap12".equals(portName)) {
            setLoginSoap12EndpointAddress(address);
        } else if ("LoginSoap".equals(portName)) {
            setLoginSoapEndpointAddress(address);
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
