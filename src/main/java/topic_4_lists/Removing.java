package topic_4_lists;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        System.out.println(classNames);

        boolean wasRemoved = classNames.remove("Programming Logic"); // remove by value // must be exact match
        System.out.println(classNames + " " + wasRemoved);

        classNames.remove(0); // remove by index
        System.out.println(classNames);

        classNames.set(0, "Systems Analysis"); // modify index 0 to be Systems Analysis
        System.out.println(classNames);

        String search = "Systems Analysis";
        if (classNames.contains(search)) {
            System.out.println("The list does contain " + search);
        } else {
            System.out.println("The list does NOT contain " + search);
        }

        System.out.println(classNames.size()); // prints size of list

        classNames.clear(); // removes everything from the list
        System.out.println(classNames);
        System.out.println(classNames.size());

        System.out.println(classNames.isEmpty()); // prints true or false

    }
}
