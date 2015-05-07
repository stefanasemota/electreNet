package ch.albertlegrand.business.utility.impl;

import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.data.model.AlgSystem;
import ch.albertlegrand.service.businesslogic.AlgSystemService;
import ch.albertlegrand.service.pluginCatalogue.ftp.AlbertFTPClientAdaptor;
import ch.albertlegrand.business.utility.DilicomFile;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.IOException;
import java.util.TreeMap;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 11.08.11
 * Time: 22:42
 * To change this template use File | Settings | File Templates.
 */
public class DilicomFileImpl implements DilicomFile {

    private static final Logger LOGGER = Logger.getLogger(DilicomFileImpl.class);
    public static final String DOWNLOAD_PATH_ON_SERVER = "/WEB-INF/temporaryFileDownload/";
    @Autowired
    private AlbertFTPClientAdaptor dilicomFTPClientAdaptor;

    //Services
    private AlgSystemService algSystemService;

    private AlgSystem dilicomSystem;

    @Override
    /**
     * This method connects to the dilicom ftp host, switches the working directory and returns the filename to be parsed
     */
    public String getLastDownloadedFile(AlgOnlineService dilicomService, AlgSystem algSystem) {
        String fileNameToParse = null;
        try {
            //set actuall service configuration
            dilicomSystem = algSystem;

            //connect to ftp
            dilicomFTPClientAdaptor.connectAndLogin(dilicomService);

            //change working directory
            dilicomFTPClientAdaptor.changeWorkingDirectory(dilicomSystem.getDirectorylabel1());

            //prepare the actual file to download and parse
            Vector<FTPFile> files = dilicomFTPClientAdaptor.getActualServerFiles();
            for (FTPFile file : files) {
                LOGGER.log(Level.DEBUG, "File info" + file.getTimestamp().getTime());
            }
            fileNameToParse = checkAndPrepareFileToDownload(dilicomFTPClientAdaptor.getActualServerFiles());

            //disconnect from host
            dilicomFTPClientAdaptor.disconnectFromHost();
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Encountered a problem will now try to close the ftp connection " + e.getMessage());
            //disconnection or try again;
            try {
                dilicomFTPClientAdaptor.disconnectFromHost();
            } catch (IOException e1) {
                LOGGER.log(Level.ERROR, "Error with FTP dilicom download file session " + e.getMessage());
            }
        }
        return fileNameToParse;
    }

    @Override
    public void downloadExtractionFiles(AlgOnlineService service, AlgSystem algSystem, String[] extractionFileNames) throws IOException {
        try {

            //set actual service configuration
            dilicomSystem = algSystem;
            //connect to ftp
            if (dilicomFTPClientAdaptor.connectAndLogin(service)) {
                System.out.println("Dir at Connection " + dilicomFTPClientAdaptor.listSubdirNamesString() + "\n");
                //change working directory
                dilicomFTPClientAdaptor.changeWorkingDirectory(dilicomSystem.getDirectorylabel1());
                System.out.println("Chnged dir " + dilicomFTPClientAdaptor.printWorkingDirectory());
                System.out.println("Dir names are " + dilicomFTPClientAdaptor.listSubdirNamesString() + "\n");
                System.out.println("File names are " + dilicomFTPClientAdaptor.listFileNamesString() + "\n");
                //prepare the actual file to download and parse
                for (String fileNameToParse : extractionFileNames) {
                    dilicomFTPClientAdaptor.downloadFile(fileNameToParse, fileNameToParse);
                }
                //disconnect from host
                dilicomFTPClientAdaptor.disconnectFromHost();
            }
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Encountered a problem will now try to close the ftp connection " + e.getMessage());
            //disconnection or try again;
            try {
                dilicomFTPClientAdaptor.disconnectFromHost();
            } catch (IOException e1) {
                LOGGER.log(Level.ERROR, "Error with FTP dilicom download file session " + e.getMessage());
            }
        }
    }

    public void copyFileToAlgFtpServer(AlgOnlineService dilicomService, String fileName) {
        try {
            //retrieve dilicom system variables
            dilicomSystem = (AlgSystem) algSystemService.getById(2);
            //connect to ftp
            if (dilicomFTPClientAdaptor.connectAndLogin(dilicomService)) {
                //change working directory
                dilicomFTPClientAdaptor.changeWorkingDirectory(dilicomSystem.getDirectorylabel1());
                System.out.println(dilicomFTPClientAdaptor.printWorkingDirectory() + "\n");
                //prepare the actual file to download and parse
                dilicomFTPClientAdaptor.uploadFile(fileName, fileName);

                //disconnect from host
                dilicomFTPClientAdaptor.disconnectFromHost();
            }
        } catch (Exception e) {
            LOGGER.log(Level.ERROR, "Encountered a problem will now try to close the ftp connection " + e.getMessage());
            //disconnection or try again;
            try {
                dilicomFTPClientAdaptor.disconnectFromHost();
            } catch (IOException e1) {
                LOGGER.log(Level.ERROR, "Error with FTP dilicom copy file session " + e.getMessage());
            }
        }
    }

    /**
     * This method copies the dilicom directory files into a TreeMap which sorts the file names at the same time
     * Only file names that have no extensions are added to the map.
     *
     * @param actualServerFiles the directory contents in the folder O.
     * @return the filename to be parsed
     * @throws IOException encountered when downloading the file
     */
    private String checkAndPrepareFileToDownload(Vector<FTPFile> actualServerFiles) throws IOException {
        TreeMap<String, String> fileNamesAsStrings = new TreeMap<String, String>();
        for (Object fileNameAsObject : actualServerFiles.toArray()) {
            String fileName = ((FTPFile) fileNameAsObject).getName();
            // if there is no extension, don't do anything
            if (!fileName.contains(".")) {
                System.out.println("found a file called " + fileName);
                //sort out non numeric values before inserting to map
                boolean isvalid = fileName.matches("^([0-9])(?!\\1+$)[0-9]+$");
                if (isvalid) {
                    fileNamesAsStrings.put(fileName, fileName);
                }
            }
        }
        //retrieve the latest uploaded dilicom file
        String latestUploadedFileName = fileNamesAsStrings.lastKey();
        if (dilicomSystem.getFilename() != null) {
            if (isValidServerFileDate(latestUploadedFileName)) {
                //String newFileName = latestUploadedFileName + System.currentTimeMillis();
                dilicomFTPClientAdaptor.downloadFile(latestUploadedFileName, latestUploadedFileName);
            }
        }
        fileNamesAsStrings = null;
        return latestUploadedFileName;
    }


    /**
     * Compares if the last read file's name is smaller than the newest, if yes then true will be returned back
     *
     * @param newestFileName filename of latest dilicom file
     * @return boolean
     */
    private boolean isValidServerFileDate(String newestFileName) {
        boolean result = false;
        int isCorrectFile = dilicomSystem.getFilename().compareTo(newestFileName);
        //if newestFileName is larger than the last downloaded file, then we know we have the write file!
        if (isCorrectFile < 0)
            result = true;
        return result;
    }


    /**
     * Deletes a file
     *
     * @param fileName to be deleted
     * @return boolean if deleted
     */
    public boolean deleteDilicomFile(String fileName) throws SecurityException {
        boolean wasDeleted = false;
        File target = new File(fileName);
        if (!target.exists()) {
            try {
                wasDeleted = target.delete();
            } catch (SecurityException se) {
                throw new SecurityException("Error: " + se.getMessage());
            }
        }
        return wasDeleted;
    }

    @Override
    public void createFile() {
    }

    @Override
    public void sendFile() {
    }
}
