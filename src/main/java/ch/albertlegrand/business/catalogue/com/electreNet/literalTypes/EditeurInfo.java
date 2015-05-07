/**
 * EditeurInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package ch.albertlegrand.business.catalogue.com.electreNet.literalTypes;

public class EditeurInfo implements java.io.Serializable {
    private String refEdite;

    private String cnuf;

    private String raiSocia;

    private ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.Adresse[] adresse;

    private String telephone;

    private String fax;

    private String siteInternet;

    private String email;

    private String[] distribue;

    private String formeBiblio;

    private String liensCA;

    public EditeurInfo() {
    }

    public EditeurInfo(
            String refEdite,
            String cnuf,
            String raiSocia,
            ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.Adresse[] adresse,
            String telephone,
            String fax,
            String siteInternet,
            String email,
            String[] distribue,
            String formeBiblio,
            String liensCA) {
        this.refEdite = refEdite;
        this.cnuf = cnuf;
        this.raiSocia = raiSocia;
        this.adresse = adresse;
        this.telephone = telephone;
        this.fax = fax;
        this.siteInternet = siteInternet;
        this.email = email;
        this.distribue = distribue;
        this.formeBiblio = formeBiblio;
        this.liensCA = liensCA;
    }


    /**
     * Gets the refEdite value for this EditeurInfo.
     *
     * @return refEdite
     */
    public String getRefEdite() {
        return refEdite;
    }


    /**
     * Sets the refEdite value for this EditeurInfo.
     *
     * @param refEdite
     */
    public void setRefEdite(String refEdite) {
        this.refEdite = refEdite;
    }


    /**
     * Gets the cnuf value for this EditeurInfo.
     *
     * @return cnuf
     */
    public String getCnuf() {
        return cnuf;
    }


    /**
     * Sets the cnuf value for this EditeurInfo.
     *
     * @param cnuf
     */
    public void setCnuf(String cnuf) {
        this.cnuf = cnuf;
    }


    /**
     * Gets the raiSocia value for this EditeurInfo.
     *
     * @return raiSocia
     */
    public String getRaiSocia() {
        return raiSocia;
    }


    /**
     * Sets the raiSocia value for this EditeurInfo.
     *
     * @param raiSocia
     */
    public void setRaiSocia(String raiSocia) {
        this.raiSocia = raiSocia;
    }


    /**
     * Gets the adresse value for this EditeurInfo.
     *
     * @return adresse
     */
    public ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.Adresse[] getAdresse() {
        return adresse;
    }


    /**
     * Sets the adresse value for this EditeurInfo.
     *
     * @param adresse
     */
    public void setAdresse(ch.albertlegrand.business.catalogue.com.electreNet.literalTypes.Adresse[] adresse) {
        this.adresse = adresse;
    }


    /**
     * Gets the telephone value for this EditeurInfo.
     *
     * @return telephone
     */
    public String getTelephone() {
        return telephone;
    }


    /**
     * Sets the telephone value for this EditeurInfo.
     *
     * @param telephone
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }


    /**
     * Gets the fax value for this EditeurInfo.
     *
     * @return fax
     */
    public String getFax() {
        return fax;
    }


    /**
     * Sets the fax value for this EditeurInfo.
     *
     * @param fax
     */
    public void setFax(String fax) {
        this.fax = fax;
    }


    /**
     * Gets the siteInternet value for this EditeurInfo.
     *
     * @return siteInternet
     */
    public String getSiteInternet() {
        return siteInternet;
    }


    /**
     * Sets the siteInternet value for this EditeurInfo.
     *
     * @param siteInternet
     */
    public void setSiteInternet(String siteInternet) {
        this.siteInternet = siteInternet;
    }


    /**
     * Gets the email value for this EditeurInfo.
     *
     * @return email
     */
    public String getEmail() {
        return email;
    }


    /**
     * Sets the email value for this EditeurInfo.
     *
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }


    /**
     * Gets the distribue value for this EditeurInfo.
     *
     * @return distribue
     */
    public String[] getDistribue() {
        return distribue;
    }


    /**
     * Sets the distribue value for this EditeurInfo.
     *
     * @param distribue
     */
    public void setDistribue(String[] distribue) {
        this.distribue = distribue;
    }


    /**
     * Gets the formeBiblio value for this EditeurInfo.
     *
     * @return formeBiblio
     */
    public String getFormeBiblio() {
        return formeBiblio;
    }


    /**
     * Sets the formeBiblio value for this EditeurInfo.
     *
     * @param formeBiblio
     */
    public void setFormeBiblio(String formeBiblio) {
        this.formeBiblio = formeBiblio;
    }


    /**
     * Gets the liensCA value for this EditeurInfo.
     *
     * @return liensCA
     */
    public String getLiensCA() {
        return liensCA;
    }


    /**
     * Sets the liensCA value for this EditeurInfo.
     *
     * @param liensCA
     */
    public void setLiensCA(String liensCA) {
        this.liensCA = liensCA;
    }

    private Object __equalsCalc = null;

    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof EditeurInfo)) return false;
        EditeurInfo other = (EditeurInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.refEdite == null && other.getRefEdite() == null) ||
                        (this.refEdite != null &&
                                this.refEdite.equals(other.getRefEdite()))) &&
                ((this.cnuf == null && other.getCnuf() == null) ||
                        (this.cnuf != null &&
                                this.cnuf.equals(other.getCnuf()))) &&
                ((this.raiSocia == null && other.getRaiSocia() == null) ||
                        (this.raiSocia != null &&
                                this.raiSocia.equals(other.getRaiSocia()))) &&
                ((this.adresse == null && other.getAdresse() == null) ||
                        (this.adresse != null &&
                                java.util.Arrays.equals(this.adresse, other.getAdresse()))) &&
                ((this.telephone == null && other.getTelephone() == null) ||
                        (this.telephone != null &&
                                this.telephone.equals(other.getTelephone()))) &&
                ((this.fax == null && other.getFax() == null) ||
                        (this.fax != null &&
                                this.fax.equals(other.getFax()))) &&
                ((this.siteInternet == null && other.getSiteInternet() == null) ||
                        (this.siteInternet != null &&
                                this.siteInternet.equals(other.getSiteInternet()))) &&
                ((this.email == null && other.getEmail() == null) ||
                        (this.email != null &&
                                this.email.equals(other.getEmail()))) &&
                ((this.distribue == null && other.getDistribue() == null) ||
                        (this.distribue != null &&
                                java.util.Arrays.equals(this.distribue, other.getDistribue()))) &&
                ((this.formeBiblio == null && other.getFormeBiblio() == null) ||
                        (this.formeBiblio != null &&
                                this.formeBiblio.equals(other.getFormeBiblio()))) &&
                ((this.liensCA == null && other.getLiensCA() == null) ||
                        (this.liensCA != null &&
                                this.liensCA.equals(other.getLiensCA())));
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
        if (getRefEdite() != null) {
            _hashCode += getRefEdite().hashCode();
        }
        if (getCnuf() != null) {
            _hashCode += getCnuf().hashCode();
        }
        if (getRaiSocia() != null) {
            _hashCode += getRaiSocia().hashCode();
        }
        if (getAdresse() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getAdresse());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getAdresse(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getTelephone() != null) {
            _hashCode += getTelephone().hashCode();
        }
        if (getFax() != null) {
            _hashCode += getFax().hashCode();
        }
        if (getSiteInternet() != null) {
            _hashCode += getSiteInternet().hashCode();
        }
        if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
        if (getDistribue() != null) {
            for (int i = 0;
                 i < java.lang.reflect.Array.getLength(getDistribue());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getDistribue(), i);
                if (obj != null &&
                        !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getFormeBiblio() != null) {
            _hashCode += getFormeBiblio().hashCode();
        }
        if (getLiensCA() != null) {
            _hashCode += getLiensCA().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(EditeurInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "EditeurInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refEdite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "refEdite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cnuf");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "cnuf"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("raiSocia");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "raiSocia"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adresse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "adresse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "Adresse"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "Adresse"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("telephone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "telephone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fax");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "fax"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("siteInternet");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "siteInternet"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("distribue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "distribue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "string"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("formeBiblio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "formeBiblio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("liensCA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://electre.com/ElectreNET/literalTypes", "liensCA"));
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
