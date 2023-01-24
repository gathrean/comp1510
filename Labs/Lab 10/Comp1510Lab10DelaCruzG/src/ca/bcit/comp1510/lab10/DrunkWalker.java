package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * A Java program that simulates a drunken walker.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class DrunkWalker {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        /* Step 1. Ask the user for the boundary and the number of steps. */
        System.out.print("Enter a boundary: ");
        int boundary = scan.nextInt();

        System.out.print("Enter number of maximum steps: ");
        int maxSteps = scan.nextInt();

        /*
         * Step 2. Ask the user for the number of drunks (simulations) to run.
         */
        System.out.print("Enter amount of drunks: ");
        int drunks = scan.nextInt();

        /*
         * Step 3. Use a for loop to instantiate a RandomWalker to represent the
         * drunk and ask it to walk. If it falls out of bounds early, increment
         * a counter.
         */
        int falls = 0;

        for (int i = 1; i <= drunks; i++) {

            RandomWalker drunkWalker = new RandomWalker(maxSteps, boundary);
            while (drunkWalker.moreSteps()) {
                if (drunkWalker.inBounds()) {
                    drunkWalker.takeStep();
                } else {
                    falls++;
                    break;
                }
            }

        }

        /*
         * Step 4. After the loop, print out the total number of tests (drunks)
         * and the number of falls.
         */

        System.out.println("\nThe total number of drunks: " + drunks
                + "\nThe total number of falls: " + falls);

        scan.close();
    }

}
