package ca.bcit.comp1510.lab05;

/**
 * A Java program to practice implementing methods with our version of a Math
 * class with the help from some unit tests.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Mathematics {

    public static final double PI = 3.14159265359;

    /**
     * Returns the area of the circle with the specified radius.
     * 
     * @param radius of the circle
     * @return area as a double
     */
    public double getCircleArea(double radius) {
        if (radius >= 0) {
            return radius * radius * PI;
        } else {
            return Double.NaN;
        }

    }

    /**
     * Returns the sum of the positive integers between 0 and the specified number
     * inclusive. If the specified number is negative, returns zero.
     * 
     * @param number upper bound
     * @return sum as an integer
     */
    public int sumOfInts(int number) {
        
        int i = 0;
        int total = 0;
        if (number > 0) {
            while (i <= number) {
                total += i;
                i++;
            }
            return total;
        } else {
            return 0;
        }
    }

    /**
     * Returns true if the specified value is positive, else false
     * 
     * @param number to test
     * @return true if number is positive, else false.
     */
    public boolean isPositive(int number) {

        return number > 0;
    }

    /**
     * Returns true if the specified value is even, else false.
     * 
     * @param number to test
     * @return true if number is even, else false
     */
    public boolean isEven(int number) {

        return number % 2 == 0;
    }

    /**
     * Returns sum of the even numbers between 0 and the specified value, inclusive.
     * The value can be positive, negative, or zero.
     * 
     * @param number upper bound
     * @return sum of the even numbers between 0 and number
     */
    public int sumOfEvens(int number) {
        
        int i = 0;
        int total = 0;
        if (number > 0) {
            while (i <= number) {
                total += i;
                i = i + 2;
            }
        } else {
            while (i >= number) {
                total += i;
                i = i - 2;
            }
        }

        return total;
    }

}
