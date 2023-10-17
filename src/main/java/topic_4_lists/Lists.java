package topic_4_lists;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Lists {
    public static void main(String[] args) {

        // lists - a resizable, ordered collection of items

        // items are kept in order
        // can create an empty list
        // can add items to the end
        // can also add items to the start or in the middle
        // can get any item from the list by index
        // can remove items from the start, middle, or end - can remove by value or index
        // can search for items in the list
        // can find out the size of the list, or if it is empty

        // 3 different types of Lists in Java
        // ----------------------------------
        // - ArrayList - uses an array to store data (fast and simple)
        // when adding/removing items, array can be replaced with a larger or smaller array
        // fast to search
        // fast to add/remove items at the end of the list
        // slow to add/remove items at the start or middle of list

        // - LinkedList - a chain of nodes
        // made of nodes linked together
        // each node stores one list item
        // each node has a link to the node immediately before and after itself
        // a LinkedList knows where the start and end node are, but can't access the middle nodes directly


        // - Vector
        // very similar to ArrayList, use an array to store data internally
        // BUT Vector is thread-safe aka synchronized
        // threads in a program are tasks that can run at the same time
        // Vector makes sure that 2 different parts of the program don't modify a Vector at once
        // makes it slower than ArrayList
        // unless writing program with more than one thread, use ArrayList
        // when writing GUI code, we will use Vector



        // ArrayList is the most common and what we will be using

        // create an ArrayList
        List<String> arrayList = new ArrayList<>();
        arrayList.add("Hello"); // add items to list
        arrayList.add("World");

        for (String s : arrayList) { // use enhanced for loop to print items in list, each on new line
            System.out.println(s);
        }

        System.out.println(arrayList); // prints in square brackets

        System.out.println();

        // add name and MCTC to list
        arrayList.add("Alexandrea Parks");
        arrayList.add("MCTC");

        // use enhanced for loop to print items in list, each on new line
        for (String s : arrayList) {
            System.out.println(s);
        }

        System.out.println();

        // print in uppercase and count the lengths of each string
        for (String s : arrayList) {
            System.out.println(s.toUpperCase());
            System.out.println(s.length());
        }

        // creating lists

        // ArrayList called cities that only stores Strings
        List<String> cities = new ArrayList<>();

        // almost all lists will contain data of just one type
        // - ArrayList of names only contains Strings
        // - ArrayList of prices only contains Doubles

        // ArrayList for primitive types
        // Use Object names for the generic type
        // int = Integer
        // boolean = Boolean
        // double = Double

        List<Integer> numbers = new ArrayList<>();
        List<Boolean> results = new ArrayList<>();
        List<Double> prices = new ArrayList<>();

        numbers.add(100); // add int value to numbers ArrayList

        int first = numbers.get(0); // read value of index 0
        System.out.println(first); // prints 100





    }
}
