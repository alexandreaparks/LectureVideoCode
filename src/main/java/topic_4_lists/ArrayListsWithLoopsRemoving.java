package topic_4_lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListsWithLoopsRemoving {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        // if only the data is needed to be used (no index) - use the enhanced for loop
        for (String name: classNames) { // enhanced for loop to print every class name
            System.out.println(name);
            // classNames.remove(0); // error
        }

        System.out.println();

        // if index is needed to be used, use this for loop
        for (int i = 0; i < classNames.size(); i++) {
            System.out.println(classNames.get(i));
            // classNames.remove(0); // not good way to modify
        }

        System.out.println();

        while (! classNames.isEmpty()) { // loops through list deleting index 0 at every iteration until it's empty
            String name = classNames.remove(0);
            System.out.println(name); // prints what was removed because remove() returns the value that was removed
        }

        System.out.println(classNames);
    }
}
