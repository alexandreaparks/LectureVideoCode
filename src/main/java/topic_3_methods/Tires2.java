package topic_3_methods;

import static input.InputUtils.doubleInput;
import static input.InputUtils.stringInput;

// refine Tires program so that the calculations are in a method
public class Tires2 {
    public static void main(String[] args) {

        String report = getTireInfo();
        System.out.println(report);

    }

    public static String getTireInfo() {


        String tireName = stringInput("Enter name of tire: ");
        double price = doubleInput("Enter price for " + tireName + ":");
        double miles = doubleInput("Enter the warranty miles for " + tireName + ":");
        double pricePerMile = price / miles;

        return "The " + tireName + " tire costs $" + pricePerMile + " dollars per mile.";




    }


}
