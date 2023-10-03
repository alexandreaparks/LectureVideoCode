package topic_2_loops_arrays;

import static input.InputUtils.doubleInput;

public class BusFareTotalArrayDayNames {
    public static void main(String[] args) {

        // array with the names of each day of the week, used to loop when asking for bus fares
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        double total = 0; // initialize total with zero for running total as program loops

        // loop through all 7 days and ask for bus fares
        for (int day = 0; day < dayNames.length; day++) {
            String dayName = dayNames[day]; // get elements from dayNames array and store them in dayName with every loop
            double dayExpense = doubleInput("On " + dayName + ", what did you spend on bus fares?");
            total = total + dayExpense; // running total
        }

        System.out.printf("For the week, you spent $%.2f on bus fares.", total);
    }
}
