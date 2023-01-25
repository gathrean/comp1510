package q1;

import java.text.DecimalFormat;

import java.util.Scanner;

/**
 * A Java program that prompts for and reads a double value representing a
 * monetary amount. Then it determines the fewest number of each bill and coin
 * needed to represent that amount, starting with highest ($10 bill).
 *
 * @author Gathrean Dela Cruz (Set A)
 * @version 1.0
 */
public class Change {
    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */
    public static void main(String[] args) {

        // Avoiding magic number warnings from Checkstyle.
        final int hundred = 100;
        final int twentyFive = 25;
        final int ten = 10;
        final int five = 5;

        Scanner scan = new Scanner(System.in);

        // Prompts the user and reads what they type in.
        System.out.print("How much cash do you have?  -> $");
        double input = scan.nextDouble();

        // (Optional) Prints back to the user what they typed.
        DecimalFormat formatting = new DecimalFormat("0.00");
        System.out.println("\nBreakdown of $" + formatting.format(input) + ":");
        double moneyLeft;

        // Preparation for Line 76.
        int change;
        change = (int) (Math.ceil(input * hundred));

        // Calculates how many ten dollar bills.
        double tens = Math.round(((int) input) / ten);
        input = input % ten;
        moneyLeft = tens;
        // Results
        System.out.println((int) moneyLeft + " ten dollar bills");

        // Calculates how many five dollar bills.
        double fives = Math.round(((int) input) / five);
        input = input % five;
        moneyLeft = fives;
        // Results.
        System.out.println(((int) moneyLeft) + " five dollar bills");

        // Calculates how many toonies.
        double toonies = Math.round(((int) input) / 2);
        input = input % 2;
        moneyLeft = toonies;
        // Results.
        System.out.println(((int) moneyLeft) + " toonies");

        // Calculates how many loonies.
        double loonies = Math.round(((int) input) / 1);
        input = input % 1;
        moneyLeft = loonies;
        // Results.
        System.out.println(((int) moneyLeft) + " loonies");

        // Working with change now.

        // This separates the change from the dollars
        change = change % hundred;

        // Calculates how many quarters.
        int quarters = Math.round((int) change / twentyFive);
        input = input % twentyFive;
        moneyLeft = quarters;
        // Results.
        System.out.println(((int) moneyLeft) + " quarters");

        change = change % twentyFive;

        // Calculates how many dimes.
        int dimes = Math.round((int) change / ten);
        input = input % ten;
        moneyLeft = dimes;
        // Results.
        System.out.println(((int) moneyLeft) + " dimes");

        change = change % ten;

        // Calculates how many nickels.
        int nickels = Math.round((int) change / five);
        moneyLeft = nickels;
        // Results.
        System.out.println(((int) moneyLeft) + " nickels");

        change = change % five;

        // Calculates how many pennies.
        int pennies = Math.round((int) change / 1);
        moneyLeft = pennies;
        // Results
        System.out.println(((int) moneyLeft) + " pennies");

        scan.close();

    }

}
