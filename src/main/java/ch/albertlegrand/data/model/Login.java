package ch.albertlegrand.data.model;

import java.io.Serializable;
import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class Login implements Serializable {

    private long loginid;

    public long getLoginid() {
        return loginid;
    }

    public void setLoginid(long loginid) {
        this.loginid = loginid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String username;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    private boolean accountlocked;

    public boolean isAccountlocked() {
        return accountlocked;
    }

    public void setAccountlocked(boolean accountlocked) {
        this.accountlocked = accountlocked;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Login login = (Login) o;

        if (accountlocked != login.accountlocked) return false;
        if (loginid != login.loginid) return false;
        if (version != login.version) return false;
        if (password != null ? !password.equals(login.password) : login.password != null) return false;
        if (username != null ? !username.equals(login.username) : login.username != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (loginid ^ (loginid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (username != null ? username.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (accountlocked ? 1 : 0);
        return result;
    }

    private Collection<AlgOnlineService> algOnlineServicesByUsername;

    public Collection<AlgOnlineService> getAlgOnlineServicesByUsername() {
        return algOnlineServicesByUsername;
    }

    public void setAlgOnlineServicesByUsername(Collection<AlgOnlineService> algOnlineServicesByUsername) {
        this.algOnlineServicesByUsername = algOnlineServicesByUsername;
    }

    private Collection<Authority> authoritiesByUsername;

    public Collection<Authority> getAuthoritiesByUsername() {
        return authoritiesByUsername;
    }

    public void setAuthoritiesByUsername(Collection<Authority> authoritiesByUsername) {
        this.authoritiesByUsername = authoritiesByUsername;
    }

    private Collection<Person> personsByUsername;

    public Collection<Person> getPersonsByUsername() {
        return personsByUsername;
    }

    public void setPersonsByUsername(Collection<Person> personsByUsername) {
        this.personsByUsername = personsByUsername;
    }
}
