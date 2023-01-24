package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * A Java program that uses Scanner to interact with the user and create some
 * shapes.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */

public class GeometryDriver {
    /**
     * Drives the program.
     * 
     * @param args
     */

    // DecimalFormat

    public static void main(String[] args) {

        // Testing (Ignore)
        DecimalFormat formatter = new DecimalFormat("###.###");

        // Instantiating a Scanner object.
        Scanner scan = new Scanner(System.in);

        // Prompts the user for the Sphere.
        System.out.println("--- Sphere Object ---");
        System.out.print("Please enter a radius: ");
        double radius = scan.nextDouble();

        System.out.print("Please enter x, y, and z coordinates: ");
        double x = scan.nextDouble();
        double y = scan.nextDouble();
        double z = scan.nextDouble();

        Sphere theSphere = new Sphere(x, y, z, radius);

        // Prints out the details of the Sphere.
        System.out.println("Surface Area:   " + formatter.format(theSphere.surfaceArea()));
        System.out.println("Volume:         " + formatter.format(theSphere.volume()));

        // Prompts the user for the Cube.
        System.out.println("\n--- Cube Object ---");
        System.out.print("Please enter an edge length: ");
        double edge = scan.nextDouble();

        System.out.print("Please enter x, y, and z coordinates: ");
        x = scan.nextDouble();
        y = scan.nextDouble();
        z = scan.nextDouble();

        Cube theCube = new Cube(x, y, z, edge);

        // Prints out the details of the Cube.
        System.out.println("Surface Area:   " + formatter.format(theCube.surfaceArea()));
        System.out.println("Volume:         " + formatter.format(theCube.volume()));
        System.out.println("Face Diagonal:  " + formatter.format(theCube.faceDiagonal()));
        System.out.println("Space Diagonal: " + formatter.format(theCube.spaceDiagonal()));

        // Prompts the user for the Cone.
        System.out.println("\n--- Cone Object ---");
        System.out.print("Please enter radius of cone: ");
        double coneRadius = scan.nextDouble();
        System.out.print("Please enter height of cone: ");
        double coneHeight = scan.nextDouble();

        Cone theCone = new Cone(coneRadius, coneHeight);

        // Prints out the details of the Cone.
        System.out.println("Volume:         " + formatter.format(theCone.volume()));
        System.out.println("Slant Height:   " + formatter.format(theCone.slantHeight()));
        System.out.println("Surface Area:   " + formatter.format(theCone.surfaceArea()));

        // Closes the Scanner object.
        scan.close();

    }

}
