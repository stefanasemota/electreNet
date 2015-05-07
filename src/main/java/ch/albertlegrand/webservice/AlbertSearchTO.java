package ch.albertlegrand.webservice;

import ch.albertlegrand.business.utility.RawHitListObject;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 30.03.12
 * Time: 20:56
 * To change this template use File | Settings | File Templates.
 */
@XmlRootElement
public class AlbertSearchTO {
    @XmlElement(nillable = true)
    private List<RawHitListObject> results = new ArrayList<RawHitListObject>();
    private String message;
    private Integer returncode;

    public List<RawHitListObject> getResults() {
        return results;
    }

    public String getMessage() {
        return message;
    }

    @XmlElement(nillable = true)
    public Integer getReturncode() {
        return returncode;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setReturncode(Integer returncode) {
        this.returncode = returncode;
    }
}
