/**
 * OrangeSearchParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class OrangeSearchParams implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur;

    public OrangeSearchParams() {
    }

    public OrangeSearchParams(
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur) {
        this.titre = titre;
        this.auteur = auteur;
    }


    /**
     * Gets the titre value for this OrangeSearchParams.
     *
     * @return titre
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this OrangeSearchParams.
     *
     * @param titre
     */
    public void setTitre(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre) {
        this.titre = titre;
    }


    /**
     * Gets the auteur value for this OrangeSearchParams.
     *
     * @return auteur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this OrangeSearchParams.
     *
     * @param auteur
     */
    public void setAuteur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur) {
        this.auteur = auteur;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OrangeSearchParams)) return false;
        OrangeSearchParams other = (OrangeSearchParams) obj;
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
                                this.auteur.equals(other.getAuteur())));
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(OrangeSearchParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "OrangeSearchParams"));
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
