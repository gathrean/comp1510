package ca.bcit.comp1510.lab11;

/**
 * An interface that locks the implementing object if a correct key is provided,
 * and can only be unlocked using that same correct key.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public interface Lockable {

    /**
     * Establishes the key used to unlock.
     * 
     * @param key an integer
     */
    void setKey(int key);

    /**
     * Locks the implementing object if the correct key is provided.
     * 
     * @param key an integer
     * @return true if the object was locked
     */
    boolean lock(int key);

    /**
     * Unlocks the implementing object if the correct key is provided.
     * 
     * @param key an integer
     * @return true if the object was unlocked.
     */
    boolean unlock(int key);

    /**
     * Returns true if the object was unlocked.
     * 
     * @return true if the object was unlocked
     */
    boolean locked();
}
