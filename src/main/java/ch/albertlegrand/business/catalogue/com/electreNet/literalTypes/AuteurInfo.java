/**
 * AuteurInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet.literalTypes;

public class AuteurInfo implements java.io.Serializable {
    private String nom;

    private String id;

    private ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.AuteurType auteurType;

    private String[] typParti;

    public AuteurInfo() {
    }

    public AuteurInfo(
            String nom,
            String id,
            ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.AuteurType auteurType,
            String[] typParti) {
        this.nom = nom;
        this.id = id;
        this.auteurType = auteurType;
        this.typParti = typParti;
    }


    /**
     * Gets the nom value for this AuteurInfo.
     *
     * @return nom
     */
    public String getNom() {
        return nom;
    }


    /**
     * Sets the nom value for this AuteurInfo.
     *
     * @param nom
     */
    public void setNom(String nom) {
        this.nom = nom;
    }


    /**
     * Gets the id value for this AuteurInfo.
     *
     * @return id
     */
    public String getId() {
        return id;
    }


    /**
     * Sets the id value for this AuteurInfo.
     *
     * @param id
     */
    public void setId(String id) {
        this.id = id;
    }


    /**
     * Gets the auteurType value for this AuteurInfo.
     *
     * @return auteurType
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.AuteurType getAuteurType() {
        return auteurType;
    }


    /**
     * Sets the auteurType value for this AuteurInfo.
     *
     * @param auteurType
     */
    public void setAuteurType(ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.AuteurType auteurType) {
        this.auteurType = auteurType;
    }


    /**
     * Gets the typParti value for this AuteurInfo.
     *
     * @return typParti
     */
    public String[] getTypParti() {
        return typParti;
    }


    /**
     * Sets the typParti value for this AuteurInfo.
     *
     * @param typParti
     */
    public void setTypParti(String[] typParti) {
        this.typParti = typParti;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AuteurInfo)) return false;
        AuteurInfo other = (AuteurInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.nom == null && other.getNom() == null) ||
                        (this.nom != null &&
                                this.nom.equals(other.getNom()))) &&
                ((this.id == null && other.getId() == null) ||
                        (this.id != null &&
                                this.id.equals(other.getId()))) &&
                ((this.auteurType == null && other.getAuteurType() == null) ||
                        (this.auteurType != null &&
                                this.auteurType.equals(other.getAuteurType()))) &&
                ((this.typParti == null && other.getTypParti() == null) ||
                        (this.typParti != null &&
                                java.util.Arrays.equals(this.typParti, other.getTypParti())));
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
        if (getNom() != null) {
            _hashCode += getNom().hashCode();
        }
        if (getId() != null) {
            _hashCode += getId().hashCode();
        }
        if (getAuteurType() != null) {
            _hashCode += getAuteurType().hashCode();
        }
        if (getTypParti() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getTypParti());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getTypParti(), i);
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
            new org.apache.axis.description.TypeDesc(AuteurInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "AuteurInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nom");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "nom"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("id");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "id"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteurType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "auteurType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "AuteurType"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typParti");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "typParti"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "string"));
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
