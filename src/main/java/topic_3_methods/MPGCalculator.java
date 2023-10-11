package topic_3_methods;

import static input.InputUtils.doubleInput;

public class MPGCalculator {
    public static void main(String[] args) {

        // get user input for gallons of gas used and number of miles driven
        double milesDriven = doubleInput("How many miles did you drive?");
        double gallonsOfGasUsed = doubleInput("How many gallons of gas did you use?");

        // call mpg method to determine MPG and send 2 arguments needed to calculate it
        double mpg = mpg(milesDriven, gallonsOfGasUsed);

        // print mpg
        System.out.println("You got " + mpg + " MPG on your road trip.");
    }

    // calculateMPG method takes 2 arguments to use as parameters
    public static double mpg(double milesDriven, double gallonsOfGasUsed) {

        // calculate mpg
        double mpg = milesDriven / gallonsOfGasUsed;

        return mpg; // return mpg to main method
    }
}
