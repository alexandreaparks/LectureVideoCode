package topic_4_lists;

import java.util.List;

public class ListOf {
    public static void main(String[] args) {

        // List.of immutable lists cannot be modified

        List<String> animals = List.of("Cat", "Bird", "Zebra");
        System.out.println(animals);

        // animals.add("Frog"); // error
    }
}
