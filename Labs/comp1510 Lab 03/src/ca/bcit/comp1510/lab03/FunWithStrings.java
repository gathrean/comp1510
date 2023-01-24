package ca.bcit.comp1510.lab03;

import java.util.Scanner;

/**
 * A program that explores, some useful methods in the String class.
 *
 * @author Ean Dela Cruz
 * @version 2022
 *
 */
public class FunWithStrings {
  /**
   * Drives the program.
   *
   * @param args unused
   * 
   */

  public static void main(String[] args) {

    // Step 3
    Scanner myScanner = new Scanner(System.in);

    // Step 4
    String userInput;

    // Step 5
    System.out.println("What is the name of your favourite book?");

    // Step 8
    userInput = myScanner.nextLine();

    // Step 9
    // Repeats the user's input to the console.
    System.out.println("\nStep 9:");
    System.out.println("Your favorite book is " + userInput);

    //
    // Step 10 Challenge Question
    // 
    // The next() method only prints everything before a space. The nextLine()
    // method prints the whole line entered.
    // 
    // This Java doc was helpful in understanding the methods at a deeper level

    // Step 12
    // Counts how many characters are in the title of the book.
    int length = userInput.length();
    System.out.println("The title has " + length + " characters");

    // Step 13
    System.out.println("\nDoes your book title start with \"The\"? ");
    System.out.println(userInput.startsWith("The"));

    // Step 14
    System.out.println("\nStep 14:");
    System.out.println(userInput.toUpperCase());
    // It made the user's input all capital letters.

    // Step15
    String upperCase;
    System.out.println("\nStep 15:");

    upperCase = userInput.toUpperCase();
    System.out.println(upperCase);

    System.out.println(userInput);
    // The above is proof
    // the variable userInput isn't permanently all capitals.

    // Step 16
    // The string cannot be changed after it is created.
    // The print method just assigns a new value.
    // Strings are immutable.

    // Step 17
    System.out.println("\nStep 17:");
    System.out.println(userInput.toUpperCase());
    System.out.println(userInput.toLowerCase());

    // Step 18
    System.out.println("\nStep 18:");
    System.out.println(userInput.trim());
    // The trim() String method gets rid of the space before and after the input.

    // Step 19
    System.out.println("\nStep 19: ");

    String first = userInput.substring(0, 1).toUpperCase();
    String middle = userInput.substring(1, userInput.length() - 1).toLowerCase();
    String last = userInput.substring((userInput.length() - 1), userInput.length()).toUpperCase();

    userInput = (first + middle + last);
    System.out.println("Your title is now: " + userInput.trim());

    myScanner.close();

  }

}
