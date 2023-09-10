package week_1_if_else;

import static input.InputUtils.stringInput;
import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        // length
        String secretPassword = "ljdljdjd2-ck8cn0c8ak";
        int numberOfCharactersInPassword = secretPassword.length();
        System.out.println(numberOfCharactersInPassword);

        if (!(secretPassword.length() < 12)) {
            System.out.println("Longer passwords are more secure, good choice.");
        } else {
            System.out.println("Consider using a longer password.");
        }

        // lowercase
        // emails are usually lowercase
        String email = "alexandrea.parks@go.MINNEAPOLIS.EDU";
        String emailLower = email.toLowerCase();
        System.out.println(emailLower);

        // uppercase
        // dept codes are uppercase
        String classIdentifier = "itec 2545";
        String classIdentifierUpper = classIdentifier.toUpperCase();
        System.out.println(classIdentifierUpper);

        // ends with
        // is the email a .edu email?
        System.out.println(emailLower.endsWith(".edu"));

        // starts with
        // is this class an ITEC class?
        String classCode = stringInput("Please enter a class code: ");
        System.out.println(classCode.startsWith("ITEC"));
        if (classCode.startsWith("ITEC")) {
            System.out.println("This is an ITEC class.");
        } else {
            System.out.println("This is NOT an ITEC class.");
        }

        // contains
        // look for support ticket that contains the text "server"
        String supportTicketDescription1 = "The server is down!";
        String supportTicketDescription2 = "My mouse mat is missing.";
        String supportTicketDescription3 = "All the servers need to be rebooted";
        String supportTicketDescription4 = "Server problem!";
        String supportTicketDescription5 = "I spilled my drink on the server.";
        String supportTicketDescription6 = "THE SERVER DOWN GRRR";

        System.out.println(supportTicketDescription1.contains("server")); // true
        System.out.println(supportTicketDescription2.contains("server")); // false
        System.out.println(supportTicketDescription3.contains("server")); // true
        System.out.println(supportTicketDescription4.contains("server")); // false
        System.out.println(supportTicketDescription5.contains("server")); // true
        System.out.println(supportTicketDescription6.contains("server")); // false

        String serverProblem = "The SERVER IS DOWN!";
        String searchTerm = "server";

        if (serverProblem.toUpperCase().contains(searchTerm.toUpperCase())) {
            System.out.println("Found a server problem.");
        } else {
            System.out.println("There is no server problem.");
        }

        String uppercaseServerProblem = serverProblem.toUpperCase();
        String uppercaseSearchTerm = searchTerm.toUpperCase();
        if (uppercaseServerProblem.contains(uppercaseSearchTerm)) {
            System.out.println("Server problem!");
        } else {
            System.out.println("Not a server problem.");
        }

        // why not to use .contains()?
        String studentEmail = "abd@go.minneapolis.edu";
        System.out.println(studentEmail.contains(".edu"));
        String trickStudentEmail = "abc.edu@gmail.com";
        System.out.println(trickStudentEmail.contains(".edu"));
        // fix with .endswith()

        // Split sentences into words
        String sentence = "IntelliJ is a Java integrated development environment.";

        String[] words = sentence.split(" ");
        System.out.println(Arrays.toString(words));
        String firstWord = words[0];
        System.out.println(firstWord);

        String javaIdes = "IntelliJ,Eclipse,NetBeans,Notepadd++,VSCode";
        String[] ides = javaIdes.split(",");
        System.out.println(Arrays.toString(ides));
        // for loop
        for (int x = 0 ; x < ides.length ; x++) {
            System.out.println(ides[x]);
        }

        // split class identifier into department and code
        String javaClass = "ITEC 2545";
        String[] javaClassIdentifierParts = javaClass.split(" ");
        String department = javaClassIdentifierParts[0];
        String code = javaClassIdentifierParts[1];
        System.out.println(department);
        System.out.println(code);

        // trim - remove whitespace - spaces, tabs, newlines, start and end of string
        String userAddressInput = "    1503 Hennepin Avenue   ";
        System.out.println(userAddressInput.trim());

        // format strings
        // printf - no newline - must add \n
        String className = "Java Programming";
        double credits = 6.0;
        int studentsEnrolled = 24;
        String format = "Online";

        //The Java Programming class is 6 credits, delivered online, there are 24 students enrolled
        System.out.println("The " + className + " is " + credits +
                " credits, delivered " + format + ", and there are " +
                studentsEnrolled + " students enrolled.");
        System.out.printf("The %s is %.1f credits, delivered %s, and there are %d students enrolled.\n",
                className, credits, format, studentsEnrolled);

        System.out.println("End of example program with Java string methods!");





    }
}
