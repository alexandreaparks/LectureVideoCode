package topic_3_methods;

import static input.InputUtils.intInput;

public class Count {
    public static void main(String[] args) {

        // this program will print a list of numbers in order

        int smallNumber = intInput("Enter a small number: ");
        int largeNumber = intInput("Enter a large number: ");

        System.out.println("I will count from " + smallNumber + " to " + largeNumber);

        count(smallNumber, largeNumber); // call count method with smallNumber and largeNumber as arguments
    }

    // count method to count from min number to max number
    // int min and int max are parameters
    // method doesn't return anything (void)
    public static void count(int min, int max) { // void keyword means method does not return anything

        for (int i = min; i <= max; i++) { // start at min, count up to and include max, increase by 1
            System.out.println(i); // print number on every iteration
        }
    }




}
