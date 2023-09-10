package week_1_if_else;

public class VariablesRecap {
    // psvm shortcut
    public static void main(String[] args) {
        // int - whole numbers, no decimal places
        int age = 21;
        int numberOfStudents = 32;
        int pixels = 480000;
        // int temp = 4.5; will cause an error

        // double - double-precision floating point number
        // Java's default for numbers with decimal places
        // float is another type, but double can store bigger values
        double price = 4.56;
        double temperature = -22.1;
        double GPA = 4.0;

        // String - S must be capitalized
        // value must be in double quotes " "
        String name = "Alexandrea Parks";
        String vehicle = "22 Honda Civic Sport Touring Hatchback";
        String classCode = "2545";
        String className = "Java Programming";

        // creating some more int variables
        int zebras = 4;
        // use sout shortcut for printing lines
        System.out.println("There are " + zebras + " zebras.");
        int cats = 6;
        System.out.println("There are " + cats + " cats.");
        // calculate total animals
        int totalAnimals = cats + zebras;
        // print with formatting
        System.out.printf("There are %d animals all together.\n", totalAnimals);

        // print empty line
        System.out.println();

        // creating double and int variables
        double widgetPrice = 4.57;
        int widgetsNeeded = 56;
        double shippingPrice = 22.33;
        double allWidgetCost = widgetPrice * widgetsNeeded;
        System.out.printf("Total widget cost: $%.2f\n", allWidgetCost);
        double widgetsPlusShipping = allWidgetCost + shippingPrice;
        System.out.printf("Total with shipping: $%.2f\n", widgetsPlusShipping);

        // boolean - stores either true or false
        // true and false must be lowercase
        boolean allDone = true;
        boolean easyMode = false;

        if (allDone) {
            System.out.println("Great!");
        }
    }
}
