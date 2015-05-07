package ch.albertlegrand.business.utility;

import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.data.model.AlgSystem;

import java.io.IOException;

/**
 * Provides basic methods and operations for a Dilcom file object
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface DilicomFile extends GenericFile {

    /**
     * Retrieves the last downloaded file
     *
     * @param service   connection details
     * @param algSystem dilicom system varaibles
     * @return a file name
     * @throws IOException connection problem
     */
    public String getLastDownloadedFile(AlgOnlineService service, AlgSystem algSystem) throws IOException;

    /**
     * Retrieves Extraction files on the ALG FTP server
     *
     * @param service             alg service
     * @param algSystem           alg system variables
     * @param extractionFileNames files to be extracted
     * @throws IOException connection
     */
    public void downloadExtractionFiles(AlgOnlineService service, AlgSystem algSystem, String[] extractionFileNames) throws IOException;

    /**
     * copies a file to the ftp server
     *
     * @param dilicomService service
     * @param fileName       filename to copy
     */
    public void copyFileToAlgFtpServer(AlgOnlineService dilicomService, String fileName);

    /**
     * Deletes a particular file
     *
     * @param dilicomFileName name of file to be deleted
     * @return boolean true if ok
     */
    public boolean deleteDilicomFile(String dilicomFileName);


}