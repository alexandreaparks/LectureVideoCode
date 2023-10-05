package topic_3_methods;

public class Marathon {
    public static void main(String[] args) {

        // define variables
        double currentDistance = 1;
        double marathonDistance = 26.2;
        double increase = 1.10; // times current distance by this
        int weeks = 1; // create variable for running total of weeks

        while (currentDistance < marathonDistance) { // loop until currentDistance greater than marathonDistance
            System.out.printf("Week %d Distance: %.2f\n", weeks, currentDistance);
            weeks++; // increase weeks by 1 every loop
            currentDistance = currentDistance * increase; // increase currentDistance by *1.10 every loop
        }

        System.out.printf("Week %d Distance: %.2f\n", weeks, currentDistance); // used to print final week
    }
}
