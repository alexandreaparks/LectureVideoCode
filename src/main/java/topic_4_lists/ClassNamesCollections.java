package topic_4_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

public class ClassNamesCollections {
    public static void main(String[] args) {

        List<String> classNames = new ArrayList<>();
        classNames.add("Programming Logic");
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Info Tech Concepts");

        Collections.sort(classNames);
        System.out.println("Sorted: " + classNames);

        Collections.shuffle(classNames);
        System.out.println("Shuffled: " + classNames);

        String alphabeticalFirst = Collections.min(classNames);
        System.out.println(alphabeticalFirst);
    }
}
