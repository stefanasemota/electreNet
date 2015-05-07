package ch.albertlegrand.data.model;

import java.util.Collection;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class Quantum {
    private long quantumid;

    public long getQuantumid() {
        return quantumid;
    }

    public void setQuantumid(long quantumid) {
        this.quantumid = quantumid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private double thickness;

    public double getThickness() {
        return thickness;
    }

    public void setThickness(double thickness) {
        this.thickness = thickness;
    }

    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    private double width;

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    private double weight;

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Quantum quantum = (Quantum) o;

        if (Double.compare(quantum.height, height) != 0) return false;
        if (quantumid != quantum.quantumid) return false;
        if (Double.compare(quantum.thickness, thickness) != 0) return false;
        if (version != quantum.version) return false;
        if (Double.compare(quantum.weight, weight) != 0) return false;
        if (Double.compare(quantum.width, width) != 0) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = (int) (quantumid ^ (quantumid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        temp = thickness != +0.0d ? Double.doubleToLongBits(thickness) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = height != +0.0d ? Double.doubleToLongBits(height) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = width != +0.0d ? Double.doubleToLongBits(width) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        temp = weight != +0.0d ? Double.doubleToLongBits(weight) : 0L;
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }

    private Collection<BookDetail> bookDetailsByQuantumid;

    public Collection<BookDetail> getBookDetailsByQuantumid() {
        return bookDetailsByQuantumid;
    }

    public void setBookDetailsByQuantumid(Collection<BookDetail> bookDetailsByQuantumid) {
        this.bookDetailsByQuantumid = bookDetailsByQuantumid;
    }
}
