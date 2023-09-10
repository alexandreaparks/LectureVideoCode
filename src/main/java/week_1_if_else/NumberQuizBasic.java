package week_1_if_else;

import static input.InputUtils.intInput;

public class NumberQuizBasic {
    public static void main(String[] args) {
        // define variables and get user input
        int secretNumber = 6;

        int guess = intInput("Guess the number I am thinking of: ");

        // output using conditional statement - tell them if they guessed correctly
        if (guess == secretNumber) {
            System.out.println("Nice job, you guessed correctly!");
        }

        System.out.println("Thanks for playing the number guessing game!");
    }
}
