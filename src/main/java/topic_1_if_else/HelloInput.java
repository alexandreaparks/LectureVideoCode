package topic_1_if_else;

import static input.InputUtils.*;

public class HelloInput {
    public static void main(String[] args) {
        // use InputUtils to get user input
        // stringInput for strings
        String userName = stringInput("Please enter your name: ");
        System.out.println("Welcome, " + userName + "!");

        // intInput for integers
        // positiveIntInput for positive integers
        int numberOfClasses = positiveIntInput("How many classes are you taking?");

        String units = "classes";

        // if statement to change classes to class if only 1 class
        if (numberOfClasses == 1) {
            units = "class"; // change value of units
        }

        System.out.println("You are taking " + numberOfClasses + " " + units + " this semester.");
        System.out.printf("You are taking %d %s this semester.\n", numberOfClasses, units);


        // more InputUtils
        int candyBars = intInput("How many candy bars?");
        //check if integer is positive
        int people = positiveIntInput("How many people?");

        double price = doubleInput("What is the price of the item?");
        // checks if double is positive
        double length = positiveDoubleInput("How long is the string?");

        // y or n or yes or no of any case will work
        boolean ok = yesNoInput("OK to continue?");

        // can also right code like this
        System.out.println("What is your name?");
        String data = stringInput();


    }
}
