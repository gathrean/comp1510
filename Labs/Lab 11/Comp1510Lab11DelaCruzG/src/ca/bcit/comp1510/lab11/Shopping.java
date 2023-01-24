package ca.bcit.comp1510.lab11;

import java.util.Scanner;

/**
 * A Java program to test the classes Item.java and Transaction.java.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Shopping {

    /**
     * Drives the program.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Cart size of 100.

        Transaction transaction = new Transaction(1);

        boolean continueShopping = true;

        // Welcomes the user to the grocery.
        System.out.println("Welcome to Food Mart!");

        do {
            System.out.print("Enter item name: ");
            String itemName = scan.next();

            System.out.print("Enter item price: $");
            double itemPrice = scan.nextDouble();

            System.out.print("Enter item quantity: ");
            int itemQuantity = scan.nextInt();

            transaction.addToCart(itemName, itemPrice, itemQuantity);
            System.out.println("\nItem added to cart.");
            System.out.print("Continue shopping? (y/n) ");
            String yesNo = scan.next();
            
            if (yesNo.equals("n")) {
                continueShopping = false;
            }
        } while (continueShopping);

        System.out.println(transaction.toString());
        scan.close();
    }

}
