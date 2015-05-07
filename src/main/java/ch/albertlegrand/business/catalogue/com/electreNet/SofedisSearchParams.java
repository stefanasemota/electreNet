/**
 * SofedisSearchParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SofedisSearchParams implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur;

    private String[] refEdite;

    private String[] collectionId;

    private String[] isbnEan;

    private boolean editeurOrCollection;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ1;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ2;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ3;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ4;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ5;

    public SofedisSearchParams() {
    }

    public SofedisSearchParams(
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur,
            String[] refEdite,
            String[] collectionId,
            String[] isbnEan,
            boolean editeurOrCollection,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ1,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ2,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ3,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ4,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ5) {
        this.titre = titre;
        this.auteur = auteur;
        this.refEdite = refEdite;
        this.collectionId = collectionId;
        this.isbnEan = isbnEan;
        this.editeurOrCollection = editeurOrCollection;
        this.champ1 = champ1;
        this.champ2 = champ2;
        this.champ3 = champ3;
        this.champ4 = champ4;
        this.champ5 = champ5;
    }


    /**
     * Gets the titre value for this SofedisSearchParams.
     *
     * @return titre
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this SofedisSearchParams.
     *
     * @param titre
     */
    public void setTitre(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre) {
        this.titre = titre;
    }


    /**
     * Gets the auteur value for this SofedisSearchParams.
     *
     * @return auteur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this SofedisSearchParams.
     *
     * @param auteur
     */
    public void setAuteur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the refEdite value for this SofedisSearchParams.
     *
     * @return refEdite
     */
    public String[] getRefEdite() {
        return refEdite;
    }


    /**
     * Sets the refEdite value for this SofedisSearchParams.
     *
     * @param refEdite
     */
    public void setRefEdite(String[] refEdite) {
        this.refEdite = refEdite;
    }


    /**
     * Gets the collectionId value for this SofedisSearchParams.
     *
     * @return collectionId
     */
    public String[] getCollectionId() {
        return collectionId;
    }


    /**
     * Sets the collectionId value for this SofedisSearchParams.
     *
     * @param collectionId
     */
    public void setCollectionId(String[] collectionId) {
        this.collectionId = collectionId;
    }


    /**
     * Gets the isbnEan value for this SofedisSearchParams.
     *
     * @return isbnEan
     */
    public String[] getIsbnEan() {
        return isbnEan;
    }


    /**
     * Sets the isbnEan value for this SofedisSearchParams.
     *
     * @param isbnEan
     */
    public void setIsbnEan(String[] isbnEan) {
        this.isbnEan = isbnEan;
    }


    /**
     * Gets the editeurOrCollection value for this SofedisSearchParams.
     *
     * @return editeurOrCollection
     */
    public boolean isEditeurOrCollection() {
        return editeurOrCollection;
    }


    /**
     * Sets the editeurOrCollection value for this SofedisSearchParams.
     *
     * @param editeurOrCollection
     */
    public void setEditeurOrCollection(boolean editeurOrCollection) {
        this.editeurOrCollection = editeurOrCollection;
    }


    /**
     * Gets the champ1 value for this SofedisSearchParams.
     *
     * @return champ1
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getChamp1() {
        return champ1;
    }


    /**
     * Sets the champ1 value for this SofedisSearchParams.
     *
     * @param champ1
     */
    public void setChamp1(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ1) {
        this.champ1 = champ1;
    }


    /**
     * Gets the champ2 value for this SofedisSearchParams.
     *
     * @return champ2
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getChamp2() {
        return champ2;
    }


    /**
     * Sets the champ2 value for this SofedisSearchParams.
     *
     * @param champ2
     */
    public void setChamp2(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ2) {
        this.champ2 = champ2;
    }


    /**
     * Gets the champ3 value for this SofedisSearchParams.
     *
     * @return champ3
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getChamp3() {
        return champ3;
    }


    /**
     * Sets the champ3 value for this SofedisSearchParams.
     *
     * @param champ3
     */
    public void setChamp3(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ3) {
        this.champ3 = champ3;
    }


    /**
     * Gets the champ4 value for this SofedisSearchParams.
     *
     * @return champ4
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getChamp4() {
        return champ4;
    }


    /**
     * Sets the champ4 value for this SofedisSearchParams.
     *
     * @param champ4
     */
    public void setChamp4(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ4) {
        this.champ4 = champ4;
    }


    /**
     * Gets the champ5 value for this SofedisSearchParams.
     *
     * @return champ5
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getChamp5() {
        return champ5;
    }


    /**
     * Sets the champ5 value for this SofedisSearchParams.
     *
     * @param champ5
     */
    public void setChamp5(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression champ5) {
        this.champ5 = champ5;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SofedisSearchParams)) return false;
        SofedisSearchParams other = (SofedisSearchParams) obj;
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
                ((this.refEdite == null && other.getRefEdite() == null) ||
                        (this.refEdite != null &&
                                java.util.Arrays.equals(this.refEdite, other.getRefEdite()))) &&
                ((this.collectionId == null && other.getCollectionId() == null) ||
                        (this.collectionId != null &&
                                java.util.Arrays.equals(this.collectionId, other.getCollectionId()))) &&
                ((this.isbnEan == null && other.getIsbnEan() == null) ||
                        (this.isbnEan != null &&
                                java.util.Arrays.equals(this.isbnEan, other.getIsbnEan()))) &&
                this.editeurOrCollection == other.isEditeurOrCollection() &&
                ((this.champ1 == null && other.getChamp1() == null) ||
                        (this.champ1 != null &&
                                this.champ1.equals(other.getChamp1()))) &&
                ((this.champ2 == null && other.getChamp2() == null) ||
                        (this.champ2 != null &&
                                this.champ2.equals(other.getChamp2()))) &&
                ((this.champ3 == null && other.getChamp3() == null) ||
                        (this.champ3 != null &&
                                this.champ3.equals(other.getChamp3()))) &&
                ((this.champ4 == null && other.getChamp4() == null) ||
                        (this.champ4 != null &&
                                this.champ4.equals(other.getChamp4()))) &&
                ((this.champ5 == null && other.getChamp5() == null) ||
                        (this.champ5 != null &&
                                this.champ5.equals(other.getChamp5())));
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
        _hashCode += (isEditeurOrCollection() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getChamp1() != null) {
            _hashCode += getChamp1().hashCode();
        }
        if (getChamp2() != null) {
            _hashCode += getChamp2().hashCode();
        }
        if (getChamp3() != null) {
            _hashCode += getChamp3().hashCode();
        }
        if (getChamp4() != null) {
            _hashCode += getChamp4().hashCode();
        }
        if (getChamp5() != null) {
            _hashCode += getChamp5().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SofedisSearchParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SofedisSearchParams"));
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
        elemField.setFieldName("isbnEan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isbnEan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editeurOrCollection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editeurOrCollection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("champ1");
        elemField.setXmlName(new javax.xml.namespace.QName("", "champ1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("champ2");
        elemField.setXmlName(new javax.xml.namespace.QName("", "champ2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("champ3");
        elemField.setXmlName(new javax.xml.namespace.QName("", "champ3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("champ4");
        elemField.setXmlName(new javax.xml.namespace.QName("", "champ4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("champ5");
        elemField.setXmlName(new javax.xml.namespace.QName("", "champ5"));
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
