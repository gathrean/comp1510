package q4;

import java.util.Scanner;

/**
 * A Java program that encodes a 5 MIX-character string into a single int
 * variable and decode it back into MIX-characters.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */

public class Pack {

    /**
     * This is the entry point that gets called to run the program.
     *
     * @param args unused.
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final int base = 56;

        // Step 1. Prompt for and read that input string into a variable.
        System.out.print("Enter a 5 MIX-character string: -> ");
        String input = scan.next();

        // Step 2. Extracting the n^th character from the string.
        char c4 = input.charAt(0);
        char c3 = input.charAt(1);
        char c2 = input.charAt(2);
        char c1 = input.charAt(1 + 2);
        char c0 = input.charAt(2 + 2);

        // Step 3. Converting each character into its numeric value.
        int value4 = (char) (c4 - ('A') + 1);
        int value3 = (char) (c3 - ('A') + 1);
        int value2 = (char) (c2 - ('A') + 1);
        int value1 = (char) (c1 - ('A') + 1);
        int value0 = (char) (c0 - ('A') + 1);

        // Step 4.
        final int four = 4;
        final int three = 3;
        int multiplied = (int) ((value4 * Math.pow(base, four)) 
                + (value3 * Math.pow(base, three))
                + (value2 * Math.pow(base, 2)) 
                + (value1 * Math.pow(base, 1)) 
                + (value0 * Math.pow(base, 0)));

        // Step 5. Print the encoded integer.
        System.out.println("\nEncoded: " + multiplied);

        // Step 6. Decode the value by using remainder to extract the least
        // significant digit and integer division to move all remaining
        // digits down one place.
        int place0 = multiplied % base;

        int result1 = multiplied / base;
        int place1 = result1 % base;

        int result2 = result1 / base;
        int place2 = result2 % base;

        int result3 = result2 / base;
        int place3 = result3 % base;

        int result4 = result3 / base;
        int place4 = result4 % base;

        // Step 7.
        char d4 = (char) (place4 - 1 + 'A');
        char d3 = (char) (place3 - 1 + 'A');
        char d2 = (char) (place2 - 1 + 'A');
        char d1 = (char) (place1 - 1 + 'A');
        char d0 = (char) (place0 - 1 + 'A');

        // Test printing
        System.out.println("Decoded: " + (d4) + (d3) + (d2) + (d1) + (d0));

        scan.close();
    }

}
