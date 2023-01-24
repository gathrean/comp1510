package ca.bcit.comp1510.lab04;

/**
 * A Java class.
 * 
 * @author Gathrean Dela Cruz
 * @version 1
 * 
 */
public class Student {

    /**
     * Student's first name.
     * 
     * @param args unused
     */
    private Object first;

    /**
     * Student's last name.
     * 
     * @param args unused
     */
    private Object last;

    /**
     * Student's year of birth.
     */
    private Object birth;

    /**
     * Student's student number.
     * 
     * @param args unused
     */
    private Object num;

    /**
     * Student's GPA.
     * 
     * @param args unused
     */
    private Object gpa;

    /**
     * A public constructor which accepts one parameter for each of the instance
     * variables.
     * 
     * @param firstName  String
     * @param lastName   String
     * @param birthYear  int
     * @param studentNum int
     * @param gGPA       double
     */
    public Student(String firstName, String lastName, 
                int birthYear, String studentNum, int gGPA) {
        first = firstName;
        last = lastName;
        birth = birthYear;
        num = studentNum;
        gpa = gGPA;

        makeProfile();
    }

    /**
     * Returns the first name.
     * 
     * @param firstName value
     * @return firstName as a Object
     */
    public Object getFirstName(Object firstName) {
        return first;
    }

    /**
     * Sets the first name input into firstName.
     * 
     * @param firstName value
     */
    public void setFirstName(Object firstName) {
        this.first = firstName;
    }

    /**
     * Returns the last name.
     * 
     * @param lastName value
     * @return lastName as a String
     */
    public Object getLastName(Object lastName) {
        return last;
    }

    /**
     * Sets the last name input into lastName.
     * 
     * @param lastName value
     */
    public void setLastName(Object lastName) {
        this.last = lastName;
    }

    /**
     * Returns the year of birth.
     * 
     * @param birthYear value
     * @return birthYear as int.
     */
    public Object getBirthYear(Object birthYear) {
        return birth;
    }

    /**
     * Sets the year of birth input into birthYear.
     * 
     * @param birthYear value
     */
    public void setBirthYear(Object birthYear) {
        this.birth = birthYear;
    }

    /**
     * Returns the student number.
     * 
     * @param studentNum value
     * @return studentNumber as int
     */
    public Object getStudentNumber(Object studentNum) {
        return num;
    }

    /**
     * Sets the student number value into studentNum.
     * 
     * @param studentNum value
     */
    public void setStudentNumber(Object studentNum) {
        this.num = studentNum;
    }

    /**
     * Sets the GPA value into gPA.
     * 
     * @param gGPA value
     */
    public void setGradeAverage(Object gGPA) {
        this.gpa = gGPA;
    }

    /**
     * Returns the GPA.
     * 
     * @param gGPA value
     * @return gGPA as double
     */
    public Object getGradeAverage(Object gGPA) {
        return gpa;
    }

    /**
     * Concatenates first & last names, year of birth, student number, and GPA.
     * 
     * @return profile as a String
     */
    public String makeProfile() {
        String profile = "Name: " + first + " " + last + ", Born " 
                + birth + " Student Number " + num + ", GPA: " + gpa;
        return profile;
    }


}
