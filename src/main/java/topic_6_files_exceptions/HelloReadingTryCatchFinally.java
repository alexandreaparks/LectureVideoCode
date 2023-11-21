package topic_6_files_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReadingTryCatchFinally {
    public static void main(String[] args) {

        BufferedReader bufferedReader = null; // initialize so it can be used in finally block
        try {

            bufferedReader = new BufferedReader(new FileReader("hello.txt"));

            // read lines of the file
            // create line variable to store each String on every iteration of while loop
            // also reads the first line of the file
            String line = bufferedReader.readLine();

            while (line != null) { // while readLine does not return null

                System.out.println(line); // print each line on every iteration
                line = bufferedReader.readLine(); // read the next line

            }


        } catch (IOException e) {
            System.out.println("Sorry, file not found." + e); // only runs if there is an IOException
        } finally { // this runs no matter what
            if (bufferedReader != null) {
                try {
                    bufferedReader.close();
                } catch (IOException e ) {
                    System.out.println("Error closing the file." + e);
                }
            }
        }
    }
}
