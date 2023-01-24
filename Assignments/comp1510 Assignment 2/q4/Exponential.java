package q4;

/**
 * A Java program that shows the definition of the exponential function. The
 * main method evaluates and prints a table of 21 exponentials for x = -10.0 ...
 * 10.0 with one value per row, showing x and e^x.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Exponential {

    /**
     * Ten magic number.
     */
    private static final int NEGATIVETEN = -10;

    /**
     * Twenty one magic number.
     */
    private static final int TWENTYONE = 21;

    /**
     * Static method for the Exponential class.
     * 
     * @param x double
     * @return sum of numbers
     */
    public static double exp(double x) {

        double sum = 1;
        double xk = 1;
        double k = 0;
        
        while (k < Integer.MAX_VALUE) {
            xk = xk * (x / (k + 1));
            sum += xk;
            k++;
        }

        return sum;
    }

    /**
     * Drives the program.
     * 
     * Prints a table of 21 exponentials.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {

        long x = NEGATIVETEN;

        /* Header for the table. */
        System.out.println("x\t| e^x");
        System.out.println("----------------------------------");

        /* Prints out 21 rows. -10 to +10. */
        for (long i = 0; i < TWENTYONE; i++) {
            System.out.println(x + "\t| " + exp(x));
            x++;
        }

    }
}
