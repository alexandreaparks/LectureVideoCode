package week_1_if_else;

import static input.InputUtils.intInput;

public class NumberQuizElseIfElse {
    public static void main(String[] args) {
        // define variables and get user input
        int secretNumber = 6;

        int guess = intInput("Guess the number I am thinking of: ");

        // output using conditional statement
        if (guess == secretNumber) {
            System.out.println("Nice job, you guessed correctly!");
        } else if (guess - secretNumber == 1) {
            System.out.println("Your guess is 1 too high!");
        } else if (secretNumber - guess == 1) {
            System.out.println("Your guess is 1 too low!");
        } else { // prints if incorrect guess
            System.out.println("Sorry, I was thinking of " + secretNumber + ".");
        }

        System.out.println("Thanks for playing the number guessing game!");
    }
}
