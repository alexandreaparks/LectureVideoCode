package topic_1_if_else;

import static input.InputUtils.doubleInput;

public class AboveFreezing {
    public static void main(String[] args) {
        // get user input
        double temp = doubleInput("Enter today's temperature in F:");

        // use if statement to determine if it's above freezing
        if (temp > 32) {
            // only runs if above freezing
            System.out.println("It's above freezing.");
        }
    }
}
