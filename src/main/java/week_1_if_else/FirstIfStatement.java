package week_1_if_else;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class FirstIfStatement {

    // psvm shortcut
    public static void main(String[] args) {

        // sout shortcut
        // get String input
        String message = stringInput("Enter some text: ");
        //print String with user input
        System.out.println("Thanks, your message was " + message + ".");

        // get double input
        double price = doubleInput("Please enter the price of chips: ");

        // if statement to print a message if the price is less than 0
        if (price < 0) {
            System.out.println("That is an error, price can't be negative.");
        } else if (price == 0) {
            System.out.println("They are free!");
        } else {
            System.out.printf("Thanks, the price is $%.2f.", price);
        }

    }
}
