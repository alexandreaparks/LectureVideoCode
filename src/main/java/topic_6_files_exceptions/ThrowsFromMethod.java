package topic_6_files_exceptions;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ThrowsFromMethod {
    public static void main(String[] args) {

        String filename = "does_not_exist.txt";    // try creating this file/using a file that does exist

        try {
            List<String> data = readFromFile(filename);
            System.out.println(data);
        } catch (FileNotFoundException fnfe) { // catches if the file is not found
            System.out.println("The file " + filename + " was not found. Fix and try again.");
        } catch (IOException e ) { // catches other general IOExceptions
            System.out.println("Sorry, couldn't read from file " + filename);
        }
    }


    private static List<String> readFromFile(String filename) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        List<String> lines = new ArrayList<>();
        String line = bufferedReader.readLine();
        while (line != null) {
            lines.add(line);
            line = bufferedReader.readLine();
        }
        bufferedReader.close();
        return lines;
    }
}
