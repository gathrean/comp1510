package ca.bcit.comp1510.lab02;
import java.util.Scanner;


/**
 * Class name: Circle
 * A program that calculates some important values for a Circle.
 * 
 * @author Ean Dela Cruz
 * @version 2022
 *
 */

public class Circle {
    
    public static void main (String [] Args){
        
        /**
         * This main method drives the program.
         * @param args unused
         */
        
        final double Pi = 3.14159;
        
        // We know that Pi is a constant
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter a radius value for the Circle.");
        double radius = myScanner.nextDouble();
      
        int circumference = (int) (2 * Pi * radius);
        System.out.println("The circumference of your circle is " + circumference);
        
        int area = (int) (Pi * radius * radius);
        System.out.println("The area of your circle is " + area);
        
        //Step 10a Doubling the radius
        
        System.out.println(" ");
        int doubleRadius = (int) (radius * 2);
        System.out.println("If we double your radius, it will be " + doubleRadius);
        
        //Step 10b Calculating area and circumference using doubleRadius
        
        int doubleArea = (int) (Pi * radius * doubleRadius);
        int doubleCircumference = (int) (2 * Pi * doubleRadius);
        System.out.println("Therefore your area would be " + doubleArea + " and your circumference would be " + doubleCircumference);
        
        
        //Step 10c Using division
        
        System.out.println(" ");
        int amountArea = (int)(doubleArea / area);
        int amountCircumference = (int)(doubleArea / area);
        System.out.println("Your area increased by " + amountArea + " times and your circumference by " + amountCircumference + " times");
      
        myScanner.close();
    }

}
