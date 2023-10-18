package topic_4_lists;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import static input.InputUtils.*;
import java.util.Collections;

public class GuestList {
    public static void main(String[] args) {

        // TODO ENDED GUEST LIST VIDEO AT 10:16

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
    }

    public static void printGuestNames(List<String> guests) {

        System.out.println("Your guest list is: \n");
        for (int i = 0; i < guests.size(); i++) {
            System.out.println((i + 1) + ": " + guests.get(i));
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
