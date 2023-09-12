package topic_1_if_else;

import static input.InputUtils.stringInput;
public class DepartmentCodes {
    public static void main(String[] args) {
        // get user input
        String departmentCode = stringInput("Enter department code: ");

        // check for valid code, ITEC, BTEC, ENGL, MATH...
        // if - else
        if (departmentCode.length() == 4) {
            System.out.println("The code is valid!");

            // make code uppercase
            String departmentCodeUppercase = departmentCode.toUpperCase();
            System.out.println("The code is " + departmentCodeUppercase + ".");
        } else {
            System.out.println("The code is not valid.");
        }
    }
}
