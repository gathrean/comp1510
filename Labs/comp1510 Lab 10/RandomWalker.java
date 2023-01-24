package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * A Java program to run a simple robot to model a random swalk.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class RandomWalker {

    /** The x coordinate of the current position. */
    private int currentX;

    /** The y-coordinate of the current position. */
    private int currentY;

    /** The maximum number of steps in the walk. */
    private int maxSteps;

    /** The current number of steps taken. */
    private int currentSteps;

    /** The boundary of the square the walker inhabits. */
    private int boundary;

    /** The distance of the walker. */
    private int maximumDistance;

    /**
     * First constructor for the RandomWalker class.
     * 
     * @param numMaxSteps integer
     * @param numBoundary integer
     */
    public RandomWalker(int numMaxSteps, int numBoundary) {
        this.currentX = 0;
        this.currentY = 0;
        this.currentSteps = 0;
        this.maximumDistance = 0;

        this.maxSteps = numMaxSteps;
        this.boundary = numBoundary;
    }

    /**
     * Second constructor for the RandomWalker class.
     * 
     * @param numMaxSteps integer
     * @param numX        integer
     * @param numY        integer
     * @param numBoundary integer
     */
    public RandomWalker(int numMaxSteps, int numBoundary, int numX, int numY) {
        this.maxSteps = numMaxSteps;
        this.currentX = numX;
        this.currentY = numY;
        this.boundary = numBoundary;

        this.currentSteps = 0;
        this.maximumDistance = 0;
    }

    /**
     * Takes a step in a random direction.
     */
    public void takeStep() {
        Random random = new Random();
        final int directions = 4;

        int move = random.nextInt(directions);

        switch (move) {
            case 0:
                currentX++;
                break;
            case 1:
                currentY++;
                break;
            case 2:
                currentX--;
                break;
            case 2 + 1:
                currentY--;
                break;
            default:
        }
        currentSteps++;
        maximumDistance = max(maximumDistance,
                max(Math.abs(currentX), Math.abs(currentY)));
    }

    /**
     * Gets the distance.
     * 
     * @return distance double
     */
    public int getMaximumDistance() {
        return maximumDistance;
    }

    /**
     * Returns the larger integer of two integers.
     * 
     * @param a integer for first number
     * @param b integer for second number
     * @return integer is larger.
     */
    private int max(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    /**
     * Returns true if current steps is less than max steps.
     * 
     * @return true if current steps is less than max steps.
     */
    public boolean moreSteps() {
        return currentSteps < maxSteps;
    }

    /**
     * Returns true if the RandomWalker's current coordinates are within its
     * square boundary.
     * 
     * @return true if the RandomWalker's current coordinates are within its
     *         square boundary.
     */
    public boolean inBounds() {
        return currentX <= boundary && currentX >= -boundary
                && currentY <= boundary && currentY >= -boundary;
    }

    /**
     * Uses a loop to simulate a random walk. Returns nothing.
     */
    public void walk() {
        while (this.moreSteps() && this.inBounds()) {
            this.takeStep();
        }

    }

    /**
     * Accessor / Getter for the current X-coordinate.
     * @return X integer
     */
    public int getCurrentX() {
        return currentX;
    }
    
    /**
     * Accessor / Getter for the current Y-coordinate.
     * @return Y integer
     */
    public int getCurrentY() {
        return currentY;
    }
    
    /**
     * Returns a String representation of RandomWalker.
     * 
     * @return a String representation of RandomWalker
     */
    public String toString() {
        return "\tCoordinates: " + currentX + ", " + currentY
                + "\tCurrent steps: " + currentSteps;
    }
}
