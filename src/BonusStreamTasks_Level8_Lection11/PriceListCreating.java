package BonusStreamTasks_Level8_Lection11;

import java.io.*;

public class PriceListCreating {

    public static void main(String[] args) throws Exception {

        if (args.length == 0) {
            return;
        } else {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String fileName = br.readLine();

            FileReader fileReader = new FileReader(fileName);
            br = new BufferedReader(fileReader);
            BufferedWriter bw = new BufferedWriter(new FileWriter(fileName, true));

            int maxId = 0;

            while ((br.ready())) {
                int id = Integer.parseInt(br.readLine().substring(0, 8).trim());
                if (id > maxId) {
                    maxId = id;
                }
            }
            br.close();

            switch (args[0]) {
                case "-c":
                    bw.newLine();
                    bw.write(String.format("%-8d%-30s%-8.2f%-4d", ++maxId, args[1], Float.parseFloat(args[2]), Integer.parseInt(args[3])));
                default: bw.close();
                    break;
            }

        }
    }
}
