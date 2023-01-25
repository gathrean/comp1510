package q1;

/**
 * Constructor class Cylinder for the class MultiCylinder.
 * 
 * @author Gathrean Dela Cruz
 * @version 1
 *
 */
public class Cylinder {

    /**
     * Cylinder radius.
     */
    private double radius;

    /**
     * Cylinder height.
     */
    private double height;

    /**
     * Cylinder surface area.
     */
    private double surfaceArea;

    /**
     * Cylinder volume.
     */
    private double volume;

    /**
     * A Cylinder constructor to accept & initialize the instance variables for
     * radius and height.
     * 
     * @param radius value
     * @param height value
     */
    public Cylinder(double radius, double height) {
        this.radius = radius;
        this.height = height;
        toString();
    }
    

    /**
     * Sets the radius.
     * 
     * @param theRadius int
     */
    public void setRadius(int theRadius) {
        radius = theRadius;
    }

    /**
     * Gets the radius.
     * 
     * @return radius
     */
    public double getRadius() {
        return radius;
    }

    /**
     * Sets the height.
     * 
     * @param theHeight int
     */
    public void setHeight(int theHeight) {
        height = theHeight;
    }

    /**
     * Gets the height.
     * 
     * @return height
     */
    public double getHeight() {
        return height;
    }

    /**
     * Calculates surface area for cylinder.
     * 
     * @param theRadius double
     * @param theHeight double
     * @return surfaceArea
     */
    public double surfaceArea(double theRadius, double theHeight) {
        surfaceArea = 2 * Math.PI * (radius + height);
        return surfaceArea;
    }

    /**
     * Calculates volume for cylinder.
     * 
     * @param theRadius double
     * @param theHeight double
     * @return volume
     */
    public double volume(double theRadius, double theHeight) {
        volume = Math.PI * Math.pow(radius, 2) * height;
        return volume;
    }

    /**
     * A toString method that returns a two-line description of the cylinder.
     * 
     * @return String
     */
    @Override
    public String toString() {
        return "Height is: " + height + "\nRadius is: " + radius 
                + "\nSurface Area: " + surfaceArea(radius, height) 
                + "\nVolume: " + volume(radius, height);

    }

}
