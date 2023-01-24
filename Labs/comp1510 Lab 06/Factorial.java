package ca.bcit.comp1510.lab06;

import java.util.Scanner;

/**
 * A Java program that takes a user's nonnegative integer input and calculates
 * its factorial using loops. If the user enters a negative integer or a
 * non-integer, the program will ask them to try again.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */

public class Factorial {
    /**
     * Drives the program.
     * @param args
     */

    public static void main(String[] args) {

        long fact = 1;
        int i = 1;

        Scanner scan = new Scanner(System.in);

        while (i > 0) {
            System.out.print("Enter a positive integer: ");
            long number = readInt(scan);

            if (number < 0) {
                System.out.println("Please enter an integer that is nonnegative. Try again");
                System.out.println("");

            } else if (number <= 1) {
                System.out.println("Your factorial is 1");
                System.out.println("");

            } else {
                while (i <= number) {
                    fact = fact * i;
                    i++;
                }

            }
            System.out.println("Your factorial is: " + fact);
            System.out.println("");
            break;
        }

    }

    private static int readInt(Scanner scan) {
        while (!scan.hasNextInt()) {
            scan.next();
            System.out.println("Input must be integer, try again");
            System.out.print("\nEnter a positive integer: ");

        }
        return scan.nextInt();
    }

}
