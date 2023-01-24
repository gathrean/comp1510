package ca.bcit.comp1510.lab04;

import java.util.Scanner;

/**
 * Driver class for MultiDie.java.
 * 
 * @author Gathrean Dela Cruz
 * @version 1
 *
 */
public class Names {
    /**
     * Drives the program to test my Name class.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        // Creating a Scanner
        Scanner myScanner = new Scanner(System.in);
        
        Name fullName;
        
        String userInput1;
        String userInput2;
        String userInput3;
        
        System.out.print("What is your first name?: ");
        userInput1 = myScanner.nextLine();
        userInput1 = userInput1.substring(0, 1).toUpperCase() 
                   + userInput1.substring(1).toLowerCase();
        
        System.out.print("What is your middle name?: ");
        userInput2 = myScanner.nextLine();
        userInput2 = userInput2.substring(0, 1).toUpperCase() 
                + userInput2.substring(1).toLowerCase();
        
        System.out.print("What is your last name?: ");
        userInput3 = myScanner.nextLine();
        userInput3 = userInput3.substring(0, 1).toUpperCase() 
                + userInput3.substring(1).toLowerCase();
        
        fullName = new Name(userInput1, userInput2, userInput3);
        
        String complete = fullName.combineName();
        
        System.out.println(complete);

        myScanner.close();
    }

}
