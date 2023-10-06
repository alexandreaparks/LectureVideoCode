package topic_3_methods;

public class PassByValueAndReferences {
    public static void main(String[] args) {

        // two different mechanisms of sending data to methods

        // pass by value - how primitive types(int, double, boolean) and Strings are sent
        // pass by value sends a copy
        // two independent variables
        // must return modified value back to calling method to modify it in the calling method

        // copy of value is made
        // copy is given to the method
        // copy may be modified
        // original value does not change if the copy is modified

        // all primitive variables in scope are stored in a part of memory called the stack

        //-----------------------------------------------------------------------------------------------

        // pass object references by value - how arrays and most everything else is sent
        // when an array is modified in a method, it's also modified in the calling method

        // an array is an object
        // more complex than primitive types
        // objects can be any size and size can change, so it's hard to organize them in memory
        // to organize objects, they are saved in part of the memory called the heap (has lots of room)
        // so that the code can find an object, a reference to that object is saved on the stack
        // the reference tells the stack where to find the object in the heap
        // object references are values
        // object reference is a memory address - basically a number

        // objects reference is sent to a method
        // object is not copied
        // the reference to the object is copied and sent to the method
        // reference to an object is the location of the actual object in the heap
        // when a method accesses or modifies the object, it looks at the copy of the reference and uses that to find
        // the original object in the heap
        // so if method modifies the object, the original is also modified
        // there is only one object, although there are two copies of its reference

    }
}
