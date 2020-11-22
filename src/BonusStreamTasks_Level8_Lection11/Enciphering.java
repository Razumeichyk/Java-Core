package BonusStreamTasks_Level8_Lection11;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Enciphering {
    public static void main(String[] args) throws IOException {

        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);

        if (args[0].equals("-e")){
            while (inputStream.available() > 0){
                int data = inputStream.read();
                outputStream.write(data+1);
            }
        } else if (args[0].equals("-d")){
            while (inputStream.available() > 0){
                int data = inputStream.read();
                outputStream.write(data-1);
            }
        }

        inputStream.close();
        outputStream.close();
    }
}
