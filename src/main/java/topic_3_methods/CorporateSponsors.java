package topic_3_methods;

import java.util.Arrays;

public class CorporateSponsors {
    public static void main(String[] args) {

        // create array to store corporate sponsors
        String[] sponsors = {"Ikea", "at&t", "cvs", "3m"};

        for (int x = 0; x < sponsors.length; x++) {
            String sponsor = sponsors[x]; // access array elements values and assign them to String sponsor
            sponsor = sponsor.toUpperCase(); // change to uppercase
            sponsors[x] = sponsor; // reassign uppercase sponsors back to array

            // can also use:
            // sponsors[i] = sponsors[i].toUpperCase();
        }

        System.out.println(Arrays.toString(sponsors)); // print array using Array.toString() method
    }
}
