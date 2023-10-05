package topic_3_methods;

import static input.InputUtils.doubleInput;

public class Squares2 {
    // main method - first code to run
    public static void main(String[] args) {

        double number = doubleInput("Please enter a number and I'll square it");
        double squared = square(number); // call square method with number as argument to get squared value

        System.out.println("The square of " + number + " is " + squared); // print squared number from main method


    }    // end of main method


    // square method takes one argument as a parameter
    // it calculates the square of that number by multiplying it by itself
    // and returns the squared number back to the main method
    public static double square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        return sq; // return sq to main method

    }    // end of square method
}
