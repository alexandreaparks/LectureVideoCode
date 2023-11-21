package topic_6_files_exceptions;

import java.io.*;

public class NameFavColorClassCodeWriteRead {

    // use throws IOException to tell IntelliJ that it's okay for the program to crash
    public static void main(String[] args) throws IOException {

        String filename = "NameFavColorClassCode.txt";
        String name = "Alexandrea Parks";
        String favColor = "blue";
        int classCode = 2545;

        // create FileWriter
        FileWriter writer = new FileWriter(filename);
        // wrap FileWriter with BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // write lines to file
        bufferedWriter.write("My name is " + name + "\n");
        bufferedWriter.write("My favorite color is " + favColor + "\n");
        // having the int added to Strings converts it to a String, so it's not confused for unicode
        bufferedWriter.write("The Java Programming class code is " + classCode + "\n");

        bufferedWriter.close(); // close file

        // create FileReader
        FileReader reader = new FileReader(filename);
        // wrap FileReader with BufferedReader
        BufferedReader bufferedReader = new BufferedReader(reader);

        // create variable to store each line in on every iteration
        // read first line of file
        String line = bufferedReader.readLine();

        // use while loop to read whole file
        while ( line != null ) { // while readLine() does not return null

            System.out.println(line); // print each line on every iteration
            line = bufferedReader.readLine(); // read the next line

        }

        bufferedReader.close(); // close file
    }
}
