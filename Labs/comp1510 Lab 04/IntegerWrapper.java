package ca.bcit.comp1510.lab04;


import java.util.Scanner;

/**
 * A Java program to learn how the Wrapper class works with integers.
 *
 * @author Gathrean Dela Cruz
 * @version 1
 *
 */

public class IntegerWrapper {

    /**
     * Minimum value.
     */

    public static final int MIN_VALUE = 0;

    /**
     * Max Value.
     */

    public static final int MAX_VALUE = 0;

    /**
     * Drives the program.
     *
     * @param args unused
     */

    public static void main(String[] args) {

        //Creating a new Scanner called "input".
        Scanner input = new Scanner(System.in);


        //Prompt for and read in an integer
        System.out.print("Enter an integer to convert: ");
        String num = input.next();
        
        //Convert the string to integer
        int numConverted = Integer.parseInt(num);
        
        //Convert the string to Binary integer
        System.out.println("\nBinary is: " 
                + Integer.toBinaryString(numConverted));
        
        //Convert the string to Octal
        System.out.println("Octal is: "
                + Integer.toOctalString(numConverted));
        
        //Convert the string to Hexadecimal
        System.out.println("Hexadecimal is: "
                + Integer.toHexString(numConverted));
        
        //Print the maximum and minimum
        System.out.println("\nThe maximum possible Java integer value is: " 
                + Integer.MAX_VALUE);
        System.out.println("The minimum possible Java integer value is: "
                + Integer.MIN_VALUE);
        
        //Prompt the user to enter two integers and add them together
        System.out.print("\nEnter first integer to add: ");
        String numOne = input.next();
        
        System.out.print("Enter second integer to add: ");
        String numTwo = input.next();

        //Add the two integers together.
        int numOneConvert = Integer.parseInt(numOne);
        int numTwoConvert = Integer.parseInt(numTwo);
        System.out.println("Adding your two integers equals: " 
                + (numOneConvert + numTwoConvert));
        
        


        input.close();
    }

}
