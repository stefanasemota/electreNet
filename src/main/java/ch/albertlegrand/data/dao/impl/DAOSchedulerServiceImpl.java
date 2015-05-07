package ch.albertlegrand.data.dao.impl;

import ch.albertlegrand.business.utility.exceptions.ErrorCodeException;
import ch.albertlegrand.business.utility.exceptions.SCHEDULER_PROBLEM;
import ch.albertlegrand.service.schudeler.SchedulerService;
import ch.albertlegrand.service.schudeler.impl.SchedulerServiceImpl;
import ch.albertlegrand.data.dao.DaoSchedulerService;
import ch.albertlegrand.service.schudeler.impl.AbstractAlbertService;
import org.apache.log4j.Level;

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 17.08.11
 * Time: 13:42
 * To change this template use File | Settings | File Templates.
 */
public class DAOSchedulerServiceImpl extends AbstractAlbertService implements DaoSchedulerService {

    public static final String CONFIG_EXT = ".properties";

    protected File configStoreLocation;

    public void setConfigStoreLocation(File configStoreLocation) {
        this.configStoreLocation = configStoreLocation;
    }

    @Override
    public void saveSchedulerService(SchedulerService schedulerService, String origConfigPropsText, boolean update) {
        String name = schedulerService.getConfigSchedulerName();
        if (name == null)
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.DATA_ACCESS_PROBLEM, "Config is missing scheduler name.");

        File file = getConfigFile(name);

        if (!update) {
            // Ensure we do not overwrite existing file.
            if (file.exists())
                throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.DATA_ACCESS_PROBLEM, "Config " + file + " already exists.");
        }

        // Write config file.
        try {
            FileWriter writer = new FileWriter(file);
            if (origConfigPropsText != null) {
                writer.write(origConfigPropsText);
                logger.log(Level.DEBUG, "Save config using origConfigPropsText.");
            } else {
                Properties configProps = schedulerService.getConfigProps();
                configProps.store(writer, "MySchedule Scheduler Config. CreateDate: " + new Date());
                logger.log(Level.DEBUG, "Save config using configProps object.");
            }
            writer.flush();
            writer.close();
            if (update)
                logger.log(Level.DEBUG, "Update to SchedulerService " + name + " config props on file: " + file + " is done.");
            else
                logger.log(Level.DEBUG, "New SchedulerService " + name + " config props on file: " + file + " is done.");
        } catch (Exception e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.DATA_ACCESS_PROBLEM, "Failed to create Properties from input config.", e);
        }
    }

    /**
     * Return an un-initialized scheduler service instance.
     */
    @Override
    public SchedulerService getSchedulerService(String schedulerServiceName) {
        File file = getConfigFile(schedulerServiceName);
        Properties configProps = new Properties();
        try {
            FileReader reader = new FileReader(file);
            configProps.load(reader);
            reader.close();
        } catch (IOException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.DATA_ACCESS_PROBLEM, "Failed to read configConfigs: " + file, e);
        }

        SchedulerServiceImpl schedulerService = new SchedulerServiceImpl();
        schedulerService.setConfigProps(configProps);
        return schedulerService;
    }

    @Override
    public void deleteSchedulerService(String schedulerServiceName) {
        File file = getConfigFile(schedulerServiceName);
        if (!file.delete()) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.DATA_ACCESS_PROBLEM,
                    "Failed to delete config: " + file);
        }
        logger.log(Level.DEBUG, "Config " + file + " has been removed.");
    }

    protected File getConfigFile(String schedulerServiceName) {
        return new File(configStoreLocation, schedulerServiceName + CONFIG_EXT);
    }

    @Override
    public boolean hasSchedulerService(String schedulerServiceName) {
        return getConfigFile(schedulerServiceName).exists();
    }


    @Override
    public List<String> getSchedulerServiceNames() {
        List<String> names = new ArrayList<String>();
        File[] files = configStoreLocation.listFiles();
        for (File file : files) {
            String name = file.getName();
            if (name.endsWith(CONFIG_EXT))
                name = name.substring(0, name.length() - CONFIG_EXT.length());
            names.add(name);
        }
        return names;
    }

    @Override
    public String getConfigPropsText(String schedulerServiceName) {
        File file = getConfigFile(schedulerServiceName);
        try {
            FileReader reader = new FileReader(file);
            StringWriter writer = new StringWriter();
            //  IOUtils.copy(reader, writer);
            reader.close();
            writer.close();
            return writer.toString();
        } catch (IOException e) {
            throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.DATA_ACCESS_PROBLEM, "Failed to read config props from file: " + file);
        }
    }

    @Override
    public void initService() {
        if (!configStoreLocation.exists()) {
            if (!configStoreLocation.mkdirs()) {
                throw new ErrorCodeException(SCHEDULER_PROBLEM.ErrorCode.DATA_ACCESS_PROBLEM, "Failed to create configStoreLocation " + configStoreLocation);
            }
            //logger.log(Level.DEBUG,"Created directory for configStoreLocation {}", configStoreLocation);
        }
    }

    @Override
    protected void destroyService() {
    }

    @Override
    protected void startService() {
    }

    @Override
    protected void stopService() {
    }
}
