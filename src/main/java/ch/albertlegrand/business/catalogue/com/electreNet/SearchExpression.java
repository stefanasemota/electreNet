/**
 * SearchExpression.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SearchExpression implements java.io.Serializable {
    private String expression;

    private boolean phonetic;

    private boolean inflections;

    public SearchExpression() {
    }

    public SearchExpression(
            String expression,
            boolean phonetic,
            boolean inflections) {
        this.expression = expression;
        this.phonetic = phonetic;
        this.inflections = inflections;
    }


    /**
     * Gets the expression value for this SearchExpression.
     *
     * @return expression
     */
    public String getExpression() {
        return expression;
    }


    /**
     * Sets the expression value for this SearchExpression.
     *
     * @param expression
     */
    public void setExpression(String expression) {
        this.expression = expression;
    }


    /**
     * Gets the phonetic value for this SearchExpression.
     *
     * @return phonetic
     */
    public boolean isPhonetic() {
        return phonetic;
    }


    /**
     * Sets the phonetic value for this SearchExpression.
     *
     * @param phonetic
     */
    public void setPhonetic(boolean phonetic) {
        this.phonetic = phonetic;
    }


    /**
     * Gets the inflections value for this SearchExpression.
     *
     * @return inflections
     */
    public boolean isInflections() {
        return inflections;
    }


    /**
     * Sets the inflections value for this SearchExpression.
     *
     * @param inflections
     */
    public void setInflections(boolean inflections) {
        this.inflections = inflections;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SearchExpression)) return false;
        SearchExpression other = (SearchExpression) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.expression == null && other.getExpression() == null) ||
                        (this.expression != null &&
                                this.expression.equals(other.getExpression()))) &&
                this.phonetic == other.isPhonetic() &&
                this.inflections == other.isInflections();
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
        if (getExpression() != null) {
            _hashCode += getExpression().hashCode();
        }
        _hashCode += (isPhonetic() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isInflections() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(SearchExpression.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expression");
        elemField.setXmlName(new javax.xml.namespace.QName("", "expression"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("phonetic");
        elemField.setXmlName(new javax.xml.namespace.QName("", "phonetic"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("inflections");
        elemField.setXmlName(new javax.xml.namespace.QName("", "inflections"));
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
