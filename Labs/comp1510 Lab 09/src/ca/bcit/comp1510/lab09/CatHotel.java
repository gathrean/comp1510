package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * A Java program for managing cats in a Cat Hotel.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class CatHotel {

    /** The name of the Cat Hotel. */
    final String hotelName;

    /** The ArrayList for the hotel's guests. */
    private ArrayList<Cat> guests = new ArrayList<Cat>();

    /**
     * The constructor for CatHotel.
     * 
     * @param hotelName String
     */
    public CatHotel(String hotelName) {
        this.hotelName = hotelName;
    }

    /**
     * Adds the Cat to the ArrayList of guests.
     * 
     * @param cat Cat
     */
    public void addCat(Cat cat) {
        guests.add(cat);
    }

    /** Clears the Cat Hotel. */
    public void removeAllGuests() {
        guests.clear();
    }

    /**
     * Counts how much cats are in the Cat Hotel.
     * 
     * @return size of Cat Hotel
     */
    public int guestCount() {
        return guests.size();
    }

    /**
     * Removes the old guests from the Cat Hotel.
     * 
     * @param ageLimit the max age a cat can be
     * @return how many cats are kicked out because of old age
     */
    public int removeOldGuests(int ageLimit) {
        int count = 0;
        Iterator<Cat> catIterator = guests.iterator();
        while (catIterator.hasNext()) {
            Cat temp = catIterator.next();
            if (temp.getAge() > ageLimit) {
                count++;
                catIterator.remove();
            }
        }
        return count;

    }

    /**
     * Prints the Hotel's guest list.
     */
    public void printGuestList() {
        System.out.println("Welcome to " + hotelName);

        for (Cat temp : guests) {

            System.out.print(temp.toString());

        }
    }

}
