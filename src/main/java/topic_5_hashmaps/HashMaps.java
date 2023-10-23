package topic_5_hashmaps;

import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // HashMap - a Map Type

        // relatable to a python dictionary
        // stores key-value pairs - a key is mapped to its value
        // keys are unique in a HashMap
        // can add a key-value pair
        // can look up a value for a key (fast to do)
        // can replace the value for a key
        // can delete a key-value pair
        // can loop over all the keys, value, or both

        HashMap<Integer, String> myCats = new HashMap<>();
        myCats.put(1, "Stella");
        myCats.put(2, "Riley");
        myCats.put(3, "August Pepper");

        System.out.println(myCats);
        System.out.println(myCats.get(1));

        String mySecondCat = myCats.get(2);
        System.out.println(mySecondCat);

        String myThirdCat = myCats.get(3);
        System.out.println(myThirdCat);

    }
}
