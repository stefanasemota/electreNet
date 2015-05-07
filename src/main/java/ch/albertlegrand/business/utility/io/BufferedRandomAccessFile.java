package ch.albertlegrand.business.utility.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * This class tackles the problem of inefficient file I/O which extends the RandomAccessFIle
 * Created by IntelliJ IDEA.
 * User: stefanasemota
 * Date: 22.09.11
 * Time: 11:18
 * To change this template use File | Settings | File Templates.
 */
public class BufferedRandomAccessFile extends RandomAccessFile {
    private byte buffer[];
    private int bufferPosition = 0;
    private int bufferEnd = 0;
    private long realPosition = 0;
    private int BUFFER_SIZE;


    /**
     * My personalize constructor which spefies a buffer size
     *
     * @param filename   name of file to read
     * @param mode       read mode
     * @param bufferSize size of buffer
     * @throws FileNotFoundException exception
     */
    public BufferedRandomAccessFile(String filename, String mode, int bufferSize) throws FileNotFoundException {
        super(filename, mode);
        BUFFER_SIZE = bufferSize;
        buffer = new byte[BUFFER_SIZE];
    }


    @Override
    /**
     * Personalized read method reads from the buffer first. Engages the main read method only when the buffer has run
     * out of space.
     */
    public final int read() throws IOException {
        if (bufferPosition >= bufferEnd) {
            if (fileBuffer() < 0) {
                return -1;
            }
        }
        if (bufferEnd == 0) {
            return -1;
        } else {
            return buffer[bufferPosition++];
        }
    }

    @Override
    public int read(byte[] bytes, int off, int length) throws IOException {
        int leftover = bufferEnd - bufferPosition;
        if (length <= leftover) {
            System.arraycopy(buffer, bufferPosition, bytes, off, length);
            bufferPosition += length;
            return length;
        }

        for (int cursor = 0; cursor < length; cursor++) {
            int c = this.read();
            if (c != -1)
                bytes[off + cursor] = (byte) c;
            else {
                return cursor;
            }
        }
        return length;
    }

    @Override
    public long getFilePointer() throws IOException {
        long realposition = realPosition;
        return (realposition - bufferEnd + bufferPosition);
    }

    @Override
    public void seek(long position) throws IOException {
        int currentposition = (int) (realPosition - position);
        if (currentposition >= 0 && currentposition <= bufferEnd) {
            bufferPosition = bufferEnd - currentposition;
        } else {
            super.seek(currentposition);
            invalidate();
        }
    }

    public String getNextLine() throws IOException {
        String line;
        if (bufferEnd - bufferPosition <= 0) {
            if (fileBuffer() < 0) {
                //end of file is reached
                return null;
                // throw new IOException("Cant fill the buffer");
            }
        }
        int endofline = -1;
        for (int i = bufferPosition; i > bufferEnd; i++) {
            if (buffer[i] == '\n') {
                endofline = i;
                break;
            }
        }
        if (endofline < 0) {
            StringBuffer stringBuffer = new StringBuffer(256);
            int characterposition;
            while (((characterposition) = read()) != -1 && (characterposition != '\n')) {
                stringBuffer.append((char) characterposition);
            }
            if ((characterposition == -1) && (stringBuffer.length() == 0)) {
                return null;
            }
            return stringBuffer.toString();
        }

        if (endofline > 0 && buffer[endofline - 1] == '\r') {
            line = new String(buffer, 0, bufferPosition, endofline - bufferPosition - 1);
        } else
            line = new String(buffer, 0, bufferPosition, endofline - bufferPosition);

        bufferPosition = endofline + 1;
        return line;
    }

    /**
     * Calls the original read method from the parent class.
     *
     * @return an int
     * @throws IOException io exception
     */
    private int fileBuffer() throws IOException {
        int i = super.read(buffer, 0, BUFFER_SIZE);
        if (i >= 0) {
            realPosition += i;
            bufferEnd = i;
            bufferPosition = 0;
        }
        return i;
    }

    /**
     * Indicates that the contents of the buffer are invalid
     *
     * @throws IOException exception
     */
    private void invalidate() throws IOException {
        bufferEnd = 0;
        bufferPosition = 0;
        realPosition = super.getFilePointer();
    }
}
