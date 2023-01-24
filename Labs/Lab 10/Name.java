package ca.bcit.comp1510.lab10;

/**
 * A Java program for first, middle, and last names.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Name implements Comparable<Name> {

    /** First Name String. */
    private final String first;

    /** Middle Name String. */
    private final String middle;

    /** Last Name String. */
    private final String last;

    /**
     * Constructor class for first, middle, and last names.
     * 
     * @param first  String
     * @param middle String
     * @param last   String
     */
    public Name(String first, String middle, String last) {

        this.first = first;
        this.middle = middle;
        this.last = last;
    }

    /**
     * Constructor class for first, middle, and last names.
     * 
     * @param first String
     * @param last  String
     */
    public Name(String first, String last) {

        this.first = first;
        this.middle = null;
        this.last = last;
    }

    /**
     * Accessor for first name.
     * 
     * @return first String
     */
    public String getFirst() {
        if (this.first == null) {
            throw new IllegalArgumentException(this.first + " is Empty");
        }
        return this.first;
    }

    /**
     * Accessor for first name.
     * 
     * @return first String
     */
    public String getMiddle() {
        return this.middle;
    }

    /**
     * Accessor for first name.
     * 
     * @return first String
     */
    public String getLast() {
        if (this.last == null) {
            throw new IllegalArgumentException(this.last + " is Empty");
        }
        return this.last;
    }

    @Override
    public int compareTo(Name o) {
        if (!this.last.equals(o.last)) {
            return this.last.compareTo(o.last);
        } else if (!this.last.equals(o.last)) {
            return this.first.compareTo(o.first);
        } else if (this.first.equals(o.first)) {
            return this.middle.compareTo(o.middle);
        } else {
            return 0;
        }
    }

}
