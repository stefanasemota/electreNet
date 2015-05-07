/**
 * ImmanensSearchParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class ImmanensSearchParams implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression editeur;

    private String[] genreCode;

    public ImmanensSearchParams() {
    }

    public ImmanensSearchParams(
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression editeur,
            String[] genreCode) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.genreCode = genreCode;
    }


    /**
     * Gets the titre value for this ImmanensSearchParams.
     *
     * @return titre
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this ImmanensSearchParams.
     *
     * @param titre
     */
    public void setTitre(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre) {
        this.titre = titre;
    }


    /**
     * Gets the auteur value for this ImmanensSearchParams.
     *
     * @return auteur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this ImmanensSearchParams.
     *
     * @param auteur
     */
    public void setAuteur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the editeur value for this ImmanensSearchParams.
     *
     * @return editeur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getEditeur() {
        return editeur;
    }


    /**
     * Sets the editeur value for this ImmanensSearchParams.
     *
     * @param editeur
     */
    public void setEditeur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression editeur) {
        this.editeur = editeur;
    }


    /**
     * Gets the genreCode value for this ImmanensSearchParams.
     *
     * @return genreCode
     */
    public String[] getGenreCode() {
        return genreCode;
    }


    /**
     * Sets the genreCode value for this ImmanensSearchParams.
     *
     * @param genreCode
     */
    public void setGenreCode(String[] genreCode) {
        this.genreCode = genreCode;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ImmanensSearchParams)) return false;
        ImmanensSearchParams other = (ImmanensSearchParams) obj;
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
                ((this.editeur == null && other.getEditeur() == null) ||
                        (this.editeur != null &&
                                this.editeur.equals(other.getEditeur()))) &&
                ((this.genreCode == null && other.getGenreCode() == null) ||
                        (this.genreCode != null &&
                                java.util.Arrays.equals(this.genreCode, other.getGenreCode())));
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
        if (getEditeur() != null) {
            _hashCode += getEditeur().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ImmanensSearchParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ImmanensSearchParams"));
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
        elemField.setFieldName("editeur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editeur"));
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
