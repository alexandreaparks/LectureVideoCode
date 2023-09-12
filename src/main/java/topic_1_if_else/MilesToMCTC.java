package topic_1_if_else;

import static input.InputUtils.positiveDoubleInput;

public class MilesToMCTC {
    public static void main(String[] args) {
        // get user input
        double milesFromMCTC = positiveDoubleInput("How many miles do you live from MCTC? ");

        // calculate kilometers from MCTC using miles
        double km = milesFromMCTC * 1.60934;

        // display output
        System.out.printf("You live %.2f kilometers from MCTC.\n", km);

        // conditional statement to print a message about how far the user lives from MCTC
        if (milesFromMCTC > 10) {
            System.out.println("You live more than 10 miles from MCTC.");
        } else if (milesFromMCTC == 10) {
            System.out.println("You live exactly 10 miles from MCTC.");
        } else {
            System.out.println("You live less than 10 miles from MCTC.");
        }
    }
}
