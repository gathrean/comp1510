package ca.bcit.comp1510.lab06;

/**
 * A Java program that tests the methods from Name.java but this time, loops are
 * involved.
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
        Name myName = new Name("   ", "Taloban", "    ");

        // Returns the length of the sum of the three parts of the name.
        System.out.println("Name Length: " + myName.nameLength());

        // Returns the initials all in Upper Case.
        System.out.println("Initials: " + myName.nameUpperCase());

        // Returns the nth character in the full name.
        final int nth = 29;
        System.out.println(nth + "th charater: " + myName.getCharacter(nth));

        // Returns a string in the format of Last, First Middle
        System.out.println("Contact style: " + myName.nameContact());

        // True if the String matches with myName
        System.out.println(myName.isEqual("Ean"));

        // True if the name object is same as three parts of "this" Name object
        System.out.println(myName.compareName(myName));

    }

}