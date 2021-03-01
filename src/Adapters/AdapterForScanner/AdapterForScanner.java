package Adapters.AdapterForScanner;

import java.io.IOException;
import java.util.Scanner;

public class AdapterForScanner {
    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;
        PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }

        @Override
        public Person read() throws IOException{
            Scanner
        }

    }
}
