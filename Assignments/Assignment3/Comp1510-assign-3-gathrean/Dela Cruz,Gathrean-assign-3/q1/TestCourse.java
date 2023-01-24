package q1;

/**
 * Driver class for the Course Java program. The program creates a course, adds
 * several students, prints a roll, and prints the overall course test average.
 *
 * @author Gathrean Dela Cruz
 * @version 1.0
 */
public class TestCourse {

    /**
     * Drives the program.
     * 
     * @param args unused.
     */
    public static void main(final String[] args) {

        Course myCourse = new Course("COMP 1510 Programming Methods");
        System.out.println("Before adding new students: ");
        myCourse.roll();
        System.out.println("The average is " + myCourse.average() + "\n");
        System.out.println("After adding new students:\n");

        /* Every student will have the same school and home address. */
        Address school = new Address("3700 Willingdon Ave.", "Burnaby", "BC",
                "V5G 3H2");

        /* The address of every student. */
        Address address1 = new Address("1113 Comp St.", "Burnaby", "BC",
                "M4T H00");
        Address address2 = new Address("1510 Comp St.", "Burnaby", "BC",
                "JVJ VJV");
        Address address3 = new Address("1537 Comp St.", "Burnaby", "BC",
                "W3B D3V");
        Address address4 = new Address("1712 Comp St.", "Burnaby", "BC",
                "B1Z ANS");
        Address address5 = new Address("1800 Comp St.", "Burnaby", "BC",
                "PR0 JCT");

        final int hundred = 100;
        final int eighty = 80;
        final int sixty = 60;
        final int forty = 40;
        final int twenty = 20;

        Student first = new Student("Gathrean 1", "Dela Cruz ", school,
                address1, hundred, hundred, twenty);
        Student second = new Student("Gathrean 2", "Dela Cruz", school,
                address2, hundred, eighty, sixty);
        Student third = new Student("Gathrean 3", "Dela Cruz ", school,
                address3, twenty, 0, hundred);
        Student fourth = new Student("Gathrean 4", "Dela Cruz", school,
                address4, eighty, sixty, forty);
        Student fifth = new Student("Gathrean 5", "Dela Cruz ", school,
                address5, eighty, hundred, eighty);

        myCourse.addStudent(first);
        myCourse.addStudent(second);
        myCourse.addStudent(third);
        myCourse.addStudent(fourth);
        myCourse.addStudent(fifth);

        myCourse.roll();
        System.out.println("The total course average: " + myCourse.average());
    }

}
