package topic_2_loops_arrays;

import static input.InputUtils.doubleInput;

public class BusFaresWithConstant {
    public static void main(String[] args) {

        // constants can't be changed throughout the program
        // best practice is uppercase and separated with underscores
        // use final keyword to indicate a constant

        // define variables & constants
        final int NUMBER_OF_DAYS = 7; // constant // final means NUMBER_OF_DAYS can't change
        double total = 0;

        // use for loop to ask for 7 bus fares for the week and create running total of all fares
        for (int day = 1 ; day <= NUMBER_OF_DAYS ; day++) {
            double amountSpent = doubleInput("What did you spend on bus fares on day " +
                    day + "?");
            total = total + amountSpent; // running total of fares
        }

        System.out.printf("Total for the week = $%.2f.", total);
    }
}
