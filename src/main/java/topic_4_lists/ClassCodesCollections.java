package topic_4_lists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ClassCodesCollections {
    public static void main(String[] args) {

        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        classCodes.add(0, 1425); // add 1425 value at index 0
        classCodes.add(2, 1100); // add 1100 value at index 2

        System.out.println(Collections.min(classCodes));
        System.out.println(Collections.max(classCodes));


    }
}
