package q2;

import java.util.Scanner;

/**
 * A Java program that calculates an approximation to the square root using the
 * the algorithm from Newton. By the tenth estimation, it will have figured out
 * the square root.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Sqrt {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {

        // New input.
        Scanner input = new Scanner(System.in);

        System.out.println("A program to approximate to the square root");
        System.out.println("using the algorithm from Newton.");
        System.out.print("Enter a variable for a: -> ");
        double a = input.nextDouble();

        // The first estimate.
        double s = (a + 1) / 2;
        System.out.println("\nFirst estimate   : " + s);

        // The second estimate.
        s = (s + a / s) / 2;
        System.out.println("Second estimate  : " + s);

        // The third estimate.
        s = (s + a / s) / 2;
        System.out.println("Third estimate   : " + s);

        // The fourth estimate.
        s = (s + a / s) / 2;
        System.out.println("Fourth estimate  : " + s);

        // The fifth estimate.
        s = (s + a / s) / 2;
        System.out.println("Fifth estimate   : " + s);

        // The sixth estimate.
        s = (s + a / s) / 2;
        System.out.println("Sixth estimate   : " + s);

        // The seventh estimate.
        s = (s + a / s) / 2;
        System.out.println("Seventh estimate : " + s);

        // The eighth estimate.
        s = (s + a / s) / 2;
        System.out.println("Eighth estimate  : " + s);

        // The ninth estimate.
        s = (s + a / s) / 2;
        System.out.println("Ninth estimate   : " + s);

        // The tenth estimate.
        s = (s + a / s) / 2;
        System.out.println("Tenth estimate   : " + s + " (final)");

        input.close();
    }

}
