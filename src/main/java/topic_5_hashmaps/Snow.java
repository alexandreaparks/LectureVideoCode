package topic_5_hashmaps;

import java.util.HashMap;
import java.util.Map;

import static input.InputUtils.*;

public class Snow {
    public static void main(String[] args) {

      Map<String, Double> snowfall = new HashMap<>();

      snowfall.put("January", 3.1);
      snowfall.put("February", 10.8);
      snowfall.put("December", 3.1);
      snowfall.put("March", 4.1);
      snowfall.put("April", 0.0); // zero is different from not putting any data (null), so it's worth putting zero

      System.out.println(snowfall);

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

      System.out.println(snowfall);

      if (snowfall.containsKey(newMonth)) {
          // ask if we should overwrite?
          double snow = snowfall.get(newMonth);
          System.out.println("The HashMap already contains that month, " + newMonth + " snow = " + snow + " inches.");
          boolean overwrite = yesNoInput("Overwrite data?");
          if (overwrite) {
              snowfall.put(newMonth, newSnow);
          } else {
              System.out.println("Data was not added.");
          }
      } else {
          snowfall.put(newMonth, newSnow);
      }

      System.out.println(snowfall);

    }
}
