package topic_2_loops_arrays;

import static input.InputUtils.stringInput;

public class WhileLoopPassword {
    public static void main(String[] args) {

        // define variables
        String secretPassword = "kittens";

        System.out.println();
        String userPassword = stringInput("Enter the password: ");

        // user only gets 5 tries
        int maxGuesses = 5;

        // use equals method to check if two Strings have the exact same characters
        // Need to check that the password is correct
        //The loop will repeat while the password entered is NOT "kittens"
        while ( ! userPassword.equals(secretPassword) && maxGuesses > 0) {
            System.out.println("Password incorrect, access denied!");
            System.out.println("Try again!");
            userPassword = stringInput("Enter the password: ");
            maxGuesses--;
        }

        if (maxGuesses > 1) {
            // if the condition is false, the loop stops and the user got the password correct
            System.out.println("Correct password - access granted!");

            // top secret program here!

        } else {
            System.out.println("Max number of password attempts.");
            System.exit(0); // ends program
        }




    }
}
