/**
 * MoyenLiaison.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class MoyenLiaison implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.TypeLiaison typeLiaison;

    private String valeur;

    public MoyenLiaison() {
    }

    public MoyenLiaison(
            ch.albertlegrand.business.catalogue.com.electreNet.TypeLiaison typeLiaison,
            String valeur) {
        this.typeLiaison = typeLiaison;
        this.valeur = valeur;
    }


    /**
     * Gets the typeLiaison value for this MoyenLiaison.
     *
     * @return typeLiaison
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.TypeLiaison getTypeLiaison() {
        return typeLiaison;
    }


    /**
     * Sets the typeLiaison value for this MoyenLiaison.
     *
     * @param typeLiaison
     */
    public void setTypeLiaison(ch.albertlegrand.business.catalogue.com.electreNet.TypeLiaison typeLiaison) {
        this.typeLiaison = typeLiaison;
    }


    /**
     * Gets the valeur value for this MoyenLiaison.
     *
     * @return valeur
     */
    public String getValeur() {
        return valeur;
    }


    /**
     * Sets the valeur value for this MoyenLiaison.
     *
     * @param valeur
     */
    public void setValeur(String valeur) {
        this.valeur = valeur;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MoyenLiaison)) return false;
        MoyenLiaison other = (MoyenLiaison) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.typeLiaison == null && other.getTypeLiaison() == null) ||
                        (this.typeLiaison != null &&
                                this.typeLiaison.equals(other.getTypeLiaison()))) &&
                ((this.valeur == null && other.getValeur() == null) ||
                        (this.valeur != null &&
                                this.valeur.equals(other.getValeur())));
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
        if (getTypeLiaison() != null) {
            _hashCode += getTypeLiaison().hashCode();
        }
        if (getValeur() != null) {
            _hashCode += getValeur().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MoyenLiaison.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MoyenLiaison"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeLiaison");
        elemField.setXmlName(new javax.xml.namespace.QName("", "typeLiaison"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TypeLiaison"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valeur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Valeur"));
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
