/**
 * Fiction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class Fiction implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected Fiction(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _NonFiction = "NonFiction";
    public static final String _Fiction = "Fiction";
    public static final String _Tout = "Tout";
    public static final Fiction NonFiction = new Fiction(_NonFiction);
    public static final Fiction Fiction = new Fiction(_Fiction);
    public static final Fiction Tout = new Fiction(_Tout);

    public String getValue() {
        return _value_;
    }

    public static Fiction fromValue(String value)
            throws IllegalArgumentException {
        Fiction enumeration = (Fiction)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static Fiction fromString(String value)
            throws IllegalArgumentException {
        return fromValue(value);
    }

    public boolean equals(Object obj) {
        return (obj == this);
    }

    public int hashCode() {
        return toString().hashCode();
    }

    public String toString() {
        return _value_;
    }

    public Object readResolve() throws java.io.ObjectStreamException {
        return fromValue(_value_);
    }

    public static org.apache.axis.encoding.Serializer getSerializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumSerializer(
                        _javaType, _xmlType);
    }

    public static org.apache.axis.encoding.Deserializer getDeserializer(
            String mechType,
            Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.EnumDeserializer(
                        _javaType, _xmlType);
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Fiction.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "Fiction"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
