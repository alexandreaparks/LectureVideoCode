package topic_7_object_oriented_programming.dates;

import java.util.Date;

public class Dates {
    public static void main(String[] args) {

        // date object represents a point in time
        // Saturday, December 2, 2023, 8:00pm, CST

        Date now = new Date(); // create current date object
        System.out.println(now);

        // dates are represented with number of milliseconds since Midnight January 1, 1970, UTC
        System.out.println(now.getTime()); // gets number of milliseconds since the above date/time

        long milliseconds = now.getTime(); // long value, not int
        System.out.println(milliseconds);

        Date dateFromTime = new Date(milliseconds);

        long numberOfMilliseconds = 1652353456465L; // L at end to tell java it's a long value, not int
        Date date2022 = new Date(numberOfMilliseconds); // date after adding milliseconds to Midnight January 1, 1970, UTC
        System.out.println(date2022);

        if (date2022.before(now)) {
            System.out.println("2022 is earlier than now!");
        }



    }
}
