/**
 * SearchFilter.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SearchFilter implements java.io.Serializable {
    private boolean disponible;

    private boolean indisponible;

    private boolean aparaitre;

    private boolean manquant;

    private TFilterFamille m_Famille;

    private Fiction fiction;

    private String avant;

    private String apres;

    private String prixMin;

    private String prixMax;

    private String niveauLectureId;

    private String nationaliteId;

    private String langueId;

    private String dateenvoiAvant;

    private String dateenvoiApres;

    private String dataSourceBits;

    private boolean restrictionImage;

    private boolean restrictionImagette;

    private Boolean restrictionCritiques;

    private String refEdite;

    private boolean memonotice;

    private String[] nivlects;

    public SearchFilter() {
    }

    public SearchFilter(TFilterFamille filter, Fiction fiction) {
        this.m_Famille = filter;
        this.fiction = fiction;
    }

    public SearchFilter(boolean disponible, boolean indisponible,
                        boolean aparaitre, boolean manquant, TFilterFamille m_Famille,
                        Fiction fiction, String avant, String apres,
                        String prixMin, String prixMax,
                        String niveauLectureId, String nationaliteId,
                        String langueId, String dateenvoiAvant,
                        String dateenvoiApres, String dataSourceBits,
                        boolean restrictionImage, boolean restrictionImagette,
                        Boolean restrictionCritiques, String refEdite,
                        boolean memonotice, String[] nivlects) {
        this.disponible = disponible;
        this.indisponible = indisponible;
        this.aparaitre = aparaitre;
        this.manquant = manquant;
        this.m_Famille = m_Famille;
        this.fiction = fiction;
        this.avant = avant;
        this.apres = apres;
        this.prixMin = prixMin;
        this.prixMax = prixMax;
        this.niveauLectureId = niveauLectureId;
        this.nationaliteId = nationaliteId;
        this.langueId = langueId;
        this.dateenvoiAvant = dateenvoiAvant;
        this.dateenvoiApres = dateenvoiApres;
        this.dataSourceBits = dataSourceBits;
        this.restrictionImage = restrictionImage;
        this.restrictionImagette = restrictionImagette;
        this.restrictionCritiques = restrictionCritiques;
        this.refEdite = refEdite;
        this.memonotice = memonotice;
        this.nivlects = nivlects;
    }

    /**
     * Gets the disponible value for this SearchFilter.
     *
     * @return disponible
     */
    public boolean isDisponible() {
        return disponible;
    }

    /**
     * Sets the disponible value for this SearchFilter.
     *
     * @param disponible
     */
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    /**
     * Gets the indisponible value for this SearchFilter.
     *
     * @return indisponible
     */
    public boolean isIndisponible() {
        return indisponible;
    }

    /**
     * Sets the indisponible value for this SearchFilter.
     *
     * @param indisponible
     */
    public void setIndisponible(boolean indisponible) {
        this.indisponible = indisponible;
    }

    /**
     * Gets the aparaitre value for this SearchFilter.
     *
     * @return aparaitre
     */
    public boolean isAparaitre() {
        return aparaitre;
    }

    /**
     * Sets the aparaitre value for this SearchFilter.
     *
     * @param aparaitre
     */
    public void setAparaitre(boolean aparaitre) {
        this.aparaitre = aparaitre;
    }

    /**
     * Gets the manquant value for this SearchFilter.
     *
     * @return manquant
     */
    public boolean isManquant() {
        return manquant;
    }

    /**
     * Sets the manquant value for this SearchFilter.
     *
     * @param manquant
     */
    public void setManquant(boolean manquant) {
        this.manquant = manquant;
    }

    /**
     * Gets the m_Famille value for this SearchFilter.
     *
     * @return m_Famille
     */
    public TFilterFamille getM_Famille() {
        return m_Famille;
    }

    /**
     * Sets the m_Famille value for this SearchFilter.
     *
     * @param m_Famille
     */
    public void setM_Famille(TFilterFamille m_Famille) {
        this.m_Famille = m_Famille;
    }

    /**
     * Gets the fiction value for this SearchFilter.
     *
     * @return fiction
     */
    public Fiction getFiction() {
        return fiction;
    }

    /**
     * Sets the fiction value for this SearchFilter.
     *
     * @param fiction
     */
    public void setFiction(Fiction fiction) {
        this.fiction = fiction;
    }

    /**
     * Gets the avant value for this SearchFilter.
     *
     * @return avant
     */
    public String getAvant() {
        return avant;
    }

    /**
     * Sets the avant value for this SearchFilter.
     *
     * @param avant
     */
    public void setAvant(String avant) {
        this.avant = avant;
    }

    /**
     * Gets the apres value for this SearchFilter.
     *
     * @return apres
     */
    public String getApres() {
        return apres;
    }

    /**
     * Sets the apres value for this SearchFilter.
     *
     * @param apres
     */
    public void setApres(String apres) {
        this.apres = apres;
    }

    /**
     * Gets the prixMin value for this SearchFilter.
     *
     * @return prixMin
     */
    public String getPrixMin() {
        return prixMin;
    }

    /**
     * Sets the prixMin value for this SearchFilter.
     *
     * @param prixMin
     */
    public void setPrixMin(String prixMin) {
        this.prixMin = prixMin;
    }

    /**
     * Gets the prixMax value for this SearchFilter.
     *
     * @return prixMax
     */
    public String getPrixMax() {
        return prixMax;
    }

    /**
     * Sets the prixMax value for this SearchFilter.
     *
     * @param prixMax
     */
    public void setPrixMax(String prixMax) {
        this.prixMax = prixMax;
    }

    /**
     * Gets the niveauLectureId value for this SearchFilter.
     *
     * @return niveauLectureId
     */
    public String getNiveauLectureId() {
        return niveauLectureId;
    }

    /**
     * Sets the niveauLectureId value for this SearchFilter.
     *
     * @param niveauLectureId
     */
    public void setNiveauLectureId(String niveauLectureId) {
        this.niveauLectureId = niveauLectureId;
    }

    /**
     * Gets the nationaliteId value for this SearchFilter.
     *
     * @return nationaliteId
     */
    public String getNationaliteId() {
        return nationaliteId;
    }

    /**
     * Sets the nationaliteId value for this SearchFilter.
     *
     * @param nationaliteId
     */
    public void setNationaliteId(String nationaliteId) {
        this.nationaliteId = nationaliteId;
    }

    /**
     * Gets the langueId value for this SearchFilter.
     *
     * @return langueId
     */
    public String getLangueId() {
        return langueId;
    }

    /**
     * Sets the langueId value for this SearchFilter.
     *
     * @param langueId
     */
    public void setLangueId(String langueId) {
        this.langueId = langueId;
    }

    /**
     * Gets the dateenvoiAvant value for this SearchFilter.
     *
     * @return dateenvoiAvant
     */
    public String getDateenvoiAvant() {
        return dateenvoiAvant;
    }

    /**
     * Sets the dateenvoiAvant value for this SearchFilter.
     *
     * @param dateenvoiAvant
     */
    public void setDateenvoiAvant(String dateenvoiAvant) {
        this.dateenvoiAvant = dateenvoiAvant;
    }

    /**
     * Gets the dateenvoiApres value for this SearchFilter.
     *
     * @return dateenvoiApres
     */
    public String getDateenvoiApres() {
        return dateenvoiApres;
    }

    /**
     * Sets the dateenvoiApres value for this SearchFilter.
     *
     * @param dateenvoiApres
     */
    public void setDateenvoiApres(String dateenvoiApres) {
        this.dateenvoiApres = dateenvoiApres;
    }

    /**
     * Gets the dataSourceBits value for this SearchFilter.
     *
     * @return dataSourceBits
     */
    public String getDataSourceBits() {
        return dataSourceBits;
    }

    /**
     * Sets the dataSourceBits value for this SearchFilter.
     *
     * @param dataSourceBits
     */
    public void setDataSourceBits(String dataSourceBits) {
        this.dataSourceBits = dataSourceBits;
    }

    /**
     * Gets the restrictionImage value for this SearchFilter.
     *
     * @return restrictionImage
     */
    public boolean isRestrictionImage() {
        return restrictionImage;
    }

    /**
     * Sets the restrictionImage value for this SearchFilter.
     *
     * @param restrictionImage
     */
    public void setRestrictionImage(boolean restrictionImage) {
        this.restrictionImage = restrictionImage;
    }

    /**
     * Gets the restrictionImagette value for this SearchFilter.
     *
     * @return restrictionImagette
     */
    public boolean isRestrictionImagette() {
        return restrictionImagette;
    }

    /**
     * Sets the restrictionImagette value for this SearchFilter.
     *
     * @param restrictionImagette
     */
    public void setRestrictionImagette(boolean restrictionImagette) {
        this.restrictionImagette = restrictionImagette;
    }

    /**
     * Gets the restrictionCritiques value for this SearchFilter.
     *
     * @return restrictionCritiques
     */
    public Boolean getRestrictionCritiques() {
        return restrictionCritiques;
    }

    /**
     * Sets the restrictionCritiques value for this SearchFilter.
     *
     * @param restrictionCritiques
     */
    public void setRestrictionCritiques(Boolean restrictionCritiques) {
        this.restrictionCritiques = restrictionCritiques;
    }

    /**
     * Gets the refEdite value for this SearchFilter.
     *
     * @return refEdite
     */
    public String getRefEdite() {
        return refEdite;
    }

    /**
     * Sets the refEdite value for this SearchFilter.
     *
     * @param refEdite
     */
    public void setRefEdite(String refEdite) {
        this.refEdite = refEdite;
    }

    /**
     * Gets the memonotice value for this SearchFilter.
     *
     * @return memonotice
     */
    public boolean isMemonotice() {
        return memonotice;
    }

    /**
     * Sets the memonotice value for this SearchFilter.
     *
     * @param memonotice
     */
    public void setMemonotice(boolean memonotice) {
        this.memonotice = memonotice;
    }

    /**
     * Gets the nivlects value for this SearchFilter.
     *
     * @return nivlects
     */
    public String[] getNivlects() {
        return nivlects;
    }

    /**
     * Sets the nivlects value for this SearchFilter.
     *
     * @param nivlects
     */
    public void setNivlects(String[] nivlects) {
        this.nivlects = nivlects;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchFilter))
            return false;
        SearchFilter other = (SearchFilter) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true
                && this.disponible == other.isDisponible()
                && this.indisponible == other.isIndisponible()
                && this.aparaitre == other.isAparaitre()
                && this.manquant == other.isManquant()
                && ((this.m_Famille == null && other.getM_Famille() == null) || (this.m_Famille != null && this.m_Famille
                .equals(other.getM_Famille())))
                && ((this.fiction == null && other.getFiction() == null) || (this.fiction != null && this.fiction
                .equals(other.getFiction())))
                && ((this.avant == null && other.getAvant() == null) || (this.avant != null && this.avant
                .equals(other.getAvant())))
                && ((this.apres == null && other.getApres() == null) || (this.apres != null && this.apres
                .equals(other.getApres())))
                && ((this.prixMin == null && other.getPrixMin() == null) || (this.prixMin != null && this.prixMin
                .equals(other.getPrixMin())))
                && ((this.prixMax == null && other.getPrixMax() == null) || (this.prixMax != null && this.prixMax
                .equals(other.getPrixMax())))
                && ((this.niveauLectureId == null && other.getNiveauLectureId() == null) || (this.niveauLectureId != null && this.niveauLectureId
                .equals(other.getNiveauLectureId())))
                && ((this.nationaliteId == null && other.getNationaliteId() == null) || (this.nationaliteId != null && this.nationaliteId
                .equals(other.getNationaliteId())))
                && ((this.langueId == null && other.getLangueId() == null) || (this.langueId != null && this.langueId
                .equals(other.getLangueId())))
                && ((this.dateenvoiAvant == null && other.getDateenvoiAvant() == null) || (this.dateenvoiAvant != null && this.dateenvoiAvant
                .equals(other.getDateenvoiAvant())))
                && ((this.dateenvoiApres == null && other.getDateenvoiApres() == null) || (this.dateenvoiApres != null && this.dateenvoiApres
                .equals(other.getDateenvoiApres())))
                && ((this.dataSourceBits == null && other.getDataSourceBits() == null) || (this.dataSourceBits != null && this.dataSourceBits
                .equals(other.getDataSourceBits())))
                && this.restrictionImage == other.isRestrictionImage()
                && this.restrictionImagette == other.isRestrictionImagette()
                && ((this.restrictionCritiques == null && other
                .getRestrictionCritiques() == null) || (this.restrictionCritiques != null && this.restrictionCritiques
                .equals(other.getRestrictionCritiques())))
                && ((this.refEdite == null && other.getRefEdite() == null) || (this.refEdite != null && this.refEdite
                .equals(other.getRefEdite())))
                && this.memonotice == other.isMemonotice()
                && ((this.nivlects == null && other.getNivlects() == null) || (this.nivlects != null && java.util.Arrays
                .equals(this.nivlects, other.getNivlects())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += (isDisponible() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isIndisponible() ? Boolean.TRUE : Boolean.FALSE)
                .hashCode();
        _hashCode += (isAparaitre() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isManquant() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getM_Famille() != null) {
            _hashCode += getM_Famille().hashCode();
        }
        if (getFiction() != null) {
            _hashCode += getFiction().hashCode();
        }
        if (getAvant() != null) {
            _hashCode += getAvant().hashCode();
        }
        if (getApres() != null) {
            _hashCode += getApres().hashCode();
        }
        if (getPrixMin() != null) {
            _hashCode += getPrixMin().hashCode();
        }
        if (getPrixMax() != null) {
            _hashCode += getPrixMax().hashCode();
        }
        if (getNiveauLectureId() != null) {
            _hashCode += getNiveauLectureId().hashCode();
        }
        if (getNationaliteId() != null) {
            _hashCode += getNationaliteId().hashCode();
        }
        if (getLangueId() != null) {
            _hashCode += getLangueId().hashCode();
        }
        if (getDateenvoiAvant() != null) {
            _hashCode += getDateenvoiAvant().hashCode();
        }
        if (getDateenvoiApres() != null) {
            _hashCode += getDateenvoiApres().hashCode();
        }
        if (getDataSourceBits() != null) {
            _hashCode += getDataSourceBits().hashCode();
        }
        _hashCode += (isRestrictionImage() ? Boolean.TRUE : Boolean.FALSE)
                .hashCode();
        _hashCode += (isRestrictionImagette() ? Boolean.TRUE : Boolean.FALSE)
                .hashCode();
        if (getRestrictionCritiques() != null) {
            _hashCode += getRestrictionCritiques().hashCode();
        }
        if (getRefEdite() != null) {
            _hashCode += getRefEdite().hashCode();
        }
        _hashCode += (isMemonotice() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getNivlects() != null) {
            for (int i = 0; i < java.lang.reflect.Array
                    .getLength(getNivlects()); i++) {
                Object obj = java.lang.reflect.Array.get(
                        getNivlects(), i);
                if (obj != null && !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(
            SearchFilter.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName(
                "http://electre.com/ElectreNET/", "SearchFilter"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("disponible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "disponible"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("indisponible");
        elemField.setXmlName(new javax.xml.namespace.QName("", "indisponible"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("aparaitre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "aparaitre"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("manquant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "manquant"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("m_Famille");
        elemField.setXmlName(new javax.xml.namespace.QName("", "m_Famille"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://electre.com/ElectreNET/", "TFilterFamille"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fiction");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fiction"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://electre.com/ElectreNET/", "Fiction"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("avant");
        elemField.setXmlName(new javax.xml.namespace.QName("", "avant"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("apres");
        elemField.setXmlName(new javax.xml.namespace.QName("", "apres"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prixMin");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prixMin"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prixMax");
        elemField.setXmlName(new javax.xml.namespace.QName("", "prixMax"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("niveauLectureId");
        elemField.setXmlName(new javax.xml.namespace.QName("",
                "niveauLectureId"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nationaliteId");
        elemField
                .setXmlName(new javax.xml.namespace.QName("", "nationaliteId"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("langueId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "langueId"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateenvoiAvant");
        elemField
                .setXmlName(new javax.xml.namespace.QName("", "dateenvoiAvant"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateenvoiApres");
        elemField
                .setXmlName(new javax.xml.namespace.QName("", "dateenvoiApres"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dataSourceBits");
        elemField
                .setXmlName(new javax.xml.namespace.QName("", "dataSourceBits"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictionImage");
        elemField.setXmlName(new javax.xml.namespace.QName("",
                "restrictionImage"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictionImagette");
        elemField.setXmlName(new javax.xml.namespace.QName("",
                "restrictionImagette"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("restrictionCritiques");
        elemField.setXmlName(new javax.xml.namespace.QName("",
                "restrictionCritiques"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refEdite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refEdite"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("memonotice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "memonotice"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nivlects");
        elemField.setXmlName(new javax.xml.namespace.QName("", "nivlects"));
        elemField.setXmlType(new javax.xml.namespace.QName(
                "http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType, Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType,
                _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType, Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType,
                _xmlType, typeDesc);
    }

}
