package topic_2_loops_arrays;

import static input.InputUtils.doubleInput;
public class AverageTestScoreSimpleLoop {
    public static void main(String[] args) {

        // Calculate the average of 5 test scores

        // define variables
        int numberOfTests = 5;
        double testScore;
        double testScoreSum = 0.0;
        double testScoreAverage;

        // use for loop to ask for 5 test scores and create a running total to get the sum of all scores
        // start at 1, count up to 5, increase by 1 every iteration
        for (int test = 1 ; test <= numberOfTests ; test++) {
            testScore = doubleInput("Enter score for test #" + test + ": ");
            testScoreSum = testScoreSum + testScore; // running total of scores
        }

        // calculate average
        testScoreAverage = testScoreSum / numberOfTests;
        // display average
        System.out.println("Average score = " + testScoreAverage);
    }
}
