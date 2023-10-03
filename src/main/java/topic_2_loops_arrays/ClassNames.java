package topic_2_loops_arrays;

public class ClassNames {
    public static void main(String[] args) {

        // create array to store my classes
        String[] classes = {"Java Programming", "Systems Analysis and Design", "Research and Composition for Change",
        "Research Methods with Ethical and Civic Responsibility Focus"};

        // count number of classes in array
        int numOfClasses = classes.length;

        System.out.println("I am taking " + numOfClasses + " classes called: \n");

        // use loop to print class names
        for (int x = 0; x < numOfClasses; x++) { // can also use x < classes.length
            System.out.println(classes[x]);
        }
    }
}
