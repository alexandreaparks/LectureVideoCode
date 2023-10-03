package topic_2_loops_arrays;

import static input.InputUtils.positiveIntInput;

public class Stars {
    public static void main(String[] args) {

        // display a square of stars

        // define variables
        int size = positiveIntInput("Enter size of square: ");


        // outer loop is used to print one row per loop repeat
        for (int x = 0 ; x < size ; x++) {

            // inner loop to print stars on every row
            for (int y = 0 ; y < size ; y++) {
                System.out.print("*");
            }

            // print newline before next set of stars are printed
            System.out.println();
        }
    }
}
