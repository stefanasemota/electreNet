package ch.albertlegrand.data.model;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 24.01.12
 * Time: 13:39
 * To change this template use File | Settings | File Templates.
 */
public class Booktitle {
    private long booktitleid;

    public long getBooktitleid() {
        return booktitleid;
    }

    public void setBooktitleid(long booktitleid) {
        this.booktitleid = booktitleid;
    }

    private long version;

    public long getVersion() {
        return version;
    }

    public void setVersion(long version) {
        this.version = version;
    }

    private String diliCwordingExtended;

    public String getDiliCwordingExtended() {
        return diliCwordingExtended;
    }

    public void setDiliCwordingExtended(String diliCwordingExtended) {
        this.diliCwordingExtended = diliCwordingExtended;
    }

    private String diliCwordingStandard;

    public String getDiliCwordingStandard() {
        return diliCwordingStandard;
    }

    public void setDiliCwordingStandard(String diliCwordingStandard) {
        this.diliCwordingStandard = diliCwordingStandard;
    }

    private String diliCwordingCounter;

    public String getDiliCwordingCounter() {
        return diliCwordingCounter;
    }

    public void setDiliCwordingCounter(String diliCwordingCounter) {
        this.diliCwordingCounter = diliCwordingCounter;
    }

    private String eleNetTitle;

    public String getEleNetTitle() {
        return eleNetTitle;
    }

    public void setEleNetTitle(String eleNetTitle) {
        this.eleNetTitle = eleNetTitle;
    }

    private String eleNetCompleteTitle;

    public String getEleNetCompleteTitle() {
        return eleNetCompleteTitle;
    }

    public void setEleNetCompleteTitle(String eleNetCompleteTitle) {
        this.eleNetCompleteTitle = eleNetCompleteTitle;
    }

    private String wCatBtitle;

    public String getwCatBtitle() {
        return wCatBtitle;
    }

    public void setwCatBtitle(String wCatBtitle) {
        this.wCatBtitle = wCatBtitle;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Booktitle booktitle = (Booktitle) o;

        if (booktitleid != booktitle.booktitleid) return false;
        if (version != booktitle.version) return false;
        if (diliCwordingCounter != null ? !diliCwordingCounter.equals(booktitle.diliCwordingCounter) : booktitle.diliCwordingCounter != null)
            return false;
        if (diliCwordingExtended != null ? !diliCwordingExtended.equals(booktitle.diliCwordingExtended) : booktitle.diliCwordingExtended != null)
            return false;
        if (diliCwordingStandard != null ? !diliCwordingStandard.equals(booktitle.diliCwordingStandard) : booktitle.diliCwordingStandard != null)
            return false;
        if (eleNetCompleteTitle != null ? !eleNetCompleteTitle.equals(booktitle.eleNetCompleteTitle) : booktitle.eleNetCompleteTitle != null)
            return false;
        if (eleNetTitle != null ? !eleNetTitle.equals(booktitle.eleNetTitle) : booktitle.eleNetTitle != null) return false;
        if (wCatBtitle != null ? !wCatBtitle.equals(booktitle.wCatBtitle) : booktitle.wCatBtitle != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (booktitleid ^ (booktitleid >>> 32));
        result = 31 * result + (int) (version ^ (version >>> 32));
        result = 31 * result + (diliCwordingExtended != null ? diliCwordingExtended.hashCode() : 0);
        result = 31 * result + (diliCwordingStandard != null ? diliCwordingStandard.hashCode() : 0);
        result = 31 * result + (diliCwordingCounter != null ? diliCwordingCounter.hashCode() : 0);
        result = 31 * result + (eleNetTitle != null ? eleNetTitle.hashCode() : 0);
        result = 31 * result + (eleNetCompleteTitle != null ? eleNetCompleteTitle.hashCode() : 0);
        result = 31 * result + (wCatBtitle != null ? wCatBtitle.hashCode() : 0);
        return result;
    }
}
