package topic_1_if_else;

import static input.InputUtils.doubleInput;

public class WeatherExample {
    public static void main(String[] args) {

        double tempYesterday = 100;
        double tempToday = doubleInput("What is today's temp?"); // ask user for double input

        // if else statement to determine which day was warmer
        if (tempYesterday > tempToday) {
            // extra challenge - warmer by how many degrees?
            double tempDifference = tempYesterday - tempToday;
            System.out.printf("Yesterday was warmer by %.2f degrees.", tempDifference); // formatted to display 2 decimals
        } else {
            // extra challenge - warmer by how many degrees?
            double tempDifference = tempToday - tempYesterday; // reverse subtraction from if statement
            System.out.printf("Today is warmer by %.2f degrees.", tempDifference); // formatted to display 2 decimals
        }
    }
}
