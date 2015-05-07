/**
 * TRapideSearchAreaNull.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class TRapideSearchAreaNull implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TRapideSearchAreaNull(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _SEARCHAREA_TITRE = "SEARCHAREA_TITRE";
    public static final String _SEARCHAREA_VEDETTE_MATIERE = "SEARCHAREA_VEDETTE_MATIERE";
    public static final String _SEARCHAREA_DEWEY = "SEARCHAREA_DEWEY";
    public static final String _SEARCHAREA_THEME = "SEARCHAREA_THEME";
    public static final String _SEARCHAREA_GENRE = "SEARCHAREA_GENRE";
    public static final String _SEARCHAREA_RESUME = "SEARCHAREA_RESUME";
    public static final String _SEARCHAREA_LEX = "SEARCHAREA_LEX";
    public static final String _SEARCHAREA_AUTEUR = "SEARCHAREA_AUTEUR";
    public static final String _SEARCHAREA_EDITEUR = "SEARCHAREA_EDITEUR";
    public static final String _SEARCHAREA_COLLECTION = "SEARCHAREA_COLLECTION";
    public static final String _SEARCHAREA_TDM = "SEARCHAREA_TDM";
    public static final String _SEARCHAREA_MENTRESP = "SEARCHAREA_MENTRESP";
    public static final String _SEARCHAREA_RAPIDE = "SEARCHAREA_RAPIDE";
    public static final TRapideSearchAreaNull SEARCHAREA_TITRE = new TRapideSearchAreaNull(_SEARCHAREA_TITRE);
    public static final TRapideSearchAreaNull SEARCHAREA_VEDETTE_MATIERE = new TRapideSearchAreaNull(_SEARCHAREA_VEDETTE_MATIERE);
    public static final TRapideSearchAreaNull SEARCHAREA_DEWEY = new TRapideSearchAreaNull(_SEARCHAREA_DEWEY);
    public static final TRapideSearchAreaNull SEARCHAREA_THEME = new TRapideSearchAreaNull(_SEARCHAREA_THEME);
    public static final TRapideSearchAreaNull SEARCHAREA_GENRE = new TRapideSearchAreaNull(_SEARCHAREA_GENRE);
    public static final TRapideSearchAreaNull SEARCHAREA_RESUME = new TRapideSearchAreaNull(_SEARCHAREA_RESUME);
    public static final TRapideSearchAreaNull SEARCHAREA_LEX = new TRapideSearchAreaNull(_SEARCHAREA_LEX);
    public static final TRapideSearchAreaNull SEARCHAREA_AUTEUR = new TRapideSearchAreaNull(_SEARCHAREA_AUTEUR);
    public static final TRapideSearchAreaNull SEARCHAREA_EDITEUR = new TRapideSearchAreaNull(_SEARCHAREA_EDITEUR);
    public static final TRapideSearchAreaNull SEARCHAREA_COLLECTION = new TRapideSearchAreaNull(_SEARCHAREA_COLLECTION);
    public static final TRapideSearchAreaNull SEARCHAREA_TDM = new TRapideSearchAreaNull(_SEARCHAREA_TDM);
    public static final TRapideSearchAreaNull SEARCHAREA_MENTRESP = new TRapideSearchAreaNull(_SEARCHAREA_MENTRESP);
    public static final TRapideSearchAreaNull SEARCHAREA_RAPIDE = new TRapideSearchAreaNull(_SEARCHAREA_RAPIDE);

    public String getValue() {
        return _value_;
    }

    public static TRapideSearchAreaNull fromValue(String value)
            throws IllegalArgumentException {
        TRapideSearchAreaNull enumeration = (TRapideSearchAreaNull)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static TRapideSearchAreaNull fromString(String value)
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
            new org.apache.axis.description.TypeDesc(TRapideSearchAreaNull.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TRapideSearchArea>null"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
