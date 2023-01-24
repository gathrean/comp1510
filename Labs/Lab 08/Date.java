package ca.bcit.comp1510.lab08;

import java.util.Scanner;

/**
 * Represent a valid Gregorian date on or after 24 February 1582.
 * 
 * @author blink
 * @version 1.0
 */
public class Date {

    /**
     * Three.
     */
    private static final int THREE = 3;

    /**
     * Four.
     */
    private static final int FOUR = 4;

    /**
     * Five.
     */
    private static final int FIVE = 5;

    /**
     * Six.
     */
    private static final int SIX = 6;

    /**
     * Seven.
     */
    private static final int SEVEN = 7;

    /**
     * Eight.
     */
    private static final int EIGHT = 8;

    /**
     * Nine.
     */
    private static final int NINE = 9;

    /**
     * Ten.
     */
    private static final int TEN = 10;

    /**
     * Eleven.
     */
    private static final int ELEVEN = 11;

    /**
     * Twelve.
     */
    private static final int TWELVE = 12;

    /**
     * Twenty four.
     */
    private static final int TWENTYFOUR = 24;

    /**
     * Twenty eight.
     */
    private static final int TWENTYEIGHT = 28;

    /**
     * Twenty nine.
     */
    private static final int TWENTYNINE = 29;

    /**
     * Thirty.
     */
    private static final int THIRTY = 30;

    /**
     * Thirty one.
     */
    private static final int THIRTYONE = 31;

    /**
     * Hundred.
     */
    private static final int HUNDRED = 100;

    /**
     * Four Hundred.
     */
    private static final int FOURHUNDO = 400;

    /**
     * For the year 1582.
     */
    private static final int START = 1582;

    /**
     * For the year 2999.
     */
    private static final int END = 2999;

    /** day of month. 1 .. max days in month */
    private int day;

    /** month of year. 1 .. 12 */
    private int month;

    /** year in Gregorian calendar. 1001 .. 2999 */
    private int year;

    /**
     * Uses day, month, and year.
     * 
     * @param theDay   value
     * @param theMonth value
     * @param theYear  value
     */
    public Date(int theDay, int theMonth, int theYear) {
        // fill this code in and only store a valid date.
        try {
            if (isDayValid(theMonth, theDay, theYear)) {
                day = theDay;
            } else {
                throw new IllegalArgumentException("The day is not valid.");
            }
            if (isMonthValid(theMonth)) {
                month = theMonth;
            } else {
                throw new IllegalArgumentException("The month is not valid.");
            }
            if (isYearValid(theYear)) {
                year = theYear;
            } else {
                throw new IllegalArgumentException("The year is not valid.");
            }
            System.out.println("Q7. Date: " + day + " " + month + " " + year); 
            
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }

        // throw exception if parameters are not a valid date
    }

    /**
     * Checks if Day is valid.
     * 
     * @param m value
     * @param d value
     * @param y value
     * @return boolean
     */
    public static boolean isDayValid(int m, int d, int y) {
        if ((m == 1 || m == THREE || m == FIVE 
                || m == SEVEN || m == EIGHT || m == TEN
                || m == TWELVE) 
                && d <= THIRTYONE) {
            return true;
        }
        if (m == FOUR || m == SIX || m == NINE || m == ELEVEN 
                && d <= THIRTY) {
            return true;
        }
        if (m == 2) {
            if (y % FOUR == 0 || y % FOURHUNDO == 0) {
                if (y % HUNDRED != 0) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    /**
     * Checks if Month is valid.
     * 
     * @param m value
     * @return boolean
     */
    public static boolean isMonthValid(int m) {
        return m >= 1 && m <= TWELVE;
    }

    /**
     * Checks if Year is valid.
     * 
     * @param year value
     * @return boolean
     */
    public static boolean isYearValid(int year) {
        return year >= START && year <= END;
    }

    /**
     * Checks if Year is a Leap Year.
     * 
     * @param year value
     * @return boolean
     */
    public static boolean isLeapYear(int year) {
        if (year % FOUR == 0) {
            if (year % HUNDRED == 0) {
                if (year % FOURHUNDO == 0) {
                    return true;
                }
                return false;
            }
            return true;
        }
        return false;
    }

    /**
     * Counts how many days in a month.
     * 
     * @param month      value
     * @param isLeapYear value
     * @return int
     */
    public static int daysInMonth(int month, boolean isLeapYear) {

        switch (month) {
            case 1:
                return THIRTYONE;
            case 2:
                if (isLeapYear) {
                    return TWENTYNINE;
                } else {
                    return TWENTYEIGHT;
                }
            case THREE:
                return THIRTYONE;
            case FOUR:
                return THIRTY;
            case FIVE:
                return THIRTYONE;
            case SIX:
                return THIRTY;
            case SEVEN:
                return THIRTYONE;
            case EIGHT:
                return THIRTYONE;
            case NINE:
                return THIRTY;
            case TEN:
                return THIRTYONE;
            case ELEVEN:
                return THIRTY;
            case TWELVE:
                return THIRTYONE;
            default:
                return 0;
        }
    }

    /**
     * Checks if the date is valid.
     * 
     * @param day   value
     * @param month value
     * @param year  value
     * @return boolean
     */
    public static boolean isDateValid(int day, int month, int year) {
        if (isYearValid(year) && isMonthValid(month) 
                && isDayValid(month, day, year)) {
            
            if (year == START && month <= 2 && day < TWENTYFOUR) {
                return false;
            } 
            return true;
        }
        return false;

    }

    /**
     * Main.
     * 
     * @param args unused
     */
    public static void main(String[] args) {
        // date read in from user
        int month;
        int day;
        int year;

        // true if parts of input from user is valid
        boolean monthValid;
        boolean yearValid;
        boolean dayValid;

        // number of days in month read in
        int daysInMonth;

        // true if user's year is a leap year
        boolean leapYear;

        Scanner scan = new Scanner(System.in);

        // Get integer month, day, and year from user
        System.out.print("Enter a month (integer)\n> ");
        month = scan.nextInt();

        System.out.print("Enter a day (integer)\n> ");
        day = scan.nextInt();

        System.out.print("Enter a year (integer)\n> ");
        year = scan.nextInt();

        // Use the methods to check to see if month is valid
        monthValid = isMonthValid(month);

        // Use the methods to check to see if year is valid
        yearValid = isYearValid(year);

        // Use the methods to determine whether it's a leap year
        leapYear = isLeapYear(year);

        // Use the methods to determine number of days in month
        daysInMonth = daysInMonth(month, leapYear);

        // Use the methods to see if day is valid
        dayValid = isDayValid(month, day, year);

        // and print appropriate message
        System.out.println("Q2. The month is valid. " + monthValid);
        System.out.println("Q3. The year is valid. " + yearValid);
        System.out.println("Q4. The year is a leap year. " + leapYear);
        System.out.println("Q4. How may days in the month entered? " 
                + daysInMonth);
        System.out.println("Q5. The day is valid for given month and year. " 
                    + dayValid);
        
        // Use the methods to determine whether date is valid
        boolean dateValid = isDateValid(day, month, year);
        
        // Create a Date object with month, day, year
        Date date = new Date(day, month, year);
        scan.close();
    }
}
