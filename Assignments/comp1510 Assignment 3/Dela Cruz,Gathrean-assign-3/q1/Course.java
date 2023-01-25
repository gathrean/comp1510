package q1;

import java.util.ArrayList;

/**
 * A Class that represents a course taken at a school.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Course {

    /** The name of this course. */
    private String courseName;

    /** An ArrayList for a list of Students. */
    private ArrayList<Student> studentList = new ArrayList<Student>();

    /**
     * Keeps track of up to five students.
     * 
     * @param courseName a String representation of the course's name.
     */
    public Course(String courseName) {
        this.courseName = courseName;
    }

    /**
     * Adds the student to the ArrayList of five students.
     * 
     * @param student a Student representation of a student
     */
    public void addStudent(Student student) {
        studentList.add(student);
    }

    /**
     * Calculates all the average score of all the students enrolled in the
     * course.
     * 
     * @return double as the average score
     */
    public double average() {
        double sum = 0;
        int total = 0;

        for (Student temp : studentList) {
            sum += temp.average();
            total++;
        }

        if (studentList.size() == 0) {
            return 0;
        } else {
            return sum / total;
        }
    }

    /**
     * A method that prints all the students in the course.
     */
    public void roll() {
        if (studentList.size() == 0) {
            System.out.println("There are no students in this course!");
        } else {
            System.out.println(courseName);

            for (Student temp : studentList) {
                System.out.println(temp);
            }
        }
    }

}
