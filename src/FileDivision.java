import java.io.*;

public class FileDivision {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = reader.readLine();
        String file2 = reader.readLine();
        String file3 = reader.readLine();

        FileInputStream fileInputStream = new FileInputStream(file1);
        FileOutputStream fileOutputStream = new FileOutputStream(file2);

        // if file1 has odd quantity of bytes, then file2 should have the biggest part of bytes
        for (int i = 0; i < (fileInputStream.available()+1) / 2; i++){
            int dataForFile2 = fileInputStream.read();
            fileOutputStream.write(dataForFile2);
        }

        fileOutputStream.close();

        fileOutputStream = new FileOutputStream(file3);
        while (fileInputStream.available() > 0){
            int dataForFile3 = fileInputStream.read();
            fileOutputStream.write(dataForFile3);
        }

        fileInputStream.close();
        fileOutputStream.close();
        reader.close();
    }
}
