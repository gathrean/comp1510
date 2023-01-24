package q2;

/**
 * This is where you put your description about what this class does. You don't
 * have to write an essay but you should describe exactly what it does.
 * Describing it will help you to understand the programming problem better.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class TimesheetRow {

    /** MASK declaration from the Assignment 3 PDF. */
    private static final long[] MASK = {0xFFL, 0xFF00L, 0xFF0000L, 0xFF000000L,
        0xFF00000000L, 0xFF0000000000L, 0xFF000000000000L};

    /** UMASK declaration from the Assignment 3 PDF. */
    private static final long[] UMASK = {0xFFFFFFFFFFFFFF00L,
        0xFFFFFFFFFFFF00FFL, 0xFFFFFFFFFF00FFFFL, 0xFFFFFFFF00FFFFFFL,
        0xFFFFFF00FFFFFFFFL, 0xFFFF00FFFFFFFFFFL, 0xFF00FFFFFFFFFFFFL};

    /** The number integer seven. */
    private static final int SEVEN = 7;

    /** The number integer eight. */
    private static final int EIGHT = 8;

    /** The number integer ten. */
    private static final int TEN = 10;

    /** The number integer 10 float. */
    private static final float TENF = 10.0f;

    /**
     * A project (An integer because projects are represented as a project
     * number).
     */
    private int project;

    /** A String representation of a work package. */
    private String workPackage;

    /** A long representation of hours, being a packed version of the hours. */
    private long hours;

    /**
     * Constructor for TimesheetRow.
     * 
     * @param project     an integer representation of a project
     * @param workPackage a String representation of a work package
     * @param hours       a long representation of hours
     */
    public TimesheetRow(int project, String workPackage, float... hours) {
        this.project = project;
        this.workPackage = workPackage;
        
        Float temp;
        
        long count = 0;
        long result = 0;
        
        for (int j = 0; j < hours.length; j++) {
            
            temp = hours[j] * TEN;
            count = temp.longValue();
            count <<= EIGHT * j;
            result += count;
        }

        this.hours = result;
    }

    /**
     * Empty constructor.
     */
    public TimesheetRow() {

    }

    /**
     * Gets the project number.
     * 
     * @return integer project number
     */
    public int getProject() {
        return project;
    }

    /**
     * Sets the project.
     * 
     * @param project this.
     */
    public void setProject(int project) {
        this.project = project;
    }

    /**
     * Gets the work package.
     * 
     * @return workPackage String
     */
    public String getWorkPackage() {
        return workPackage;
    }

    /**
     * Sets the work package.
     * 
     * @param workPackage this.
     */
    public void setWorkPackage(String workPackage) {
        this.workPackage = workPackage;
    }

    /**
     * Gets the hours.
     * 
     * @return hours long
     */
    public long getHours() {
        return hours;
    }

    /**
     * Sets the hours.
     * 
     * @param hours this.
     */
    public void setHours(long hours) {
        this.hours = hours;
    }

    /**
     * Gets the hour.
     * 
     * @param dayOfWeek an integer representation of the day of week
     * @return hour divided by 10 float.
     */
    public float getHour(int dayOfWeek) {
        long hour = hours & MASK[dayOfWeek];
        hour = hour >> (dayOfWeek * EIGHT);
        return hour / TENF;
    }

    /**
     * Sets the hour.
     * 
     * @param d an integer representation of day
     * @param h an integer representation of hour
     */
    public void setHour(int d, float h) {
        long hour = (long) (h * TEN);
        long result = hours & UMASK[d];
        result = result | (hour << d * EIGHT);
        hours = result;
    }

    /**
     * toString method to turn results in a String.
     * 
     * @return result
     */
    public String toString() {
        String result = "";

        for (int i = 0; i < SEVEN; i++) {
            result += getHour(i) + "\t";
        }
        return result;
    }
}
