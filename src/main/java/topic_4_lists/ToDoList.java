package topic_4_lists;

import java.util.ArrayList;
import java.util.List;

import static input.InputUtils.stringInput;

public class ToDoList {
    public static void main(String[] args) {

        List<String> todoList = new ArrayList<>();

        while (true) { // loops infinitely unless a break happens (when the user hits Enter)
            String data = stringInput("Please type a task you need to do, or press Enter to quit");
            if (data.isEmpty()) { // if nothing is entered // can also use data.length() == 0
                break; // break out of the loop
            }
            if (todoList.contains(data)) {
                System.out.println("This task is already on your list");
            } else {
                todoList.add(data); // add each task to the list
            }
        }

        System.out.println("Thank you, here are all of your tasks you entered: ");

        for (String input: todoList) { // enhanced for loop to print each list item
            System.out.println(input);
        }
        System.out.println("You entered " + todoList.size() + " task(s)");
    }
}
