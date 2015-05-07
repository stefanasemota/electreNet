package ch.albertlegrand.data.model;

import java.sql.Date;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class AlgOrder {
    private long orderid;

    public long getOrderid() {
        return orderid;
    }

    public void setOrderid(long orderid) {
        this.orderid = orderid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String filename;

    public String getFilename() {
        return filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    private Date datesent;

    public Date getDatesent() {
        return datesent;
    }

    public void setDatesent(Date datesent) {
        this.datesent = datesent;
    }

    private boolean status;

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        AlgOrder algOrder = (AlgOrder) o;

        if (orderid != algOrder.orderid) return false;
        if (status != algOrder.status) return false;
        if (version != algOrder.version) return false;
        if (datesent != null ? !datesent.equals(algOrder.datesent) : algOrder.datesent != null) return false;
        if (filename != null ? !filename.equals(algOrder.filename) : algOrder.filename != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (orderid ^ (orderid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (filename != null ? filename.hashCode() : 0);
        result = 31 * result + (datesent != null ? datesent.hashCode() : 0);
        result = 31 * result + (status ? 1 : 0);
        return result;
    }
}
