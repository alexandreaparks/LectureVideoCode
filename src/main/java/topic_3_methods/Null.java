package topic_3_methods;

import java.util.ArrayList;
import java.util.List;

public class Null {

    public static void main(String[] args) {

        // any object type can have the value null

        // null means the variable name exists, but it doesn't refer to - or point to - any data

        // primitive types cannot be null
        // int number = null; // error

        // can create a variable and set it to null
        // might do it to specifically mean we don't have any data for this variable
        // the data is missing or unknown
        String name = null;

        // a null object is not the same as an empty object
        List<String> myList = null;
        List<String> emptyList = new ArrayList<>();

        String anotherName = ""; // empty string - different from a null string

        System.out.println(name); // no error

        if (name == null) { // test if variable is null
            System.out.println("There is no name.");
        }

        if (name != null) {
            System.out.println("The name " + name + " has " + name.length() + " letters.");
        }

        name = "Alexandrea";

        System.out.println(name);

        if (name != null) {
            System.out.println("The name " + name + " has " + name.length() + " letters.");
        }



    }
}
