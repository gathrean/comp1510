package ca.bcit.comp1510.lab04;

/**
 * A Java class.
 * 
 * @author Gathrean Dela Cruz
 * @version 1
 *
 */
public class Name {

    /**
     * First name.
     * 
     * @param args unused
     */
    private String first;

    /**
     * Middle name.
     */
    private String middle;

    /**
     * Last name.
     */
    private String last;

    /**
     * Constructor adds the names together.
     *
     * @param firstName String
     * @param middleName String
     * @param lastName String
     */
    public Name(String firstName, String middleName, String lastName) {
        first = firstName;
        middle = middleName;
        last = lastName;
        combineName();
    }

    /**
     * Sets the First Name input into first.
     * 
     * @param first value
     */
    public void setFirst(String first) {
        this.first = first;
    }

    /**
     * Sets the Middle Name input into middle.
     * 
     * @param middle value
     */
    public void setMiddle(String middle) {
        this.middle = middle;
    }

    /**
     * Sets the Last Name input into to last.
     *
     * @param last value
     */
    public void setLast(String last) {
        this.last = last;
    }

    /**
     * Returns the First Name.
     * 
     * @return first
     */
    public String getFirst() {
        return first;
    }

    /**
     * Returns the Middle Name.
     * 
     * @return middle
     */
    public String getMiddle() {
        return middle;
    }

    /**
     * Returns the Last Name.
     * 
     * @return last
     */
    public String getLast() {
        return last;
    }

    /**
     * Concatenates first, middle, and last name into one full name.
     * 
     * @return fullName as a String
     */
    public String combineName() {
        String fullName = first + " " + middle + " " + last;

        return fullName;
    }

}
