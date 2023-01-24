package q2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * JUnit 5 Test for TimesheetRow.java.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class TimesheetRowTest {

    @Test
    public void testTimesheetRow() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);
    }

    @Test
    public void testTimesheetRow1() {
        TimesheetRow timesheet = new TimesheetRow();
    }

    @Test
    public void testGetProject() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);
        assertEquals(1, timesheet.getProject());
    }

    @Test
    public void testSetProject() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);

        timesheet.setProject(1);
    }

    @Test
    public void testGetWorkPackage() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);
        assertEquals("row1", timesheet.getWorkPackage());
    }

    @Test
    public void testSetWorkPackage() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);

        timesheet.setWorkPackage("row1");
    }

    @Test
    public void testGetHours() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);

        assertEquals(timesheet.getHours(), 14095877432740640l);
    }

    @Test
    public void testSetHours() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);

        timesheet.setHours(14095877432740640l);
    }

    @Test
    public void testGetHour() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);
        timesheet.setHour(0, 2);
        assertEquals(2.0f, timesheet.getHour(0));
    }

    @Test
    public void testToString() {
        TimesheetRow timesheet = new TimesheetRow(1, "row1", 3.2f, 1.1f, 4.5f,
                5.5f, 3.2f, 2.0f, 5.0f);
        timesheet.toString();
    }
}
