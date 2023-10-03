package topic_2_loops_arrays;

import java.util.Arrays;

public class ArrayExamples {
    public static void main(String[] args) {

        // array - simple data structure
        // array   [3, 22, 6, 7, 4]
        // element  0   1  2  3  4

        // you define how many items there will be
        // use array name to refer to the group as a whole
        // can also refer to each individual element

        // create array called scores to store 10 int variables
        // int[] scores = new int[10];
        // can also use int scores[] = new int[10];

        // square brackets mean we are creating an array, not just a simple int variable
        // use new keyword because arrays are objects,  and we are making a new object
        // must declare the size when an array is created

        // use variable to specify thew size of an array
        int size = 10;
        int[] moreData = new int[size];

        // create an array called names to store 100 Strings
        String[] names = new String[100];

        // create an array to store 70 doubles
        double[] prices = new double[70];

        // create array to store 3 ints
        int[] data = new int[3];

        // define elements of array
        data[0] = 10;
        data[1] = 15;
        data[2] = 8;

        // print first element
        System.out.println("First element = " + data[0]);

        // store second element in another variable
        int secondElement = data[1];
        // store last element in another variable
        int lastElement = data[2];

        // array numbering starts at 0
        // the last item is (array size -1)

        int[] scores = new int[10];
        scores[0] = 98;
        scores[7] = 76;
        scores[4] = 54;
        scores[9] = 98; // last element of array
        // scores[10] = 87; // ERROR - array only goes up to 9
        // scores[-1] = 92; // ERROR

        // example int array
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 100;
        //  numbers[5] = 3; // ERROR out of bounds

        String[] classNames = {"Java", "C#", "Web", "iOS", "Android"}; // array initializer syntax
        // classNames[0] = "Java";
        // classNames[1] = "C#";
        // classNames[2] = "Web";

        System.out.println("One of the second year classes is " + classNames[0]);

        // determine length of classNames array
        int numberOfClasses = classNames.length;
        System.out.println("There are " + numberOfClasses + " classes.");

        System.out.println("The classes are: ");

        // use loop to print classNames array
        // use length of array to print every element of the array
        for (int x = 0; x < classNames.length; x++) {
            System.out.println(classNames[x]);
        }


        System.out.println(classNames); // prints weird
        System.out.println(Arrays.toString(classNames)); // prints correctly





    }
}
