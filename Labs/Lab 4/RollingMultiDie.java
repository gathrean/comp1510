package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Driver class for MultiDie.java.
 * 
 * @author Gathrean Dela Cruz
 * @version 1
 *
 */
public class RollingMultiDie {
    /**
     * Drives the program.
     * 
     * @param args unused
     */

    public static void main(String[] args) {

        // Creating a Scanner
        Scanner myScanner = new Scanner(System.in);

        int userInput1;
        int userInput2;

        int sum;

        System.out.println("Enter how many sides for your two dice: ");
        userInput1 = myScanner.nextInt();
        userInput2 = myScanner.nextInt();
        
        MultiDie die1 = new MultiDie(userInput1);
       
        MultiDie die2 = new MultiDie(userInput2);

        System.out.println("\nYou roll the dice...");
        System.out.println("Die One: " + die1);
        System.out.println("Die Two: " + die2);

        die1.roll();
        die2.roll();
        System.out.println("\nYou roll again.");
        System.out.println("Die One: " + die1 + "\nDie Two: " + die2);

        die1.roll();
        die2.roll();
        System.out.println("\nYou roll again.");
        System.out.println("Die One: " + die1 + "\nDie Two: " + die2);
        sum = die1.getFaceValue() + die2.getFaceValue();
        
        // Adding the two die together
        System.out.println("Sum: " + sum);

        System.out.println("\nYou roll again.");
        sum = die1.roll() + die2.roll();
        System.out.println("Die One: " + die1 + "\nDie Two: " + die2);
        System.out.println("New sum: " + sum);
        
        myScanner.close();

    }

}
