package topic_1_if_else;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class BloodDonor {
    public static void main(String[] args) {
        // using && operator to test if 2 things are true
        // can be a blood donor if
        // they weigh at least 110lbs AND are age 17 or older

        // get user input
        System.out.println("What is your weight?");
        double weight = doubleInput();

        System.out.println("How old are you?");
        int age = intInput();

        // use conditional logic to determine donor eligibility
        if (weight >= 110 && age >= 17) {
            System.out.println("You are eligible to be a blood donor.");
        } else {
            System.out.println("Sorry, you are not eligible.");
            if (weight < 110) {
                System.out.println("You do not weigh enough. You must weight 110lbs or more.");
            }
            if (age < 17) {
                System.out.println("You are not old enough. You must be age 17 or older.");
            }
        }
    }
}
