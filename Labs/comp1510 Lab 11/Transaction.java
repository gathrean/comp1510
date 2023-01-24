package ca.bcit.comp1510.lab11;

/**
 * A Transaction class that stores an array of Item (cart), total price, and
 * item count.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Transaction {

    /** Magic number for 3. */
    private static final int THREE = 3;

    /** An array of Item elements. */
    private Item[] cart;

    /** A double representing the total price of the Items in the array. */
    private double totalPrice;

    /** An integer that represents the number of Item objects in the array. */
    private int itemCount;

    /**
     * First constructor for Transaction to symbolize an empty cart.
     * 
     * @param cartSize an integer for the size of the cart Item array.
     */
    public Transaction(int cartSize) {
        this.cart = new Item[cartSize];
        this.totalPrice = 0.0;
        this.itemCount = 0;
    }

    /**
     * Adds the item to the cart Item array.
     * 
     * @param itemName     aString representation of item name
     * @param itemPrice    a double representation of item price
     * @param itemQuantity an integer representation of item quantity
     */
    public void addToCart(String itemName, double itemPrice, int itemQuantity) {

        Item item = new Item(itemName, itemPrice, itemQuantity);
        if (itemCount == cart.length) {
            increaseSize();
        }

        cart[itemCount] = item;
        totalPrice += item.getPrice() * item.getQuantity();
        itemCount++;
    }

    /**
     * Overloaded constructor. Adds the item to the cart Item array.
     * 
     * @param item Item
     */
    public void addToCart(Item item) {

        if (itemCount == cart.length) {
            increaseSize();
        }

        cart[itemCount] = item;
        totalPrice += item.getPrice() * item.getQuantity();
        itemCount++;
    }

    /**
     * Increase the size of the cart.
     */
    public void increaseSize() {
        // Makes sure the new local array can carry THREE more items.
        Item[] item = new Item[cart.length + THREE];

        for (int j = 0; j < cart.length; j++) {
            item[j] = cart[j];
        }

        cart = item;
    }

    /**
     * Gets the total price.
     * 
     * @return totalPrice
     */
    public double getTotalPrice() {
        return totalPrice;
    }

    /**
     * Gets the total number of all the Items in the cart (not to be confused
     * with itemCount).
     * 
     * @return total a double represenation of the size of the cart
     */
    public double getCount() {
        double total = 0;

        total = this.cart.length;

        return total;
    }

    /**
     * toString method for the Transaction class.
     * 
     * @return result and totalPrice
     */
    public String toString() {
        String tPrice = "\nTotal price of your transaction: $"
                + getTotalPrice();
        String result = "";

        for (Item item : cart) {
            if (item != null) {
                result += "\nItem: " + item.getName();
                result += "\nPrice: $" + item.getPrice();
                result += "\nQuantity: " + item.getQuantity();
            }
        }
        return result + tPrice;
    }

}
