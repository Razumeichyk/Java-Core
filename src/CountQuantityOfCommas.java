import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class CountQuantityOfCommas {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputStream = new FileInputStream(reader.readLine());


        int count = 0;

        while (inputStream.available()>0){
            if (inputStream.read() == ','){
                count++;
            }
        }
        reader.close();
        inputStream.close();

        System.out.println(count);
    }
}
