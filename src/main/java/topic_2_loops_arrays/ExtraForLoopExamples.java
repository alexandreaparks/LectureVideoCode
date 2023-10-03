package topic_2_loops_arrays;

public class ExtraForLoopExamples {
    public static void main(String[] args) {

        // count by 2
        // will only count to 8 because x is less than 10 and 9 isn't included because it's odd
        // start at 0, count up to 9, increase by 2 every iteration
        for (int x = 0 ; x < 10 ; x = x + 2) {
            System.out.println(x);
        }

        System.out.println();

        // count by 5
        // start at 10, count up to 99, increase by 5 every iteration
        for (int x = 10 ; x < 100 ; x = x + 5) {
            System.out.println(x);
        }

        System.out.println();

        // count down from 5 to 0
        // start at 5, count down to 0, decrease by 1 every iteration
        for (int x = 5 ; x >= 0 ; x = x - 1) {
            System.out.println(x);
        }

        System.out.println();

        // same as loop above
        // x = x - 1 is the same as x--
        for (int x = 5 ; x >= 0 ; x-- ) {
            System.out.println(x);
        }
    }
}
