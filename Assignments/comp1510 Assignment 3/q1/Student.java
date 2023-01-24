package q1;

/**
 * Student class from Chapter 7, modified. Now includes scores for three tests.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Student {

    /** Test Score for Test 1. */
    private int test1;

    /** Test Score for Test 2. */
    private int test2;

    /** Test Score for Test 3. */
    private int test3;

    /** First name of this student. */
    private String firstName;

    /** Last name of this student. */
    private String lastName;

    /** Home address of this student. */
    private Address homeAddress;

    /** School address of this student. Can be shared by other students */
    private Address schoolAddress;

    /**
     * Constructs a Student object that contains the specified values.
     * 
     * @param first  a String representing the first name
     * @param last   a String representing the last name
     * @param home   an Address object containing the home address
     * @param school an Address object containing the school address
     */
    public Student(String first, String last, Address home, Address school) {
        this.firstName = first;
        this.lastName = last;
        this.homeAddress = home;
        this.schoolAddress = school;
    }

    /**
     * Constructs a Student object that contains the specified values.
     * 
     * @param first  a String representing the first name
     * @param last   a String representing the last name
     * @param home   an Address object containing the home address
     * @param school an Address object containing the school address
     * @param score1 an integer representing the student's score for test 1
     * @param score2 an integer representing the student's score for test 2
     * @param score3 an integer representing the student's score for test 3
     */
    public Student(String first, String last, Address home, Address school,
            int score1, int score2, int score3) {
        this.firstName = first;
        this.lastName = last;
        this.homeAddress = home;
        this.schoolAddress = school;
        test1 = score1;
        test2 = score2;
        test3 = score3;
    }

    /**
     * Clears the test scores to zero.
     */
    public void setTestZero() {
        test1 = 0;
        test2 = 0;
        test3 = 0;
    }

    /**
     * Sets the test score to the correct test number.
     * 
     * @param testNum an integer representing the test number
     * @param score   an integer representing the test score
     */
    public void setTestScore(final int testNum, final int score) {
        final int maxNumOfTests = 3;
        if (testNum < 1 || testNum > maxNumOfTests) {
            throw new IllegalArgumentException(
                    "The test number should either be 1, 2, or 3.");
        }
        final char magic = (char) ('A' + testNum - 1);
        switch (magic) {
            case 'A':
                test1 = score;
                break;
            case 'B':
                test2 = score;
                break;
            case 'C':
                test3 = score;
                break;
            default:

        }
    }

    /**
     * Gets the test score.
     * 
     * @param testNum an integer representing the test number
     * @return the appropriate test
     */
    public int getTestScore(int testNum) {
        final int maxNumOfTests = 3;
        if (testNum < 1 || testNum > maxNumOfTests) {
            throw new IllegalArgumentException(
                    "The test number should either be 1, 2, or 3.");
        }
        final char magic = (char) ('A' + testNum - 1);
        if (magic == 'A') {
            return test1;
        }
        if (magic == 'B') {
            return test2;
        }
        return test3;
    }

    /**
     * Calculates the average score of the three tests.
     * 
     * @return average of the tests
     */
    public double average() {

        final int testOne = 1;
        final int testTwo = 2;
        final int testThree = 3;
        final double amountOfTests = 3.0;
        return (getTestScore(testOne) + getTestScore(testTwo)
                + getTestScore(testThree)) / amountOfTests;
    }

    /**
     * Returns a String description of this Student object.
     * 
     * @return description a String
     */
    public String toString() {
        String result;

        result = firstName + " " + lastName + "\n";
        result += "Home Address: " + homeAddress + "\n";
        result += "School Address: " + schoolAddress + "\n";
        result += "Test 1 score: " + test1 + "\n";
        result += "Test 2 score: " + test2 + "\n";
        result += "Test 3 score: " + test3 + "\n";
        result += "Test Score average: " + average() + "\n";

        return result;
    }
}
