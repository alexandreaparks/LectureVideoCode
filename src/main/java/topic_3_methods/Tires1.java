package topic_3_methods;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

public class Tires1 {
    public static void main(String[] args) {

        String tireName = stringInput("Enter name of tire: ");
        double price = doubleInput("Enter price for " + tireName + ":");
        double miles = doubleInput("Enter the warranty miles for " + tireName + ":");
        double pricePerMile = price / miles;

        System.out.println("The " + tireName + " tire costs $" + pricePerMile + " dollars per mile.");

    }
}
