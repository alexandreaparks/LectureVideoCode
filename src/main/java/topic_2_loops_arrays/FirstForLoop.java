package topic_2_loops_arrays;

public class FirstForLoop {
    public static void main(String[] args) {

        // for loops - for doing something a number of times
        // need to specify a loop counter to count the number of repeats
        // decide what number the loop counter will start counting at x = 0
        // also specify what condition the loop will stop under - often when counter gets to a certain value x < 10
        // include what amount the counter will change after every iteration x++
        // doesn't have to be whole or positive numbers
        // can count backwards and/or use doubles or floats

        // a for loop that counts from 0 to 9

        // start at 0, count up to 9, increase by 1 every iteration
        // x = x + 1 is the same as x++
        for (int x = 0 ; x < 10 ; x++) {
            System.out.println(x);
        }
    }
}
