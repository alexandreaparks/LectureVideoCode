package topic_3_methods;

import static input.InputUtils.doubleInput;

public class Squares3 {

    // main method - the first code to run
    public static void main(String[] args) {

        System.out.println("Here are the squares of the numbers 1 to 10");

        for (int x = 1 ; x <= 10 ; x++ ) { // start at 1, count up to and include 10, increase by 1 every iteration
            double xsquared = square(x); // call square method on every iteration to get squares of numbers 1 - 10
            System.out.println("The square of " + x + " is " + xsquared); // print the squared number on every iteration
        }

    }    // end of main method


    // square method takes one argument as a parameter
    // it calculates the square of that number by multiplying it by itself
    // and returns the squared number back to the main method
    public static double square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        return sq;

    }    // end of squares method


}
