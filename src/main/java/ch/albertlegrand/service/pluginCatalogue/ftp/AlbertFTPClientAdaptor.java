package ch.albertlegrand.service.pluginCatalogue.ftp;

import ch.albertlegrand.data.model.AlgOnlineService;
import org.apache.commons.net.ftp.FTPFile;

import java.io.IOException;
import java.util.Vector;

/**
 * This class declares a selective number of methods implemented by the personalized wrapper class
 * albertlegrand.business.utility.impl.AlbertFtpClientWrapperImpl
 * <p/>
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 23:46
 * To change this template use File | Settings | File Templates.
 */
public interface AlbertFTPClientAdaptor {

    public boolean connectAndLogin(AlgOnlineService service) throws IOException;

    public void setPassiveMode(boolean setPassive);

    public void disconnectFromHost() throws IOException;

    public boolean changeWorkingDirectory(String path) throws IOException;

    public String printWorkingDirectory() throws java.io.IOException;

    public boolean downloadFile(String serverFile, String localFile) throws IOException;

    public boolean uploadFile(String localFile, String serverFile) throws IOException;

    public Vector listFileNames() throws IOException;

    public String listFileNamesString() throws IOException;

    public Vector listSubdirNames() throws IOException;

    public String listSubdirNamesString() throws IOException;

    public Vector<FTPFile> getActualServerFiles() throws IOException;

    public FTPFile getActualServerFilesWithName(String name) throws IOException;

}
