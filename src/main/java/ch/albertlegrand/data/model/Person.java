package ch.albertlegrand.data.model;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class Person {
    private long personid;

    public long getPersonid() {
        return personid;
    }

    public void setPersonid(long personid) {
        this.personid = personid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String loginid;

    public String getLoginid() {
        return loginid;
    }

    public void setLoginid(String loginid) {
        this.loginid = loginid;
    }

    private String firstname;

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    private String lastname;

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private long addressref;

    public long getAddressref() {
        return addressref;
    }

    public void setAddressref(long addressref) {
        this.addressref = addressref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Person person = (Person) o;

        if (addressref != person.addressref) return false;
        if (personid != person.personid) return false;
        if (type != person.type) return false;
        if (version != person.version) return false;
        if (email != null ? !email.equals(person.email) : person.email != null) return false;
        if (firstname != null ? !firstname.equals(person.firstname) : person.firstname != null) return false;
        if (lastname != null ? !lastname.equals(person.lastname) : person.lastname != null) return false;
        if (loginid != null ? !loginid.equals(person.loginid) : person.loginid != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (personid ^ (personid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (loginid != null ? loginid.hashCode() : 0);
        result = 31 * result + (firstname != null ? firstname.hashCode() : 0);
        result = 31 * result + (lastname != null ? lastname.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (int) (addressref ^ (addressref >>> 32));
        return result;
    }

    private Login loginByLoginid;

    public Login getLoginByLoginid() {
        return loginByLoginid;
    }

    public void setLoginByLoginid(Login loginByLoginid) {
        this.loginByLoginid = loginByLoginid;
    }
}
