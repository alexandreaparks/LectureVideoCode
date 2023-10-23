package topic_4_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static input.InputUtils.*;
import java.util.Collections;

public class GuestList {
    public static void main(String[] args) {


        // Random rnd = new Random();
        // int randomNumber = rnd.nextInt(10); // random number 0-9
        // int randomNumberBetween1and10 = rnd.nextInt(10) + 1; // 1-10
        // System.out.println(randomNumber + " " + randomNumberBetween1and10);

        List<String> guestList = new ArrayList<>();

        while (true) {
            String guestName = stringInput("Enter the name of a guest, or press Enter to quit: ");
            if (guestName.isEmpty()) {
                break;
            }
            if (containsIgnoresCase(guestList, guestName)) {
                System.out.println(guestName + " is already on the list!");
            } else {
                System.out.println("Adding " + guestName + " to the list!");
                guestList.add(guestName);
            }
        }

        Collections.sort(guestList);

        printGuestNames(guestList);

        // remove guests from list if needed

        while (yesNoInput("Do you want to remove any guests?")) {
            System.out.println("Here are all the guests: ");
            printGuestNames(guestList);

            if (guestList.isEmpty()) {
                System.out.println("There are no more guests to remove");
                break;
            }

            int index = positiveIntInput("Enter the number of the guest you want to remove: ");
            index--;
            if (index < guestList.size()) {
                String removedName = guestList.remove(index);
                System.out.println("Removed guest " + removedName);
            } else {
                System.out.println("Error - please enter a valid number of a guest");
            }

        }

        printGuestNames(guestList);
        System.out.println("The number of guests on the guest list is " + guestList.size());
        System.out.println();
        
        selectPrizeWinner(guestList);


    }

    private static void selectPrizeWinner(List<String> guests) {

        if (guests.isEmpty()) {
            System.out.println("Warning - no guests - no one to win the prize");
            return;
        }
        Random rng = new Random();
        int randomGuestIndex = rng.nextInt(guests.size());

        String prizeWinner = guests.get(randomGuestIndex);
        System.out.println("Guest number " + (randomGuestIndex+1) + " " + prizeWinner + " wins a prize!");
    }


    public static void printGuestNames(List<String> guests) {

        System.out.println("Your guest list is: \n");

        if (guests.isEmpty()) {
            System.out.println("There are no guests in the list.");
        } else {
            for (int i = 0; i < guests.size(); i++) {
                System.out.println((i + 1) + ": " + guests.get(i));
            }
            System.out.println();
        }
    }

    public static boolean containsIgnoresCase(List<String> list, String data) {
        for (String item: list) {
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
    }


}
