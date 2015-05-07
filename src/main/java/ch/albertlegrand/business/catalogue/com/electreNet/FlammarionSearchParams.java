/**
 * FlammarionSearchParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class FlammarionSearchParams implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur;

    private String[] genreCode;

    private String[] themeCode;

    private String[] refEdite;

    private String[] collectionId;

    private String[] deweyId;

    private String[] isbnEan;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression rapide;

    private boolean themeOrGenre;

    private boolean editeurOrCollection;

    private ch.albertlegrand.business.catalogue.com.electreNet.FlammarionTheme flammarionTheme;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression noCollection;

    public FlammarionSearchParams() {
    }

    public FlammarionSearchParams(
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur,
            String[] genreCode,
            String[] themeCode,
            String[] refEdite,
            String[] collectionId,
            String[] deweyId,
            String[] isbnEan,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression rapide,
            boolean themeOrGenre,
            boolean editeurOrCollection,
            ch.albertlegrand.business.catalogue.com.electreNet.FlammarionTheme flammarionTheme,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression noCollection) {
        this.titre = titre;
        this.auteur = auteur;
        this.genreCode = genreCode;
        this.themeCode = themeCode;
        this.refEdite = refEdite;
        this.collectionId = collectionId;
        this.deweyId = deweyId;
        this.isbnEan = isbnEan;
        this.rapide = rapide;
        this.themeOrGenre = themeOrGenre;
        this.editeurOrCollection = editeurOrCollection;
        this.flammarionTheme = flammarionTheme;
        this.noCollection = noCollection;
    }


    /**
     * Gets the titre value for this FlammarionSearchParams.
     *
     * @return titre
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this FlammarionSearchParams.
     *
     * @param titre
     */
    public void setTitre(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre) {
        this.titre = titre;
    }


    /**
     * Gets the auteur value for this FlammarionSearchParams.
     *
     * @return auteur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this FlammarionSearchParams.
     *
     * @param auteur
     */
    public void setAuteur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the genreCode value for this FlammarionSearchParams.
     *
     * @return genreCode
     */
    public String[] getGenreCode() {
        return genreCode;
    }


    /**
     * Sets the genreCode value for this FlammarionSearchParams.
     *
     * @param genreCode
     */
    public void setGenreCode(String[] genreCode) {
        this.genreCode = genreCode;
    }


    /**
     * Gets the themeCode value for this FlammarionSearchParams.
     *
     * @return themeCode
     */
    public String[] getThemeCode() {
        return themeCode;
    }


    /**
     * Sets the themeCode value for this FlammarionSearchParams.
     *
     * @param themeCode
     */
    public void setThemeCode(String[] themeCode) {
        this.themeCode = themeCode;
    }


    /**
     * Gets the refEdite value for this FlammarionSearchParams.
     *
     * @return refEdite
     */
    public String[] getRefEdite() {
        return refEdite;
    }


    /**
     * Sets the refEdite value for this FlammarionSearchParams.
     *
     * @param refEdite
     */
    public void setRefEdite(String[] refEdite) {
        this.refEdite = refEdite;
    }


    /**
     * Gets the collectionId value for this FlammarionSearchParams.
     *
     * @return collectionId
     */
    public String[] getCollectionId() {
        return collectionId;
    }


    /**
     * Sets the collectionId value for this FlammarionSearchParams.
     *
     * @param collectionId
     */
    public void setCollectionId(String[] collectionId) {
        this.collectionId = collectionId;
    }


    /**
     * Gets the deweyId value for this FlammarionSearchParams.
     *
     * @return deweyId
     */
    public String[] getDeweyId() {
        return deweyId;
    }


    /**
     * Sets the deweyId value for this FlammarionSearchParams.
     *
     * @param deweyId
     */
    public void setDeweyId(String[] deweyId) {
        this.deweyId = deweyId;
    }


    /**
     * Gets the isbnEan value for this FlammarionSearchParams.
     *
     * @return isbnEan
     */
    public String[] getIsbnEan() {
        return isbnEan;
    }


    /**
     * Sets the isbnEan value for this FlammarionSearchParams.
     *
     * @param isbnEan
     */
    public void setIsbnEan(String[] isbnEan) {
        this.isbnEan = isbnEan;
    }


    /**
     * Gets the rapide value for this FlammarionSearchParams.
     *
     * @return rapide
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getRapide() {
        return rapide;
    }


    /**
     * Sets the rapide value for this FlammarionSearchParams.
     *
     * @param rapide
     */
    public void setRapide(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression rapide) {
        this.rapide = rapide;
    }


    /**
     * Gets the themeOrGenre value for this FlammarionSearchParams.
     *
     * @return themeOrGenre
     */
    public boolean isThemeOrGenre() {
        return themeOrGenre;
    }


    /**
     * Sets the themeOrGenre value for this FlammarionSearchParams.
     *
     * @param themeOrGenre
     */
    public void setThemeOrGenre(boolean themeOrGenre) {
        this.themeOrGenre = themeOrGenre;
    }


    /**
     * Gets the editeurOrCollection value for this FlammarionSearchParams.
     *
     * @return editeurOrCollection
     */
    public boolean isEditeurOrCollection() {
        return editeurOrCollection;
    }


    /**
     * Sets the editeurOrCollection value for this FlammarionSearchParams.
     *
     * @param editeurOrCollection
     */
    public void setEditeurOrCollection(boolean editeurOrCollection) {
        this.editeurOrCollection = editeurOrCollection;
    }


    /**
     * Gets the flammarionTheme value for this FlammarionSearchParams.
     *
     * @return flammarionTheme
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.FlammarionTheme getFlammarionTheme() {
        return flammarionTheme;
    }


    /**
     * Sets the flammarionTheme value for this FlammarionSearchParams.
     *
     * @param flammarionTheme
     */
    public void setFlammarionTheme(ch.albertlegrand.business.catalogue.com.electreNet.FlammarionTheme flammarionTheme) {
        this.flammarionTheme = flammarionTheme;
    }


    /**
     * Gets the noCollection value for this FlammarionSearchParams.
     *
     * @return noCollection
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getNoCollection() {
        return noCollection;
    }


    /**
     * Sets the noCollection value for this FlammarionSearchParams.
     *
     * @param noCollection
     */
    public void setNoCollection(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression noCollection) {
        this.noCollection = noCollection;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof FlammarionSearchParams)) return false;
        FlammarionSearchParams other = (FlammarionSearchParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.titre == null && other.getTitre() == null) ||
                        (this.titre != null &&
                                this.titre.equals(other.getTitre()))) &&
                ((this.auteur == null && other.getAuteur() == null) ||
                        (this.auteur != null &&
                                this.auteur.equals(other.getAuteur()))) &&
                ((this.genreCode == null && other.getGenreCode() == null) ||
                        (this.genreCode != null &&
                                java.util.Arrays.equals(this.genreCode, other.getGenreCode()))) &&
                ((this.themeCode == null && other.getThemeCode() == null) ||
                        (this.themeCode != null &&
                                java.util.Arrays.equals(this.themeCode, other.getThemeCode()))) &&
                ((this.refEdite == null && other.getRefEdite() == null) ||
                        (this.refEdite != null &&
                                java.util.Arrays.equals(this.refEdite, other.getRefEdite()))) &&
                ((this.collectionId == null && other.getCollectionId() == null) ||
                        (this.collectionId != null &&
                                java.util.Arrays.equals(this.collectionId, other.getCollectionId()))) &&
                ((this.deweyId == null && other.getDeweyId() == null) ||
                        (this.deweyId != null &&
                                java.util.Arrays.equals(this.deweyId, other.getDeweyId()))) &&
                ((this.isbnEan == null && other.getIsbnEan() == null) ||
                        (this.isbnEan != null &&
                                java.util.Arrays.equals(this.isbnEan, other.getIsbnEan()))) &&
                ((this.rapide == null && other.getRapide() == null) ||
                        (this.rapide != null &&
                                this.rapide.equals(other.getRapide()))) &&
                this.themeOrGenre == other.isThemeOrGenre() &&
                this.editeurOrCollection == other.isEditeurOrCollection() &&
                ((this.flammarionTheme == null && other.getFlammarionTheme() == null) ||
                        (this.flammarionTheme != null &&
                                this.flammarionTheme.equals(other.getFlammarionTheme()))) &&
                ((this.noCollection == null && other.getNoCollection() == null) ||
                        (this.noCollection != null &&
                                this.noCollection.equals(other.getNoCollection())));
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
        if (getTitre() != null) {
            _hashCode += getTitre().hashCode();
        }
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        if (getGenreCode() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getGenreCode());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getGenreCode(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getThemeCode() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getThemeCode());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getThemeCode(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRefEdite() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getRefEdite());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getRefEdite(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getCollectionId() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getCollectionId());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getCollectionId(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeweyId() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDeweyId());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDeweyId(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getIsbnEan() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getIsbnEan());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIsbnEan(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRapide() != null) {
            _hashCode += getRapide().hashCode();
        }
        _hashCode += (isThemeOrGenre() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isEditeurOrCollection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFlammarionTheme() != null) {
            _hashCode += getFlammarionTheme().hashCode();
        }
        if (getNoCollection() != null) {
            _hashCode += getNoCollection().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(FlammarionSearchParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "FlammarionSearchParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("genreCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "genreCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refEdite");
        elemField.setXmlName(new javax.xml.namespace.QName("", "refEdite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deweyId");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deweyId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbnEan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isbnEan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rapide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rapide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("themeOrGenre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "themeOrGenre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editeurOrCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editeurOrCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("flammarionTheme");
        elemField.setXmlName(new javax.xml.namespace.QName("", "flammarionTheme"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "FlammarionTheme"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
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
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

}
