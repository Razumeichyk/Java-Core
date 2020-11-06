package InputStreamOutputStreamTasks;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseFileWriting {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        List<Integer> list = new ArrayList<>();

        while (fileInputStream.available() > 0){
            list.add(fileInputStream.read());
        }

        Collections.reverse(list);

        for (Integer integer : list) {
            fileOutputStream.write(integer);
        }

        fileOutputStream.close();
        fileInputStream.close();
    }
}
