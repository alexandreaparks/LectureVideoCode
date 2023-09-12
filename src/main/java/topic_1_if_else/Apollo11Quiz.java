package topic_1_if_else;

import static input.InputUtils.intInput;

public class Apollo11Quiz {
    public static void main(String[] args) {

        // print intro message and ask quiz question
        System.out.println("Quiz time!");
        System.out.println("What year did the Apollo 11 land on the moon?");

        // answer is 1969

        // get user answer
        int answer = intInput();

        // != operator tests if two values are not equal
        // conditional statement to test if answer is not equal to 1969
        if (answer != 1969) {
            System.out.println("Wrong answer - it was 1969.");
        } else {
            // prints if they are correct
            System.out.println("You are correct!");
        }
    }
}
