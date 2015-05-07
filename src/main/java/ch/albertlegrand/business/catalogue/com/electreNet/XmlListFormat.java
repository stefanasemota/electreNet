/**
 * XmlListFormat.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class XmlListFormat implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected XmlListFormat(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _FormatNotice = "FormatNotice";
    public static final String _FormatList = "FormatList";
    public static final String _FormatOnix = "FormatOnix";
    public static final XmlListFormat FormatNotice = new XmlListFormat(_FormatNotice);
    public static final XmlListFormat FormatList = new XmlListFormat(_FormatList);
    public static final XmlListFormat FormatOnix = new XmlListFormat(_FormatOnix);

    public String getValue() {
        return _value_;
    }

    public static XmlListFormat fromValue(String value)
            throws IllegalArgumentException {
        XmlListFormat enumeration = (XmlListFormat)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static XmlListFormat fromString(String value)
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
            new org.apache.axis.description.TypeDesc(XmlListFormat.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "XmlListFormat"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
