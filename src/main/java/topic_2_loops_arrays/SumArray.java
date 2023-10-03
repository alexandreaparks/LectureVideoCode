package topic_2_loops_arrays;

public class SumArray {
    public static void main(String[] args) {

        // create double array to store 3 doubles
        double numbers[] = new double[3];

        // add data to array
        numbers[0] = 45.234256;
        numbers[1] = -123945.22;
        numbers[2] = 0.0000003;

        // create start point for running total
        double sum = 0.0;

        // loop through array and get sum of each number in array
        for (int x = 0; x < numbers.length; x++) {
            sum = sum + numbers[x];
        }

        // calculate average of all numbers in array
        double average = sum / numbers.length;

        System.out.println("Total of numbers = " + sum);
        System.out.println("Average of numbers = " + average);
    }
}
