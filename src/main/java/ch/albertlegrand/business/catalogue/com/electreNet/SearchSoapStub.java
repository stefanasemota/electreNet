/**
 * SearchSoapStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SearchSoapStub extends org.apache.axis.client.Stub implements ch.albertlegrand.business.catalogue.com.electreNet.SearchSoap {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc[] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[67];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
        _initOperationDesc5();
        _initOperationDesc6();
        _initOperationDesc7();
    }

    private static void _initOperationDesc1() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sptRandomList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maxNotices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sptFiltrePublic"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfSPTFiltrePublic"), ch.albertlegrand.business.catalogue.com.electreNet.SPTFiltrePublic[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sptRandomListResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sptSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sptSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SPTSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.SPTSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sptSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getUserCritiques");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "signataire"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getUserCritiquesResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getRecentCritiques");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "signataire"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "deweyIndices"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "themes"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "genres"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getRecentCritiquesResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getResume");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getResumeResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getElementPromoSofedis");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TypeElementSofedis"), ch.albertlegrand.business.catalogue.com.electreNet.TypeElementSofedis.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rang"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getElementPromoSofedisResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immanensCheckLogin");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iphoneId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        oper.setReturnClass(boolean.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "immanensCheckLoginResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immanensCheckLogin_v2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "userName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "password"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iphoneId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ImmanensLoginStatus"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "immanensCheckLogin_v2Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immanensLogout");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iphoneId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immanensVentDisponibilite");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "immanensVentDisponibiliteResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immanens_getNoticeListXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sortKeys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfSortKey"), ch.albertlegrand.business.catalogue.com.electreNet.SortKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlListFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "XmlListFormat"), ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iPhoneId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "typeIPhoneAbonnement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "immanens_getNoticeListXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immanens_getImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scaled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "iPhoneId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "typeIPhoneAbonnement"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "immanens_getImageResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLoginInformation");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLoginInformationResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rapideSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rapideSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("rapideSearchArea");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "rapideSearchArea"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfTRapideSearchArea"), String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "rapideSearchAreaResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("flammarionSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "flammarionSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "FlammarionSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "flammarionSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("flammarionSearch2");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "flammarionSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "FlammarionSearchParams2"), ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams2.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "flammarionSearch2Result"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("sofedisSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sofedisSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SofedisSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.SofedisSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "sofedisSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("carrefourSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "carrefourSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "CarrefourSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.CarrefourSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "carrefourSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("revueBanquesSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "revueBanquesSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "RevueBanquesSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.RevueBanquesSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "revueBanquesSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ombresBlanchesSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ombresBlanchesSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "OmbresBlanchesSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.OmbresBlanchesSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "ombresBlanchesSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("mollatSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "mollatSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MollatSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.MollatSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "mollatSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("immanensSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "immanensSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ImmanensSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.ImmanensSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "immanensSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("orangeSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "orangeSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "OrangeSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.OrangeSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "orangeSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("procureSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "procureSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ProcureSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.ProcureSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "procureSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("marieFranceSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "marieFranceSearchParams"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MarieFranceSearchParams"), ch.albertlegrand.business.catalogue.com.electreNet.MarieFranceSearchParams.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "marieFranceSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(org.apache.axis.encoding.XMLType.AXIS_VOID);
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNoticeList");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sortKeys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfSortKey"), ch.albertlegrand.business.catalogue.com.electreNet.SortKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "options"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfListOption"), ch.albertlegrand.business.catalogue.com.electreNet.ListOption[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfListEntry"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNoticeListResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListElementsAsso");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isbnlist"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfElementsAsso"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getListElementsAssoResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNoticeListXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startRecord"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "maxRecords"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sortKeys"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfSortKey"), ch.albertlegrand.business.catalogue.com.electreNet.SortKey[].class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlListFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "XmlListFormat"), ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNoticeListXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNoticeCount");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNoticeCountResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNoticeXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonotice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "xmlListFormat"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "XmlListFormat"), ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNoticeXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchIsbnEan");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isbnlist"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchIsbnEanResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("searchIsbnEanExact");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isbnlist"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "searchIsbnEanExactResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[33] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("dateEnvoiSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "startDateEnvoiString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "endDateEnvoiString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "dataSource"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfTDataSource"), String[][].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "dateEnvoiSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[34] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getFlammarionBlacklist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getFlammarionBlacklistResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[35] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("addToFlammarionBlackilist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "addToFlammarionBlackilistResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[36] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("deleteFromFlammarionBlackilist");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "deleteFromFlammarionBlackilistResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[37] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getNoticeAuteurLinks");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchIdToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "nonotice"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getNoticeAuteurLinksResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[38] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findAuteur");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "auteurId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "AuteurInfo"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findAuteurResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[39] = oper;

    }

    private static void _initOperationDesc5() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findAuteurs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfAuteurInfo"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findAuteursResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[40] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findAuteurTypParti");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "typParti"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"));
        oper.setReturnClass(String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findAuteurTypPartiResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[41] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findEditeur");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refEdite"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "EditeurInfo"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findEditeurResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[42] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findEditeurs");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "distributeurs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfEditeurInfo"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findEditeursResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[43] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findEditeursLiensCA");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "distributeurs"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfEditeurInfo"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findEditeursLiensCAResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[44] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findEditeurCollections");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "refEdite"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfCollectionInfo"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findEditeurCollectionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[45] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findCollections");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfCollectionInfo"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findCollectionsResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[46] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findThemes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfIdLibelle"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findThemesResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[47] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("findGenres");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "expression"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"), ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfIdLibelle"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "findGenresResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[48] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTvaCodes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfTvaCode"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTvaCodesResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[49] = oper;

    }

    private static void _initOperationDesc6() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("auteurIdSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "auteurIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "auteurIdSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[50] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("noticeIdSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "noticeIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "noticeIdSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[51] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("editeurIdSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "editeurIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "editeurIdSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[52] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("collectionIdSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "collectionIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "collectionIdSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[53] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("titreEnsembleIdSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "titreEnsembleIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "titreEnsembleIdSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[54] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("titreRevueIdSearch");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "useFonds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "searchFilter"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter"), ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "titreRevueIds"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString"), String[].class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "titreRevueIdSearchResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[55] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scaled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getImageResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[56] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCatalogImage");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "scaled"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary"));
        oper.setReturnClass(byte[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCatalogImageResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[57] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListImagettes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "eanList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfBase64Binary"));
        oper.setReturnClass(byte[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getListImagettesResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[58] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCatalogListImagettes");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "eanList"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfBase64Binary"));
        oper.setReturnClass(byte[][].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCatalogListImagettesResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[59] = oper;

    }

    private static void _initOperationDesc7() {
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getQuatriemeXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getQuatriemeXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[60] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCatalogQuatriemeXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCatalogQuatriemeXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[61] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getTdmXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getTdmXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[62] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getCatalogTdmXml");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "ean"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getCatalogTdmXmlResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[63] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getEditeursNewsLetterLH");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pivotDateString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfEditeursNewsletterLH"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getEditeursNewsLetterLHResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[64] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getListElementsNewsLetterLH");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionCookie"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "editeurId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "pivotDateString"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfElementsNewsLetterLH"));
        oper.setReturnClass(ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getListElementsNewsLetterLHResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[65] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("getLivreEnLigneIFrame");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "sessionToken"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "isbn"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("", "type"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("", "getLivreEnLigneIFrameResult"));
        oper.setStyle(org.apache.axis.constants.Style.RPC);
        oper.setUse(org.apache.axis.constants.Use.ENCODED);
        _operations[66] = oper;

    }

    public SearchSoapStub() throws org.apache.axis.AxisFault {
        this(null);
    }

    public SearchSoapStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        this(service);
        super.cachedEndpoint = endpointURL;
    }

    public SearchSoapStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service) super.service).setTypeMappingVersion("1.2");
        Class cls;
        javax.xml.namespace.QName qName;
        javax.xml.namespace.QName qName2;
        Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
        Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
        Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
        Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
        Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
        Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
        Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
        Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
        Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
        Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/AbstractTypes", "StringArray");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "Adresse");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.Adresse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfAdresse");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.Adresse[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "Adresse");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "Adresse");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfBase64Binary");
        cachedSerQNames.add(qName);
        cls = byte[][].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "base64Binary");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfCollectionInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.CollectionInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "CollectionInfo");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "CollectionInfo");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfEditeursNewsletterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.EditeursNewsletterLH[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "EditeursNewsletterLH");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "EditeursNewsletterLH");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfElementsNewsLetterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.ElementsNewsLetterLH[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ElementsNewsLetterLH");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ElementsNewsLetterLH");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfMoyenLiaison");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.MoyenLiaison[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "MoyenLiaison");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "MoyenLiaison");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfString");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "string");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ArrayOfTvaCode");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TvaCode[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TvaCode");
        qName2 = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TvaCode");
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "AuteurInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.AuteurInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "AuteurType");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.AuteurType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "CollectionInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.CollectionInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "EditeurInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.EditeurInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "EditeursNewsletterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.EditeursNewsletterLH.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ElementsNewsLetterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.ElementsNewsLetterLH.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ImmanensLoginStatus");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.ImmanensLoginStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "MoyenLiaison");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.MoyenLiaison.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TvaCode");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TvaCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TypeAdresse");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TypeAdresse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TypeLiaison");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TypeLiaison.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "Adresse");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.Adresse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfAdresse");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.Adresse[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "Adresse");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfAnyType");
        cachedSerQNames.add(qName);
        cls = Object[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfAuteurInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "AuteurInfo");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfBase64Binary");
        cachedSerQNames.add(qName);
        cls = byte[][].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "base64Binary");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfCollectionInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "CollectionInfo");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfEditeurInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "EditeurInfo");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfEditeursNewsletterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "EditeursNewsletterLH");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfElementsAsso");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ElementsAsso");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfElementsNewsLetterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ElementsNewsLetterLH");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfIdLibelle");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "IdLibelle");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfListEntry");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ListEntry");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfListOption");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ListOption[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ListOption");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfMoyenLiaison");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.MoyenLiaison[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MoyenLiaison");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfSearchExpression");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfSortKey");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SortKey[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SortKey");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfSPTFiltrePublic");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SPTFiltrePublic[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SPTFiltrePublic");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfString");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfTDataSource");
        cachedSerQNames.add(qName);
        cls = String[][].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TDataSource");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfTRapideSearchArea");
        cachedSerQNames.add(qName);
        cls = String[][].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TRapideSearchArea");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ArrayOfTvaCode");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[].class;
        cachedSerClasses.add(cls);
        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TvaCode");
        qName2 = null;
        cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
        cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "AuteurInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "AuteurType");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.AuteurType.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "CarrefourSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.CarrefourSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "CollectionInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "EditeurInfo");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "EditeursNewsletterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ElementsAsso");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ElementsNewsLetterLH");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "Fiction");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.Fiction.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "FlammarionSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "FlammarionSearchParams2");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams2.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "FlammarionTheme");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.FlammarionTheme.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "IdLibelle");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ImmanensLoginStatus");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ImmanensSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ImmanensSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ListEntry");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ListEntry.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ListOption");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ListOption.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MarieFranceSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.MarieFranceSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MollatSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.MollatSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MoyenLiaison");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.MoyenLiaison.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "OmbresBlanchesSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.OmbresBlanchesSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "OrangeSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.OrangeSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ProcureSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.ProcureSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "RevueBanquesSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.RevueBanquesSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchFilter");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SofedisSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SofedisSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SortKey");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SortKey.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SortOrder");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SortOrder.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SPTFiltrePublic");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SPTFiltrePublic.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SPTSearchParams");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.SPTSearchParams.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TDataSource");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TDataSource>null");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TDataSourceNull.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TFilterFamille");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TFilterFamille.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TRapideSearchArea");
        cachedSerQNames.add(qName);
        cls = String[].class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(simplelistsf);
        cachedDeserFactories.add(simplelistdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TRapideSearchArea>null");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TRapideSearchAreaNull.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TvaCode");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TvaCode.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(beansf);
        cachedDeserFactories.add(beandf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TypeAdresse");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TypeAdresse.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TypeElementSofedis");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TypeElementSofedis.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TypeLiaison");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.TypeLiaison.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

        qName = new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "XmlListFormat");
        cachedSerQNames.add(qName);
        cls = ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat.class;
        cachedSerClasses.add(cls);
        cachedSerFactories.add(enumsf);
        cachedDeserFactories.add(enumdf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                String key = (String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
                    _call.setEncodingStyle(org.apache.axis.Constants.URI_SOAP11_ENC);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        Class cls = (Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            Class sf = (Class)
                                    cachedSerFactories.get(i);
                            Class df = (Class)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        } else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                    cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                    cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        } catch (Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public String sptRandomList(String sessionCookie, int maxNotices, ch.albertlegrand.business.catalogue.com.electreNet.SPTFiltrePublic[] sptFiltrePublic) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/sptRandomList");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "sptRandomList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Integer(maxNotices), sptFiltrePublic});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String sptSearch(String sessionCookie, ch.albertlegrand.business.catalogue.com.electreNet.SPTSearchParams sptSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/sptSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "sptSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, sptSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getUserCritiques(String sessionCookie, String signataire) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getUserCritiques");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getUserCritiques"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, signataire});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getRecentCritiques(String sessionCookie, String signataire, String[] deweyIndices, String[] themes, String[] genres) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getRecentCritiques");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getRecentCritiques"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, signataire, deweyIndices, themes, genres});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getResume(String sessionToken, String ean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getResume");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getResume"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, ean});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public byte[] getElementPromoSofedis(String sessionCookie, String ean, ch.albertlegrand.business.catalogue.com.electreNet.TypeElementSofedis type, String rang) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getElementPromoSofedis");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getElementPromoSofedis"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, ean, type, rang});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (byte[]) _resp;
                } catch (Exception _exception) {
                    return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public boolean immanensCheckLogin(String sessionCookie, String userName, String password, String iphoneId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/immanensCheckLogin");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "immanensCheckLogin"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, userName, password, iphoneId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Boolean) _resp).booleanValue();
                } catch (Exception _exception) {
                    return ((Boolean) org.apache.axis.utils.JavaUtils.convert(_resp, boolean.class)).booleanValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus immanensCheckLogin_v2(String sessionCookie, String userName, String password, String iphoneId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/immanensCheckLogin_v2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "immanensCheckLogin_v2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, userName, password, iphoneId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void immanensLogout(String sessionCookie, String iphoneId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/immanensLogout");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "immanensLogout"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, iphoneId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String immanensVentDisponibilite(String sessionCookie, String searchIdToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/immanensVentDisponibilite");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "immanensVentDisponibilite"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, searchIdToken});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String immanens_getNoticeListXml(String sessionToken, String searchIdToken, int startRecord, int maxRecords, ch.albertlegrand.business.catalogue.com.electreNet.SortKey[] sortKeys, ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat xmlListFormat, String iPhoneId, int typeIPhoneAbonnement) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/immanens_getNoticeListXml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "immanens_getNoticeListXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, searchIdToken, new Integer(startRecord), new Integer(maxRecords), sortKeys, xmlListFormat, iPhoneId, new Integer(typeIPhoneAbonnement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public byte[] immanens_getImage(String sessionCookie, String ean, boolean scaled, String iPhoneId, int typeIPhoneAbonnement) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/immanens_getImage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "immanens_getImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, ean, new Boolean(scaled), iPhoneId, new Integer(typeIPhoneAbonnement)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (byte[]) _resp;
                } catch (Exception _exception) {
                    return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getLoginInformation(String sessionCookie) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getLoginInformation");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getLoginInformation"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String rapideSearch(String sessionCookie, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/rapideSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "rapideSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, expression, new Boolean(useFonds), searchFilter});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String rapideSearchArea(String sessionCookie, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[][] rapideSearchArea) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/rapideSearchArea");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "rapideSearchArea"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, expression, new Boolean(useFonds), searchFilter, rapideSearchArea});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String flammarionSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams flammarionSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/flammarionSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "flammarionSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, flammarionSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String flammarionSearch2(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams2 flammarionSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/flammarionSearch2");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "flammarionSearch2"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, flammarionSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String sofedisSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.SofedisSearchParams sofedisSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/sofedisSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "sofedisSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, sofedisSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String carrefourSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.CarrefourSearchParams carrefourSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/carrefourSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "carrefourSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, carrefourSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String revueBanquesSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.RevueBanquesSearchParams revueBanquesSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/revueBanquesSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "revueBanquesSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, revueBanquesSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String ombresBlanchesSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.OmbresBlanchesSearchParams ombresBlanchesSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/ombresBlanchesSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ombresBlanchesSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, ombresBlanchesSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String mollatSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.MollatSearchParams mollatSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/mollatSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "mollatSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, mollatSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String immanensSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.ImmanensSearchParams immanensSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/immanensSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "immanensSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, immanensSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String orangeSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.OrangeSearchParams orangeSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/orangeSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "orangeSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, orangeSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String procureSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.ProcureSearchParams procureSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/procureSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "procureSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, procureSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String marieFranceSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.MarieFranceSearchParams marieFranceSearchParams) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/marieFranceSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "marieFranceSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, marieFranceSearchParams});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public void deleteSearch(String sessionToken, String searchIdToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/deleteSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "deleteSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, searchIdToken});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            }
            extractAttachments(_call);
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[] getNoticeList(String sessionToken, String searchIdToken, int startRecord, int maxRecords, ch.albertlegrand.business.catalogue.com.electreNet.SortKey[] sortKeys, ch.albertlegrand.business.catalogue.com.electreNet.ListOption[] options) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getNoticeList");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getNoticeList"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, searchIdToken, new Integer(startRecord), new Integer(maxRecords), sortKeys, options});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[] getListElementsAsso(String sessionToken, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String isbnlist) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getListElementsAsso");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getListElementsAsso"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, new Boolean(useFonds), searchFilter, isbnlist});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getNoticeListXml(String sessionToken, String searchIdToken, int startRecord, int maxRecords, ch.albertlegrand.business.catalogue.com.electreNet.SortKey[] sortKeys, ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat xmlListFormat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getNoticeListXml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getNoticeListXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, searchIdToken, new Integer(startRecord), new Integer(maxRecords), sortKeys, xmlListFormat});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int getNoticeCount(String sessionToken, String searchIdToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getNoticeCount");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getNoticeCount"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, searchIdToken});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getNoticeXml(String sessionToken, String searchIdToken, String nonotice, ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat xmlListFormat) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getNoticeXml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getNoticeXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, searchIdToken, nonotice, xmlListFormat});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String searchIsbnEan(String sessionToken, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String isbnlist) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/searchIsbnEan");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "searchIsbnEan"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, new Boolean(useFonds), searchFilter, isbnlist});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String searchIsbnEanExact(String sessionToken, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String isbnlist) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/searchIsbnEanExact");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "searchIsbnEanExact"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, new Boolean(useFonds), searchFilter, isbnlist});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String dateEnvoiSearch(String sessionToken, String startDateEnvoiString, String endDateEnvoiString, String[][] dataSource) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[34]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/dateEnvoiSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "dateEnvoiSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, startDateEnvoiString, endDateEnvoiString, dataSource});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String[] getFlammarionBlacklist(String sessionToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[35]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getFlammarionBlacklist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getFlammarionBlacklist"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String[]) _resp;
                } catch (Exception _exception) {
                    return (String[]) org.apache.axis.utils.JavaUtils.convert(_resp, String[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int addToFlammarionBlackilist(String sessionToken, String ean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[36]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/addToFlammarionBlackilist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "addToFlammarionBlackilist"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, ean});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public int deleteFromFlammarionBlackilist(String sessionToken, String ean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[37]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/deleteFromFlammarionBlackilist");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "deleteFromFlammarionBlackilist"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, ean});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return ((Integer) _resp).intValue();
                } catch (Exception _exception) {
                    return ((Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getNoticeAuteurLinks(String sessionToken, String searchIdToken, String nonotice) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[38]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getNoticeAuteurLinks");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getNoticeAuteurLinks"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, searchIdToken, nonotice});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo findAuteur(String sessionToken, String auteurId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[39]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findAuteur");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findAuteur"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, auteurId});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[] findAuteurs(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[40]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findAuteurs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findAuteurs"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, expression});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String[] findAuteurTypParti(String sessionToken, String[] typParti) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[41]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findAuteurTypParti");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findAuteurTypParti"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, typParti});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String[]) _resp;
                } catch (Exception _exception) {
                    return (String[]) org.apache.axis.utils.JavaUtils.convert(_resp, String[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo findEditeur(String sessionToken, String refEdite) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[42]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findEditeur");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findEditeur"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, refEdite});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] findEditeurs(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean distributeurs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[43]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findEditeurs");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findEditeurs"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, expression, new Boolean(distributeurs)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] findEditeursLiensCA(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean distributeurs) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[44]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findEditeursLiensCA");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findEditeursLiensCA"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, expression, new Boolean(distributeurs)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] findEditeurCollections(String sessionToken, String refEdite) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[45]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findEditeurCollections");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findEditeurCollections"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, refEdite});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] findCollections(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[46]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findCollections");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findCollections"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, expression});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] findThemes(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[47]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findThemes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findThemes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, expression});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] findGenres(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[48]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/findGenres");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "findGenres"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, expression});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[] getTvaCodes(String sessionToken) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[49]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getTvaCodes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getTvaCodes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String auteurIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] auteurIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[50]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/auteurIdSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "auteurIdSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, auteurIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String noticeIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] noticeIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[51]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/noticeIdSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "noticeIdSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, noticeIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String editeurIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] editeurIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[52]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/editeurIdSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "editeurIdSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, editeurIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String collectionIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] collectionIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[53]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/collectionIdSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "collectionIdSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, collectionIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String titreEnsembleIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] titreEnsembleIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[54]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/titreEnsembleIdSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "titreEnsembleIdSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, titreEnsembleIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String titreRevueIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] titreRevueIds) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[55]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/titreRevueIdSearch");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "titreRevueIdSearch"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, new Boolean(useFonds), searchFilter, titreRevueIds});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public byte[] getImage(String sessionCookie, String ean, boolean scaled) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[56]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getImage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, ean, new Boolean(scaled)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (byte[]) _resp;
                } catch (Exception _exception) {
                    return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public byte[] getCatalogImage(String sessionCookie, String ean, boolean scaled) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[57]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getCatalogImage");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getCatalogImage"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, ean, new Boolean(scaled)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (byte[]) _resp;
                } catch (Exception _exception) {
                    return (byte[]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public byte[][] getListImagettes(String sessionCookie, String eanList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[58]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getListImagettes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getListImagettes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, eanList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (byte[][]) _resp;
                } catch (Exception _exception) {
                    return (byte[][]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[][].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public byte[][] getCatalogListImagettes(String sessionCookie, String eanList) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[59]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getCatalogListImagettes");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getCatalogListImagettes"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, eanList});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (byte[][]) _resp;
                } catch (Exception _exception) {
                    return (byte[][]) org.apache.axis.utils.JavaUtils.convert(_resp, byte[][].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getQuatriemeXml(String sessionToken, String ean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[60]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getQuatriemeXml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getQuatriemeXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, ean});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getCatalogQuatriemeXml(String sessionToken, String ean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[61]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getCatalogQuatriemeXml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getCatalogQuatriemeXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, ean});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getTdmXml(String sessionToken, String ean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[62]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getTdmXml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getTdmXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, ean});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getCatalogTdmXml(String sessionToken, String ean) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[63]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getCatalogTdmXml");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getCatalogTdmXml"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, ean});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[] getEditeursNewsLetterLH(String sessionCookie, String pivotDateString) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[64]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getEditeursNewsLetterLH");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getEditeursNewsLetterLH"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, pivotDateString});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[] getListElementsNewsLetterLH(String sessionCookie, String editeurId, String pivotDateString) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[65]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getListElementsNewsLetterLH");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getListElementsNewsLetterLH"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionCookie, editeurId, pivotDateString});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[]) _resp;
                } catch (Exception _exception) {
                    return (ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[]) org.apache.axis.utils.JavaUtils.convert(_resp, ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[].class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

    public String getLivreEnLigneIFrame(String sessionToken, String isbn, int type) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[66]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("http://electre.com/ElectreNET/getLivreEnLigneIFrame");
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "getLivreEnLigneIFrame"));

        setRequestHeaders(_call);
        setAttachments(_call);
        try {
            Object _resp = _call.invoke(new Object[]{sessionToken, isbn, new Integer(type)});

            if (_resp instanceof java.rmi.RemoteException) {
                throw (java.rmi.RemoteException) _resp;
            } else {
                extractAttachments(_call);
                try {
                    return (String) _resp;
                } catch (Exception _exception) {
                    return (String) org.apache.axis.utils.JavaUtils.convert(_resp, String.class);
                }
            }
        } catch (org.apache.axis.AxisFault axisFaultException) {
            throw axisFaultException;
        }
    }

}
