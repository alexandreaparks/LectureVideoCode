package topic_1_if_else;

import static input.InputUtils.yesNoInput;

public class CanYouTakeAndroid {
    public static void main(String[] args) {
        // intro
        System.out.println("Thus program will check if you meet the requirements for taking ITEC 2417 Android Programming.");
        System.out.println("Please answer the following questions.");

        // get user input
        boolean hasTakenCSharp = yesNoInput("Have you taken ITEC 2505 C# Programming?");
        boolean hasTakenJava = yesNoInput("Have you taken ITEC 2545 Java Programming?");

        // use || operator in the condition to check if pre-reqs are met
        if (hasTakenJava || hasTakenCSharp) {
            System.out.println("You meet the pre-requisites. You may take ITEC 2417 Android Programming.");
        } else {
            System.out.println("You do not meet the pre-requisites yet. You need to complete either C# or Java.");
        }
    }
}
