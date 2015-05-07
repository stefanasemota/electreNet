/**
 * TypeAdresse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet.literalTypes;

public class TypeAdresse implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TypeAdresse(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _TYPE_INCONNU = "TYPE_INCONNU";
    public static final String _BUREAU_PARISIEN = "BUREAU_PARISIEN";
    public static final String _BUREAU = "BUREAU";
    public static final String _DIRECTION_GENERALE = "DIRECTION_GENERALE";
    public static final String _SIEGE_SOCIAL = "SIEGE_SOCIAL";
    public static final String _SIEGE_ADMINISTATIF = "SIEGE_ADMINISTATIF";
    public static final String _SUCCURSALE = "SUCCURSALE";
    public static final String _SECRETARIAT_GENERAL = "SECRETARIAT_GENERAL";
    public static final String _SERVICE_COMMERCIAL = "SERVICE_COMMERCIAL";
    public static final String _SERVICE_TECHNIQUE = "SERVICE_TECHNIQUE";
    public static final String _REDACTION = "REDACTION";
    public static final String _SERVICE_DES_PUBLICATIONS = "SERVICE_DES_PUBLICATIONS";
    public static final String _SERVICE_DE_PRESSE = "SERVICE_DE_PRESSE";
    public static final String _SERVICE_DE_PUBLICITE = "SERVICE_DE_PUBLICITE";
    public static final String _SERVICE_ISBN = "SERVICE_ISBN";
    public static final String _ADRESSE_POSTALE = "ADRESSE_POSTALE";
    public static final String _VENTE = "VENTE";
    public static final String _RETOURS = "RETOURS";
    public static final String _ENTREPOT = "ENTREPOT";
    public static final String _VENTE_AUX_LIBRAIRES = "VENTE_AUX_LIBRAIRES";
    public static final String _VENTE_PAR_CORRESPONDANCE = "VENTE_PAR_CORRESPONDANCE";
    public static final String _DIRECTION = "DIRECTION";
    public static final String _ADRESSE_EN_FRANCE = "ADRESSE_EN_FRANCE";
    public static final String _ADRESSE_A_L_ETRANGER = "ADRESSE_A_L_ETRANGER";
    public static final TypeAdresse TYPE_INCONNU = new TypeAdresse(_TYPE_INCONNU);
    public static final TypeAdresse BUREAU_PARISIEN = new TypeAdresse(_BUREAU_PARISIEN);
    public static final TypeAdresse BUREAU = new TypeAdresse(_BUREAU);
    public static final TypeAdresse DIRECTION_GENERALE = new TypeAdresse(_DIRECTION_GENERALE);
    public static final TypeAdresse SIEGE_SOCIAL = new TypeAdresse(_SIEGE_SOCIAL);
    public static final TypeAdresse SIEGE_ADMINISTATIF = new TypeAdresse(_SIEGE_ADMINISTATIF);
    public static final TypeAdresse SUCCURSALE = new TypeAdresse(_SUCCURSALE);
    public static final TypeAdresse SECRETARIAT_GENERAL = new TypeAdresse(_SECRETARIAT_GENERAL);
    public static final TypeAdresse SERVICE_COMMERCIAL = new TypeAdresse(_SERVICE_COMMERCIAL);
    public static final TypeAdresse SERVICE_TECHNIQUE = new TypeAdresse(_SERVICE_TECHNIQUE);
    public static final TypeAdresse REDACTION = new TypeAdresse(_REDACTION);
    public static final TypeAdresse SERVICE_DES_PUBLICATIONS = new TypeAdresse(_SERVICE_DES_PUBLICATIONS);
    public static final TypeAdresse SERVICE_DE_PRESSE = new TypeAdresse(_SERVICE_DE_PRESSE);
    public static final TypeAdresse SERVICE_DE_PUBLICITE = new TypeAdresse(_SERVICE_DE_PUBLICITE);
    public static final TypeAdresse SERVICE_ISBN = new TypeAdresse(_SERVICE_ISBN);
    public static final TypeAdresse ADRESSE_POSTALE = new TypeAdresse(_ADRESSE_POSTALE);
    public static final TypeAdresse VENTE = new TypeAdresse(_VENTE);
    public static final TypeAdresse RETOURS = new TypeAdresse(_RETOURS);
    public static final TypeAdresse ENTREPOT = new TypeAdresse(_ENTREPOT);
    public static final TypeAdresse VENTE_AUX_LIBRAIRES = new TypeAdresse(_VENTE_AUX_LIBRAIRES);
    public static final TypeAdresse VENTE_PAR_CORRESPONDANCE = new TypeAdresse(_VENTE_PAR_CORRESPONDANCE);
    public static final TypeAdresse DIRECTION = new TypeAdresse(_DIRECTION);
    public static final TypeAdresse ADRESSE_EN_FRANCE = new TypeAdresse(_ADRESSE_EN_FRANCE);
    public static final TypeAdresse ADRESSE_A_L_ETRANGER = new TypeAdresse(_ADRESSE_A_L_ETRANGER);

    public String getValue() {
        return _value_;
    }

    public static TypeAdresse fromValue(String value)
            throws IllegalArgumentException {
        TypeAdresse enumeration = (TypeAdresse)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static TypeAdresse fromString(String value)
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
            new org.apache.axis.description.TypeDesc(TypeAdresse.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TypeAdresse"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
