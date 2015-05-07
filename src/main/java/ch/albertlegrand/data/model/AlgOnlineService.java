package ch.albertlegrand.data.model;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class AlgOnlineService {
    private long algonlineserviceid;

    public long getAlgonlineserviceid() {
        return algonlineserviceid;
    }

    public void setAlgonlineserviceid(long algonlineserviceid) {
        this.algonlineserviceid = algonlineserviceid;
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

    private String hosturl;

    public String getHosturl() {
        return hosturl;
    }

    public void setHosturl(String hosturl) {
        this.hosturl = hosturl;
    }

    private int type;

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private boolean active;

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    private long usagelimit;

    public long getUsagelimit() {
        return usagelimit;
    }

    public void setUsagelimit(long usagelimit) {
        this.usagelimit = usagelimit;
    }

    private String loginref;

    public String getLoginref() {
        return loginref;
    }

    public void setLoginref(String loginref) {
        this.loginref = loginref;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlgOnlineService that = (AlgOnlineService) o;

        if (active != that.active) return false;
        if (algonlineserviceid != that.algonlineserviceid) return false;
        if (type != that.type) return false;
        if (usagelimit != that.usagelimit) return false;
        if (version != that.version) return false;
        if (hosturl != null ? !hosturl.equals(that.hosturl) : that.hosturl != null) return false;
        if (loginref != null ? !loginref.equals(that.loginref) : that.loginref != null) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (algonlineserviceid ^ (algonlineserviceid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (hosturl != null ? hosturl.hashCode() : 0);
        result = 31 * result + type;
        result = 31 * result + (active ? 1 : 0);
        result = 31 * result + (int) (usagelimit ^ (usagelimit >>> 32));
        result = 31 * result + (loginref != null ? loginref.hashCode() : 0);
        return result;
    }

    private Login loginByLoginref;

    public Login getLoginByLoginref() {
        return loginByLoginref;
    }

    public void setLoginByLoginref(Login loginByLoginref) {
        this.loginByLoginref = loginByLoginref;
    }
}
