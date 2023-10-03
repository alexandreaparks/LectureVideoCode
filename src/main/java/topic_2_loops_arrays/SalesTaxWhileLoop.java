package topic_2_loops_arrays;

import java.text.NumberFormat;

import static input.InputUtils.doubleInput;
import static input.InputUtils.yesNoInput;

public class SalesTaxWhileLoop {
    public static void main(String[] args) {

        // define variables
        boolean moreCalculations = true;
        double price;
        double salesTax = 1.07;

        // loop repeats as long as the user wants to do more calculations
        while (moreCalculations) {

            price = doubleInput("Type in a price: ");
            double priceInclTax = price * salesTax;
            System.out.printf("The price plus sales tax is $%.2f.\n", priceInclTax);

            // can also use a currency formatter by creating a NumberFormat object
            // need to add import java.text.NumberFormat; at top of class

            // NumberFormat currencyFormatter = NumberFormat.getCurrencyInstance();
            // String formattedPrice = currencyFormatter.format(priceInclTax);
            // System.out.println("The price plus sales tax is " + formattedPrice);

            // ask user if they want to continue
            moreCalculations = yesNoInput("Do you want to continue?");
        }

        System.out.println("Thanks for using the program - goodbye!");
    }
}
