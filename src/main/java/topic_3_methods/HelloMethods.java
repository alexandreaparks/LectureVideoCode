package topic_3_methods;

import static input.InputUtils.stringInput;

public class HelloMethods {

    // public static - modifiers

    // return type must be specified - if no return, use void

    // arguments are used when calling methods
    // methods that are called receive the argument as parameters
    // parameters need a type and name, separate with commas if more than one
    // method body is surrounded with { }
    // return statement is needed if method specifies a return type - returns a variable/value of
    // same type specified in method header


    // main method - first code to run
    public static void main(String[] args) {

        String name = stringInput("Please enter your name: ");
        String greeting = makeGreeting(name); // call makeGreeting method with name variable as argument
        System.out.println(greeting); // print greeting after it's returned from makeGreeting method
    } // end of main method

    // makeGreeting method
    // takes one parameter, String n (name variable from main method)
    // creates a new string with "Hello" plus String n plus an exclamation point !
    // then returns the greeting String

    public static String makeGreeting(String n) {

        String greeting = "Hello " + n + "!";
        return greeting; // return greeting to main calling method
    } // end of makeGreeting method

} // end of HelloMethods class
