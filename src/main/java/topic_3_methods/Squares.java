package topic_3_methods;

import static input.InputUtils.doubleInput;

public class Squares {

    // main method - first code to run
    public static void main(String[] args) {

        double number = doubleInput("Please enter a number and I'll square it");
        square(number); // call square method with number as argument


    }    // end of main method


    // square method takes one argument as a parameter
    // it calculates the square of that number by multiplying it by itself
    // and prints the number and its square value
    public static void square(double n) {

        double sq = n * n;   // The square of a number is that number multiplied by itself
        System.out.println("The square of " + n + " is " + sq);

    }    // end of square method

}
