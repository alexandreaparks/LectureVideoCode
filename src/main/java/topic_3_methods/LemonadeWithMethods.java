package topic_3_methods;

import static input.InputUtils.doubleInput;
import static input.InputUtils.intInput;

public class LemonadeWithMethods {


    public static void main(String[] args) {

        // calculate operating cost and profit for a lemonade stand
        // the lemonade stand sells lemonade and cookies

        double lemonadeProfit = calculateProfit("lemonade"); // call calculateProfit method with String argument
        System.out.println("Lemonade profit = $" + lemonadeProfit);

        // same calculation for cookies

        double cookieProfit = calculateProfit("cookie");
        System.out.println("Cookie profit = $" + cookieProfit);

        // can add any other products here
        // for example, brownies

        double brownieProfit = calculateProfit("brownie");
        System.out.println("Brownie profit = $" + brownieProfit);

    }

    // calculate profit method can be used for any type of product
    public static double calculateProfit(String productName) {

        // ask user how much they spent on supplies, how much they sold one units for, and how many units they sold
        System.out.println("How much did you spend on " + productName + " supplies?");
        double suppliesCost = doubleInput();
        System.out.println("What did you sell one " + productName + " for?");
        double salePrice = doubleInput();
        System.out.println("How many " + productName + " units did you sell?");  //could improve the wording :)
        int numberSold = intInput();

        // calculate profit
        double profit = ( numberSold * salePrice ) - suppliesCost;

        return profit; // return profit to main method

    }



}
