package week_1_if_else;

import static input.InputUtils.stringInput;

public class CompareStrings {
    public static void main(String[] args) {
        // get user input
        String college = stringInput("Which college do you attend?");

        // conditional statement
        // can't use == to compare strings, use .equalsIgnoreCase()
        if (college.equalsIgnoreCase("MCTC")) {
            System.out.println("Yay, MCTC!");
        } else {
            System.out.println("Too bad, you should check out MCTC.");
        }
    }
}
