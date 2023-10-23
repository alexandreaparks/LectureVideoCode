package topic_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow2 {
    public static void main(String[] args) {

        Map<String, Double> snowfall = new HashMap<>();

        snowfall.put("January", 3.1);
        snowfall.put("February", 10.8);
        snowfall.put("December", 3.1);
        snowfall.put("March", 4.1);
        snowfall.put("April", 0.0); // zero is different from not putting any data (null), so it's worth putting zero

        System.out.println(snowfall);

        double total = 0.0;
        for (double snow: snowfall.values()) {
            total = total + snow;
        }

        System.out.printf("The total snow is %.2f.\n", total);

        for (String month: snowfall.keySet()) { // for loop to print the keys and values
            double snow = snowfall.get(month);
            System.out.printf("The snow in %s was %.2f inches\n", month, snow);
        }

        snowfall.put("February", 12.4);

        System.out.println(snowfall);

        System.out.println("The snow in January is " + snowfall.get("January") + " inches");

        System.out.println("The snow in July is " + snowfall.get("July") + " inches");

        if (snowfall.containsKey("July")) {
            System.out.println("There was snow in July!'");
        } else {
            System.out.println("There was no snow in July.");
        }

        String newMonth = stringInput("Enter name of month: ");
        double newSnow = doubleInput("Enter the amount of snow for " + newMonth + ":");

        // snowfall.put(newMonth, newSnow);


        Double snow = snowfall.get(newMonth);

        if (snow == null) {
            snowfall.put(newMonth, newSnow);
        } else {
            // ask if we should overwrite?
            System.out.println("The HashMap already contains that month, " + newMonth + " snow = " + snow + " inches.");
            boolean overwrite = yesNoInput("Overwrite data?");
            if (overwrite) {
                snowfall.put(newMonth, newSnow);
            } else {
                System.out.println("Data was not added.");
            }
        }

        System.out.println(snowfall);
    }
}
