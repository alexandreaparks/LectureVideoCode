package topic_6_files_exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class HelloReading {
    public static void main(String[] args) throws IOException {

        FileReader reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(reader);

        // shortcut for above code:

        // BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));

        // read lines of the file

//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine());
//        System.out.println(bufferedReader.readLine()); // this returns null because there's only 6 lines of data

        // Use a while loop instead of repeating like the above example

        // create line variable to store each String on every iteration of while loop
        // also reads the first line of the file
        String line = bufferedReader.readLine();

        while ( line != null ) { // while readLine does not return null

            System.out.println(line); // print each line on every iteration
            line = bufferedReader.readLine(); // read the next line

        }

        /*
         shortcut for above code:

         String line;
         while ( ( line = bufferedReader.readLine() ) != null ) {
              System.out.println(line);
         }
        */


        bufferedReader.close();
    }
}
