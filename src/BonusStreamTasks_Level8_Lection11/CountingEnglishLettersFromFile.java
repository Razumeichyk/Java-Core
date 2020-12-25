package BonusStreamTasks_Level8_Lection11;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CountingEnglishLettersFromFile {
    public static void main(String[] args) throws IOException {

        String fileName = args[0];
        StringBuilder builder = new StringBuilder();
        int count = 0;

        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        while (reader.ready()) {
            String text = reader.readLine();
            String[] alphabetic = text.split("[^a-zA-Z]");

            for (int i = 0; i < alphabetic.length; i++) {
                builder.append(alphabetic[i]);
            }
        }

        count = builder.length();
        reader.close();
        System.out.println(count);


    }
}
