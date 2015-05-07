package ch.albertlegrand.business.utility.impl;

import org.apache.commons.net.ftp.FTP;
import org.apache.commons.net.ftp.FTPClient;
import org.apache.commons.net.ftp.FTPFile;
import org.apache.commons.net.ftp.FTPReply;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Vector;

/**
 * THis class wrappes the ftp client class
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 09.08.11
 * Time: 23:32
 * To change this template use File | Settings | File Templates.
 */
public class AlbertFtpClientWrapperImpl extends FTPClient {
    /**
     * A convenience method for connecting and logging in
     */
    public boolean connectAndLogin(String host, String userName, String password) throws IOException {
        boolean success = false;
        connect(host);
        int reply = getReplyCode();
        if (FTPReply.isPositiveCompletion(reply))
            success = login(userName, password);
        if (!success)
            disconnect();
        return success;
    }

    /**
     * Turn passive transfer mode on or off. If Passive mode is active, a
     * PASV command to be issued and interpreted before data transfers;
     * otherwise, a PORT command will be used for data transfers. If you're
     * unsure which one to use, you probably want Passive mode to be on.
     *
     * @param setPassive ftp connection type
     */
    public void setPassiveMode(boolean setPassive) {
        if (setPassive)
            enterLocalPassiveMode();
        else
            enterLocalActiveMode();
    }

    /**
     * Use ASCII mode for file transfers
     *
     * @return boolean
     * @throws java.io.IOException if
     */
    public boolean ascii() throws IOException {
        return setFileType(FTP.ASCII_FILE_TYPE);
    }

    /**
     * Use Binary mode for file transfers
     *
     * @return a boolean
     * @throws java.io.IOException if a problems exists
     */
    public boolean binary() throws IOException {
        return setFileType(FTP.BINARY_FILE_TYPE);
    }

    /**
     * Download a file from the server, and save it to the specified local file
     *
     * @param serverFile name of file on local server
     * @param localFile  name of file
     * @return boolean if ok
     * @throws java.io.IOException if something went wrong
     */
    public boolean downloadFile(String serverFile, String localFile) throws IOException {
        FileOutputStream out = new FileOutputStream(localFile);
        boolean result = retrieveFile(serverFile, out);
        out.close();
        return result;
    }

    /**
     * Upload a file to the server
     *
     * @param localFile  to be uploaded
     * @param serverFile name of the file on server
     * @return boolean
     * @throws java.io.IOException if any
     */
    public boolean uploadFile(String localFile, String serverFile) throws IOException {
        FileInputStream in = new FileInputStream(localFile);
        boolean result = storeFile(serverFile, in);
        in.close();
        return result;
    }

    /**
     * Get the list of files in the current directory as a Vector of Strings
     * (excludes substructures)
     *
     * @return a vector of file names in the current dir
     * @throws java.io.IOException if no file
     */
    public Vector<String> listFileNames() throws IOException {
        FTPFile[] files = listFiles();
        Vector<String> v = new Vector<String>();
        for (FTPFile file : files) {
            if (!file.isDirectory())
                v.addElement(file.getName());
        }
        return v;
    }

    /**
     * Returns the server files
     *
     * @return FTPFile in a vector
     * @throws IOException
     */
    public Vector<FTPFile> getActualServerFiles() throws IOException {
        FTPFile[] files = listFiles();
        Vector<FTPFile> v = new Vector<FTPFile>();
        for (FTPFile file : files) {
            if (!file.isDirectory())
                v.addElement(file);
        }
        return v;
    }

    /**
     * Returns a server file with a particualar name
     *
     * @param name of file
     * @return the correct ftp file
     * @throws IOException error
     */
    public FTPFile getActualServerFilesWithName(String name) throws IOException {
        FTPFile[] files = listFiles();
        for (FTPFile file : files) {
            if (!file.isDirectory())
                if (file.getName().equals(name))
                    return file;
        }
        return null;
    }

    /**
     * Get the list of files in the current directory as a single Strings,
     * delimited by \n (char '10') (excludes substructures)
     *
     * @return a string
     * @throws org.apache.commons.net.ftp.FTPConnectionClosedException
     *          if connection was closed
     */
    public String listFileNamesString() throws IOException {
        return vectorToString(listFileNames(), "\n");
    }

    /**
     * Get the list of subdirectories in the current directory as a Vector of Strings
     * (excludes files)
     *
     * @return a vector directory names
     * @throws java.io.IOException if
     */
    public Vector<String> listSubdirNames() throws IOException {
        FTPFile[] files = listFiles();
        Vector<String> v = new Vector<String>();
        for (int i = 0, filesLength = files.length; i < filesLength; i++) {
            FTPFile file = files[i];
            if (file.isDirectory())
                v.addElement(file.getName());
        }
        return v;
    }

    /**
     * Get the list of subdirectories in the current directory as a single Strings,
     * delimited by \n (char '10') (excludes files)
     *
     * @return a string of sub directory names
     * @throws java.io.IOException if subdir
     */
    public String listSubdirNamesString() throws IOException {
        return vectorToString(listSubdirNames(), "\n");
    }

    /**
     * Convert a Vector to a delimited String
     *
     * @param v         a vector
     * @param delimiter separator
     * @return a string
     */
    public String vectorToString(Vector<String> v, String delimiter) {
        StringBuilder sb = new StringBuilder();
        String s = "";
        for (int i = 0; i < v.size(); i++) {
            sb.append(s).append(v.elementAt(i));
            s = delimiter;
        }
        return sb.toString();
    }
}
