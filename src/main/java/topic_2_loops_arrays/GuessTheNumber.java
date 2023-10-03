package topic_2_loops_arrays;

import static input.InputUtils.intInput;
import java.util.Random;

public class GuessTheNumber {
    public static void main(String[] args) {

        // define variables
        Random random = new Random();
        int secretNumber = random.nextInt(100); // generates random number between 0 and 999

        // ask user for guess
        int guess = intInput("Guess the number!");

        while (guess != secretNumber) {
            System.out.println("That's wrong, try again!");

            if (guess < secretNumber) {
                System.out.println("Guess higher!");
            }

            if (guess > secretNumber) {
                System.out.println("Guess lower!");
            }

            guess = intInput("Guess the number!"); // ask again for guess if wrong
        }

        System.out.println("Correct!");
    }
}
