/**
 * SearchTestCase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SearchTestCase extends junit.framework.TestCase {
    public SearchTestCase(String name) {
        super(name);
    }

    public void testSearchSoapWSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoapAddress() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test1SearchSoapSptRandomList() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.sptRandomList(new String(), 0, new ch.albertlegrand.business.catalogue.com.electreNet.SPTFiltrePublic[0]);
        // TBD - validate results
    }

    public void test2SearchSoapSptSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.sptSearch(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SPTSearchParams());
        // TBD - validate results
    }

    public void test3SearchSoapGetUserCritiques() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getUserCritiques(new String(), new String());
        // TBD - validate results
    }

    public void test4SearchSoapGetRecentCritiques() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getRecentCritiques(new String(), new String(), new String[0], new String[0], new String[0]);
        // TBD - validate results
    }

    public void test5SearchSoapGetResume() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getResume(new String(), new String());
        // TBD - validate results
    }

    public void test6SearchSoapGetElementPromoSofedis() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.getElementPromoSofedis(new String(), new String(), ch.albertlegrand.business.catalogue.com.electreNet.TypeElementSofedis.Argumentaire, new String());
        // TBD - validate results
    }

    public void test7SearchSoapImmanensCheckLogin() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.immanensCheckLogin(new String(), new String(), new String(), new String());
        // TBD - validate results
    }

    public void test8SearchSoapImmanensCheckLogin_v2() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus value = null;
        value = binding.immanensCheckLogin_v2(new String(), new String(), new String(), new String());
        // TBD - validate results
    }

    public void test9SearchSoapImmanensLogout() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.immanensLogout(new String(), new String());
        // TBD - validate results
    }

    public void test10SearchSoapImmanensVentDisponibilite() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.immanensVentDisponibilite(new String(), new String());
        // TBD - validate results
    }

    public void test11SearchSoapImmanens_getNoticeListXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.immanens_getNoticeListXml(new String(), new String(), 0, 0, new ch.albertlegrand.business.catalogue.com.electreNet.SortKey[0], ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.FormatNotice, new String(), 0);
        // TBD - validate results
    }

    public void test12SearchSoapImmanens_getImage() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.immanens_getImage(new String(), new String(), true, new String(), 0);
        // TBD - validate results
    }

    public void test13SearchSoapGetLoginInformation() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getLoginInformation(new String());
        // TBD - validate results
    }

    public void test14SearchSoapRapideSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.rapideSearch(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter());
        // TBD - validate results
    }

    public void test15SearchSoapRapideSearchArea() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.rapideSearchArea(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0][0]);
        // TBD - validate results
    }

    public void test16SearchSoapFlammarionSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.flammarionSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams());
        // TBD - validate results
    }

    public void test17SearchSoapFlammarionSearch2() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.flammarionSearch2(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams2());
        // TBD - validate results
    }

    public void test18SearchSoapSofedisSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.sofedisSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.SofedisSearchParams());
        // TBD - validate results
    }

    public void test19SearchSoapCarrefourSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.carrefourSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.CarrefourSearchParams());
        // TBD - validate results
    }

    public void test20SearchSoapRevueBanquesSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.revueBanquesSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.RevueBanquesSearchParams());
        // TBD - validate results
    }

    public void test21SearchSoapOmbresBlanchesSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.ombresBlanchesSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.OmbresBlanchesSearchParams());
        // TBD - validate results
    }

    public void test22SearchSoapMollatSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.mollatSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.MollatSearchParams());
        // TBD - validate results
    }

    public void test23SearchSoapImmanensSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.immanensSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.ImmanensSearchParams());
        // TBD - validate results
    }

    public void test24SearchSoapOrangeSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.orangeSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.OrangeSearchParams());
        // TBD - validate results
    }

    public void test25SearchSoapProcureSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.procureSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.ProcureSearchParams());
        // TBD - validate results
    }

    public void test26SearchSoapMarieFranceSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.marieFranceSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.MarieFranceSearchParams());
        // TBD - validate results
    }

    public void test27SearchSoapDeleteSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.deleteSearch(new String(), new String());
        // TBD - validate results
    }

    public void test28SearchSoapGetNoticeList() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[] value = null;
        value = binding.getNoticeList(new String(), new String(), 0, 0, new ch.albertlegrand.business.catalogue.com.electreNet.SortKey[0], new ch.albertlegrand.business.catalogue.com.electreNet.ListOption[0]);
        // TBD - validate results
    }

    public void test29SearchSoapGetListElementsAsso() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[] value = null;
        value = binding.getListElementsAsso(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String());
        // TBD - validate results
    }

    public void test30SearchSoapGetNoticeListXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getNoticeListXml(new String(), new String(), 0, 0, new ch.albertlegrand.business.catalogue.com.electreNet.SortKey[0], ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.FormatNotice);
        // TBD - validate results
    }

    public void test31SearchSoapGetNoticeCount() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.getNoticeCount(new String(), new String());
        // TBD - validate results
    }

    public void test32SearchSoapGetNoticeXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getNoticeXml(new String(), new String(), new String(), ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.FormatNotice);
        // TBD - validate results
    }

    public void test33SearchSoapSearchIsbnEan() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.searchIsbnEan(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String());
        // TBD - validate results
    }

    public void test34SearchSoapSearchIsbnEanExact() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.searchIsbnEanExact(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String());
        // TBD - validate results
    }

    public void test35SearchSoapDateEnvoiSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.dateEnvoiSearch(new String(), new String(), new String(), new String[0][0]);
        // TBD - validate results
    }

    public void test36SearchSoapGetFlammarionBlacklist() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getFlammarionBlacklist(new String());
        // TBD - validate results
    }

    public void test37SearchSoapAddToFlammarionBlackilist() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.addToFlammarionBlackilist(new String(), new String());
        // TBD - validate results
    }

    public void test38SearchSoapDeleteFromFlammarionBlackilist() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.deleteFromFlammarionBlackilist(new String(), new String());
        // TBD - validate results
    }

    public void test39SearchSoapGetNoticeAuteurLinks() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getNoticeAuteurLinks(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test40SearchSoapFindAuteur() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo value = null;
        value = binding.findAuteur(new String(), new String());
        // TBD - validate results
    }

    public void test41SearchSoapFindAuteurs() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[] value = null;
        value = binding.findAuteurs(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test42SearchSoapFindAuteurTypParti() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.findAuteurTypParti(new String(), new String[0]);
        // TBD - validate results
    }

    public void test43SearchSoapFindEditeur() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo value = null;
        value = binding.findEditeur(new String(), new String());
        // TBD - validate results
    }

    public void test44SearchSoapFindEditeurs() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] value = null;
        value = binding.findEditeurs(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true);
        // TBD - validate results
    }

    public void test45SearchSoapFindEditeursLiensCA() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] value = null;
        value = binding.findEditeursLiensCA(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true);
        // TBD - validate results
    }

    public void test46SearchSoapFindEditeurCollections() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] value = null;
        value = binding.findEditeurCollections(new String(), new String());
        // TBD - validate results
    }

    public void test47SearchSoapFindCollections() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] value = null;
        value = binding.findCollections(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test48SearchSoapFindThemes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] value = null;
        value = binding.findThemes(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test49SearchSoapFindGenres() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] value = null;
        value = binding.findGenres(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test50SearchSoapGetTvaCodes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[] value = null;
        value = binding.getTvaCodes(new String());
        // TBD - validate results
    }

    public void test51SearchSoapAuteurIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.auteurIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test52SearchSoapNoticeIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.noticeIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test53SearchSoapEditeurIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.editeurIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test54SearchSoapCollectionIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.collectionIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test55SearchSoapTitreEnsembleIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.titreEnsembleIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test56SearchSoapTitreRevueIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.titreRevueIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test57SearchSoapGetImage() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.getImage(new String(), new String(), true);
        // TBD - validate results
    }

    public void test58SearchSoapGetCatalogImage() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.getCatalogImage(new String(), new String(), true);
        // TBD - validate results
    }

    public void test59SearchSoapGetListImagettes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[][] value = null;
        value = binding.getListImagettes(new String(), new String());
        // TBD - validate results
    }

    public void test60SearchSoapGetCatalogListImagettes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[][] value = null;
        value = binding.getCatalogListImagettes(new String(), new String());
        // TBD - validate results
    }

    public void test61SearchSoapGetQuatriemeXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getQuatriemeXml(new String(), new String());
        // TBD - validate results
    }

    public void test62SearchSoapGetCatalogQuatriemeXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getCatalogQuatriemeXml(new String(), new String());
        // TBD - validate results
    }

    public void test63SearchSoapGetTdmXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getTdmXml(new String(), new String());
        // TBD - validate results
    }

    public void test64SearchSoapGetCatalogTdmXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getCatalogTdmXml(new String(), new String());
        // TBD - validate results
    }

    public void test65SearchSoapGetEditeursNewsLetterLH() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[] value = null;
        value = binding.getEditeursNewsLetterLH(new String(), new String());
        // TBD - validate results
    }

    public void test66SearchSoapGetListElementsNewsLetterLH() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[] value = null;
        value = binding.getListElementsNewsLetterLH(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test67SearchSoapGetLivreEnLigneIFrame() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoapStub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap();
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
        value = binding.getLivreEnLigneIFrame(new String(), new String(), 0);
        // TBD - validate results
    }

    public void testSearchSoap12WSDL() throws Exception {
        javax.xml.rpc.ServiceFactory serviceFactory = javax.xml.rpc.ServiceFactory.newInstance();
        java.net.URL url = new java.net.URL(new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12Address() + "?WSDL");
        javax.xml.rpc.Service service = serviceFactory.createService(url, new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getServiceName());
        assertTrue(service != null);
    }

    public void test68SearchSoap12SptRandomList() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.sptRandomList(new String(), 0, new ch.albertlegrand.business.catalogue.com.electreNet.SPTFiltrePublic[0]);
        // TBD - validate results
    }

    public void test69SearchSoap12SptSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.sptSearch(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SPTSearchParams());
        // TBD - validate results
    }

    public void test70SearchSoap12GetUserCritiques() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getUserCritiques(new String(), new String());
        // TBD - validate results
    }

    public void test71SearchSoap12GetRecentCritiques() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getRecentCritiques(new String(), new String(), new String[0], new String[0], new String[0]);
        // TBD - validate results
    }

    public void test72SearchSoap12GetResume() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getResume(new String(), new String());
        // TBD - validate results
    }

    public void test73SearchSoap12GetElementPromoSofedis() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.getElementPromoSofedis(new String(), new String(), ch.albertlegrand.business.catalogue.com.electreNet.TypeElementSofedis.Argumentaire, new String());
        // TBD - validate results
    }

    public void test74SearchSoap12ImmanensCheckLogin() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        boolean value = false;
        value = binding.immanensCheckLogin(new String(), new String(), new String(), new String());
        // TBD - validate results
    }

    public void test75SearchSoap12ImmanensCheckLogin_v2() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus value = null;
        value = binding.immanensCheckLogin_v2(new String(), new String(), new String(), new String());
        // TBD - validate results
    }

    public void test76SearchSoap12ImmanensLogout() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.immanensLogout(new String(), new String());
        // TBD - validate results
    }

    public void test77SearchSoap12ImmanensVentDisponibilite() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.immanensVentDisponibilite(new String(), new String());
        // TBD - validate results
    }

    public void test78SearchSoap12Immanens_getNoticeListXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.immanens_getNoticeListXml(new String(), new String(), 0, 0, new ch.albertlegrand.business.catalogue.com.electreNet.SortKey[0], ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.FormatNotice, new String(), 0);
        // TBD - validate results
    }

    public void test79SearchSoap12Immanens_getImage() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.immanens_getImage(new String(), new String(), true, new String(), 0);
        // TBD - validate results
    }

    public void test80SearchSoap12GetLoginInformation() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getLoginInformation(new String());
        // TBD - validate results
    }

    public void test81SearchSoap12RapideSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.rapideSearch(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter());
        // TBD - validate results
    }

    public void test82SearchSoap12RapideSearchArea() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.rapideSearchArea(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0][0]);
        // TBD - validate results
    }

    public void test83SearchSoap12FlammarionSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.flammarionSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams());
        // TBD - validate results
    }

    public void test84SearchSoap12FlammarionSearch2() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.flammarionSearch2(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams2());
        // TBD - validate results
    }

    public void test85SearchSoap12SofedisSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.sofedisSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.SofedisSearchParams());
        // TBD - validate results
    }

    public void test86SearchSoap12CarrefourSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.carrefourSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.CarrefourSearchParams());
        // TBD - validate results
    }

    public void test87SearchSoap12RevueBanquesSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.revueBanquesSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.RevueBanquesSearchParams());
        // TBD - validate results
    }

    public void test88SearchSoap12OmbresBlanchesSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.ombresBlanchesSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.OmbresBlanchesSearchParams());
        // TBD - validate results
    }

    public void test89SearchSoap12MollatSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.mollatSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.MollatSearchParams());
        // TBD - validate results
    }

    public void test90SearchSoap12ImmanensSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.immanensSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.ImmanensSearchParams());
        // TBD - validate results
    }

    public void test91SearchSoap12OrangeSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.orangeSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.OrangeSearchParams());
        // TBD - validate results
    }

    public void test92SearchSoap12ProcureSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.procureSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.ProcureSearchParams());
        // TBD - validate results
    }

    public void test93SearchSoap12MarieFranceSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.marieFranceSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new ch.albertlegrand.business.catalogue.com.electreNet.MarieFranceSearchParams());
        // TBD - validate results
    }

    public void test94SearchSoap12DeleteSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        binding.deleteSearch(new String(), new String());
        // TBD - validate results
    }

    public void test95SearchSoap12GetNoticeList() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[] value = null;
        value = binding.getNoticeList(new String(), new String(), 0, 0, new ch.albertlegrand.business.catalogue.com.electreNet.SortKey[0], new ch.albertlegrand.business.catalogue.com.electreNet.ListOption[0]);
        // TBD - validate results
    }

    public void test96SearchSoap12GetListElementsAsso() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[] value = null;
        value = binding.getListElementsAsso(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String());
        // TBD - validate results
    }

    public void test97SearchSoap12GetNoticeListXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getNoticeListXml(new String(), new String(), 0, 0, new ch.albertlegrand.business.catalogue.com.electreNet.SortKey[0], ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.FormatNotice);
        // TBD - validate results
    }

    public void test98SearchSoap12GetNoticeCount() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.getNoticeCount(new String(), new String());
        // TBD - validate results
    }

    public void test99SearchSoap12GetNoticeXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getNoticeXml(new String(), new String(), new String(), ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.FormatNotice);
        // TBD - validate results
    }

    public void test100SearchSoap12SearchIsbnEan() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.searchIsbnEan(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String());
        // TBD - validate results
    }

    public void test101SearchSoap12SearchIsbnEanExact() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.searchIsbnEanExact(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String());
        // TBD - validate results
    }

    public void test102SearchSoap12DateEnvoiSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.dateEnvoiSearch(new String(), new String(), new String(), new String[0][0]);
        // TBD - validate results
    }

    public void test103SearchSoap12GetFlammarionBlacklist() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getFlammarionBlacklist(new String());
        // TBD - validate results
    }

    public void test104SearchSoap12AddToFlammarionBlackilist() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.addToFlammarionBlackilist(new String(), new String());
        // TBD - validate results
    }

    public void test105SearchSoap12DeleteFromFlammarionBlackilist() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        int value = -3;
        value = binding.deleteFromFlammarionBlackilist(new String(), new String());
        // TBD - validate results
    }

    public void test106SearchSoap12GetNoticeAuteurLinks() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getNoticeAuteurLinks(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test107SearchSoap12FindAuteur() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo value = null;
        value = binding.findAuteur(new String(), new String());
        // TBD - validate results
    }

    public void test108SearchSoap12FindAuteurs() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[] value = null;
        value = binding.findAuteurs(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test109SearchSoap12FindAuteurTypParti() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.findAuteurTypParti(new String(), new String[0]);
        // TBD - validate results
    }

    public void test110SearchSoap12FindEditeur() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo value = null;
        value = binding.findEditeur(new String(), new String());
        // TBD - validate results
    }

    public void test111SearchSoap12FindEditeurs() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] value = null;
        value = binding.findEditeurs(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true);
        // TBD - validate results
    }

    public void test112SearchSoap12FindEditeursLiensCA() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] value = null;
        value = binding.findEditeursLiensCA(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression(), true);
        // TBD - validate results
    }

    public void test113SearchSoap12FindEditeurCollections() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] value = null;
        value = binding.findEditeurCollections(new String(), new String());
        // TBD - validate results
    }

    public void test114SearchSoap12FindCollections() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] value = null;
        value = binding.findCollections(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test115SearchSoap12FindThemes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] value = null;
        value = binding.findThemes(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test116SearchSoap12FindGenres() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] value = null;
        value = binding.findGenres(new String(), new ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression());
        // TBD - validate results
    }

    public void test117SearchSoap12GetTvaCodes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[] value = null;
        value = binding.getTvaCodes(new String());
        // TBD - validate results
    }

    public void test118SearchSoap12AuteurIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.auteurIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test119SearchSoap12NoticeIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.noticeIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test120SearchSoap12EditeurIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.editeurIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test121SearchSoap12CollectionIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.collectionIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test122SearchSoap12TitreEnsembleIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.titreEnsembleIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test123SearchSoap12TitreRevueIdSearch() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.titreRevueIdSearch(new String(), true, new ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter(), new String[0]);
        // TBD - validate results
    }

    public void test124SearchSoap12GetImage() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.getImage(new String(), new String(), true);
        // TBD - validate results
    }

    public void test125SearchSoap12GetCatalogImage() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[] value = null;
        value = binding.getCatalogImage(new String(), new String(), true);
        // TBD - validate results
    }

    public void test126SearchSoap12GetListImagettes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[][] value = null;
        value = binding.getListImagettes(new String(), new String());
        // TBD - validate results
    }

    public void test127SearchSoap12GetCatalogListImagettes() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        byte[][] value = null;
        value = binding.getCatalogListImagettes(new String(), new String());
        // TBD - validate results
    }

    public void test128SearchSoap12GetQuatriemeXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getQuatriemeXml(new String(), new String());
        // TBD - validate results
    }

    public void test129SearchSoap12GetCatalogQuatriemeXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getCatalogQuatriemeXml(new String(), new String());
        // TBD - validate results
    }

    public void test130SearchSoap12GetTdmXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getTdmXml(new String(), new String());
        // TBD - validate results
    }

    public void test131SearchSoap12GetCatalogTdmXml() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getCatalogTdmXml(new String(), new String());
        // TBD - validate results
    }

    public void test132SearchSoap12GetEditeursNewsLetterLH() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[] value = null;
        value = binding.getEditeursNewsLetterLH(new String(), new String());
        // TBD - validate results
    }

    public void test133SearchSoap12GetListElementsNewsLetterLH() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
        } catch (javax.xml.rpc.ServiceException jre) {
            if (jre.getLinkedCause() != null)
                jre.getLinkedCause().printStackTrace();
            throw new junit.framework.AssertionFailedError("JAX-RPC ServiceException caught: " + jre);
        }
        assertNotNull("binding is null", binding);

        // Time out after a minute
        binding.setTimeout(60000);

        // Test operation
        ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[] value = null;
        value = binding.getListElementsNewsLetterLH(new String(), new String(), new String());
        // TBD - validate results
    }

    public void test134SearchSoap12GetLivreEnLigneIFrame() throws Exception {
        ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub binding;
        try {
            binding = (ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap12Stub)
                    new ch.albertlegrand.business.catalogue.com.electreNet.SearchLocator().getSearchSoap12();
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
        value = binding.getLivreEnLigneIFrame(new String(), new String(), 0);
        // TBD - validate results
    }

}
