/**
 * SortKey.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SortKey implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.SortOrder sortOrder;

    private boolean descending;

    public SortKey() {
    }

    public SortKey(
            ch.albertlegrand.business.catalogue.com.electreNet.SortOrder sortOrder,
            boolean descending) {
        this.sortOrder = sortOrder;
        this.descending = descending;
    }


    /**
     * Gets the sortOrder value for this SortKey.
     *
     * @return sortOrder
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SortOrder getSortOrder() {
        return sortOrder;
    }


    /**
     * Sets the sortOrder value for this SortKey.
     *
     * @param sortOrder
     */
    public void setSortOrder(ch.albertlegrand.business.catalogue.com.electreNet.SortOrder sortOrder) {
        this.sortOrder = sortOrder;
    }


    /**
     * Gets the descending value for this SortKey.
     *
     * @return descending
     */
    public boolean isDescending() {
        return descending;
    }


    /**
     * Sets the descending value for this SortKey.
     *
     * @param descending
     */
    public void setDescending(boolean descending) {
        this.descending = descending;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SortKey)) return false;
        SortKey other = (SortKey) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.sortOrder == null && other.getSortOrder() == null) ||
                        (this.sortOrder != null &&
                                this.sortOrder.equals(other.getSortOrder()))) &&
                this.descending == other.isDescending();
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
        if (getSortOrder() != null) {
            _hashCode += getSortOrder().hashCode();
        }
        _hashCode += (isDescending() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SortKey.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SortKey"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sortOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("", "sortOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SortOrder"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("descending");
        elemField.setXmlName(new javax.xml.namespace.QName("", "descending"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
