package q3;

/**
 * A class about MIXChar.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class MIXChar {

    /** Unicode for Delta. */
    private static final char DELTA = '\u0394';

    /** Unicode for Sigma. */
    private static final char SIGMA = '\u03A3';

    /** Unicode for PI. */
    private static final char PI = '\u03A0';

    /** The char list of MIX characters. */
    private static final char[] CHARLIST = {' ', 'A', 'B', 'C', 'D', 'E', 'F',
        'G', 'H', 'I', DELTA, 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R',
        SIGMA, PI, 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', '0', '1', '2', '3',
        '4', '5', '6', '7', '8', '9', '.', ',', '(', ')', '+', '-', '*', '/',
        '=', '$', '<', '>', '@', ';', ':', '\''};

    /** Holds the value of the MIX character. */
    private int value;

    /**
     * Step 2. Constructor converts c to the corresponding MIXChar, with
     * exception thrown if conversion not possible..
     * 
     * @param c Char
     */
    public MIXChar(char c) {

        if (isMIXChar(c)) {

            for (int i = 0; i < CHARLIST.length; i++) {
                if (c == CHARLIST[i]) {
                    value = i;
                    break;
                }
            }
            return;

        } else {
            throw new IllegalArgumentException(
                    "Conversion not possible because "
                            + "that is not a valid MIXChar.");
        }
    }

    /**
     * Step 2. Constructor makes value entered to be equals value.
     * 
     * @param value int
     */
    public MIXChar(int value) {
        this.value = value;
    }

    /**
     * Step 1. Returns true if c corresponds to MIXChar character, false
     * otherwise.
     * 
     * @param c char
     * @return true if c corresponds to MIXChar character
     */
    static boolean isMIXChar(char c) {
        boolean result = false;

        // This for loop iterates through the CHARLIST Array.
        for (char temp : CHARLIST) {
            if (c == temp) {
                result = true;
                break;
            }
        }
        return result;
    }

    /**
     * Step 6 needed for Step 3. Return the numerical value of MIX character.
     * 
     * @return int the value
     */
    public int ordinal() {
        return value;
    }

    /**
     * Step 3. converts x MIXChar character to corresponding Java char.
     * 
     * @param x MIXChar character
     * @return The position at Array based on the numerical value of x MIXChar
     */
    static char toChar(MIXChar x) {
        return CHARLIST[x.ordinal()];
    }

    static MIXChar toMIXChar(char c) {
        int i = 0;

        while (i < CHARLIST.length) {
            if (CHARLIST[i] == c) {
                return new MIXChar(i);
            }
            i++;
        }
        throw new IllegalArgumentException("Unable to convert.");

    }

    /**
     * Step 5. Returns array of MIXChar characters corresponding to the chars in
     * s. Throws exception if any if the string's characters do not correspond
     * to MIXChar characters.
     * 
     * @param s String
     * @return array MIXChar character
     */
    static MIXChar[] toMIXChar(String s) {

        MIXChar[] array = new MIXChar[s.length()];

        for (int i = 0; i < s.length(); i++) {

            if (isMIXChar(s.charAt(i))) {

                array[i] = MIXChar.toMIXChar(s.charAt(i));

            } else {
                throw new IllegalArgumentException("No MIX character entered.");
            }

        }
        return array;
    }

    /**
     * Step 7. Returns String containing this MIXChar as a Java char.
     * 
     * @param array MIXChar array
     * @return result String
     */
    static String toString(MIXChar[] array) {
        String result = "";

        for (MIXChar temp : array) {
            result += toChar(temp);
        }
        return result;
    }

    /**
     * Returns CHARLIST character at ordinal position.
     * @param ordinal int
     * @return CHARLIST
     */
    public static char atOrdinal(int ordinal) {
        return CHARLIST[ordinal];
    }

}
