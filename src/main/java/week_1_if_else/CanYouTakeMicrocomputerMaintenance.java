package week_1_if_else;

import static input.InputUtils.yesNoInput;

public class CanYouTakeMicrocomputerMaintenance {
    public static void main(String[] args) {
        // get user input
        boolean hasTakenITConcepts = yesNoInput("Have you taken ITEC 1100 IT Concepts?");
        boolean hasTakenITSkills = yesNoInput("Have you taken ITEC 1110 IT Skills?");
        boolean hasTakenWindows = yesNoInput("Have you taken ITEC 1250 Windows OS?");

        // use && operator in condition to check if all pre-reqs are met
        if (hasTakenITConcepts && hasTakenITSkills && hasTakenWindows) {
            System.out.println("You meet the pre-requisites. You may take ITEC 1310 Microcomputer Systems Maintenance.");
        } else {
            System.out.println("You do not meet the pre-requisites You need to complete all 3 pre-requisite classes.");
        }
    }
}
