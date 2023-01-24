package ca.bcit.comp1510.lab10;

import java.util.Scanner;

/**
 * Driver class for RandomWalker.java.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class TestWalker {

    /**
     * Tests if the RandomWalker class is working properly.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        // FIRST WALKER:
        final int firstMaxSteps = 10;
        final int firstBoundary = 5;

        RandomWalker firstWalker = new RandomWalker(firstMaxSteps,
                firstBoundary);

        System.out.println("First Walker's max steps: " + firstMaxSteps
                + ", boundary: " + firstBoundary + "\n");

        // SECOND WALKER:
        Scanner scan = new Scanner(System.in);

        System.out.print("(Second Walker) Enter maximum steps: ");
        int secondMaxSteps = scan.nextInt();

        System.out.print("(Second Walker) Enter boundary size: ");
        int secondBoundary = scan.nextInt();

        RandomWalker secondWalker = new RandomWalker(secondMaxSteps,
                secondBoundary);

        // FIRST AND SECOND WALKER
        System.out.println("");
        System.out.println("First Walker: " + firstWalker.toString());
        System.out.println("Second Walker: " + secondWalker.toString());

        final int firstSecondSteps = 5;
        System.out.println("\nDetailed log of First and Second Walker's "
                + "distance during their first " + firstSecondSteps
                + " steps:\n");
        for (int i = 1; i <= firstSecondSteps; i++) {
            firstWalker.takeStep();
            secondWalker.takeStep();

            System.out.println("First Walker: "
                    + firstWalker.getMaximumDistance() + "\t| Second Walker: "
                    + secondWalker.getMaximumDistance());

        }

        // THIRD WALKER
        final int thirdMaxSteps = 200;
        final int thirdBoundary = 10;
        RandomWalker thirdWalker = new RandomWalker(thirdMaxSteps,
                thirdBoundary);

        System.out.println("\nThe before and after of the Third Walker "
                + "going for a walk given a maximum of " + thirdMaxSteps
                + " steps: \n");
        System.out.println("Before moving: " + thirdWalker.toString());

        thirdWalker.walk();

        System.out.println("After moving: " + thirdWalker.toString());

        scan.close();
    }

}
