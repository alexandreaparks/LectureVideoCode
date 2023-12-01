package topic_7_object_oriented_programming.KnockoutDiceGame;

import java.util.Random;

public class Dice {

    public int roll() {
        Random rnd = new Random();
        return rnd.nextInt(6) + 1; // add 1 to range between 1 and 6
    }
}
