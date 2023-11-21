package topic_6_files_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CodeStyleCheck {
    public static void main(String[] args) {

        String filename = "ReadNumbersFromFileResource.java";
        int maxLineLength = 100;

        // try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(filename))) {

            boolean linesTooLong = false;

            int numberOfLinesTooLong = 0;

            String line = bufferedReader.readLine();

            int lineCounter = 1;

            while (line != null) {

                if (line.length() > maxLineLength) {
                    System.out.println("Line number " + lineCounter + " is too long: ");
                    System.out.println(line);
                    linesTooLong = true;
                    numberOfLinesTooLong++;
                }
                lineCounter ++; // count every line
                line = bufferedReader.readLine();
            }

            if (linesTooLong) {
                System.out.println("There were " + numberOfLinesTooLong + " lines that were too long!");
            } else {
                System.out.println("There were no lines that were too long!");
            }




        } catch (IOException e) {
            System.out.println("Error reading file " + filename + " because " + e);
        }


    }

}
