package InputStreamOutputStreamTasks;

import java.io.*;

public class ReadingFromStaticLineAndNotFromConsole {
    public static void main(String[] args) throws IOException {

        String greetings = "Hello! My name is. I am learning. I want to become";
        byte[] bytes = greetings.getBytes();

        InputStream inputStream = new ByteArrayInputStream(bytes);

        System.setIn(inputStream);

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        String str;

        while ((str = reader.readLine()) != null){
            System.out.println(str);
        }
    }
}
