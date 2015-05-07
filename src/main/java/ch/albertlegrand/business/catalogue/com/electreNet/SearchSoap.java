/**
 * SearchSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public interface SearchSoap extends java.rmi.Remote {
    public String sptRandomList(String sessionCookie, int maxNotices, ch.albertlegrand.business.catalogue.com.electreNet.SPTFiltrePublic[] sptFiltrePublic) throws java.rmi.RemoteException;

    public String sptSearch(String sessionCookie, ch.albertlegrand.business.catalogue.com.electreNet.SPTSearchParams sptSearchParams) throws java.rmi.RemoteException;

    public String getUserCritiques(String sessionCookie, String signataire) throws java.rmi.RemoteException;

    public String getRecentCritiques(String sessionCookie, String signataire, String[] deweyIndices, String[] themes, String[] genres) throws java.rmi.RemoteException;

    public String getResume(String sessionToken, String ean) throws java.rmi.RemoteException;

    public byte[] getElementPromoSofedis(String sessionCookie, String ean, ch.albertlegrand.business.catalogue.com.electreNet.TypeElementSofedis type, String rang) throws java.rmi.RemoteException;

    public boolean immanensCheckLogin(String sessionCookie, String userName, String password, String iphoneId) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.ImmanensLoginStatus immanensCheckLogin_v2(String sessionCookie, String userName, String password, String iphoneId) throws java.rmi.RemoteException;

    public void immanensLogout(String sessionCookie, String iphoneId) throws java.rmi.RemoteException;

    public String immanensVentDisponibilite(String sessionCookie, String searchIdToken) throws java.rmi.RemoteException;

    public String immanens_getNoticeListXml(String sessionToken, String searchIdToken, int startRecord, int maxRecords, ch.albertlegrand.business.catalogue.com.electreNet.SortKey[] sortKeys, ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat xmlListFormat, String iPhoneId, int typeIPhoneAbonnement) throws java.rmi.RemoteException;

    public byte[] immanens_getImage(String sessionCookie, String ean, boolean scaled, String iPhoneId, int typeIPhoneAbonnement) throws java.rmi.RemoteException;

    public String getLoginInformation(String sessionCookie) throws java.rmi.RemoteException;

    public String rapideSearch(String sessionCookie, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter) throws java.rmi.RemoteException;

    public String rapideSearchArea(String sessionCookie, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[][] rapideSearchArea) throws java.rmi.RemoteException;

    public String flammarionSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams flammarionSearchParams) throws java.rmi.RemoteException;

    public String flammarionSearch2(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.FlammarionSearchParams2 flammarionSearchParams) throws java.rmi.RemoteException;

    public String sofedisSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.SofedisSearchParams sofedisSearchParams) throws java.rmi.RemoteException;

    public String carrefourSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.CarrefourSearchParams carrefourSearchParams) throws java.rmi.RemoteException;

    public String revueBanquesSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.RevueBanquesSearchParams revueBanquesSearchParams) throws java.rmi.RemoteException;

    public String ombresBlanchesSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.OmbresBlanchesSearchParams ombresBlanchesSearchParams) throws java.rmi.RemoteException;

    public String mollatSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.MollatSearchParams mollatSearchParams) throws java.rmi.RemoteException;

    public String immanensSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.ImmanensSearchParams immanensSearchParams) throws java.rmi.RemoteException;

    public String orangeSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.OrangeSearchParams orangeSearchParams) throws java.rmi.RemoteException;

    public String procureSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.ProcureSearchParams procureSearchParams) throws java.rmi.RemoteException;

    public String marieFranceSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, ch.albertlegrand.business.catalogue.com.electreNet.MarieFranceSearchParams marieFranceSearchParams) throws java.rmi.RemoteException;

    public void deleteSearch(String sessionToken, String searchIdToken) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.ListEntry[] getNoticeList(String sessionToken, String searchIdToken, int startRecord, int maxRecords, ch.albertlegrand.business.catalogue.com.electreNet.SortKey[] sortKeys, ch.albertlegrand.business.catalogue.com.electreNet.ListOption[] options) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.ElementsAsso[] getListElementsAsso(String sessionToken, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String isbnlist) throws java.rmi.RemoteException;

    public String getNoticeListXml(String sessionToken, String searchIdToken, int startRecord, int maxRecords, ch.albertlegrand.business.catalogue.com.electreNet.SortKey[] sortKeys, ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat xmlListFormat) throws java.rmi.RemoteException;

    public int getNoticeCount(String sessionToken, String searchIdToken) throws java.rmi.RemoteException;

    public String getNoticeXml(String sessionToken, String searchIdToken, String nonotice, ch.albertlegrand.business.catalogue.com.electreNet.XmlListFormat xmlListFormat) throws java.rmi.RemoteException;

    public String searchIsbnEan(String sessionToken, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String isbnlist) throws java.rmi.RemoteException;

    public String searchIsbnEanExact(String sessionToken, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String isbnlist) throws java.rmi.RemoteException;

    public String dateEnvoiSearch(String sessionToken, String startDateEnvoiString, String endDateEnvoiString, String[][] dataSource) throws java.rmi.RemoteException;

    public String[] getFlammarionBlacklist(String sessionToken) throws java.rmi.RemoteException;

    public int addToFlammarionBlackilist(String sessionToken, String ean) throws java.rmi.RemoteException;

    public int deleteFromFlammarionBlackilist(String sessionToken, String ean) throws java.rmi.RemoteException;

    public String getNoticeAuteurLinks(String sessionToken, String searchIdToken, String nonotice) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo findAuteur(String sessionToken, String auteurId) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.AuteurInfo[] findAuteurs(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException;

    public String[] findAuteurTypParti(String sessionToken, String[] typParti) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo findEditeur(String sessionToken, String refEdite) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] findEditeurs(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean distributeurs) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeurInfo[] findEditeursLiensCA(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression, boolean distributeurs) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] findEditeurCollections(String sessionToken, String refEdite) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.CollectionInfo[] findCollections(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] findThemes(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.IdLibelle[] findGenres(String sessionToken, ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression expression) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.TvaCode[] getTvaCodes(String sessionToken) throws java.rmi.RemoteException;

    public String auteurIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] auteurIds) throws java.rmi.RemoteException;

    public String noticeIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] noticeIds) throws java.rmi.RemoteException;

    public String editeurIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] editeurIds) throws java.rmi.RemoteException;

    public String collectionIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] collectionIds) throws java.rmi.RemoteException;

    public String titreEnsembleIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] titreEnsembleIds) throws java.rmi.RemoteException;

    public String titreRevueIdSearch(String sessionCookie, boolean useFonds, ch.albertlegrand.business.catalogue.com.electreNet.SearchFilter searchFilter, String[] titreRevueIds) throws java.rmi.RemoteException;

    public byte[] getImage(String sessionCookie, String ean, boolean scaled) throws java.rmi.RemoteException;

    public byte[] getCatalogImage(String sessionCookie, String ean, boolean scaled) throws java.rmi.RemoteException;

    public byte[][] getListImagettes(String sessionCookie, String eanList) throws java.rmi.RemoteException;

    public byte[][] getCatalogListImagettes(String sessionCookie, String eanList) throws java.rmi.RemoteException;

    public String getQuatriemeXml(String sessionToken, String ean) throws java.rmi.RemoteException;

    public String getCatalogQuatriemeXml(String sessionToken, String ean) throws java.rmi.RemoteException;

    public String getTdmXml(String sessionToken, String ean) throws java.rmi.RemoteException;

    public String getCatalogTdmXml(String sessionToken, String ean) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.EditeursNewsletterLH[] getEditeursNewsLetterLH(String sessionCookie, String pivotDateString) throws java.rmi.RemoteException;

    public ch.albertlegrand.business.catalogue.com.electreNet.ElementsNewsLetterLH[] getListElementsNewsLetterLH(String sessionCookie, String editeurId, String pivotDateString) throws java.rmi.RemoteException;

    public String getLivreEnLigneIFrame(String sessionToken, String isbn, int type) throws java.rmi.RemoteException;
}
