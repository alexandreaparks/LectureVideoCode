package topic_2_loops_arrays;

import static input.InputUtils.intInput;
import static input.InputUtils.stringInput;

public class Menu {
        public static void main(String[] args) {

            while (true) {

                System.out.println("What would you like to do?");
                System.out.println("1. Calculate the length of a string");
                System.out.println("2. Calculate how many words are in a string");
                System.out.println("3. Quit");

                int choice = intInput("Enter your choice: ");

                if (choice == 1) {
                    calculateStringLength();
                } else if (choice == 2) {
                    calculateWordCount();
                } else if (choice == 3) {
                    break;
                } else {
                    System.out.println("Not a valid choice, please try again");
                }
            }
        }

        private static void calculateStringLength() {
            String input = stringInput("Enter your string: ");
            int characters = input.length();
            System.out.println("Your string has " + characters + " characters");
        }

        private static void calculateWordCount() {
            String input = stringInput("Enter your string: ");
            String[] words = input.split(" ");
            int wordCount = words.length;
            System.out.println("Your string has " + wordCount + " words");

        }
    }

