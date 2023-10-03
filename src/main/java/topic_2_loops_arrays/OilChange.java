package topic_2_loops_arrays;

public class OilChange {
    public static void main(String[] args) {

        // define variables
        int mileage = 150000;
        int interval = 3000;

        // start at 0, count up to 7, increase by 1
        for (int oilChange = 0 ; oilChange < 8 ; oilChange++) {
            mileage = mileage + interval; // running total adds 3000 every iteration
            System.out.println("Get oil change at " + mileage + " miles."); // print the mileage every iteration
        }
    }
}
