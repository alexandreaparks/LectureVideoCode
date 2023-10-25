package topic_5_hashmaps;


import java.util.HashMap;
import java.util.Map;

public class States {
    public static void main(String[] args) {

        Map<String, String> stateAbbreviations = new HashMap<>();
        stateAbbreviations.put("Minnesota", "MN"); // add key-value pair to HashMap
        stateAbbreviations.put("Wisconsin", "WI");
        stateAbbreviations.put("Michigan", "MI");
        stateAbbreviations.put("Iowa", "IA"); // this added the key-value pair to the HashMap at the beginning
        // totally fine as long as the keys are with their respectful values
        // can use a TreeMap if you need the key-value pairs to be sorted (works the same as a HashMap)

        System.out.println(stateAbbreviations);
        System.out.println(stateAbbreviations.get("Minnesota")); // gets the value for the key in parentheses
        System.out.println(stateAbbreviations.get("Iowa"));

        String wisconsinAbbreviation = stateAbbreviations.get("Wisconsin"); // case sensitive
        System.out.println(wisconsinAbbreviation);

        // loop through keys
        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            System.out.println(stateAbbreviations.get(stateName)); // can also get the values when looping over keys
        }

        // loop through values
        for (String abbreviations: stateAbbreviations.values()) {
            System.out.println(abbreviations);
        }

        // search for a specific value in a HashMap
        // loop over key-value pairs until value is found
        String searchAbbreviation = "MI";
        for (String stateName: stateAbbreviations.keySet()) {
            System.out.println(stateName);
            String abbreviation = stateAbbreviations.get(stateName);
            if (abbreviation.equals(searchAbbreviation)) {
                System.out.println("Found it! The state for " + searchAbbreviation + " is " + stateName);
            }
        }

        // create new HashMap to swap keys and values
        Map<String, String> abbreviationsStateNames = new HashMap<>();

        for (Map.Entry<String, String> entry: stateAbbreviations.entrySet()) {
            String state = entry.getKey();
            String abbreviation = entry.getValue();
            abbreviationsStateNames.put(abbreviation, state);
        }

        System.out.println(stateAbbreviations);
        System.out.println(abbreviationsStateNames);


        System.out.println("There are " + stateAbbreviations.size() + " states listed."); // size counts how many pairs

    }
}
