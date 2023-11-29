package topic_7_object_oriented_programming;

public class Pool {
    // this is a class definition
    // does not have a main method

    // instance variables
    private String name; // field, or a variable
    private double length; // another field
    private String address;
    private double maxDepth;

    Pool(String name, double length) { // constructor method // same name as class
        // used for setting up and initializing an object
        this.name = name;
        this.length = length;
    }

    // instance method
    // instance is another name for object
    // an object is an instance of a class
    // a Pool object is an instance of the Pool class
    public double distanceForLaps(int laps) {
        // 10 laps of pool of length 50, that's 500 meters
        double total = laps * this.length;
        return total;
    }

    // @Override checks that toString is typed correctly
    // this method replaces the default toString() method
    // @Overrides default toString()
    @Override
    public String toString() {
        String description = this.name + " pool is " +
                this.length + " meters long.";
        return description;
    }



}
