package topic_6_files_exceptions;

public class ExceptionsIntro {
    public static void main(String[] args) {

        /*
        Exceptions

        When a program throws an exception, it crashes

        Some types of errors:
        Not initializing a variable = NullPointerException
        Reading a non-existent index = ArrayIndexOutOfBounds, IndexOutOfBounds
        Modifying an ArrayList inside an enhanced for loop = ConcurrentModificationException

        What if there's a problem outside your code like a file not found?
        You can catch that exception and do something to deal with the error condition

        Use try and catch blocks

        Try block - contains code that might throw an exception
        Catch block - contains code that can attempt to deal with the exception and allow the program to keep running
            - or quit the program safely
            - and/or log the error message for debugging
            - and/or notify the user that something has gone wrong

        Two broad types of errors:

        - Errors that are outsider of our control (file I/O, network operations, things that depend on user input
        or data from another source)
            -Handle these errors with try-catch blocks (attempt to recover or shut down gracefully)

        - Errors that are from coding errors (usually when programmer has made a mistake, like reading from non-existing
        array element)
            - Avoid through good programming practices and through testing - try many possible circumstances

        Reading/writing files is one area where lots of things out of our control can go wrong
        -File doesn't exist
        -Try to write to a read-only directory
        -Another program is using the file
        -Somebody or some other program changes/moved/deleted the file
        -Permission denied
        -Disk full
        -Many other things that could go wrong

        Good to anticipate possible errors and think about how to handle them
        - What will program do if opening a file fails?
            -Should it crash, quit, ask user for a new location to check for file, or do something else?

        Checked vs Unchecked Exceptions

        -Outside of control errors - often throw a checked exception : Java makes you deal with checked exceptions
        These are usually thrown when your code interacts with something it has no control over
            -IOException - your program can't stop a file being deleted/moved
            -SQLException - your program can't stop the database server going down
            -Various data parsing exceptions (dates, XML, JSON...)
            - Others

        -Coding errors - these are unchecked exceptions : Java does not force you to deal with unchecked exceptions
        Write code that doesn't throw these exceptions
            -NullPointerException
            -ArrayIndexOutOfBoundsException
            -ConcurrentModificationException
            -Others

        The compiler forces you to deal with checked exceptions by either:
        -Telling the compiler that you won't deal  with the exception in this method
            - like using "throws IOException"
        -Catching the exception and doing something about it
            - if it's possible to recover, or if the exception should be logged or recorded somehow
            -Use try-catch blocks
            -Finally block us optional and runs whether an exception is thrown or not

         */
    }
}
