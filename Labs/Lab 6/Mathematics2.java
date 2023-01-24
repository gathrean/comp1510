package ca.bcit.comp1510.lab06;

import java.util.Random;

/**
 * A Java program to practice implementing methods with our version of a Math
 * class with the help from some unit tests.
 * 
 * @author Gathrean Dela Cruz
 * @version 1.0
 *
 */
public class Mathematics2 {

    public static final double FOOT_TO_KILOMETRE_RATIO = 0.0003048;

    /**
     * Returns the area of the square with the specified edge length.
     * 
     * @param edgeLength of the square.
     * @return area as a double
     */
    public double getSquareArea(double edgeLength) {
        if (edgeLength >= 0) {
            return edgeLength * edgeLength;
        } else {
            return Double.NaN;
        }
    }

    /**
     * Returns the sum of the specified values.
     * 
     * @param first  operand (addend1)
     * @param second operand (addend2)
     * @return sum of the operands
     */
    public double add(double addend1, double addend2) {

        return addend1 + addend2;
    }

    /**
     * Returns the product of the specified values.
     * 
     * @param first  operand (multiplicand)
     * @param second operand (multiplier)
     * @return product of the operands
     */
    public double multiply(double multiplicand, double multiplier) {

        return multiplicand * multiplier;
    }

    /**
     * Returns the difference of the specified values.
     * 
     * @param first  operand (minuend)
     * @param second operand (subtrahend)
     * @return difference of the operands
     */
    public double subtract(double minuend, double subtrahend) {

        return minuend - subtrahend;
    }

    /**
     * Returns the quotient of the specified values. If the divisor is zero, returns
     * the zero instead of NaN or infinity.
     * 
     * @param first  operand (dividend)
     * @param second operand (divisor)
     * @return quotient of the operands
     */
    public double divide(double dividend, double divisor) {
        if (divisor == 0) {
            return 0;
        } else {
            return dividend / divisor;
        }

    }

    /**
     * Returns the absolute value of the specified integer
     * 
     * @param number to test
     * @return absolute value of number
     */
    public int absoluteValue(int number) {

        if (number < 0) {
            return number * -1;
        }
        if (number == 0) {
            return 0;
        } else {
            return number;
        }

    }

    /**
     * Converts the specified number of feet to kilometers.
     * 
     * @param feet to convert
     * @return kilometers in the specified number of feet
     */
    public double convertFeetToKilometres(double ft) {

        double km = ft * FOOT_TO_KILOMETRE_RATIO;

        return km;
    }

    /**
     * Returns the sum of the numbers between zero and the first parameter that are
     * divisible by the second number
     * 
     * For example:
     * 
     * sumOfProducts(10, 3) will return 3 + 6 + 9 = 18.
     * 
     *
     * sumOfProducts(10, 2) will return 2 + 4 + 6 + 8 + 10 = 30.
     * 
     * 
     * sumofProducts(-10, 2) will return -2 + -4 + -6 +-8 + -10 = -30.
     * 
     * @param bound   the upper bound
     * @param divisor the divisor
     * @return sum
     */
    public int sumOfProducts(int bound, int divisor) {

        int i = 0;
        int total = 0;

        if (bound > 0) {
            while (i <= bound) {
                total += i;
                i += divisor;
            }
        } if (bound < 0) {
            while (i >= bound) {
                total += i;
                i -= divisor;
            }
        }
        return total;
    }

    /**
     * Returns a random number between 10 and 20 inclusive, but NOT 15.
     * 
     * @return random number in range [10, 20] excluding 15.
     */
    public int getRandomNumberBetweenTenAndTwentyButNotFifteen() {
        Random random = new Random();

        int number = 15;

        while (number == 15) {

            number = random.nextInt(11) + 10;

        }

        return number;

    }

}
