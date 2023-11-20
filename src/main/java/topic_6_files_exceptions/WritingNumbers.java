package topic_6_files_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingNumbers {
    public static void main(String[] args) throws IOException {

        // Integers are interpreted as char values
        // Unicode values - number codes for characters
        // If you want to write the integer 65, must be converted to a string
        // Can add + "\n" makes the int a String
        // Can also use .write(Integer.toString(data2));
        // OR .write(Integer.toString(data2) + "\n"); to add in the newline
        // Can also append an empty string (data2 + " ");

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;

        // creating FileWriter
        FileWriter writer = new FileWriter("numbers.txt");
        // wrapping in a BufferedWriter
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write(data1 + "\n"); // adding \n makes it a String
        bufferedWriter.write(data2 + "\n");
        bufferedWriter.write(data3 + "\n"); // int number argument

        // bufferedWriter.write(number); // error after trying to write int values to file
        bufferedWriter.write("test"); // write a string

        bufferedWriter.close();


    }
}
