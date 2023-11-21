package topic_6_files_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadNumbersFromFileResource {
    public static void main(String[] args) {

        // Use try-with-resources for file input/output
        // Will also use it with database code later

        // If you need to catch other exceptions - use regular try-catch blocks

        List<Integer> numbers = new ArrayList<>();
        String filename = "numbers.txt";

        // resource is closed automatically
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {


            String line = reader.readLine();

            while (line != null) {

                try {
                    int number = Integer.parseInt(line);
                    numbers.add(number);
                } catch (NumberFormatException e) { // ignore line
                    System.out.println(line + " is not an integer - ignoring.");
                }
                line = reader.readLine();
            }

            System.out.println(numbers);
        } catch (IOException e) {
            System.out.println("Error reading file " + e);
        }
    }
}
