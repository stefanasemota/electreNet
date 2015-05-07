/**
 * ListOption.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class ListOption implements java.io.Serializable {
    private String _value_;
    private static java.util.HashMap _table_ = new java.util.HashMap();

    // Constructor
    protected ListOption(String value) {
        _value_ = value;
        _table_.put(_value_, this);
    }

    public static final String _ListTitre = "ListTitre";
    public static final String _ListAuteur = "ListAuteur";
    public static final String _ListEditeur = "ListEditeur";
    public static final String _ListIsbn = "ListIsbn";
    public static final String _ListNoDansC = "ListNoDansC";
    public static final String _ListDatParut = "ListDatParut";
    public static final String _ListDisponibilite = "ListDisponibilite";
    public static final String _ListNivLect = "ListNivLect";
    public static final String _ListPrix = "ListPrix";
    public static final String _ListDevise = "ListDevise";
    public static final String _ListCollection = "ListCollection";
    public static final String _ListDewey = "ListDewey";
    public static final String _ListTheme = "ListTheme";
    public static final String _ListGenre = "ListGenre";
    public static final String _ListEan = "ListEan";
    public static final ListOption ListTitre = new ListOption(_ListTitre);
    public static final ListOption ListAuteur = new ListOption(_ListAuteur);
    public static final ListOption ListEditeur = new ListOption(_ListEditeur);
    public static final ListOption ListIsbn = new ListOption(_ListIsbn);
    public static final ListOption ListNoDansC = new ListOption(_ListNoDansC);
    public static final ListOption ListDatParut = new ListOption(_ListDatParut);
    public static final ListOption ListDisponibilite = new ListOption(_ListDisponibilite);
    public static final ListOption ListNivLect = new ListOption(_ListNivLect);
    public static final ListOption ListPrix = new ListOption(_ListPrix);
    public static final ListOption ListDevise = new ListOption(_ListDevise);
    public static final ListOption ListCollection = new ListOption(_ListCollection);
    public static final ListOption ListDewey = new ListOption(_ListDewey);
    public static final ListOption ListTheme = new ListOption(_ListTheme);
    public static final ListOption ListGenre = new ListOption(_ListGenre);
    public static final ListOption ListEan = new ListOption(_ListEan);

    public ListOption() {
    }

    public String getValue() {
        return _value_;
    }

    public static ListOption fromValue(String value)
            throws IllegalArgumentException {
        ListOption enumeration = (ListOption)
                _table_.get(value);
        if (enumeration == null) throw new IllegalArgumentException();
        return enumeration;
    }

    public static ListOption fromString(String value)
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
            new org.apache.axis.description.TypeDesc(ListOption.class);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ListOption"));
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

}
