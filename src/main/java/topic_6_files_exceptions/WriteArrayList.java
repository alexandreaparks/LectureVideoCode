package topic_6_files_exceptions;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteArrayList {
    public static void main(String[] args) throws IOException {

        final String filename = "ITEC_Classes.txt"; // constant so filename can't be changed
        // write lines to the file "ITEC 2545 Java" etc...
        List<String> classNames = List.of("Java", "Web", "C#");
        List<Integer> classCodes = List.of(2545, 2560, 2505);

        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));

/*
        for (String name: classNames) {
            bufferedWriter.write(name + "\n");
        }

        we need to loop through 2 lists so this won't work - use a classic for loop instead
*/

        for (int i = 0; i < classNames.size(); i++) {
            String name = classNames.get(i);
            int code = classCodes.get(i);
            bufferedWriter.write("ITEC " + code + " " + name + "\n");
            /*
             can also use:
             bufferedWriter.write(String.format("ITEC %d %s \n", code, name));
             OR
             String outputLine = String.format("ITEC %d %s \n", code, name);
             bufferedWriter.write(outputLine);
            */
        }


        bufferedWriter.close();


        // read file

        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));

        List<String> classDescriptions = new ArrayList<>();

        String line = bufferedReader.readLine();

        while ( line != null ) {
            classDescriptions.add(line); // add line to list within loop, so we know it's not null
            line = bufferedReader.readLine();
        }

        System.out.println("End of file reached!");
        System.out.println(classDescriptions);

    }
}
