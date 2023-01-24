package q3;

import java.util.Scanner;

/**
 * A Java program to test MIXChar.java and Message.java. This is essentially a
 * base conversion calculator, converting an 11 digit number to binary (value
 * between 0 and 55).
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class TestMIXChar {

    /**
     * This is the main method that reads a line from the input and prints an
     * error message if any characters are invalid MIX characters.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a message only using MIX characters: ");

        String input = scan.nextLine();

        Message message = new Message(input);

        System.out.println("Encoded: " + message.toLong());
        System.out.println("Decoded: " + message.toString());

        scan.close();
    }
}
