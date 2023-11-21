package topic_6_files_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReadingTryWithResources {
    public static void main(String[] args) {

        /*
         Try with resources

         cleaner code instead of using finally block
         buffered reader in parentheses is the resource
         don't need to close file


         Put the code to open the resource (for example, file reader) in a header for the try block
         If an exception is thrown within the try block, that resource is automatically closed AND the
         catch block runs
         If no exception is thrown, the file is automatically closed at the end of the try block
        */

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"))){

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

        }
    }
}
