package topic_7_object_oriented_programming;

public class OOPIntro {
    public static void main(String[] args) {

        /*
        A java object:
        * is made from a class definition

        * It contains data (in variables aka fields)
        * AND/OR
        * It can do things (with methods)

        Example:
        A Java ArrayList object contains data - the list elements
        A Java ArrayList can also do things - add/delete an element, tell us size...

        List<String> animals = new ArrayList<String>();

        animals.add("cat");
        animals.remove(0);
        int sizeOfAnimals = animals.size();

        add(), remove(), and size() are all methods for the ArrayList object

        Java already has a class definition for the ArrayList class as well as
        many others like HashMap and FileReader

        One class definition can be used to make one or many objects
        A class definition can be seen as a blueprint or set of instructions
        The objects are built from these blueprints/instructions

        We can create our own class definitions
        Write one class definition
            *Describe what can object can do - write methods in the class
            *Describe what data the object stores - declare variables (fields) in the class
        Then use that class definition to create and use objects in your program

        Principles of OO:
        * Object modeling
        * Encapsulation - keeping data together
        * Abstraction - putting details in one place and then
          not having to worry about the detail to use the code
        * Single responsibility principle - focusing each class on one task

        Defining a class:
        Use keyword class plus name of class
        Start class name with an uppercase letter
        Write each class definition in its own file
        The file name must match the class name
        Can write several class definitions in the same file, or different files

        Constructors:
        Special method that's called when an object is created
        Must be the same name as the class
        Used to set up and initialize an object
        A default constructor is always automatically called when an object is created,
        whether you create a constructor method or not
        Constructors don't have any return type

        Overloading methods and constructors:
        Can't have two variables in the same scope with the same name
        But can do it with methods and constructors - only do it for
        methods which do the same kind of thing or else it's confusing
        Two methods can have the same name ONLY IF they have different arguments
        Compiler will look at arguments used when you call the method to figure out
        which method or constructor was meant to be called

        Programs should always be designed with change in mind
        You'll have to add new features, or requirements change, or find a bug, or
        want to use some of the code in another program
        If OOP is used well, makes it easier to write a modular program that can
        be re-used
        Objects help with breaking code into independent modules
        Easier to change parts of a program without breaking other parts

        Encapsulation:
        A well-designed object hides how it works internally
        Only shares necessary data
        Should have well-designed set of methods which other code can use to
        work with this object
        Why?
        * Facilitates re-use - if there is a well-defined and documented interface,
        it's easier to use that object
        * You know what the publicly accessible parts of the objects are - so you know
        what is okay to change and what will affect other parts of your code
        * Helps prevent accidentally modifying an object's data (makes it harder to do this)

        Public, Protected, Private:
        Usually make all instance variables private
        Make methods that will be used by other classes in the same package protected
        Make methods that any other class can use public
        Final (constant) variables can be public, protected, or private (as appropriate)

        Public: any other class can access this method or variable
        Protected: other classes in the same package can access this method or variable
        (also subclasses, later class)
        Private: only this object can access this private variable/method
        No other objects can access this method or variable

        If no access modifier is specified, package-protected is assumed (like protected;
        available in same package, but subclasses in a different package can't access it)

        Access Modifiers:
        Use the most restrictive access modifier possible
        Protected: useful because often public enables too much access/private is too restrictive
        Package: a directory containing Java code. Classes describe the package it belongs to on first line






         */
    }
}
