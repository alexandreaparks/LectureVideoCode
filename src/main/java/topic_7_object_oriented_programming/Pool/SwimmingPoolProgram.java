package topic_7_object_oriented_programming.Pool;

import topic_7_object_oriented_programming.Pool.Pool;

public class SwimmingPoolProgram {

    public static void main(String[] args) {

        // create a ymca Pool object
        Pool ymca = new Pool("YMCA", 50);

        // ymca.name = "ymca"; // not allowed
        ymca.setName("Minneapolis YMCA");

        // call the distanceForLaps method of the Pool class
        double totalSwam = ymca.distanceForLaps(6);
        System.out.println(ymca);
        System.out.println("The total distance is " + totalSwam + " meters");

        // create another Pool object
        Pool como = new Pool("Como Park", 25);
        // call distanceForLaps method of the Pool class and pass # laps as argument
        System.out.println(como.distanceForLaps(12));

        System.out.println(como);

        // create a new pool named "Edina", length 50
        Pool edina = new Pool("Edina", 50);

        // what's the total distance for swimming 12 laps in Edina pool?
        double distanceEdinaTwelveLaps = edina.distanceForLaps(12);
        System.out.println("The total distance is " + distanceEdinaTwelveLaps +
                " meters");
        // print Edina pool info
        System.out.println(edina);
    }
}
