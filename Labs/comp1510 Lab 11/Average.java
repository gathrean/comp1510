package ca.bcit.comp1510.lab11;

/**
 * A Java program that just prints the Strings passed to the program via the
 * command line.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Average {

    /**
     * Drives the program.
     * 
     * @param args used by command line
     */
    public static void main(String[] args) {
        int arguments = 0;

        int nonInt = 0;
        double sum = 0.0;

        while (args.length != arguments && args[arguments] != null) {
            System.out.println(args[arguments]);

            try {
                sum += Integer.parseInt(args[arguments]);
            } catch (NumberFormatException e) {
                System.out.println(
                        "Argument" + (arguments + 1) + "is not an integer.");
                nonInt++;
            }
            arguments++;
        }

        if (arguments == 0) {
            System.out.println("No arguments.");
        } else if (arguments - nonInt == 0) {
            System.out.println("No valid arguments.");
        } else {
            System.out.println("Average: " + sum / (arguments - nonInt));
        }

    }

}
