/**
 * CollectionInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet.literalTypes;

public class CollectionInfo implements java.io.Serializable {
    private String collectionId;

    private String libelle;

    private String refEdite;

    public CollectionInfo() {
    }

    public CollectionInfo(
            String collectionId,
            String libelle,
            String refEdite) {
        this.collectionId = collectionId;
        this.libelle = libelle;
        this.refEdite = refEdite;
    }


    /**
     * Gets the collectionId value for this CollectionInfo.
     *
     * @return collectionId
     */
    public String getCollectionId() {
        return collectionId;
    }


    /**
     * Sets the collectionId value for this CollectionInfo.
     *
     * @param collectionId
     */
    public void setCollectionId(String collectionId) {
        this.collectionId = collectionId;
    }


    /**
     * Gets the libelle value for this CollectionInfo.
     *
     * @return libelle
     */
    public String getLibelle() {
        return libelle;
    }


    /**
     * Sets the libelle value for this CollectionInfo.
     *
     * @param libelle
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    /**
     * Gets the refEdite value for this CollectionInfo.
     *
     * @return refEdite
     */
    public String getRefEdite() {
        return refEdite;
    }


    /**
     * Sets the refEdite value for this CollectionInfo.
     *
     * @param refEdite
     */
    public void setRefEdite(String refEdite) {
        this.refEdite = refEdite;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CollectionInfo)) return false;
        CollectionInfo other = (CollectionInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.collectionId == null && other.getCollectionId() == null) ||
                        (this.collectionId != null &&
                                this.collectionId.equals(other.getCollectionId()))) &&
                ((this.libelle == null && other.getLibelle() == null) ||
                        (this.libelle != null &&
                                this.libelle.equals(other.getLibelle()))) &&
                ((this.refEdite == null && other.getRefEdite() == null) ||
                        (this.refEdite != null &&
                                this.refEdite.equals(other.getRefEdite())));
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
        if (getCollectionId() != null) {
            _hashCode += getCollectionId().hashCode();
        }
        if (getLibelle() != null) {
            _hashCode += getLibelle().hashCode();
        }
        if (getRefEdite() != null) {
            _hashCode += getRefEdite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(CollectionInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "CollectionInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collectionId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "collectionId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("libelle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "libelle"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refEdite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "refEdite"));
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
