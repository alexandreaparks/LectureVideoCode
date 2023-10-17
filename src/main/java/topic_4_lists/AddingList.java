package topic_4_lists;

import java.util.ArrayList;
import java.util.List;

public class AddingList {
    public static void main(String[] args) {

        List<Integer> classCodes = new ArrayList<>();
        classCodes.add(2545);
        classCodes.add(1150);
        classCodes.add(1250);

        classCodes.add(0, 1425); // add 1425 value at index 0
        classCodes.add(2, 1100); // add 1100 value at index 2

        System.out.println(classCodes);
        System.out.println(classCodes.size());

        for (int classCode: classCodes) {
            System.out.println("ITEC " + classCode);
        }

        System.out.println(classCodes);



        classCodes.remove(2); // this removes by index
        classCodes.remove(Integer.valueOf(1250)); // this removes by the value of 1250
        System.out.println(classCodes);
    }
}
