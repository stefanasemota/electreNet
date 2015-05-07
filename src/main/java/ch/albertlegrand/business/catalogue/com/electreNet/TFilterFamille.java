/**
 * TFilterFamille.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class TFilterFamille implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TFilterFamille(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _FILTERFAMILLE_LIVRE = "FILTERFAMILLE_LIVRE";
    public static final String _FILTERFAMILLE_NUMERIQUE = "FILTERFAMILLE_NUMERIQUE";
    public static final String _FILTERFAMILLE_CARTE = "FILTERFAMILLE_CARTE";
    public static final String _FILTERFAMILLE_ALL = "FILTERFAMILLE_ALL";
    public static final TFilterFamille FILTERFAMILLE_LIVRE = new TFilterFamille(_FILTERFAMILLE_LIVRE);
    public static final TFilterFamille FILTERFAMILLE_NUMERIQUE = new TFilterFamille(_FILTERFAMILLE_NUMERIQUE);
    public static final TFilterFamille FILTERFAMILLE_CARTE = new TFilterFamille(_FILTERFAMILLE_CARTE);
    public static final TFilterFamille FILTERFAMILLE_ALL = new TFilterFamille(_FILTERFAMILLE_ALL);

    public String getValue() {
        return _value_;
    }

    public static TFilterFamille fromValue(String value)
            throws IllegalArgumentException {
        TFilterFamille enumeration = (TFilterFamille)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static TFilterFamille fromString(String value)
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
            new org.apache.axis.description.TypeDesc(TFilterFamille.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TFilterFamille"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
