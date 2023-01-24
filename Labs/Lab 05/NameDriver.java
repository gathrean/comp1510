package ca.bcit.comp1510.lab05;

/**
 * A Java program that tests the methods from Name.java
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class NameDriver {

    /**
     * Drives the program.
     * 
     * @param args
     */
    public static void main(String[] args) {

        // Creates a new Name object.
        Name myName = new Name("Gathrean", "Taloban", "Dela Cruz");

        // 3.a. Returns the length of the sum of the three parts of the name.
        System.out.println(myName.nameLength());

        // 3.b. Returns the initials all in Upper Case.
        System.out.println(myName.nameUpperCase());

        // 3.c. Returns the nth character in the full name.
        final int nth = 2;
        System.out.println(myName.getN(nth));

        // 3.d. Returns a string in the format of Last, First Middle
        System.out.println(myName.nameContact());

        // 3.e. Returns true if the String matches with myName
        System.out.println(myName.isEqual("Ean"));

        // 3.f. Returns true if the name object is same as three parts of "this" Name
        // object
        System.out.println(myName.compareName(myName));

    }

}
