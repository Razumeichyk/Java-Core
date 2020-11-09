package InputStreamOutputStreamTasks;

import java.io.*;

public class UsingSystemSetIn {
    public static void main(String[] args) throws IOException {

        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("Helen").append('\n');
        stringBuilder.append("Olaf").append('\n');
        stringBuilder.append("Anna").append('\n');
        String data = stringBuilder.toString();

        // wrap the line in class ByteArrayInputStream
        InputStream inputStream = new ByteArrayInputStream(data.getBytes());

        // change 'in'
        System.setIn(inputStream);

        readAndPrintLine();

    }

    public static void readAndPrintLine() throws IOException{
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        while (true){
            String line = reader.readLine();
            if (line == null) break;
            System.out.println(line);
        }
        reader.close();
        inputStreamReader.close();
    }
}
