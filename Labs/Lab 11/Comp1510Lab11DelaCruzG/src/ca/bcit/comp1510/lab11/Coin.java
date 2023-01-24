package ca.bcit.comp1510.lab11;

/**
 * Represents a two-sided coin that can be flipped.
 * 
 * @author Gathrean Dela Cruz
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2017
 */
public class Coin implements Lockable {
    /** Internal representation of coin showing heads. */
    public static final int HEADS = 0;

    /** Internal representation of coin showing tails. */
    public static final int TAILS = 1;

    /** Coin's current face showing. */
    private int face;

    /** Locked boolean for Lockable interface. */
    private boolean locked;

    /** Key for Lockable interface. */
    private int key;

    /**
     * Constructs a Coin object and flips it to give it a starting value.
     */
    public Coin() {
        flip();
    }

    /**
     * Flips this Coin by randomly choosing a face value.
     */
    public void flip() {

        if (!locked) {
            face = (int) (Math.random() * 2);
        }

    }

    /**
     * Returns true if the current face of the Coin is heads.
     * 
     * @return true if current face is heads, else false.
     */
    public boolean isHeads() {
        return face == HEADS;
    }

    /**
     * Returns the current face value of this Coin as a String.
     * 
     * @return toString description
     */
    public String toString() {
        String faceName;

        if (face == HEADS) {
            faceName = "Heads";
        } else {
            faceName = "Tails";
        }

        return faceName;
    }

    /**
     * Sets the key.
     * 
     * @param key an integer of the key number.
     */
    public void setKey(int key) {
        this.key = key;

    }

    /**
     * Locks the key if the correct key is used.
     * 
     * @param keyNum an integer for the key
     * @return locked boolean
     */
    public boolean lock(int keyNum) {
        if (this.key == keyNum) {
            locked = true;
            return locked;
        }
        locked = false;
        return locked;
    }

    /**
     * Unlocks the key if the correct key is used.
     * 
     * @param keyNum an integer for the key
     * @return locked boolean
     */
    public boolean unlock(int keyNum) {
        if (this.key != keyNum) {
            locked = true;
            return locked;
        }
        locked = false;
        return locked;
    }

    /**
     * Checks to see if locked or not.
     * 
     * @return locked boolean
     */
    public boolean locked() {
        return locked;
    }
}
