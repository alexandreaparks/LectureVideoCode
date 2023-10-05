package topic_3_methods;

import static input.InputUtils.intInput;

public class CreditsToGraduate {
    public static void main(String[] args) {

        // get user input of credits earned and total program required credits
        int creditsEarned = intInput("How many credits have you already earned?");
        int totalProgramCredits = intInput("How many total credits does your program require?");

        // call method to calculate credits still needed with 2 arguments
        int creditsNeededToGraduate = howManyCreditsToGraduate(creditsEarned, totalProgramCredits);

        // print credits needed to graduate
        System.out.println("You still need " + creditsNeededToGraduate + " credits to graduate.");

    }

    private static int howManyCreditsToGraduate(int creditsEarned, int totalProgramCredits) {

        int creditsNeeded = totalProgramCredits - creditsEarned; // calculate remaining credits

        return creditsNeeded; // return to main method
    }


}
