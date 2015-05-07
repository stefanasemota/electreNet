package ch.albertlegrand.business.catalogue;

import ch.albertlegrand.data.model.AlgSystem;

import java.io.IOException;

/**
 * Provides basic methods and operations for the Dilicom service
 *
 * @author Asemota Stefan
 * @version 1.0
 * @created 06-Jul-2011 10:41:08
 */
public interface DilicomBC {
    /**
     * Executes a dilicom update
     *
     * @param algSystem algSystem system variables
     * @throws IOException file or ftpc connections
     */
    public void executeDilicomJobs(AlgSystem algSystem) throws IOException;

    /**
     * Executes a dilicom Extraction, the files are picked up from the albert le grand ftp server
     *
     * @param algSystem system variables
     */
    public String executeExtraction(AlgSystem algSystem);

    public String insertIntoDatabaseAfterSuccessfulExtraction(AlgSystem algSystem);
}