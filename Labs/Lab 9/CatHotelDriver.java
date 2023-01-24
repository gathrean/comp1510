package ca.bcit.comp1510.lab09;

import java.util.Random;

/**
 * Driver class for CatHotel.java.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class CatHotelDriver {

    /**
     * Creates a CatHotel object, add 6 cats to the hotel and tests CatHotel.
     * 
     * @param args unused
     */
    public static void main(String[] args) {

        CatHotel myCatHotel = new CatHotel("Purrfect Palace");
        Random random = new Random();

        final int oldCatAge = 20;
        final int guestsAmount = 6;

        for (int i = 1; i <= guestsAmount; i++) {
            Cat newCat = new Cat(random.nextInt(oldCatAge));
            myCatHotel.addCat(newCat);
        }

        System.out.println("Guest list:");
        myCatHotel.printGuestList();

        System.out.println("\nKicking out cats older than 20:");
        final int ageLimit = 5;

        System.out.println("Kicked out " + myCatHotel.removeOldGuests(ageLimit)
                + " cats.");

        myCatHotel.printGuestList();

        System.out.println(
                "\nHow many cats are in the hotel? " + myCatHotel.guestCount());

        System.out.println("\n*Clearing all cats*");
        myCatHotel.removeAllGuests();
        
        System.out.println("");
        myCatHotel.printGuestList();
        System.out.println("\nAdd three more cats");

        final int age1 = 8;
        final int age2 = 9;
        final int age3 = 10;

        Cat cat1 = new Cat("John", age1);
        Cat cat2 = new Cat("Jane", age2);
        Cat cat3 = new Cat("Joe", age3);

        myCatHotel.addCat(cat1);
        myCatHotel.addCat(cat2);
        myCatHotel.addCat(cat3);

        System.out.println("");
        myCatHotel.printGuestList();
    }

}
