package q2;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple time sheet application. A time sheet has one row for each
 * project/work package.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class Timesheet {

    /** Magic number for the year 2022. */
    private static final int YEAR = 2022;

    /** Magic number for the number 101. */
    private static final int ONEOHONE = 101;

    /** Magic number for the number 102. */
    private static final int ONEOHTHREE = 103;

    /** Magic number for the number 103. */
    private static final int ONEOHFIVE = 105;

    /** Magic number for the 11th month, November. */
    private static final int NOV = 11;

    /** Magic number for the number 20. */
    private static final int TWENTY = 20;

    /** Magic number for the float number 3.2f. */
    private static final float THREE_TWOF = 3.2f;

    /** Magic number for the float number 1.1f. */
    private static final float ONE_ONEF = 1.1f;

    /** Magic number for the float number 4.5f. */
    private static final float FOUR_FIVEF = 4.5f;

    /** Magic number for the float number 5.5f. */
    private static final float FIVE_FIVEF = 5.5f;

    /** Magic number for the float number 2f. */
    private static final float TWOF = 2f;

    /** Magic number for the float number 5f. */
    private static final float FIVEF = 5f;

    /** An employee number. */
    private String empNum;

    /** An end date (must be a Friday). */
    private LocalDate endWeek;

    /** A list of TimeesheetRow objects. */
    private List<TimesheetRow> timesheetRow = new ArrayList<TimesheetRow>();

    /**
     * Constructor for Time Sheet that takes empNum and endWeek.
     * 
     * @param empNum  String
     * @param endWeek LocalDate
     */
    public Timesheet(String empNum, LocalDate endWeek) {
        this.empNum = empNum;
        this.endWeek = endWeek;
    }

    /**
     * Empty constructor for Time Sheet.
     */
    public Timesheet() {
        // Empty.
    }

    /**
     * Gets the empNum.
     * 
     * @return empNum
     */
    public String getEmpNum() {
        return empNum;
    }

    /**
     * Sets the empNum.
     * 
     * @param empNum String
     */
    public void setEmpNum(String empNum) {
        this.empNum = empNum;
    }

    /**
     * Gets the endWeek LocalData.
     * 
     * @return endWeek LocalData
     */
    public LocalDate getEndWeek() {
        return endWeek;
    }

    /**
     * Sets for end of the week. Throws an exception if the date is not a
     * Friday.
     * 
     * @param endWeek LocalData
     */
    public void setEndWeek(LocalDate endWeek) {

        if (endWeek.getDayOfWeek() == DayOfWeek.FRIDAY) {
            this.endWeek = endWeek;
        }
        throw new IllegalArgumentException("End week is not a Friday.");

    }

    /**
     * Adds a row to the list timesheetRow.
     * 
     * @param row TimesheetRow
     */
    public void addRow(TimesheetRow row) {
        timesheetRow.add(row);
    }

    /**
     * A toString method that provides all time sheet data in the returned
     * string.
     * 
     * @return String
     */
    public String toString() {
        return "Employee #" + empNum + "\nEnd Week: " + DayOfWeek.FRIDAY + "\n";
    }

    /**
     * The main method for testing to see if the program works. This will be
     * excluded from the JUnit testing.
     *
     * @param args command line arguments.
     */
    public static void main(String[] args) {

        Timesheet test = new Timesheet("152", LocalDate.of(YEAR, NOV, TWENTY));

        // test.addRow(new TimesheetRow(101, "row1", 3.2f, 1.1f, 4.5f, 5.5f,
        // 3.2f, 2.0f, 5.0f));
        test.addRow(new TimesheetRow(1, "Row1", THREE_TWOF, ONE_ONEF,
                FOUR_FIVEF, FIVE_FIVEF, THREE_TWOF, TWOF, FIVEF));

        // test.addRow(new TimesheetRow(103, "row2", 1.1f, 4.5f, 5.5f, 3.2f,
        // 2.0f, 5.0f, 3.2f));
        test.addRow(new TimesheetRow(2, "Row2", ONE_ONEF, FOUR_FIVEF,
                FIVE_FIVEF, THREE_TWOF, TWOF, FIVEF, THREE_TWOF));

        // test.addRow(new TimesheetRow(105, "row3", 4.5f, 5.5f, 3.2f, 2.0f,
        // 5.0f, 3.2f, 1.1f));
        test.addRow(new TimesheetRow(2 + 1, "Row3", FOUR_FIVEF, FIVE_FIVEF,
                THREE_TWOF, TWOF, FIVEF, THREE_TWOF, ONE_ONEF));

        System.out.println("FR\tTH\tWE\tTU\tMO\tSU\tSA");

        // test.addRow(new TimesheetRow(101, "row1", 3.2f, 1.1f, 4.5f, 5.5f,
        // 3.2f, 2.0f, 5.0f));
        TimesheetRow row1 = new TimesheetRow(1, "Row1", THREE_TWOF,
                ONE_ONEF, FOUR_FIVEF, FIVE_FIVEF, THREE_TWOF, TWOF, FIVEF);

        // test.addRow(new TimesheetRow(103, "row2", 1.1f, 4.5f, 5.5f, 3.2f,
        // 2.0f, 5.0f, 3.2f));
        TimesheetRow row2 = new TimesheetRow(2, "Row2", ONE_ONEF,
                FOUR_FIVEF, FIVE_FIVEF, THREE_TWOF, TWOF, FIVEF, THREE_TWOF);

        // test.addRow(new TimesheetRow(105, "row3", 4.5f, 5.5f, 3.2f, 2.0f,
        // 5.0f, 3.2f, 1.1f));
        TimesheetRow row3 = new TimesheetRow(2 + 1, "Row3", FOUR_FIVEF,
                FIVE_FIVEF, THREE_TWOF, TWOF, FIVEF, THREE_TWOF, ONE_ONEF);

        System.out.println(row1);
        System.out.println(row2);
        System.out.println(row3);

        System.out.println(test);

    }

}
