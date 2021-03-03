package FileReaderAndFileWriterTasks;

import java.io.*;
import java.util.ArrayList;

public class OnlyEvenCharactersFromFile1ToFile2 {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String file1 = bufferedReader.readLine();
        String file2 = bufferedReader.readLine();
        bufferedReader.close();

        ArrayList<Integer> integerArrayList = new ArrayList<>();

        FileReader reader = new FileReader(file1);
        while (reader.ready()){
            int number = reader.read();
            integerArrayList.add(number);
        }
        reader.close();

        FileWriter writer = new FileWriter(file2);

        for (int i = 0; i<integerArrayList.size(); i++){
            if ((i+1)%2 == 0){
                writer.write(integerArrayList.get(i));
            }
        }
        writer.close();

//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = reader.readLine();
//        String fileName2 = reader.readLine();
//        reader.close();
//        BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
//        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName2));
//
//        while (true){
//            if (reader1.read() == -1) break;
//            int data = reader1.read();
//            writer.write(data);
//        }
//        writer.close();
//        reader1.close();
    }
}
