package topic_3_methods;



// refine Tires2 program so that it works with multiple kinds of tires

import static input.InputUtils.*;

public class Tires3 {

    public static void main(String[] args) {

        int numberOfTiresToCompare = positiveIntInput("Enter the number of tires to compare: ");

        for (int t = 0; t < numberOfTiresToCompare; t++) {
            String report = getTireInfo();
            System.out.println(report);
        }

    }

    public static String getTireInfo() {


        String tireName = stringInput("Enter name of tire: ");
        double price = doubleInput("Enter price for " + tireName + ":");
        double miles = doubleInput("Enter the warranty miles for " + tireName + ":");
        double pricePerMile = price / miles;

        return "The " + tireName + " tire costs $" + pricePerMile + " dollars per mile.";

    }
}
