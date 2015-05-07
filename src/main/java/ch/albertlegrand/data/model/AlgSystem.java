package ch.albertlegrand.data.model;

import java.sql.Time;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class AlgSystem {
    private long algsystemid;

    public long getAlgsystemid() {
        return algsystemid;
    }

    public void setAlgsystemid(long algsystemid) {
        this.algsystemid = algsystemid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String directorylabel1;

    public String getDirectorylabel1() {
        return directorylabel1;
    }

    public void setDirectorylabel1(String directorylabel1) {
        this.directorylabel1 = directorylabel1;
    }

    private String directorylabel2;

    public String getDirectorylabel2() {
        return directorylabel2;
    }

    public void setDirectorylabel2(String directorylabel2) {
        this.directorylabel2 = directorylabel2;
    }

    private String directorylabel3;

    public String getDirectorylabel3() {
        return directorylabel3;
    }

    public void setDirectorylabel3(String directorylabel3) {
        this.directorylabel3 = directorylabel3;
    }

    private Time awaitRepeatTime;

    public Time getAwaitRepeatTime() {
        return awaitRepeatTime;
    }

    public void setAwaitRepeatTime(Time awaitRepeatTime) {
        this.awaitRepeatTime = awaitRepeatTime;
    }

    private int repeatCounter;

    public int getRepeatCounter() {
        return repeatCounter;
    }

    public void setRepeatCounter(int repeatCounter) {
        this.repeatCounter = repeatCounter;
    }

    private long proxy;

    public long getProxy() {
        return proxy;
    }

    public void setProxy(long proxy) {
        this.proxy = proxy;
    }

    private long port;

    public long getPort() {
        return port;
    }

    public void setPort(long port) {
        this.port = port;
    }

    private String escalationEmail;

    public String getEscalationEmail() {
        return escalationEmail;
    }

    public void setEscalationEmail(String escalationEmail) {
        this.escalationEmail = escalationEmail;
    }

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private boolean firstExtraction;

    public boolean isFirstExtraction() {
        return firstExtraction;
    }

    public void setFirstExtraction(boolean firstExtraction) {
        this.firstExtraction = firstExtraction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlgSystem algSystem = (AlgSystem) o;

        if (algsystemid != algSystem.algsystemid) return false;
        if (firstExtraction != algSystem.firstExtraction) return false;
        if (port != algSystem.port) return false;
        if (proxy != algSystem.proxy) return false;
        if (repeatCounter != algSystem.repeatCounter) return false;
        if (version != algSystem.version) return false;
        if (awaitRepeatTime != null ? !awaitRepeatTime.equals(algSystem.awaitRepeatTime) : algSystem.awaitRepeatTime != null) return false;
        if (directorylabel1 != null ? !directorylabel1.equals(algSystem.directorylabel1) : algSystem.directorylabel1 != null) return false;
        if (directorylabel2 != null ? !directorylabel2.equals(algSystem.directorylabel2) : algSystem.directorylabel2 != null) return false;
        if (directorylabel3 != null ? !directorylabel3.equals(algSystem.directorylabel3) : algSystem.directorylabel3 != null) return false;
        if (escalationEmail != null ? !escalationEmail.equals(algSystem.escalationEmail) : algSystem.escalationEmail != null) return false;
        if (filename != null ? !filename.equals(algSystem.filename) : algSystem.filename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (algsystemid ^ (algsystemid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (directorylabel1 != null ? directorylabel1.hashCode() : 0);
        result = 31 * result + (directorylabel2 != null ? directorylabel2.hashCode() : 0);
        result = 31 * result + (directorylabel3 != null ? directorylabel3.hashCode() : 0);
        result = 31 * result + (awaitRepeatTime != null ? awaitRepeatTime.hashCode() : 0);
        result = 31 * result + repeatCounter;
        result = 31 * result + (int) (proxy ^ (proxy >>> 32));
        result = 31 * result + (int) (port ^ (port >>> 32));
        result = 31 * result + (escalationEmail != null ? escalationEmail.hashCode() : 0);
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (firstExtraction ? 1 : 0);
        return result;
    }
}
