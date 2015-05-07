/**
 * ElementsAsso.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class ElementsAsso implements java.io.Serializable {
    private String noNotice;

    private String ean;

    private String isbn;

    private boolean bio;

    private boolean imagette;

    private boolean image;

    private boolean tdm;

    private boolean argument;

    private String eanRecherche;

    private String isbnRecherche;

    public ElementsAsso() {
    }

    public ElementsAsso(
            String noNotice,
            String ean,
            String isbn,
            boolean bio,
            boolean imagette,
            boolean image,
            boolean tdm,
            boolean argument,
            String eanRecherche,
            String isbnRecherche) {
        this.noNotice = noNotice;
        this.ean = ean;
        this.isbn = isbn;
        this.bio = bio;
        this.imagette = imagette;
        this.image = image;
        this.tdm = tdm;
        this.argument = argument;
        this.eanRecherche = eanRecherche;
        this.isbnRecherche = isbnRecherche;
    }


    /**
     * Gets the noNotice value for this ElementsAsso.
     *
     * @return noNotice
     */
    public String getNoNotice() {
        return noNotice;
    }


    /**
     * Sets the noNotice value for this ElementsAsso.
     *
     * @param noNotice
     */
    public void setNoNotice(String noNotice) {
        this.noNotice = noNotice;
    }


    /**
     * Gets the ean value for this ElementsAsso.
     *
     * @return ean
     */
    public String getEan() {
        return ean;
    }


    /**
     * Sets the ean value for this ElementsAsso.
     *
     * @param ean
     */
    public void setEan(String ean) {
        this.ean = ean;
    }


    /**
     * Gets the isbn value for this ElementsAsso.
     *
     * @return isbn
     */
    public String getIsbn() {
        return isbn;
    }


    /**
     * Sets the isbn value for this ElementsAsso.
     *
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    /**
     * Gets the bio value for this ElementsAsso.
     *
     * @return bio
     */
    public boolean isBio() {
        return bio;
    }


    /**
     * Sets the bio value for this ElementsAsso.
     *
     * @param bio
     */
    public void setBio(boolean bio) {
        this.bio = bio;
    }


    /**
     * Gets the imagette value for this ElementsAsso.
     *
     * @return imagette
     */
    public boolean isImagette() {
        return imagette;
    }


    /**
     * Sets the imagette value for this ElementsAsso.
     *
     * @param imagette
     */
    public void setImagette(boolean imagette) {
        this.imagette = imagette;
    }


    /**
     * Gets the image value for this ElementsAsso.
     *
     * @return image
     */
    public boolean isImage() {
        return image;
    }


    /**
     * Sets the image value for this ElementsAsso.
     *
     * @param image
     */
    public void setImage(boolean image) {
        this.image = image;
    }


    /**
     * Gets the tdm value for this ElementsAsso.
     *
     * @return tdm
     */
    public boolean isTdm() {
        return tdm;
    }


    /**
     * Sets the tdm value for this ElementsAsso.
     *
     * @param tdm
     */
    public void setTdm(boolean tdm) {
        this.tdm = tdm;
    }


    /**
     * Gets the argument value for this ElementsAsso.
     *
     * @return argument
     */
    public boolean isArgument() {
        return argument;
    }


    /**
     * Sets the argument value for this ElementsAsso.
     *
     * @param argument
     */
    public void setArgument(boolean argument) {
        this.argument = argument;
    }


    /**
     * Gets the eanRecherche value for this ElementsAsso.
     *
     * @return eanRecherche
     */
    public String getEanRecherche() {
        return eanRecherche;
    }


    /**
     * Sets the eanRecherche value for this ElementsAsso.
     *
     * @param eanRecherche
     */
    public void setEanRecherche(String eanRecherche) {
        this.eanRecherche = eanRecherche;
    }


    /**
     * Gets the isbnRecherche value for this ElementsAsso.
     *
     * @return isbnRecherche
     */
    public String getIsbnRecherche() {
        return isbnRecherche;
    }


    /**
     * Sets the isbnRecherche value for this ElementsAsso.
     *
     * @param isbnRecherche
     */
    public void setIsbnRecherche(String isbnRecherche) {
        this.isbnRecherche = isbnRecherche;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ElementsAsso)) return false;
        ElementsAsso other = (ElementsAsso) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.noNotice == null && other.getNoNotice() == null) ||
                        (this.noNotice != null &&
                                this.noNotice.equals(other.getNoNotice()))) &&
                ((this.ean == null && other.getEan() == null) ||
                        (this.ean != null &&
                                this.ean.equals(other.getEan()))) &&
                ((this.isbn == null && other.getIsbn() == null) ||
                        (this.isbn != null &&
                                this.isbn.equals(other.getIsbn()))) &&
                this.bio == other.isBio() &&
                this.imagette == other.isImagette() &&
                this.image == other.isImage() &&
                this.tdm == other.isTdm() &&
                this.argument == other.isArgument() &&
                ((this.eanRecherche == null && other.getEanRecherche() == null) ||
                        (this.eanRecherche != null &&
                                this.eanRecherche.equals(other.getEanRecherche()))) &&
                ((this.isbnRecherche == null && other.getIsbnRecherche() == null) ||
                        (this.isbnRecherche != null &&
                                this.isbnRecherche.equals(other.getIsbnRecherche())));
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
        if (getNoNotice() != null) {
            _hashCode += getNoNotice().hashCode();
        }
        if (getEan() != null) {
            _hashCode += getEan().hashCode();
        }
        if (getIsbn() != null) {
            _hashCode += getIsbn().hashCode();
        }
        _hashCode += (isBio() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImagette() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isTdm() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isArgument() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEanRecherche() != null) {
            _hashCode += getEanRecherche().hashCode();
        }
        if (getIsbnRecherche() != null) {
            _hashCode += getIsbnRecherche().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ElementsAsso.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "ElementsAsso"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noNotice");
        elemField.setXmlName(new javax.xml.namespace.QName("", "noNotice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ean");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbn");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isbn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "bio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagette");
        elemField.setXmlName(new javax.xml.namespace.QName("", "imagette"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tdm");
        elemField.setXmlName(new javax.xml.namespace.QName("", "tdm"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("argument");
        elemField.setXmlName(new javax.xml.namespace.QName("", "argument"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("eanRecherche");
        elemField.setXmlName(new javax.xml.namespace.QName("", "eanRecherche"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbnRecherche");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isbnRecherche"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
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
