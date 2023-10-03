package topic_2_loops_arrays;

public class NumberOfClassrooms {
    public static void main(String[] args) {

        // create a String array initialized with data
        String[] classrooms = {"T3010", "T3020", "T3030", "T3040", "T3050", "T3080"};

        // How many elements are in the array? What's the size/length of the array?
        int numberOfClassrooms = classrooms.length;

        System.out.println("There are " + numberOfClassrooms + " classrooms.");

        System.out.println("The classrooms are: ");

        // use a loop to print all the data from the array
        for (int x = 0; x < classrooms.length; x++) {
            System.out.println(classrooms[x]);
        }
    }
}
