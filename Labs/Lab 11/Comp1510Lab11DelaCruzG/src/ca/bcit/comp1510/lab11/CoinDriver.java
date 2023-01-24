package ca.bcit.comp1510.lab11;

/**
 * Driver class for Coin.java to demonstrate how a locked Coin cannot be used..
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class CoinDriver {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        
        final int key1 = 152;
        final int key2 = 132;

        Coin coin = new Coin();

        coin.flip();

        System.out.println("Flipped the coin like usual -> " + coin);

        System.out.println("\nNow locking the coin with key 152.");

        coin.setKey(key1);
        coin.lock(key1);

        System.out.println("Is the coin locked? -> " + coin.locked());

        System.out.println("\nNow unlocking the coin with key 134.");

        coin.unlock(key2);

        System.out.println("Is the coin locked? -> " + coin.locked());

        System.out.println("\nNow unlocking the coin with key 152.");

        coin.unlock(key1);

        System.out.println("Is the coin locked? -> " + coin.locked());
    }

}
