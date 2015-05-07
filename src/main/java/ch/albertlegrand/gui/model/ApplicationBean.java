package ch.albertlegrand.gui.model;

import ch.albertlegrand.business.utility.impl.ReadPropertyFileImpl;
import org.springframework.stereotype.Component;

import java.io.Serializable;


@Component
public class ApplicationBean extends BaseBean implements Serializable {

    private static final long serialVersionUID = -8603773638140988924L;

    public String getAppname() {
        String title = ReadPropertyFileImpl.getCurrentInstance().getValueForKey("appName");
        String enviroment = ReadPropertyFileImpl.getCurrentInstance().getValueForKey("appEnviroment");
        return title + " | " + enviroment;
    }

}