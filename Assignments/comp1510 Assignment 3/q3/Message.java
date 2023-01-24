package q3;

/**
 * A class that contains a long[] and a count of how many characters are in the
 * message object. The message represents a packed string of MIXChar's.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Message {

    /** How many characters are in the table. */
    private static final int FIFTYSIX = 56;

    /** 11 MIXChar characters per long in the instance array. */
    private static final int ELEVEN = 11;

    /** an Array of long called message. */
    private long[] message;

    /** Count. */
    private int count;

    /**
     * "Step 1. Values of the m should be packed 11 MIXChar characters per long
     * in the instance array, with the last long element having perhaps fewer
     * than 11 characters packed into it. The instance array should be sized as
     * small as possible and the count instance variable holds total number of
     * characters."
     * 
     * @param m MIXChar[] character
     */
    public Message(MIXChar[] m) {
        count = message.length;
        makeLong(m);
    }

    /**
     * "Step 2. Values of the s packed 11 MIXChar characters per long in the
     * instance array, with the last long element having perhaps fewer than 11
     * characters packed into it. The instance array should be sized as small as
     * possible and the count instance variable holds total number of
     * characters.
     * 
     * @param s String
     */
    public Message(String s) {
        count = s.length();
        MIXChar[] mixArray = MIXChar.toMIXChar(s);
        makeLong(mixArray);
    }

    /**
     * Makes a Long MIXChar[] Object.
     * 
     * @param m MIXChar[] object
     * @return message long[]
     */
    public long[] makeLong(MIXChar[] m) {

        /* Size is the smallest double value that is <= the argument. */
        int size = (int) Math.ceil(m.length / (double) ELEVEN);

        /* message is instantiated as big as int size. */
        message = new long[size];

        /* Iteration for loop going through all of the Array. */
        for (int i = 0; i < size; i++) {
            long packedMIX = 0;

            /* Goes through 0 to 10 */
            for (int x = 0; x < ELEVEN; x++) {

                /*
                 * The last long element having perhaps fewer than 11 characters
                 * packed into it.
                 */
                if (x + ELEVEN * i == count) {
                    message[i] = packedMIX;
                    return message;
                }

                /*
                 * The instance array should be sized as small as possible and
                 * the count instance variable holds total number of characters.
                 */
                packedMIX += m[(int) (x + ELEVEN * i)].ordinal()
                        * (long) Math.pow(FIFTYSIX, ELEVEN - x - 1);
            }
            message[i] = packedMIX;
        }
        return message;
    }

    /**
     * Returns a String corresponding to the characters in the message.
     * 
     * @return a String corresponding to the characters in the message.
     */
    public String toString() {
        String toString = "";

        for (int i = 0; i < message.length; i++) {
            long elevenMIXChar = message[i];

            for (int j = 0; j < ELEVEN; j++) {
                if (j + i * ELEVEN == count) {
                    return toString;
                }

                int ordinal = (int) Long.divideUnsigned(elevenMIXChar,
                        (long) Math.pow(FIFTYSIX, ELEVEN - j - 1));

                elevenMIXChar = Long.remainderUnsigned(elevenMIXChar,
                        (long) Math.pow(FIFTYSIX, ELEVEN - j - 1));

                char mixChar = MIXChar.atOrdinal(ordinal);

                toString += mixChar;
            }
        }

        return toString;
    }

    /**
     * Returns a String which is the instance of long[] formatted as unsigned
     * integers and separated by spaces.
     * 
     * @return a String which is the instance of long[] formatted as unsigned
     *         integers and separated by spaces.
     */
    public String toLong() {
        String toString = "";

        for (int i = 0; i < message.length; i++) {
            toString += (message[i] + " ");
        }
        return toString;

    }

}
