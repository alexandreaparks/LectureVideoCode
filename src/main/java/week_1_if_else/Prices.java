package week_1_if_else;

import static input.InputUtils.*;

public class Prices {
    public static void main(String[] args) {
        // get user input
        String productName = stringInput("What is the name of the product?");
        double price = positiveDoubleInput("What does " + productName + " cost?");
        int quantity = positiveIntInput("How many " + productName + " to sell?");

        // calculate total price
        double totalPrice = price * quantity;

        // display output
        // System.out.println(quantity + " of " + productName + " at $" +
                // price + " each costs $" + totalPrice + ".");
        System.out.printf("%d of %s at $%.2f each costs $%.2f.", quantity, productName, price, totalPrice);
    }
}
