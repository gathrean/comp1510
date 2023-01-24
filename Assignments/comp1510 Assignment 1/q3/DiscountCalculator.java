package q3;

import java.util.Scanner;

/**
 * A Java program that calculates a discount for a cheese club. The discount
 * depends on the customer's number of cheeses purchased and the number of new
 * customers referred by the customer. The discount is in percent and equals the
 * sum of the number of cheeses and referrals but cannot exceed 75%.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class DiscountCalculator {

    /**
     * This is the main method that runs the code.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        final int seventyFive = 75;

        Scanner scan = new Scanner(System.in);

        System.out.println("Cheese Club Discount Calculator.");

        System.out.print("How much cheese?:   -> ");
        int cheese = scan.nextInt();

        System.out.print("How many referrals?: -> ");
        int referral = scan.nextInt();

        int added = cheese + referral;

        int compare = Math.min(added, seventyFive);

        System.out.println("Your discount is: " + compare + "%.");

        scan.close();
    }

}
