/**
 * LoginSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public interface LoginSoap extends java.rmi.Remote {
    public String loginUser(String userName, String userPassword) throws java.rmi.RemoteException;

    /**
     * Terminate user session
     */
    public void logoutUser(String sessionIdCookie) throws java.rmi.RemoteException;

    public String[] getSessionTokens(String login, String password) throws java.rmi.RemoteException;
}
