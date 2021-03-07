package FileReaderAndFileWriterTasks;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class OneWordReading {

    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileReader fileReader = new FileReader(reader.readLine());
        String s = "";
        int count = 0;
        while (fileReader.ready()) {
            int data = fileReader.read();
            s += (char) data;
        }
        String[] res2 = s.split("[\\p{IsPunctuation}\\p{IsWhite_Space}]+");
        for (int i = 0; i < res2.length; i++) {
            if (res2[i].equals("world")) {
                count++;
            }

        }
        System.out.println(count);
        reader.close();
        fileReader.close();
    }
}
