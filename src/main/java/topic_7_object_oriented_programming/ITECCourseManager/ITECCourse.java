package topic_7_object_oriented_programming.ITECCourseManager;

import java.util.ArrayList;
import java.util.List;

public class ITECCourse {

    // data - fields - instance variables
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    // alt insert keyboard shortcut
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0) {
            return;
        }
        this.maxStudents = maxStudents;

    }

    // constructor method
    public ITECCourse(String courseName,int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

    // method to add a new student
    public void addStudent(String studentName) {
        if (students.size() == maxStudents) {
            System.out.println("Course is full! Can't add " + studentName);
        } else {
            students.add(studentName);
        }
    }

    // method to print all info about a ITECCourse object
    public void writeCourseInfo() {
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
    public int getNumberOfStudents() {

        return students.size();

    }

    public void removeStudent(String studentName) {
        if (students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from " + name);
        } else {
            System.out.println(studentName + " was not found in " + name);
        }
    }


}
