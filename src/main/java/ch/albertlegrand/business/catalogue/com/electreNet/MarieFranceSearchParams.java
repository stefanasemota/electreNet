/**
 * MarieFranceSearchParams.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet;

public class MarieFranceSearchParams implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression rapide;

    private ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression vedetteMatiere;

    public MarieFranceSearchParams() {
    }

    public MarieFranceSearchParams(
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression rapide,
            ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression vedetteMatiere) {
        this.titre = titre;
        this.auteur = auteur;
        this.rapide = rapide;
        this.vedetteMatiere = vedetteMatiere;
    }


    /**
     * Gets the titre value for this MarieFranceSearchParams.
     *
     * @return titre
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getTitre() {
        return titre;
    }


    /**
     * Sets the titre value for this MarieFranceSearchParams.
     *
     * @param titre
     */
    public void setTitre(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression titre) {
        this.titre = titre;
    }


    /**
     * Gets the auteur value for this MarieFranceSearchParams.
     *
     * @return auteur
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getAuteur() {
        return auteur;
    }


    /**
     * Sets the auteur value for this MarieFranceSearchParams.
     *
     * @param auteur
     */
    public void setAuteur(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression auteur) {
        this.auteur = auteur;
    }


    /**
     * Gets the rapide value for this MarieFranceSearchParams.
     *
     * @return rapide
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getRapide() {
        return rapide;
    }


    /**
     * Sets the rapide value for this MarieFranceSearchParams.
     *
     * @param rapide
     */
    public void setRapide(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression rapide) {
        this.rapide = rapide;
    }


    /**
     * Gets the vedetteMatiere value for this MarieFranceSearchParams.
     *
     * @return vedetteMatiere
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression getVedetteMatiere() {
        return vedetteMatiere;
    }


    /**
     * Sets the vedetteMatiere value for this MarieFranceSearchParams.
     *
     * @param vedetteMatiere
     */
    public void setVedetteMatiere(ch.albertlegrand.business.catalogue.com.electreNet.SearchExpression vedetteMatiere) {
        this.vedetteMatiere = vedetteMatiere;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MarieFranceSearchParams)) return false;
        MarieFranceSearchParams other = (MarieFranceSearchParams) obj;
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
                ((this.rapide == null && other.getRapide() == null) ||
                        (this.rapide != null &&
                                this.rapide.equals(other.getRapide()))) &&
                ((this.vedetteMatiere == null && other.getVedetteMatiere() == null) ||
                        (this.vedetteMatiere != null &&
                                this.vedetteMatiere.equals(other.getVedetteMatiere())));
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
        if (getRapide() != null) {
            _hashCode += getRapide().hashCode();
        }
        if (getVedetteMatiere() != null) {
            _hashCode += getVedetteMatiere().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(MarieFranceSearchParams.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "MarieFranceSearchParams"));
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
        elemField.setFieldName("rapide");
        elemField.setXmlName(new javax.xml.namespace.QName("", "rapide"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/", "SearchExpression"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("vedetteMatiere");
        elemField.setXmlName(new javax.xml.namespace.QName("", "vedetteMatiere"));
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
