package topic_3_methods;


import static input.InputUtils.*;
import static input.InputUtils.doubleInput;

// modify Tires3 so that it creates a report of all tires compared and then prints it at the end
public class Tires4 {

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
        double miles = doubleInput("Enter the warranty miles for " + tireName + ":");
        double pricePerMile = price / miles;

        return "The " + tireName + " tire costs $" + pricePerMile + " dollars per mile.";

    }

    private static void printReportsTable(String[] tireReports) {

        for (int t = 0; t < tireReports.length; t++) {
            System.out.println(tireReports[t]);
        }

    }

}
