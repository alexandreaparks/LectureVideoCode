package topic_5_hashmaps;

import java.util.HashMap;

public class States {
    public static void main(String[] args) {

        HashMap<String, String> stateAbbreviations = new HashMap<>();
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
    }
}
