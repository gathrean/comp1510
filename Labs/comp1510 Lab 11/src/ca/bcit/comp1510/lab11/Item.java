package ca.bcit.comp1510.lab11;

/**
 * A Java program that simulates part of a point of sale (cash register) system.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Item {

    /* The instance variables are IMMUTABLE, hence the final keyword. */
    
    /**
     * A String representation of the item name.
     */
    private final String name;

    /**
     * A double representation of the item price.
     */
    private final double price;

    /**
     * An integer representation of the item quantity.
     */
    private final int quantity;

    /**
     * The first constructor for Item class that accepts a parameter for each
     * instance variable.
     * 
     * @param itemName   a String
     * @param itemPrice  a double
     * @param itemQuantity an integer
     */
    public Item(String itemName, double itemPrice, int itemQuantity) {
        this.name = itemName;
        this.price = itemPrice;
        this.quantity = itemQuantity;
    }

    /**
     * The second constructor for Item class that accepts the parameters for
     * item name and price, but sets the amount to 1.
     * 
     * @param itemName  String
     * @param itemPrice double
     */
    public Item(String itemName, double itemPrice) {
        this.name = itemName;
        this.price = itemPrice;
        this.quantity = 1;
    }

    /**
     * Gets the name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the price.
     * 
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * Gets the amount of items.
     * 
     * @return amount
     */
    public int getQuantity() {
        return quantity;
    }
}
