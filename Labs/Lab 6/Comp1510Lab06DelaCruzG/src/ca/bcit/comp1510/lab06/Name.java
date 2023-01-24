package ca.bcit.comp1510.lab06;

/**
 * A Java class that consists of the first, middle, and last name of someone.
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
     * @param firstName  String
     * @param middleName String
     * @param lastName   String
     */
    public Name(String firstName, String middleName, String lastName) {

        if (firstName.isEmpty() || firstName.isBlank()) {
            first = "Jane";
        }
        if (middleName.isEmpty() || middleName.isBlank()) {
            middle = "  ";
        }
        if (lastName.isEmpty() || lastName.isBlank()) {
            last = "Doe";
        }
        first = firstName.substring(0, 1).toUpperCase() + firstName.substring(1);
        middle = middleName.substring(0, 1).toUpperCase() + middleName.substring(1);
        last = lastName.substring(0, 1).toUpperCase() + lastName.substring(1);
        combineName();
    }

    /**
     * Sets the First Name input into first.
     * 
     * @param first value
     */
    public void setFirst(String first) {
        if (first.isEmpty() || first.isBlank()) {
            // do nothing
        } else {
            this.first = first.substring(0, 1).toUpperCase() + first.substring(1);
        }
    }

    /**
     * Sets the Middle Name input into middle.
     * 
     * @param middle value
     */
    public void setMiddle(String middle) {
        if (middle.isEmpty() || middle.isBlank()) {
            // do nothing
        } else {
            this.middle = middle.substring(0, 1).toUpperCase() + middle.substring(1);
        }
    }

    /**
     * Sets the Last Name input into to last.
     *
     * @param last value
     */
    public void setLast(String last) {
        if (last.isEmpty() || last.isBlank()) {
            // do nothing
        } else {
            this.last = last.substring(0, 1).toUpperCase() + last.substring(1);
        }
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

    /*
     * Lab 5 3.a. A method that accepts no parameters and returns the length of the
     * name i.e. the sum of the three parts of the name.
     */
    public int nameLength() {
        int nameLength = first.length() + middle.length() + last.length();
//
//        if (first.length() == 0) {
//            return nameLength = 0 + middle.length() + last.length();
//        } else if (middle.length() == 0) {
//            return nameLength = first.length() + 0 + last.length();            
//        } else if (last.length() == 0) {
//            return nameLength = first.length() + middle.length() + 0;
//        } else {
//            
//        }
        return nameLength;
    }

    /*
     * Lab 5 3.b. A method that accepts no parameters and returns a String
     * consisting of the three initials in UPPER CASE.
     */
    public String nameUpperCase() {
        String firstUpperCase = first.substring(0, 1).toUpperCase();
        String middleUpperCase = middle.substring(0, 1).toUpperCase();
        String lastUpperCase = last.substring(0, 1).toUpperCase();

        String nameUpperCase = firstUpperCase + middleUpperCase + lastUpperCase;

        return nameUpperCase;
    }

    public char getCharacter(int n) {

        String fullName = first + " " + middle + " " + last;

        if (n > fullName.length()) {
            return '@';
        }
        return combineName().charAt(n - 1);
    }

    /*
     * Lab 5 3.d. A method that accepts no parameters and returns a String
     * consisting of the last name, followed by a comma, followed by the first name,
     * followed by the middle name. (Remember to put spaces between the names)
     */
    public String nameContact() {
        return last + ", " + first + " " + middle;
    }

    /*
     * Lab 5 3.e. A method that accepts a String and returns true if the String is
     * equal to the first name (use equals method in the String class!).
     */

    public boolean isEqual(String str) {
        return first.equals(str);
    }

    /*
     * Lab 5 3.f. A method that accepts a Name object and returns true if the three
     * parts of the name object are the same as the three parts of "this" Name
     * object.
     */
    public boolean compareName(Name name) {

        return this.first.equals(name.getFirst()) && this.middle.equals(name.getMiddle())
                && this.last.equals(name.getLast());

    }
}
