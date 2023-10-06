package topic_3_methods;


import static input.InputUtils.*;
import static input.InputUtils.doubleInput;

// change Tires4 so that it shows price per 1000 miles
public class Tires5 {

    public static void main(String[] args) {

        int numberOfTiresToCompare = positiveIntInput("Enter the number of tires to compare: ");

        String[] tireReports = new String[numberOfTiresToCompare];

        for (int t = 0; t < numberOfTiresToCompare; t++) {
            String report = getTireInfo();
            //System.out.println(report);
            tireReports[t] = report;
        }

        printReportsTable(tireReports);

    }

    public static String getTireInfo() {


        String tireName = stringInput("Enter name of tire: ");
        double price = doubleInput("Enter price for " + tireName + ":");
        int miles = intInput("Enter the warranty miles for " + tireName + ":");
        double pricePerThousandMiles = price / miles * 1000;

        return String.format("%s costs $%.2f, has a %d mile warranty, costs $%.3f per 1000 miles",
                tireName, price, miles, pricePerThousandMiles);

    }

    private static void printReportsTable(String[] tireReports) {

        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);
        }

    }
}
