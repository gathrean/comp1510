package q2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;

/**
 * JUnit 5 Test for Timesheet.java..
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class TimesheetTest {

    Timesheet test1;
    Timesheet test2;

    @Test
    public void testTimesheet() {
        String testEmpNum = null;
        LocalDate testEndWeek = null;
        test1 = new Timesheet();
        test2 = new Timesheet(testEmpNum, testEndWeek);
    }

    @Test
    public void testTimesheet1() {
        Timesheet time = new Timesheet();
    }

    @Test
    public void testGetEmpNum() {
        LocalDate testDate = LocalDate.of(2000, 11, 20);
        Timesheet test1 = new Timesheet("1234", testDate);

        assertEquals("1234", test1.getEmpNum());
    }

    @Test
    public void testSetEmpNum() {
        LocalDate testDate = LocalDate.of(2000, 11, 20);
        Timesheet test1 = new Timesheet("1234", testDate);
        test1.setEmpNum("EMP1");
    }

    @Test
    public void testGetEndWeek() {
        LocalDate testDate = LocalDate.of(2000, 11, 20);
        Timesheet test1 = new Timesheet("1234", testDate);

        assertEquals(testDate, test1.getEndWeek());
    }

    @Test
    public void testSetEndWeek() {
        LocalDate testDate = LocalDate.of(2022, 11, 25);
        LocalDate testDate2 = LocalDate.of(2022, 12, 26);

        Timesheet test1 = new Timesheet("1234", testDate);
        Timesheet test2 = new Timesheet("4567", testDate2);

        assertThrows(IllegalArgumentException.class,
                () -> test1.setEndWeek(testDate), "End week is not a Friday.");
        assertEquals(testDate2, test2.getEndWeek());
    }

    @Test
    public void testAddRow() {
        LocalDate testDate = LocalDate.of(2000, 11, 20);
        Timesheet test1 = new Timesheet("EMP1", testDate);

        TimesheetRow row = new TimesheetRow();

        test1.addRow(row);
    }

    @Test
    public void testToString() {
        LocalDate testDate = LocalDate.of(2000, 11, 20);
        Timesheet test1 = new Timesheet("1234", testDate);

        test1.toString();
    }
}
