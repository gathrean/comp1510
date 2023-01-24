package ca.bcit.comp1510.lab05;

/**
 * A Java program to represent a cube centered at the origin.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Cube {
    
    private double x, y, z;
    
    private double edge, area, volume, face, space;
    
    public Cube(double newX, double newY, double newZ, double newEdge) {
        
        x = newX;
        y = newY;
        z = newZ;
        edge = newEdge;
        
        surfaceArea();
        volume();
        faceDiagonal();
        spaceDiagonal();
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

    public double getEdge() {
        return edge;
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
    
    public void setradius(int newE) {
        edge = newE;
    }
    
    /* A method that returns the surface area of the Cube.
     * 
     * Formula: A = 6 * a^2
     * 
     * where A is the surface area of the cube,
     * and a is the edge length
     * */
    
    public double surfaceArea() {
        area = (6 * Math.pow(edge, 2));
        
        return area;
    }
    
    /* A method that returns the volume of the Cube.
     * 
     * Formula: V = a^3
     * 
     * where A is the volume of the cube,
     * and a is the edge length
     * */
    
    public double volume() {
        volume = (Math.pow(edge, 3));
        
        return volume;
    }
    
    /* A method that returns the face diagonal of the Cube.
     * 
     * Formula: F = = √2 * a
     * 
     * where F is the face diagonal of the cube,
     * and a is the edge length
     * */
    
    public double faceDiagonal() {
        face = (Math.sqrt(2) * edge);
        
        return face;
    }
    
    /* A method that returns the space diagonal of the Cube.
     * 
     * Formula: S = = √3 * a
     * 
     * where S is the space diagonal of the cube,
     * and a is the edge length
     * */
    
    public double spaceDiagonal() {
        space = (Math.sqrt(3) * edge);
        
        return space;
    }
    
    
    /* toString() method which returns a String composed of the
     * concatenation of information in the Cube.
     * */
    
    public String toString() {
        String areaResults = Double.toString(area);
        String volResults = Double.toString(volume);
        String faceResults = Double.toString(face);
        String spaceResults = Double.toString(space);
        
        String resultsCube = "- Surface Area:   " + areaResults 
                           + "\n- Volume:         " + volResults 
                           + "\n- Face Diagonal:  " + faceResults 
                           + "\n- Space Diagonal: " + spaceResults;
        
        return resultsCube;
    }
    
}
