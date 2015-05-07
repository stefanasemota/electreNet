package ch.albertlegrand.business.utility.impl;

import ch.albertlegrand.business.utility.ReadPropertyFile;
import org.apache.log4j.Logger;

import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 06.04.12
 * Time: 09:17
 * To change this template use File | Settings | File Templates.
 */
public class ReadPropertyFileImpl implements ReadPropertyFile {
    private static Map<String, String> resourceBundle = new HashMap<String, String>();

    private static final Logger LOGGER = Logger.getLogger(ReadPropertyFile.class);
    private static ReadPropertyFileImpl readPropertyFile;
    private static ResourceBundle bundle;


    public static ReadPropertyFileImpl getCurrentInstance() {
        if (readPropertyFile == null) {
            readPropertyFile = new ReadPropertyFileImpl();
            //load a properties file and insert into map for once
            LOGGER.debug("Initialization of Settings bundle  -- looking up settings.properties");
            bundle = ResourceBundle.getBundle("settings");
            for (Object o : bundle.keySet()) {
                String key = (String) o;
                String value = bundle.getString(key);
                try {
                    //String[] values = value.split(",");
                    resourceBundle.put(key, value);
                } catch (Throwable t) {
                    LOGGER.error("Cannot read properties file for key {" + key + "} and value {" + value + "}", t);
                }
            }
        }
        return readPropertyFile;
    }

    @Override
    public String getValueForKey(String key) {
        String value;
        //get the property value cooresponding to key
        value = resourceBundle.get(key);
        return value;
    }
}
