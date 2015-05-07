/**
 * ListEntry.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class ListEntry implements java.io.Serializable {
    private String noNotice;

    private boolean isChecked;

    private Object[] fields;

    public ListEntry() {
    }

    public ListEntry(
            String noNotice,
            boolean isChecked,
            Object[] fields) {
        this.noNotice = noNotice;
        this.isChecked = isChecked;
        this.fields = fields;
    }


    /**
     * Gets the noNotice value for this ListEntry.
     *
     * @return noNotice
     */
    public String getNoNotice() {
        return noNotice;
    }


    /**
     * Sets the noNotice value for this ListEntry.
     *
     * @param noNotice
     */
    public void setNoNotice(String noNotice) {
        this.noNotice = noNotice;
    }


    /**
     * Gets the isChecked value for this ListEntry.
     *
     * @return isChecked
     */
    public boolean isIsChecked() {
        return isChecked;
    }


    /**
     * Sets the isChecked value for this ListEntry.
     *
     * @param isChecked
     */
    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }


    /**
     * Gets the fields value for this ListEntry.
     *
     * @return fields
     */
    public Object[] getFields() {
        return fields;
    }


    /**
     * Sets the fields value for this ListEntry.
     *
     * @param fields
     */
    public void setFields(Object[] fields) {
        this.fields = fields;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ListEntry)) return false;
        ListEntry other = (ListEntry) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.noNotice == null && other.getNoNotice() == null) ||
                        (this.noNotice != null &&
                                this.noNotice.equals(other.getNoNotice()))) &&
                this.isChecked == other.isIsChecked() &&
                ((this.fields == null && other.getFields() == null) ||
                        (this.fields != null &&
                                java.util.Arrays.equals(this.fields, other.getFields())));
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
        if (getNoNotice() != null) {
            _hashCode += getNoNotice().hashCode();
        }
        _hashCode += (isIsChecked() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getFields() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getFields());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getFields(), i);
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
            new org.apache.axis.description.TypeDesc(ListEntry.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ListEntry"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noNotice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noNotice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isChecked");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isChecked"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fields");
        elemField.setXmlName(new javax.xml.namespace.QName("", "fields"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "anyType"));
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
