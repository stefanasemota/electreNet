/**
 * TypeLiaison.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet.literalTypes;

public class TypeLiaison implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TypeLiaison(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _TYPE_INCONNU = "TYPE_INCONNU";
    public static final String _TELEPHONE = "TELEPHONE";
    public static final String _TELEX = "TELEX";
    public static final String _TELECOPIE = "TELECOPIE";
    public static final String _SIRET = "SIRET";
    public static final String _MINITEL = "MINITEL";
    public static final String _EMAIL = "EMAIL";
    public static final String _SERVEUR_INTERNET = "SERVEUR_INTERNET";
    public static final String _GSM = "GSM";
    public static final TypeLiaison TYPE_INCONNU = new TypeLiaison(_TYPE_INCONNU);
    public static final TypeLiaison TELEPHONE = new TypeLiaison(_TELEPHONE);
    public static final TypeLiaison TELEX = new TypeLiaison(_TELEX);
    public static final TypeLiaison TELECOPIE = new TypeLiaison(_TELECOPIE);
    public static final TypeLiaison SIRET = new TypeLiaison(_SIRET);
    public static final TypeLiaison MINITEL = new TypeLiaison(_MINITEL);
    public static final TypeLiaison EMAIL = new TypeLiaison(_EMAIL);
    public static final TypeLiaison SERVEUR_INTERNET = new TypeLiaison(_SERVEUR_INTERNET);
    public static final TypeLiaison GSM = new TypeLiaison(_GSM);

    public String getValue() {
        return _value_;
    }

    public static TypeLiaison fromValue(String value)
            throws IllegalArgumentException {
        TypeLiaison enumeration = (TypeLiaison)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static TypeLiaison fromString(String value)
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
            new org.apache.axis.description.TypeDesc(TypeLiaison.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TypeLiaison"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
