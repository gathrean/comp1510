package ca.bcit.comp1510.lab10;

/**
 * A Java program that will simulate two particles in a space and how many times
 * they collide (occupy the same coordinates). The goal of the program is to
 * determine and report the number of collisions.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Collisions {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        final int boundary = 2000000;
        final int maxSteps = 100000;

        final int x1 = 3;
        final int x2 = -3;

        RandomWalker one = new RandomWalker(maxSteps, boundary, x1, 0);
        RandomWalker two = new RandomWalker(maxSteps, boundary, x2, 0);

        /*
         * Step 3. Use a for loop to have each RandomWalker take one step and
         * then determines if they have collided.
         */

        int collisions = 0;
        for (int i = 1; i <= maxSteps; i++) {
            one.takeStep();
            two.takeStep();
            if (samePositions(one, two)) {
                collisions++;
            }
        }

        System.out.println("Collisions: " + collisions);

        /*
         * The farthest distance a RandomWalker particle gets with these
         * settings is 1003.
         */
    }

    /**
     * Returns true if the two RandomWalker particles have collided (same
     * position).
     * 
     * @param one RandomWalker object
     * @param two RandomWalker object
     * @return true
     */
    public static boolean samePositions(RandomWalker one, RandomWalker two) {
        return one.getCurrentX() == two.getCurrentX()
                && one.getCurrentY() == two.getCurrentY();

    }

}
