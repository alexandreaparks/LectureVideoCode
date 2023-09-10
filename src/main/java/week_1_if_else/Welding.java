package week_1_if_else;

import static input.InputUtils.yesNoInput;

public class Welding {
    public static void main(String[] args) {

        // this program checks if a student is dressed safely for welding
        // must wear cotton or wool clothes and must wear closed-toe shoes

        // get user input
        boolean cottonClothes = yesNoInput("Are you wearing cotton clothes?");
        boolean woolClothes = yesNoInput("Are you wearing wool clothes?");
        boolean closedToeShoes = yesNoInput("Are you wearing closed-toe shoes?");

        // use if statement to check if student is dressed safely
        if ((cottonClothes || woolClothes) && closedToeShoes) {
            System.out.println("You are dressed safely for welding.");
        } else {
            System.out.println("You must wear cotton or wool clothes and have on closed-toe shoes.");
        }
    }
}
