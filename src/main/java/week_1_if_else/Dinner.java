package week_1_if_else;

import static input.InputUtils.stringInput;

public class Dinner {
    public static void main(String[] args) {
        // user input
        String dinnerSuggestion = stringInput("What should we have for dinner?");

        // the computer only wants either pizza or tacos
        //if - else if - else
        if (dinnerSuggestion.equalsIgnoreCase("pizza")) {
            System.out.println("Mmmm, pizza sounds delicious!");
        } else if (dinnerSuggestion.equalsIgnoreCase("tacos")) {
            System.out.println("Great! I love tacos.");
        } else {
            System.out.println("How about pizza, or tacos?");
        }
    }
}
