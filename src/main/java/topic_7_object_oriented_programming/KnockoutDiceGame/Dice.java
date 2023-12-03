package topic_7_object_oriented_programming.KnockoutDiceGame;

import java.util.Random;

public class Dice {

    Random rnd = new Random(); // makes game faster as a field

    public int roll() {

        return rnd.nextInt(6) + 1; // add 1 to range between 1 and 6
    }
}
