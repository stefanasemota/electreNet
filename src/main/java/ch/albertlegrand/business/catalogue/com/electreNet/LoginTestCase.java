/**
 * LoginTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class LoginTestCase extends junit.framework.TestCase {
    public LoginTestCase(String name) {
        super(name);
    }

    public void testLoginSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1LoginSoap12LoginUser() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.loginUser(new String(), new String());
        // TBD - validate results
    }

    public void test2LoginSoap12LogoutUser() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.logoutUser(new String());
        // TBD - validate results
    }

    public void test3LoginSoap12GetSessionTokens() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String[] value = null;
        value = binding.getSessionTokens(new String(), new String());
        // TBD - validate results
    }

    public void testLoginSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test4LoginSoapLoginUser() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String value = null;
        value = binding.loginUser(new String(), new String());
        // TBD - validate results
    }

    public void test5LoginSoapLogoutUser() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.logoutUser(new String());
        // TBD - validate results
    }

    public void test6LoginSoapGetSessionTokens() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.LoginSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.LoginLocator().getLoginSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        String[] value = null;
        value = binding.getSessionTokens(new String(), new String());
        // TBD - validate results
    }

}
