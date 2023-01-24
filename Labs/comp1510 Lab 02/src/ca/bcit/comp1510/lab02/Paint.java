package ca.bcit.comp1510.lab02;
import java.util.Scanner;

/**
 * Class name: Paint
 * A Java program that determines ho many cans of paint we need to paint a room
 * based on the room's length, width, and height, and the number of coats we want to apply.
 * 
 * @author Ean Dela Cruz
 * @version 2022
 *
 */

public class Paint {

    public static void main(String[] args) {
        /**
         * This main method drives the program.
         * @param args unused
         */
        
        int COVERAGE = 400; //a 4 liter can of paint will cover 400 square feet

        Scanner myScanner = new Scanner(System.in);
        System.out.println("What is the length of the room in feet?");
        double length = myScanner.nextDouble();
        
        System.out.println("What is the width of the room in feet?");
        double width = myScanner.nextDouble();
        
        System.out.println("What is the height of the room in feet?");
        double height = myScanner.nextDouble();
        
        System.out.println("How many coats of paint do you want to apply10?");
        double coats = myScanner.nextDouble();
        
        double surfaceArea = ((length * width) + (2 * height * length) + (2 * height * width));
        double coverageNeeded = coats * surfaceArea;
        double cansOfPaintNeeded = coverageNeeded / COVERAGE;
        
        System.out.println("You will need to buy " + cansOfPaintNeeded + " cans of paint.");
        
        myScanner.close();
    }

}
