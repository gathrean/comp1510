package ca.bcit.comp1510.lab05;

/**
 * A Java program to represent a Sphere concept.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 * 
 */
public class Sphere {

    private double x, y, z;

    private double radius, area, volume;

    public Sphere(double newX, double newY, double newZ, double newR) {

        x = newX;
        y = newY;
        z = newZ;
        radius = newR;

        surfaceArea();
        volume();
        toString();
    }

    // Getters

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    public double getRadius() {
        return radius;
    }

    // Setters

    public void setX(double newX) {
        x = newX;
    }

    public void setY(double newY) {
        y = newY;
    }

    public void setZ(double newZ) {
        z = newZ;
    }

    public void setradius(int newR) {
        this.radius = newR;
    }

    // Method that returns the Surface Area of the Sphere
    // Formula: A = 4 * PI * r^2

    public double surfaceArea() {
        area = (4 * Math.PI * Math.pow(radius, 2));

        return area;
    }

    // Method that returns the Volume of the Sphere
    // Formula: V = 4/3 * PI * r^3

    public double volume() {
        volume = (4 * Math.PI * Math.pow(radius, 3) / 3);

        return volume;
    }

    /*
     * toString() method which returns a String composed of the concatenation of the
     * information in the Sphere.
     */

    public String toString() {

        String areaResults = Double.toString(area);
        String volResults = Double.toString(volume);

        String number = areaResults + volResults;

        return number;
    }
}
