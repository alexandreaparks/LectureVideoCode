package topic_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

public class ClassCodes {
    public static void main(String[] args) {

        // create HashMap with class codes and their respective names
        Map<Integer, String> classes = new HashMap<>();

        // add my classes to the HashMap using .put()
        classes.put(2545, "Java Programming");
        classes.put(2775, "Systems Analysis and Design");
        classes.put(2009, "Research Methods with Ethical and Civic Responsibility Focus");
        classes.put(1111, "Research and Composition for Change");

        // use loop to print all class codes and names
        // not including ITEC because 2 of my classes are not ITEC
        for (Integer code: classes.keySet()) {
            System.out.println(code + " " + classes.get(code));
        }

        System.out.println();

        // print number of classes I'm taking
        System.out.println("I'm taking " + classes.size() + " classes this semester.");

        System.out.println();

        // add variable
        int searchCode = 2417; // android programming

        // write if-statement to check if 2417 is in HashMap

        if (classes.containsKey(searchCode)) {
            System.out.println(searchCode + " was found! The class name is " + classes.get(searchCode));
        } else {
            System.out.println("Code not found!");
        }


        //for (Integer code: classes.keySet()) {
        //    if (code.equals(searchCode)) {
        //        System.out.println(searchCode + " was found! The class name is " + classes.get(searchCode));
        //   }
        //}

        // add another variable
        int searchCode2 = 2545;

        // write if-statement to check if 2545 is in HashMap

        String className = classes.get(searchCode2);
        if (className == null) {
            System.out.println(searchCode2 + " not found!");
        } else {
            System.out.println(searchCode2 + " was found! The class name is " + className);
        }

        //if (classes.containsKey(searchCode2)) {
        //    System.out.println(searchCode2 + " was found! The class name is " + classes.get(searchCode2));
        //} else {
        //System.out.println("Code not found!");
        //}


        //for (Integer code: classes.keySet()) {
        //    if (code.equals(searchCode2)) {
        //        System.out.println(searchCode2 + " was found! The class name is " + classes.get(searchCode2));
        //    }
        //}
    }
}
