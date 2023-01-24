package ca.bcit.comp1510.lab03;

import java.lang.Math;
import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * A Java program that calculates the distance between two points.
 *
 * @author Ean Dela Cruz
 * @version 2022
 *
 */

public class Distance {

  /**
   * Drives the program.
   *
   * @param args unused
   */

  public static void main(String[] args) {

    // Step 4
    // Collecting the first x, y coordinates
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your first x and y coordinates "
                     + "(two values separated by white space): ");
    double x1 = scan.nextDouble();
    double y1 = scan.nextDouble();

    // Collecting the second x, y coordinates
    System.out.println("Enter your second x and y coordinates" 
                     + "(two values separated by white space): ");
    double x2 = scan.nextDouble();
    double y2 = scan.nextDouble();
    
    // Step 5
    double resultX = (x2 - x1);
    double resultY = (y2 - y1);
    
    // Step 6
    double result1 = ((resultX * resultX) + (resultY * resultY));
    double result2 = Math.sqrt(result1);
    
    // Step 7
    System.out.println("\nThe distance between the two points is \n" + result2);
    
    // Step 8
    DecimalFormat df = new DecimalFormat("#0.00");
    String str = df.format(result2);
    System.out.println("\nThe distance formatted properly is: \n" + str);
    
    
    scan.close();
  }

}
