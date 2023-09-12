package topic_0_variables;

public class Address {
    public static void main(String[] args) {

        // String variables to store city and state
        String city = "Minneapolis";
        String state = "mn";

        // Create a new String variable "Minneapolis, MN"
        // capitalize the state and add city/state strings together
        String cityState = city + ", " + state.toUpperCase();

        // print output
        System.out.println("I live in " + cityState + ".");



    }
}
