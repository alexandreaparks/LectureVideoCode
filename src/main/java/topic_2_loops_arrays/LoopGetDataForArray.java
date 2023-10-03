package topic_2_loops_arrays;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class LoopGetDataForArray {
    public static void main(String[] args) {

        // create array to store 5 Strings
        String[] textbooks = new String[5];

        // loop 5 times to ask for bookNames which will be stored in the textbooks array
        for (int number = 0; number < textbooks.length; number++) {

            // ask for bookName with every loop
            String bookName = stringInput("Please enter the name of book #" + (number + 1) + ":");

            // use loop counter to add each bookName as an array element
            textbooks[number] = bookName;
        }

        System.out.println("Thank you! Here are the book names you entered: ");
        // use Array.toString to print array nicely
        // System.out.println(Arrays.toString(textbooks));

        // use loop to print each book name
        for (int number = 0; number < textbooks.length; number++) {
            System.out.println("Book #" + (number + 1) + " is " + textbooks[number]);
        }
    }
}
