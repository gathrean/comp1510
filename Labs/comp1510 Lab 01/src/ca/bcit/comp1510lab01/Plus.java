package ca.bcit.comp1510lab01;

/***
 * Demonstrates the different behaviours of the + operator
 * @author ean
 * @version 2022
 * 
 */

public class Plus {
    
    /**
     * Drives the program.
     * @param args unused
     */
    public static void main(String[] args) {
        System.out.println("This is a long string that is the" +
                " concatenation of two shorter strings.");
        System.out.println("The first computer was invented about " + 70 +
        " years ago");
        System.out.println ("8 plus 5 is " + 8 + 5);
        System.out.println ("8 plus 5 is " + (8 + 5));
        System.out.println (8 + 5 + " equals 8 plus 5.");
    }
    
    /**
     * The reason why the first equation resulted in 85 is that 
     * the 8 and 5 numbers in the printout were not declared as integers
     * But instead they were strings.
     */

}
