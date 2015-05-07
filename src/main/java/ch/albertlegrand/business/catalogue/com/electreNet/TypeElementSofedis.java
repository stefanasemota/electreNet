/**
 * TypeElementSofedis.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class TypeElementSofedis implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected TypeElementSofedis(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _Argumentaire = "Argumentaire";
    public static final String _Couverture = "Couverture";
    public static final String _Sommaire = "Sommaire";
    public static final String _BonnesFeuilles = "BonnesFeuilles";
    public static final String _PlaquettePromotionelle = "PlaquettePromotionelle";
    public static final String _PlanMedias = "PlanMedias";
    public static final String _ArticleDePresse = "ArticleDePresse";
    public static final String _Audio = "Audio";
    public static final String _Video = "Video";
    public static final TypeElementSofedis Argumentaire = new TypeElementSofedis(_Argumentaire);
    public static final TypeElementSofedis Couverture = new TypeElementSofedis(_Couverture);
    public static final TypeElementSofedis Sommaire = new TypeElementSofedis(_Sommaire);
    public static final TypeElementSofedis BonnesFeuilles = new TypeElementSofedis(_BonnesFeuilles);
    public static final TypeElementSofedis PlaquettePromotionelle = new TypeElementSofedis(_PlaquettePromotionelle);
    public static final TypeElementSofedis PlanMedias = new TypeElementSofedis(_PlanMedias);
    public static final TypeElementSofedis ArticleDePresse = new TypeElementSofedis(_ArticleDePresse);
    public static final TypeElementSofedis Audio = new TypeElementSofedis(_Audio);
    public static final TypeElementSofedis Video = new TypeElementSofedis(_Video);

    public String getValue() {
        return _value_;
    }

    public static TypeElementSofedis fromValue(String value)
            throws IllegalArgumentException {
        TypeElementSofedis enumeration = (TypeElementSofedis)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static TypeElementSofedis fromString(String value)
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
            new org.apache.axis.description.TypeDesc(TypeElementSofedis.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "TypeElementSofedis"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
