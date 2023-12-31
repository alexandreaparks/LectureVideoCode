package topic_2_loops_arrays;

import java.util.Random;

import static input.InputUtils.stringInput;

public class WhileLoopBreakExample {
    public static void main(String[] args) {

        // a break statement ends the loop or in other words, it breaks out of the loop

        Random randomNumberGenerator = new Random();

        while (true) {

            System.out.println("Would you like a random number?");
            System.out.println("Enter any key for a random number, or Q to quit");

            String userInput = stringInput();

            if (userInput.equalsIgnoreCase("Q")) {
                break;   //immediately stops the loop, jump to next statement after the loop
            }

            // If we get to this line, the loop didn't break
            // Generate and display a random number

            int randomNumber = randomNumberGenerator.nextInt();
            // .nextInt() with no argument generate a random number from all the possible integer values

            System.out.println("Your random number is " + randomNumber);

        }

        System.out.println("Thanks for using the program - bye!");

    }
}
