package topic_4_lists;

public class ArrayLoop {
    public static void main(String[] args) {

        // enhanced for loop used with an Array
        // can use if you only need to work with the data, but not the index
        String[] days = {"Mon", "Tue", "Wed", "Thu", "Fri"};
        for (String day: days) {
            System.out.println(day);
        }

    }
}
