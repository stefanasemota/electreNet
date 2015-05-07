/**
 * ElementsNewsLetterLH.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet.literalTypes;

public class ElementsNewsLetterLH implements java.io.Serializable {
    private String noNotice;

    private String titre;

    private String auteur;

    private String editeur;

    private String ean;

    private String isbn;

    private boolean imagette;

    private boolean image;

    private double prixTTC;

    private String resume;

    public ElementsNewsLetterLH() {
    }

    public ElementsNewsLetterLH(
            String noNotice,
            String titre,
            String auteur,
            String editeur,
            String ean,
            String isbn,
            boolean imagette,
            boolean image,
            double prixTTC,
            String resume) {
        this.noNotice = noNotice;
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.ean = ean;
        this.isbn = isbn;
        this.imagette = imagette;
        this.image = image;
        this.prixTTC = prixTTC;
        this.resume = resume;
    }


    /**
     * Gets the noNotice value for this ElementsNewsLetterLH.
     *
     * @return noNotice
     */
    public String getNoNotice() {
        return noNotice;
    }


    /**
     * Sets the noNotice value for this ElementsNewsLetterLH.
     *
     * @param noNotice
     */
    public void setNoNotice(String noNotice) {
        this.noNotice = noNotice;
    }


    /**
     * Gets the titre value for this ElementsNewsLetterLH.
     *
     * @return titre
     */
    public String getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this ElementsNewsLetterLH.
     *
     * @param titre
     */
    public void setTitre(String titre) {
        this.titre = titre;
    }


    /**
     * Gets the auteur value for this ElementsNewsLetterLH.
     *
     * @return auteur
     */
    public String getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this ElementsNewsLetterLH.
     *
     * @param auteur
     */
    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the editeur value for this ElementsNewsLetterLH.
     *
     * @return editeur
     */
    public String getEditeur() {
        return editeur;
    }


    /**
     * Sets the editeur value for this ElementsNewsLetterLH.
     *
     * @param editeur
     */
    public void setEditeur(String editeur) {
        this.editeur = editeur;
    }


    /**
     * Gets the ean value for this ElementsNewsLetterLH.
     *
     * @return ean
     */
    public String getEan() {
        return ean;
    }


    /**
     * Sets the ean value for this ElementsNewsLetterLH.
     *
     * @param ean
     */
    public void setEan(String ean) {
        this.ean = ean;
    }


    /**
     * Gets the isbn value for this ElementsNewsLetterLH.
     *
     * @return isbn
     */
    public String getIsbn() {
        return isbn;
    }


    /**
     * Sets the isbn value for this ElementsNewsLetterLH.
     *
     * @param isbn
     */
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }


    /**
     * Gets the imagette value for this ElementsNewsLetterLH.
     *
     * @return imagette
     */
    public boolean isImagette() {
        return imagette;
    }


    /**
     * Sets the imagette value for this ElementsNewsLetterLH.
     *
     * @param imagette
     */
    public void setImagette(boolean imagette) {
        this.imagette = imagette;
    }


    /**
     * Gets the image value for this ElementsNewsLetterLH.
     *
     * @return image
     */
    public boolean isImage() {
        return image;
    }


    /**
     * Sets the image value for this ElementsNewsLetterLH.
     *
     * @param image
     */
    public void setImage(boolean image) {
        this.image = image;
    }


    /**
     * Gets the prixTTC value for this ElementsNewsLetterLH.
     *
     * @return prixTTC
     */
    public double getPrixTTC() {
        return prixTTC;
    }


    /**
     * Sets the prixTTC value for this ElementsNewsLetterLH.
     *
     * @param prixTTC
     */
    public void setPrixTTC(double prixTTC) {
        this.prixTTC = prixTTC;
    }


    /**
     * Gets the resume value for this ElementsNewsLetterLH.
     *
     * @return resume
     */
    public String getResume() {
        return resume;
    }


    /**
     * Sets the resume value for this ElementsNewsLetterLH.
     *
     * @param resume
     */
    public void setResume(String resume) {
        this.resume = resume;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ElementsNewsLetterLH)) return false;
        ElementsNewsLetterLH other = (ElementsNewsLetterLH) obj;
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
                ((this.titre == null && other.getTitre() == null) ||
                        (this.titre != null &&
                                this.titre.equals(other.getTitre()))) &&
                ((this.auteur == null && other.getAuteur() == null) ||
                        (this.auteur != null &&
                                this.auteur.equals(other.getAuteur()))) &&
                ((this.editeur == null && other.getEditeur() == null) ||
                        (this.editeur != null &&
                                this.editeur.equals(other.getEditeur()))) &&
                ((this.ean == null && other.getEan() == null) ||
                        (this.ean != null &&
                                this.ean.equals(other.getEan()))) &&
                ((this.isbn == null && other.getIsbn() == null) ||
                        (this.isbn != null &&
                                this.isbn.equals(other.getIsbn()))) &&
                this.imagette == other.isImagette() &&
                this.image == other.isImage() &&
                this.prixTTC == other.getPrixTTC() &&
                ((this.resume == null && other.getResume() == null) ||
                        (this.resume != null &&
                                this.resume.equals(other.getResume())));
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
        if (getTitre() != null) {
            _hashCode += getTitre().hashCode();
        }
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        if (getEditeur() != null) {
            _hashCode += getEditeur().hashCode();
        }
        if (getEan() != null) {
            _hashCode += getEan().hashCode();
        }
        if (getIsbn() != null) {
            _hashCode += getIsbn().hashCode();
        }
        _hashCode += (isImagette() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (isImage() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += new Double(getPrixTTC()).hashCode();
        if (getResume() != null) {
            _hashCode += getResume().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(ElementsNewsLetterLH.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ElementsNewsLetterLH"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("noNotice");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "noNotice"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titre");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "titre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editeur");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "editeur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ean");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ean"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbn");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "isbn"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("imagette");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "imagette"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("image");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "image"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prixTTC");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "prixTTC"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resume");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "resume"));
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
