package topic_0_variables;

public class Temp {
    public static void main(String[] args) {
        // String and int variables to store date
        String currentMonth = "January";
        int dayOfMonth = 11;

        // double variables to store high/low temps
        double forecastHigh = 19.4;
        double forecastLow = -3.7;

        // calculate temp difference
        double tempDifference = forecastHigh - forecastLow;

        // print temp different without formatting
        System.out.println("On " + currentMonth + " " + dayOfMonth +
                ", the difference between the high and low temperatures is "
                + tempDifference + "F.");

        // String formatting
        System.out.printf("On %s %d, the difference between the high and low temperatures is %.1fF.",
                currentMonth, dayOfMonth, tempDifference);
    }
}
