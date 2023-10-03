package topic_2_loops_arrays;

public class Distances {

    public static void main(String[] args) {

        // create an array to store miles and an array to store kilometers
        double[] miles = {1, 4, 10};
        double[] kilometers = new double[miles.length]; // size of array matches size of miles array

        // use loop to convert miles to kilometers

        for (int x = 0; x < miles.length; x++) {
            double km = miles[x] * 1.6;
            kilometers[x] = km; // add km to kilometers array
        }

        // display conversions
        for (int x = 0; x < miles.length; x++) {
            System.out.println(miles[x] + " miles is equal to "
                    + kilometers[x] + " kilometers.");
        }

    }


}
