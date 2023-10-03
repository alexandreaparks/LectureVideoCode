package topic_2_loops_arrays;

import static input.InputUtils.doubleInput;

public class HeatingUtilityBills {
    public static void main(String[] args) {

        // create array to store bill totals for 12 months
        double[] monthlyBills = new double[12];

        // create array for month names
        String[] monthNames = {"January", "February", "March", "April", "May", "June", "July", "August", "September",
        "October", "November", "December"};

        // declare total variable at 0 for running total
        double total = 0.0;

        // loop through every month, ask for monthly bill, add to monthlyBills array
        for (int month = 0; month < monthNames.length; month++) {
            String monthName = monthNames[month]; // get month names from months array

            // ask for monthly bills
            double bill = doubleInput("How much was your heating bill in " + monthName + "?");
            monthlyBills[month] = bill; // add each bill to monthlyBills array
            total = total + bill; // running total of bills
        }

        // calculate average of bills
        double averageBill = total / monthlyBills.length;

        // use loop to display bills for each month
        System.out.println("Here's the bill totals you entered for each month: \n");
        for (int x = 0; x < monthNames.length; x++) {
            System.out.printf("%s: $%.2f\n", monthNames[x], monthlyBills[x]);
        }

        System.out.printf("\nThe total of all heating bills for the year is $%.2f.\n", total);
        System.out.printf("The average of all heating bills for the year is $%.2f.", averageBill);
    }
}
