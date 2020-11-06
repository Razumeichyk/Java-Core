package InputStreamOutputStreamTasks;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyFileOnDisc {
    public static void main(String[] args) throws IOException {
        //Create stream to read byte from file
        FileInputStream inputStream = new FileInputStream("c:/temp/data.txt");
        // Create stream to write byte in file
        FileOutputStream outputStream = new FileOutputStream("c:/temp/result.txt");

        byte[] buffer = new byte[1000];
        while (inputStream.available()>0) { // while we have unread bytes
            //read the next block of bytes in variable buffer and the real quantity in variable count
            int count = inputStream.read(buffer);
            outputStream.write(buffer, 0, count); //write block (part of block) in a second stream
        }

        inputStream.close();
        outputStream.close();
    }
}
