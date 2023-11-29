package topic_7_object_oriented_programming.ITECCourseManager;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // data - fields - instance variables
    String name;
    int code;
    List<String> students;
    int maxStudents;

    // constructor method
    ITECCourse(String courseName,int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

    // method to add a new student
    void addStudent(String studentName) {
        students.add(studentName);
    }

    // method to print all info about a ITECCourse object
    void writeCourseInfo() {
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled:");
        for (String student : students) {
            System.out.println(student);
        }
        System.out.println("There are " + getNumberOfStudents() + " students enrolled");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
        System.out.println();
    }

    // method to get the size of student list for a ITECCourse object
    int getNumberOfStudents() {

        return students.size();

    }
}
