package topic_6_files_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWriting {

    // add throws IOException to fix all the red squiggly line errors
    // basically saying if error happens - let the program crash
    public static void main(String[] args) throws IOException {

        // file will be created if it does not exist
        // file will be overwritten if it does exist

        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        // can also use:

        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"));

        bufferedWriter.write("Hello!\n"); // add newline so the next line you write is on a newline
        bufferedWriter.write("More data here");
        bufferedWriter.newLine(); // adds newline to file rather than using \n
        bufferedWriter.write("Goodbye!\n");

        bufferedWriter.close(); // don't forget to close the file!
        // if the file is not closed - data will not be written to file

        // when you re-run this program, it overwrites the hello.txt file

        // creating a new FileWriter to write new data to the same file
        // creating a new FileWriter in the same program still overwrites the file if it already exists
        // to not overwrite file, add the true append flag

        FileWriter writer2 = new FileWriter("hello.txt", true); // append flag - true means add to the end
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("Other data!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("Hello programmers!");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file!");
        bufferedWriter2.newLine();

        bufferedWriter2.close(); // don't forget to close the file!






    }
}
