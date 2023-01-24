package ca.bcit.comp1510.lab05;

/**
 * A Java program to represent a circular cone.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */

public class Cone {
    
    private double radius, volume, height, area, slantHeight;
    
    public Cone(double newRadius, double newHeight) {
        radius = newRadius;
        height = newHeight;
        
        volume();
        slantHeight();
        surfaceArea();
        toString();
        
    }

    // Getters
    
    public double getRadius() {
        return radius;
    }
    
    public double getHeight() {
        return height;
    }
    
    // Setters
    
    public void setRadius(double newRadius) {
        radius = newRadius;
    }
    
    public void setHeight(double newHeight) {
        height = newHeight;
    }
    
    /* A method that returns the volume of the Cone
     * 
     * Formula: V = 1/3 * PI * (radius)^2 * (height)
     * 
     * */
    
    public double volume() {
        volume = (Math.PI * Math.pow(radius, 2) * height);
        
        return volume;
                
    }
    
    /* A method that returns the slant height of the Cone
     * 
     * Formula: SH = √( (radius)^2 + (height)^2 )
     * 
     * */
    
    public double slantHeight() {
        slantHeight = Math.sqrt(Math.pow(radius, 2) 
                                     + Math.pow(height, 2));
        
        return slantHeight;
    }
    
     /* A method that returns the surface area of the Cone.
      * 
      * Formula: A = PI * radius^2 + (PI * radius * slantHeight)
      * 
      * Included the slantHeight as well so it's easier to
      * understand.
      * 
      * */
    
    public double surfaceArea() {
        
        area = Math.PI * Math.pow(radius, 2) 
                    + Math.PI * radius * slantHeight;
        
        return area;        
    }
    
    /*
     * toString() method which returns a String composed of the
     * concatenation of information in the Cone.
     */
    
    public String toString() {        
        String volumeResults = Double.toString(volume);
        String areaResults = Double.toString(area);
        String slantHeightResults = Double.toString(slantHeight);
        
        String resultsCone = "- Volume:       " + volumeResults
                           + "\n- Slant Height: " + slantHeightResults
                           + "\n- Surface Area: " + areaResults;
        
        return resultsCone;
        
    }
}
