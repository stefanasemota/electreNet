package ch.albertlegrand.data.model;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class Address {
    private long addressid;

    public long getAddressid() {
        return addressid;
    }

    public void setAddressid(long addressid) {
        this.addressid = addressid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String line1;

    public String getLine1() {
        return line1;
    }

    public void setLine1(String line1) {
        this.line1 = line1;
    }

    private String line2;

    public String getLine2() {
        return line2;
    }

    public void setLine2(String line2) {
        this.line2 = line2;
    }

    private String line3;

    public String getLine3() {
        return line3;
    }

    public void setLine3(String line3) {
        this.line3 = line3;
    }

    private long cityref;

    public long getCityref() {
        return cityref;
    }

    public void setCityref(long cityref) {
        this.cityref = cityref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Address address = (Address) o;

        if (addressid != address.addressid) return false;
        if (cityref != address.cityref) return false;
        if (version != address.version) return false;
        if (line1 != null ? !line1.equals(address.line1) : address.line1 != null) return false;
        if (line2 != null ? !line2.equals(address.line2) : address.line2 != null) return false;
        if (line3 != null ? !line3.equals(address.line3) : address.line3 != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (addressid ^ (addressid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (line1 != null ? line1.hashCode() : 0);
        result = 31 * result + (line2 != null ? line2.hashCode() : 0);
        result = 31 * result + (line3 != null ? line3.hashCode() : 0);
        result = 31 * result + (int) (cityref ^ (cityref >>> 32));
        return result;
    }

    private City cityByCityref;

    public City getCityByCityref() {
        return cityByCityref;
    }

    public void setCityByCityref(City cityByCityref) {
        this.cityByCityref = cityByCityref;
    }
}
