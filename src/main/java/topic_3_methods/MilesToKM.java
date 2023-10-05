package topic_3_methods;

import static input.InputUtils.doubleInput;

public class MilesToKM {
    public static void main(String[] args) {

        // get user input for miles
        double miles = doubleInput("Enter a number of miles to convert to kilometers: ");
        double km = milesToKM(miles); // call milesToKM method with miles argument
        System.out.println(miles + " miles is equal to " + km + " kilometers.");
    }

    // milesToKM method used to convert miles to kilometers
    private static double milesToKM(double miles) { // double in method name means must return double

        double km = miles * 1.6; // calculate km using miles parameter
        return km; // return double km value to main calling method
    }
}
