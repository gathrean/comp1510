package q1;

/**
 * Represents a street address.
 * 
 * @author Gathrean Dela Cruz
 * @author Lewis & Loftus 9e
 * @author BCIT
 * @version 2022
 */
public class Address {

    /** Street address. */
    private String streetAddress;

    /** city. */
    private String city;

    /** State. */
    private String state;

    /** Postal code, any country. */
    private String postalCode;

    /**
     * Constructs an Address object with the specified data.
     *
     * @param street Holds new streetAddress
     * @param town   Holds new city
     * @param st     Holds new state
     * @param code   Holds new postalCode
     */
    public Address(String street, String town, String st, String code) {
        streetAddress = street;
        city = town;
        state = st;
        postalCode = code;
    }

    @Override
    public String toString() {

        String result = streetAddress + " " + city + ", " + state + " "
                + postalCode;

        return result;
    }

}
