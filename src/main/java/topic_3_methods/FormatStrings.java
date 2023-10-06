package topic_3_methods;

public class FormatStrings {

    public static void main(String[] args) {

        // %d = int
        // %s = String, anything else
        // %f = double // %.2f rounds to 2 decimal places
        // add \n because printf doesn't add newline

        String college = "MCTC";
        String className = "Java Programming";
        int classCode = 2545;
        int credits = 6;
        double averageGrade = 84.545345;
        boolean isOnline = true;

        System.out.printf("This class is %d %s. It is taught at %s. It is %d credits, the average grade is %f%%. " +
                "Is it online? %s.\n", classCode, className, college, credits, averageGrade, isOnline);

        System.out.printf("The average grade is %.2f%%.\n", averageGrade);


    }
}
