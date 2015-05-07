/**
 * Adresse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet.literalTypes;

public class Adresse implements java.io.Serializable {
    private ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TypeAdresse typAdresse;

    private String intitule;

    private String complement;

    private String num2Rue;

    private String typvoie;

    private String rue;

    private String codepost;

    private String ville;

    private String etatprov;

    private String pays;

    private ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.MoyenLiaison[] moyenLiaison;

    public Adresse() {
    }

    public Adresse(
            ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TypeAdresse typAdresse,
            String intitule,
            String complement,
            String num2Rue,
            String typvoie,
            String rue,
            String codepost,
            String ville,
            String etatprov,
            String pays,
            ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.MoyenLiaison[] moyenLiaison) {
        this.typAdresse = typAdresse;
        this.intitule = intitule;
        this.complement = complement;
        this.num2Rue = num2Rue;
        this.typvoie = typvoie;
        this.rue = rue;
        this.codepost = codepost;
        this.ville = ville;
        this.etatprov = etatprov;
        this.pays = pays;
        this.moyenLiaison = moyenLiaison;
    }


    /**
     * Gets the typAdresse value for this Adresse.
     *
     * @return typAdresse
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TypeAdresse getTypAdresse() {
        return typAdresse;
    }


    /**
     * Sets the typAdresse value for this Adresse.
     *
     * @param typAdresse
     */
    public void setTypAdresse(ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.TypeAdresse typAdresse) {
        this.typAdresse = typAdresse;
    }


    /**
     * Gets the intitule value for this Adresse.
     *
     * @return intitule
     */
    public String getIntitule() {
        return intitule;
    }


    /**
     * Sets the intitule value for this Adresse.
     *
     * @param intitule
     */
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }


    /**
     * Gets the complement value for this Adresse.
     *
     * @return complement
     */
    public String getComplement() {
        return complement;
    }


    /**
     * Sets the complement value for this Adresse.
     *
     * @param complement
     */
    public void setComplement(String complement) {
        this.complement = complement;
    }


    /**
     * Gets the num2Rue value for this Adresse.
     *
     * @return num2Rue
     */
    public String getNum2Rue() {
        return num2Rue;
    }


    /**
     * Sets the num2Rue value for this Adresse.
     *
     * @param num2Rue
     */
    public void setNum2Rue(String num2Rue) {
        this.num2Rue = num2Rue;
    }


    /**
     * Gets the typvoie value for this Adresse.
     *
     * @return typvoie
     */
    public String getTypvoie() {
        return typvoie;
    }


    /**
     * Sets the typvoie value for this Adresse.
     *
     * @param typvoie
     */
    public void setTypvoie(String typvoie) {
        this.typvoie = typvoie;
    }


    /**
     * Gets the rue value for this Adresse.
     *
     * @return rue
     */
    public String getRue() {
        return rue;
    }


    /**
     * Sets the rue value for this Adresse.
     *
     * @param rue
     */
    public void setRue(String rue) {
        this.rue = rue;
    }


    /**
     * Gets the codepost value for this Adresse.
     *
     * @return codepost
     */
    public String getCodepost() {
        return codepost;
    }


    /**
     * Sets the codepost value for this Adresse.
     *
     * @param codepost
     */
    public void setCodepost(String codepost) {
        this.codepost = codepost;
    }


    /**
     * Gets the ville value for this Adresse.
     *
     * @return ville
     */
    public String getVille() {
        return ville;
    }


    /**
     * Sets the ville value for this Adresse.
     *
     * @param ville
     */
    public void setVille(String ville) {
        this.ville = ville;
    }


    /**
     * Gets the etatprov value for this Adresse.
     *
     * @return etatprov
     */
    public String getEtatprov() {
        return etatprov;
    }


    /**
     * Sets the etatprov value for this Adresse.
     *
     * @param etatprov
     */
    public void setEtatprov(String etatprov) {
        this.etatprov = etatprov;
    }


    /**
     * Gets the pays value for this Adresse.
     *
     * @return pays
     */
    public String getPays() {
        return pays;
    }


    /**
     * Sets the pays value for this Adresse.
     *
     * @param pays
     */
    public void setPays(String pays) {
        this.pays = pays;
    }


    /**
     * Gets the moyenLiaison value for this Adresse.
     *
     * @return moyenLiaison
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.MoyenLiaison[] getMoyenLiaison() {
        return moyenLiaison;
    }


    /**
     * Sets the moyenLiaison value for this Adresse.
     *
     * @param moyenLiaison
     */
    public void setMoyenLiaison(ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.MoyenLiaison[] moyenLiaison) {
        this.moyenLiaison = moyenLiaison;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Adresse)) return false;
        Adresse other = (Adresse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.typAdresse == null && other.getTypAdresse() == null) ||
                        (this.typAdresse != null &&
                                this.typAdresse.equals(other.getTypAdresse()))) &&
                ((this.intitule == null && other.getIntitule() == null) ||
                        (this.intitule != null &&
                                this.intitule.equals(other.getIntitule()))) &&
                ((this.complement == null && other.getComplement() == null) ||
                        (this.complement != null &&
                                this.complement.equals(other.getComplement()))) &&
                ((this.num2Rue == null && other.getNum2Rue() == null) ||
                        (this.num2Rue != null &&
                                this.num2Rue.equals(other.getNum2Rue()))) &&
                ((this.typvoie == null && other.getTypvoie() == null) ||
                        (this.typvoie != null &&
                                this.typvoie.equals(other.getTypvoie()))) &&
                ((this.rue == null && other.getRue() == null) ||
                        (this.rue != null &&
                                this.rue.equals(other.getRue()))) &&
                ((this.codepost == null && other.getCodepost() == null) ||
                        (this.codepost != null &&
                                this.codepost.equals(other.getCodepost()))) &&
                ((this.ville == null && other.getVille() == null) ||
                        (this.ville != null &&
                                this.ville.equals(other.getVille()))) &&
                ((this.etatprov == null && other.getEtatprov() == null) ||
                        (this.etatprov != null &&
                                this.etatprov.equals(other.getEtatprov()))) &&
                ((this.pays == null && other.getPays() == null) ||
                        (this.pays != null &&
                                this.pays.equals(other.getPays()))) &&
                ((this.moyenLiaison == null && other.getMoyenLiaison() == null) ||
                        (this.moyenLiaison != null &&
                                java.util.Arrays.equals(this.moyenLiaison, other.getMoyenLiaison())));
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
        if (getTypAdresse() != null) {
            _hashCode += getTypAdresse().hashCode();
        }
        if (getIntitule() != null) {
            _hashCode += getIntitule().hashCode();
        }
        if (getComplement() != null) {
            _hashCode += getComplement().hashCode();
        }
        if (getNum2Rue() != null) {
            _hashCode += getNum2Rue().hashCode();
        }
        if (getTypvoie() != null) {
            _hashCode += getTypvoie().hashCode();
        }
        if (getRue() != null) {
            _hashCode += getRue().hashCode();
        }
        if (getCodepost() != null) {
            _hashCode += getCodepost().hashCode();
        }
        if (getVille() != null) {
            _hashCode += getVille().hashCode();
        }
        if (getEtatprov() != null) {
            _hashCode += getEtatprov().hashCode();
        }
        if (getPays() != null) {
            _hashCode += getPays().hashCode();
        }
        if (getMoyenLiaison() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getMoyenLiaison());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getMoyenLiaison(), i);
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
            new org.apache.axis.description.TypeDesc(Adresse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "Adresse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typAdresse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "typAdresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "TypeAdresse"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intitule");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "intitule"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("complement");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "complement"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("num2Rue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "num2rue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typvoie");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "typvoie"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "rue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codepost");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "codepost"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ville");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "ville"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("etatprov");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "etatprov"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("pays");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "pays"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("moyenLiaison");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "moyenLiaison"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "MoyenLiaison"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "MoyenLiaison"));
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
