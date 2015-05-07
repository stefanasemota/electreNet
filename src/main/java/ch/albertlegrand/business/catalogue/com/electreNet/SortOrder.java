/**
 * SortOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class SortOrder implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected SortOrder(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _SortTitre = "SortTitre";
    public static final String _SortAuteur = "SortAuteur";
    public static final String _SortEditeur = "SortEditeur";
    public static final String _SortPrix = "SortPrix";
    public static final String _SortIsbn = "SortIsbn";
    public static final String _SortCollection = "SortCollection";
    public static final String _SortNoDansC = "SortNoDansC";
    public static final String _SortDatParut = "SortDatParut";
    public static final String _SortTheme = "SortTheme";
    public static final String _SortGenre = "SortGenre";
    public static final String _SortDewey = "SortDewey";
    public static final String _SortPublic = "SortPublic";
    public static final String _SortImagette = "SortImagette";
    public static final SortOrder SortTitre = new SortOrder(_SortTitre);
    public static final SortOrder SortAuteur = new SortOrder(_SortAuteur);
    public static final SortOrder SortEditeur = new SortOrder(_SortEditeur);
    public static final SortOrder SortPrix = new SortOrder(_SortPrix);
    public static final SortOrder SortIsbn = new SortOrder(_SortIsbn);
    public static final SortOrder SortCollection = new SortOrder(_SortCollection);
    public static final SortOrder SortNoDansC = new SortOrder(_SortNoDansC);
    public static final SortOrder SortDatParut = new SortOrder(_SortDatParut);
    public static final SortOrder SortTheme = new SortOrder(_SortTheme);
    public static final SortOrder SortGenre = new SortOrder(_SortGenre);
    public static final SortOrder SortDewey = new SortOrder(_SortDewey);
    public static final SortOrder SortPublic = new SortOrder(_SortPublic);
    public static final SortOrder SortImagette = new SortOrder(_SortImagette);

    public String getValue() {
        return _value_;
    }

    public static SortOrder fromValue(String value)
            throws IllegalArgumentException {
        SortOrder enumeration = (SortOrder)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static SortOrder fromString(String value)
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
            new org.apache.axis.description.TypeDesc(SortOrder.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SortOrder"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
