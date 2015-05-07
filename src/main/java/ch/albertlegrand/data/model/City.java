package ch.albertlegrand.data.model;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class City {
    private long cityid;

    public long getCityid() {
        return cityid;
    }

    public void setCityid(long cityid) {
        this.cityid = cityid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private long zipcode;

    public long getZipcode() {
        return zipcode;
    }

    public void setZipcode(long zipcode) {
        this.zipcode = zipcode;
    }

    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    private String country;

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        City city = (City) o;

        if (cityid != city.cityid) return false;
        if (version != city.version) return false;
        if (zipcode != city.zipcode) return false;
        if (country != null ? !country.equals(city.country) : city.country != null) return false;
        if (name != null ? !name.equals(city.name) : city.name != null) return false;
        if (state != null ? !state.equals(city.state) : city.state != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (cityid ^ (cityid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (int) (zipcode ^ (zipcode >>> 32));
        result = 31 * result + (state != null ? state.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        return result;
    }

    private Collection<Address> addressesByCityid;

    public Collection<Address> getAddressesByCityid() {
        return addressesByCityid;
    }

    public void setAddressesByCityid(Collection<Address> addressesByCityid) {
        this.addressesByCityid = addressesByCityid;
    }
}
