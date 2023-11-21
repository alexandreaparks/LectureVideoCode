package topic_6_files_exceptions;

public class StringToInt {
    public static void main(String[] args) {

        String hopeThisIsANumber = "cat";

        try {
            int number = Integer.parseInt(hopeThisIsANumber); // converts String to int
            System.out.println("The number is " + number);
        } catch (NumberFormatException e) {
            System.out.println(hopeThisIsANumber + " is not a valid number.");
        }

        System.out.println("End of program!");

    }
}
