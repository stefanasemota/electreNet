/**
 * MollatSearchParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class MollatSearchParams implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression editeur;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression collection;

    private String[] isbnEan;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression[] champ;

    public MollatSearchParams() {
    }

    public MollatSearchParams(
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression editeur,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression collection,
            String[] isbnEan,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression[] champ) {
        this.titre = titre;
        this.auteur = auteur;
        this.editeur = editeur;
        this.collection = collection;
        this.isbnEan = isbnEan;
        this.champ = champ;
    }


    /**
     * Gets the titre value for this MollatSearchParams.
     *
     * @return titre
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this MollatSearchParams.
     *
     * @param titre
     */
    public void setTitre(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre) {
        this.titre = titre;
    }


    /**
     * Gets the auteur value for this MollatSearchParams.
     *
     * @return auteur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this MollatSearchParams.
     *
     * @param auteur
     */
    public void setAuteur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the editeur value for this MollatSearchParams.
     *
     * @return editeur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getEditeur() {
        return editeur;
    }


    /**
     * Sets the editeur value for this MollatSearchParams.
     *
     * @param editeur
     */
    public void setEditeur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression editeur) {
        this.editeur = editeur;
    }


    /**
     * Gets the collection value for this MollatSearchParams.
     *
     * @return collection
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getCollection() {
        return collection;
    }


    /**
     * Sets the collection value for this MollatSearchParams.
     *
     * @param collection
     */
    public void setCollection(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression collection) {
        this.collection = collection;
    }


    /**
     * Gets the isbnEan value for this MollatSearchParams.
     *
     * @return isbnEan
     */
    public String[] getIsbnEan() {
        return isbnEan;
    }


    /**
     * Sets the isbnEan value for this MollatSearchParams.
     *
     * @param isbnEan
     */
    public void setIsbnEan(String[] isbnEan) {
        this.isbnEan = isbnEan;
    }


    /**
     * Gets the champ value for this MollatSearchParams.
     *
     * @return champ
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression[] getChamp() {
        return champ;
    }


    /**
     * Sets the champ value for this MollatSearchParams.
     *
     * @param champ
     */
    public void setChamp(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression[] champ) {
        this.champ = champ;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MollatSearchParams)) return false;
        MollatSearchParams other = (MollatSearchParams) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.titre == null && other.getTitre() == null) ||
                        (this.titre != null &&
                                this.titre.equals(other.getTitre()))) &&
                ((this.auteur == null && other.getAuteur() == null) ||
                        (this.auteur != null &&
                                this.auteur.equals(other.getAuteur()))) &&
                ((this.editeur == null && other.getEditeur() == null) ||
                        (this.editeur != null &&
                                this.editeur.equals(other.getEditeur()))) &&
                ((this.collection == null && other.getCollection() == null) ||
                        (this.collection != null &&
                                this.collection.equals(other.getCollection()))) &&
                ((this.isbnEan == null && other.getIsbnEan() == null) ||
                        (this.isbnEan != null &&
                                java.util.Arrays.equals(this.isbnEan, other.getIsbnEan()))) &&
                ((this.champ == null && other.getChamp() == null) ||
                        (this.champ != null &&
                                java.util.Arrays.equals(this.champ, other.getChamp())));
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
        if (getTitre() != null) {
            _hashCode += getTitre().hashCode();
        }
        if (getAuteur() != null) {
            _hashCode += getAuteur().hashCode();
        }
        if (getEditeur() != null) {
            _hashCode += getEditeur().hashCode();
        }
        if (getCollection() != null) {
            _hashCode += getCollection().hashCode();
        }
        if (getIsbnEan() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getIsbnEan());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIsbnEan(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getChamp() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getChamp());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getChamp(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MollatSearchParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MollatSearchParams"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("titre");
        elemField.setXmlName(new javax.xml.namespace.QName("", "titre"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("auteur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "auteur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("editeur");
        elemField.setXmlName(new javax.xml.namespace.QName("", "editeur"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("collection");
        elemField.setXmlName(new javax.xml.namespace.QName("", "collection"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isbnEan");
        elemField.setXmlName(new javax.xml.namespace.QName("", "isbnEan"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("champ");
        elemField.setXmlName(new javax.xml.namespace.QName("", "champ"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
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
