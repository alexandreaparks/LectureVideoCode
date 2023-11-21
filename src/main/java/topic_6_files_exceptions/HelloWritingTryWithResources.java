package topic_6_files_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class HelloWritingTryWithResources {
    public static void main(String[] args) {


        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("hello.txt"))) {


            bufferedWriter.write("Hello!\n"); // add newline so the next line you write is on a newline
            bufferedWriter.write("More data here");
            bufferedWriter.newLine(); // adds newline to file rather than using \n
            bufferedWriter.write("Goodbye!\n");

        } catch (IOException e) {
            System.out.println("Error writing to file " + e);
        }

        try (FileWriter writer2 = new FileWriter("hello.txt", true);
             BufferedWriter bufferedWriter2 = new BufferedWriter(writer2)) { // append flag - true means add to the end

            bufferedWriter2.write("Other data!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("Hello programmers!");
            bufferedWriter2.newLine();
            bufferedWriter2.write("End of file!");
            bufferedWriter2.newLine();
            
        } catch (IOException e) {
            System.out.println("Error appending data to file " + e);
        }



    }
}
