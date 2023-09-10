package week_0_variables;

public class Prices {
    public static void main(String[] args) {
        String productName = "packets of spaghetti";
        double price = 1.60;
        int quantity = 4;

        double totalPrice = price * quantity;

        System.out.println(quantity + " " + productName
                + " at $" + price + " each costs a total of $" + totalPrice);

        // String formatting version for 2 decimals in the prices
        System.out.printf("%d %s at %.2f each costs a total of $%.2f",
                quantity, productName, price, totalPrice);
    }
}
