package ca.bcit.comp1510.lab08;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class DateTest {

    /**
     * Create new Date objects to test.
     * @throws Exception
     */
   
    
    @Test
    public void testIsDayValid1() throws Exception {
        assertEquals(true, Date.isDayValid(1, 20, 2000));
        assertEquals(true, Date.isDayValid(3, 31, 2000));
        assertEquals(true, Date.isDayValid(5, 31, 2000));
        assertEquals(true, Date.isDayValid(7, 31, 2000));
        assertEquals(true, Date.isDayValid(8, 31, 2000));
        assertEquals(true, Date.isDayValid(10, 31, 2000));
        assertEquals(true, Date.isDayValid(12, 31, 2000));
        assertEquals(true, Date.isDayValid(12, 30, 2000));
    }
    
    @Test
    public void testIsDayValid2() throws Exception {
        assertEquals(true, Date.isDayValid(4, 20, 2000));
        assertEquals(true, Date.isDayValid(6, 30, 2000));
        assertEquals(true, Date.isDayValid(9, 30, 2000));
        assertEquals(true, Date.isDayValid(11, 30, 2000));
    }
    
    @Test
    public void testIsDayValid3() throws Exception {
        assertEquals(false, Date.isDayValid(2, 20, 2000));
        assertEquals(false, Date.isDayValid(2, 20, 1600));
        assertEquals(false, Date.isDayValid(2, 20, 1594));
        assertEquals(true, Date.isDayValid(2, 20, 1592));
        assertEquals(false, Date.isDayValid(0, 20, 1592));
    }
    
    @Test
    public void testIsMonthValid() throws Exception {
        assertEquals(true, Date.isMonthValid(1));
        assertEquals(true, Date.isMonthValid(2));
        assertEquals(true, Date.isMonthValid(3));
        assertEquals(true, Date.isMonthValid(4));
        assertEquals(true, Date.isMonthValid(5));
        assertEquals(true, Date.isMonthValid(6));
        assertEquals(true, Date.isMonthValid(7));
        assertEquals(true, Date.isMonthValid(8));
        assertEquals(true, Date.isMonthValid(9));
        assertEquals(true, Date.isMonthValid(10));
        assertEquals(true, Date.isMonthValid(11));
        assertEquals(true, Date.isMonthValid(12));
        assertEquals(false, Date.isMonthValid(13));
    }
    
    @Test
    public void testIsMonthValid1() throws Exception {
        assertEquals(false, Date.isMonthValid(14));
        assertEquals(false, Date.isMonthValid(0));
        assertEquals(false, Date.isMonthValid(-1));
    }
    @Test
    public void testIsYearValid() throws Exception {
        assertEquals(false, Date.isYearValid(1581));
        assertEquals(true, Date.isYearValid(1583));
        assertEquals(true, Date.isYearValid(1600));
        assertEquals(true, Date.isYearValid(1852));
        assertEquals(false, Date.isYearValid(1000));
        assertEquals(false, Date.isYearValid(1));
        assertEquals(true, Date.isYearValid(2000));
        assertEquals(true, Date.isYearValid(2020));
    }
    
    @Test
    public void testIsYearValid1() throws Exception {
        assertEquals(true, Date.isYearValid(2000));
        assertEquals(false, Date.isYearValid(3000));
        assertEquals(true, Date.isYearValid(2998));
    }
    
    @Test
    public void testIsLeapYear() throws Exception {
        assertEquals(true, Date.isLeapYear(1600));
        assertEquals(true, Date.isLeapYear(1592));
        assertEquals(false, Date.isLeapYear(1700));
        assertEquals(false, Date.isLeapYear(1594));
    }
    
    @Test
    public void testIsDateValid1() throws Exception {
        assertEquals(true, Date.isDateValid(1, 3, 2002));
        assertEquals(true, Date.isDateValid(1, 3, 1582));
        assertEquals(true, Date.isDateValid(31, 12, 1582));
        assertEquals(false, Date.isDateValid(1, 2, 1582));
        assertEquals(false, Date.isDateValid(1, 2, 1581));
    }
    
    @Test
    public void testIsDateValid2(){
        assertEquals(true, Date.isDateValid(20, 11, 2000));
        assertEquals(true, Date.isDateValid(20, 11, 1582));
        assertEquals(false, Date.isDateValid(1, 11, 500));
        assertEquals(true, Date.isDateValid(3, 11, 1582));
        assertEquals(false, Date.isDateValid(24, 2, 1582));
        assertEquals(false, Date.isDateValid(24, 2, 1581));
        assertEquals(false, Date.isDateValid(1, 2, 1582));
        assertEquals(true, Date.isDateValid(31, 12, 1582));
    }
    
    @Test
    public void testIsDateValid3() throws Exception {               
        assertEquals(true, Date.isDateValid(20, 11, 2000));
        assertEquals(false, Date.isDateValid(11, 20, 1582));
        assertEquals(false, Date.isDateValid(1, 1, 1581));
        assertEquals(false, Date.isDateValid(2, 20, 1581));
        assertEquals(false, Date.isDateValid(2, 24, 1582));
        assertEquals(false, Date.isDateValid(1, 5, 1580));
        assertEquals(false, Date.isDateValid(23, 2, 1582));
    }
    
    @Test
    public void testDaysInMonth() throws Exception {
        assertEquals(31, Date.daysInMonth(1, false));
        assertEquals(29, Date.daysInMonth(2, true));
        assertEquals(28, Date.daysInMonth(2, false));
        assertEquals(31, Date.daysInMonth(3, false));
        assertEquals(30, Date.daysInMonth(4, false));
        assertEquals(31, Date.daysInMonth(5, false));
        assertEquals(30, Date.daysInMonth(6, false));
        assertEquals(31, Date.daysInMonth(7, false));
        assertEquals(31, Date.daysInMonth(8, false));
        assertEquals(30, Date.daysInMonth(9, false));
        assertEquals(31, Date.daysInMonth(10, false));
        assertEquals(30, Date.daysInMonth(11, false));
        assertEquals(31, Date.daysInMonth(12, false));
        assertEquals(0, Date.daysInMonth(13, false));
        assertEquals(0, Date.daysInMonth(14, false));
    }
}
