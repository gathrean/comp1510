package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/**
 * Driver class for Name.java.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class NameDriver {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        ArrayList<Name> nameList = new ArrayList<Name>();

        Name person1 = new Name("Ean", "D", "ela Cruz");
        Name person2 = new Name("Ean", null, "Dela Cruz");
        Name person3 = new Name("Ean", "", "DelaCruz");
        Name person4 = new Name("Ean2", "", "Dela Cruz");
        Name person5 = new Name("Ean2", "", "Dela Cruz2");

        nameList.add(person1);
        nameList.add(person2);
        nameList.add(person3);
        nameList.add(person4);
        nameList.add(person5);

        System.out.println("=== Before sorting ===");
        for (Name name : nameList) {
            System.out.println(name.getFirst() + " " + name.getMiddle() + " "
                    + name.getLast());
        }

        nameList.sort(null);

        System.out.println("\n=== After sorting ===");
        for (Name name : nameList) {
            System.out.println(name.getFirst() + " " + name.getMiddle() + " "
                    + name.getLast());
        }
    }

}
