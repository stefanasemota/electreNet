package ch.albertlegrand.service.pluginCatalogue.ftp.impl;

import ch.albertlegrand.business.utility.impl.AlbertFtpClientWrapperImpl;
import ch.albertlegrand.data.model.AlgOnlineService;
import ch.albertlegrand.service.pluginCatalogue.ftp.AlbertFTPClientAdaptor;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;

import java.io.IOException;
import java.util.Vector;

/**
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 23:50
 * To change this template use File | Settings | File Templates.
 */
public class AlbertFtpClientAdaptorImpl implements AlbertFTPClientAdaptor {
    private static final Logger LOGGER = Logger.getLogger(AlbertFTPClientAdaptor.class);
    private AlbertFtpClientWrapperImpl albertFtpClientWrapper;

    public AlbertFtpClientAdaptorImpl() {
        this.albertFtpClientWrapper = new AlbertFtpClientWrapperImpl();
    }

    @Override
    public boolean connectAndLogin(AlgOnlineService service) throws IOException {
        boolean successfulConnection = false;
        String username = service.getLoginByLoginref().getUsername();
        String pwd = service.getLoginByLoginref().getPassword();
        if (albertFtpClientWrapper.connectAndLogin(service.getHosturl(), username, pwd)) {
            LOGGER.log(Level.DEBUG, "Connected to " + service.getHosturl());
            LOGGER.log(Level.DEBUG, "Welcome message " + albertFtpClientWrapper.getReplyString());
            successfulConnection = true;
        }
        return successfulConnection;
    }

    @Override
    public void setPassiveMode(boolean setPassive) {
        albertFtpClientWrapper.setPassiveMode(true);
    }

    @Override
    public void disconnectFromHost() throws IOException {
        albertFtpClientWrapper.logout();
        albertFtpClientWrapper.disconnect();
    }

    @Override
    public boolean changeWorkingDirectory(String path) throws IOException {
        return albertFtpClientWrapper.changeWorkingDirectory(path);
    }

    @Override
    public String printWorkingDirectory() throws IOException {
        return albertFtpClientWrapper.printWorkingDirectory();
    }

    @Override
    public boolean downloadFile(String serverFile, String localFile) throws IOException {
        return albertFtpClientWrapper.downloadFile(serverFile, localFile);
    }

    @Override
    public boolean uploadFile(String localFile, String serverFile) throws IOException {
        return albertFtpClientWrapper.uploadFile(localFile, serverFile);
    }

    @Override
    public Vector listFileNames() throws IOException {
        return albertFtpClientWrapper.listFileNames();
    }

    @Override
    public String listFileNamesString() throws IOException {
        return albertFtpClientWrapper.listFileNamesString();
    }

    @Override
    public Vector listSubdirNames() throws IOException {
        return albertFtpClientWrapper.listSubdirNames();
    }

    @Override
    public String listSubdirNamesString() throws IOException {
        return albertFtpClientWrapper.listSubdirNamesString();
    }

    @Override
    public Vector<FTPFile> getActualServerFiles() throws IOException {
        return albertFtpClientWrapper.getActualServerFiles();
    }

    @Override
    public FTPFile getActualServerFilesWithName(String name) throws IOException {
        return albertFtpClientWrapper.getActualServerFilesWithName(name);
    }

}
