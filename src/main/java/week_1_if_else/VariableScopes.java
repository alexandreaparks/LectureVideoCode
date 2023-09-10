package week_1_if_else;

import static input.InputUtils.stringInput;

public class VariableScopes {
    public static void main(String[] args) {
        // bookstore has a 10% student discount for students with a .edu email
        // System.out.println(email);  // error - can't use variable before created

        // System.out.println(email); - can't use because it wasn't created yet

        String[] bookList = {
                "Automate the boring stuff with Python",
                "Java Programming",
                "A very complex and long programming book title with a lot of words in but lots of good info"
        };

        printBookList(bookList);



        String email = stringInput("Enter your email: "); // email variable beginning scope

        double bookPrice = 40;

        double discount = 0; // declare variable so it can be used within main method scope

        if (email.endsWith(".edu")) {
            System.out.println("Your student email is " + email);
            discount = 10; // 10% discount
        }

        System.out.println(email);
        // calculate final price with discount
        bookPrice = bookPrice / 100 * (100 - discount);

        System.out.println(bookPrice);

    } // email variable end of scope
    public static void printBookList(String[] books) {

        for (int x = 0; x < books.length; x++) { // x is in the for loop scope
            String book = books[x];

            // truncate longer book names
            if (book.length() > 50) {
                book = book.substring(0, 50) + "...";
            }
            System.out.println(x + 1 + ": " + book); // print book list as numbered list
        }

    }
}


