package topic_6_files_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteArray {
    public static void main(String[] args) throws IOException {

        String[] months = {"Jan", "Feb", "Mar"};
        String filename = "months.txt";

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

        for (String month: months) {
            bufferedWriter.write(month + "\n");
            // bufferedWriter.newLine();
        }

        bufferedWriter.close();
    }
}
