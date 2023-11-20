package topic_6_files_exceptions;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingVariables {
    public static void main(String[] args) throws IOException {

        int classCode = 2545;
        double averageEnrollment = 22.16; // avg number of students in a semester
        String className = "Java";

        FileWriter writer = new FileWriter("Java.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("The class code is " + classCode + "\n");
        bufferedWriter.write("The average enrollment is " + averageEnrollment + "\n");
        bufferedWriter.write( "The class name is " + className + "\n");

        bufferedWriter.close();
        // writer.close(); // this works too
    }
}
