package topic_6_files_exceptions;

import java.util.List;
import java.util.Random;

public class ArrayExceptions {
    public static void main(String[] args) {

        String[] classNames = {"Web", "Java", "C#"};

        for (String name: classNames) {
            System.out.println(name);
        }


        List<Integer> classCodes = List.of(2560, 2545, 2505);

        for (Integer classCode : classCodes) {
            System.out.println(classCode);
        }

        Random rnd = makeRandomNumberGenerator(); // rnd is null
        System.out.println(getRandomNumber(rnd)); // rnd as null being passed
    }

    public static int getRandomNumber(Random rnd) { // rnd is null
        return rnd.nextInt(10); // rnd is null and causes a NullPointerException
    }

    public static Random makeRandomNumberGenerator() {
        return new Random(); // fixes NullPointerException
    }
}
