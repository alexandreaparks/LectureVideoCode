package topic_2_loops_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // code from class 9/13/23
        // print Hello world! 10 times
        for (int x = 0; x < 10; x++) {
            System.out.println("Hello world!");
        }

        // create array to store Strings
        // [] is an array of sStrings, not a single String
        // new keyword means make a new array
        // use new keyword for anything that isn't a primitive data type
        // int, double, boolean, String
        // repeat the data type and include the size in []
        String[] animals = new String[3]; // 3 is size of the array
        String example = "hello";

        animals[0] = "cat"; // use square bracket to access elements of array
        animals[1] = "fish"; // number is the array index
        animals[2] = "hamster";

        System.out.println(animals + "\n"); // looks funky

        System.out.println(Arrays.toString(animals)); // much better

        System.out.println("\n");

        for (int index = 0; index < animals.length; index++) {
            System.out.println("The array index is " + index);
            System.out.println(animals[index] + "\n");
        }

        for (String animal: animals) { // enhanced for loop
            System.out.println(animal); // less code, but can't access the index
        }



    }
}
