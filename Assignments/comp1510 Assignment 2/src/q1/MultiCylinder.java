package q1;

/**
 * Driver class for the Cylinder constructor class. Instantiates and updates two
 * Cylinder objects. Prints radius, height, final volume, and surface area of
 * each cylinder.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class MultiCylinder {
    /**
     * <p>
     * Main method for creating the two Cylinder objects.
     * </p>
     *
     * @param args unused
     */

    public static void main(String[] args) {

        double radius1 = 2 + 2;
        double radius2 = 2 + 1;

        double height1 = 2 + 2 + 2;
        double height2 = 2 + 1 + 2;
        Cylinder cylinder1 = new Cylinder(radius1, height1);

        Cylinder cylinder2 = new Cylinder(radius2, height2);

        System.out.println("Cylinder 1:");
        System.out.println(cylinder1);

        System.out.println("\nCylinder 2:");
        System.out.println(cylinder2);
    }

}
