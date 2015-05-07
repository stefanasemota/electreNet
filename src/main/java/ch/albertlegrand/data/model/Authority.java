package ch.albertlegrand.data.model;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class Authority {
    private long authorityid;

    public long getAuthorityid() {
        return authorityid;
    }

    public void setAuthorityid(long authorityid) {
        this.authorityid = authorityid;
    }

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Authority authority = (Authority) o;

        if (authorityid != authority.authorityid) return false;
        if (name != null ? !name.equals(authority.name) : authority.name != null) return false;
        if (username != null ? !username.equals(authority.username) : authority.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (authorityid ^ (authorityid >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (username != null ? username.hashCode() : 0);
        return result;
    }

    private Login loginByUsername;

    public Login getLoginByUsername() {
        return loginByUsername;
    }

    public void setLoginByUsername(Login loginByUsername) {
        this.loginByUsername = loginByUsername;
    }
}
