package week_1_if_else;

import static input.InputUtils.positiveIntInput;
import static input.InputUtils.yesNoInput;

public class CanYouBePresident {
    public static void main(String[] args) {
        // intro
        System.out.println("Are you eligible to become President of the United States?");
        System.out.println("Please answer these three questions.");

        // get input
        boolean naturalBornCitizen = yesNoInput("Were you born in the United States?");
        int age = positiveIntInput("What is your age, in years?");
        int yearsLivedInUSA = positiveIntInput("How many years have you lived in the United States?");

        // use && operator and if - else statement to determine eligibility
        if (naturalBornCitizen && age >= 35 && yearsLivedInUSA >= 14) {
            System.out.println("You meet the eligibility requirements to become president.");
        } else {
            System.out.println("Sorry, you do not meet the requirements.");
        }

    }
}
