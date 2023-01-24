package ca.bcit.comp1510.lab04;

/**
 * Represents one die (singular of dice) with faces showing values between 1 and
 * 6.
 * 
 * @author Lewis & Loftus 9e
 * @author Gathrean Dela Cruz
 * @author BCIT
 * @version 2017
 * 
 *          Answers: 
 *          1. We don't really need getters and setters for max in this 
 *             Die program, but I think we should have them anyway to have
 *             control.
 *          2. No because it is in a class.
 *          3. It doesn't make sense to have max be the final because the
 *             max will almost always change when the program rolls the 
 *             dice again (or at least in the real world).
 *          4. Since max = numSides, the max will always match the
 *             MultiDie's maximum number of sides.
 *          5. max is not an instance variable because it is defined
 *             inside the public class MultiDie.
 */
public class MultiDie {

    /** Maximum face value. */
    public final int max;

    /** Current value showing on the die. */
    private int faceValue;

    /**
     * Constructor sets the initial face value to 1.
     * 
     * @param numSides int
     */
    public MultiDie(int numSides) {
        faceValue = 1;
        max = numSides;
        roll();
    }

    /**
     * Rolls this Die and returns the result.
     * 
     * @return faceValue as an int
     */
    public int roll() {
        faceValue = (int) (Math.random() * max) + 1;

        return faceValue;
    }

    /**
     * Sets the face value of this Die to the specified value.
     * 
     * @param value an int
     */
    public void setFaceValue(int value) {
        faceValue = value;
    }

    /**
     * Returns the face value of this Die as an int.
     * 
     * @return faceValue as an int
     */
    public int getFaceValue() {
        return faceValue;
    }

    /**
     * Returns a String representation of this Die.
     * 
     * @return toString description
     */
    public String toString() {
        String result = Integer.toString(faceValue);

        return result;
    }

}
