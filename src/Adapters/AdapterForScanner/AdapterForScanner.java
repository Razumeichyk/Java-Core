package Adapters.AdapterForScanner;

import java.io.IOException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class AdapterForScanner {
    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        PersonScannerAdapter(Scanner fileScanner) {
            this.fileScanner = fileScanner;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

        @Override
        public Person read() throws IOException {
            String person = fileScanner.nextLine();
            String[] data = person.split(" ", 4);
            String dateBirth = data[3];
            SimpleDateFormat formatter = new SimpleDateFormat("dd MM yyyy");
            Date date = null;
            try {
                date = formatter.parse(dateBirth);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return new Person(data[1], data[2], data[0], date);
        }

    }
}
