package topic_5_hashmaps;

import java.util.ArrayList;

import java.util.List;
import java.util.Map;


import static input.InputUtils.*;

public class RoadTripPlanner {
    public static void main(String[] args) {

        // create HashMap of distances to other cities in Minnesota from Minneapolis
        // use Map.of instead of .put()
        Map<String, Integer> distanceFromMPLS = Map.of(
                "Duluth", 154,
                "Brainerd", 127,
                "Stillwater", 26,
                "Ely", 245,
                "Red Wing", 54);

        // distanceFromMPLS.put("Rochester", 80); // causes an error because of Map.of



        // ask for max distance user wants to drive
        int maxDistanceWantingToDrive = positiveIntInput("Enter the maximum distance you want to " +
                "drive on your road trip: ");

        // use loop to search HashMap and print all cities that are within user's max distance
        // add each city to list so a message can be printed if no cities are within range
        List<String> citiesInRange = new ArrayList<>();
        for (String city: distanceFromMPLS.keySet()) {
            int distance = distanceFromMPLS.get(city);
            if ( distance <= maxDistanceWantingToDrive) {
                //System.out.println(city + " is " + distance + " miles away from Minneapolis.");
                citiesInRange.add(city);
            }
        }

        if (citiesInRange.isEmpty()) {
            System.out.println("Sorry, no Minnesota cities are within your driving distance!");
        } else {
            System.out.println("There are " + citiesInRange.size() + " cities you can drive to: ");
            for (String city: citiesInRange) {
                System.out.println(city);
            }
        }

    }
}
