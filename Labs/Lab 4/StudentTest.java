package ca.bcit.comp1510.lab04;

import org.junit.jupiter.api.Test;

public class StudentTest {
    private final Student s = new Student("Tashi", "Delek", 1985, "A00234534", 84);
    private String studentStr = "Tashi Delek 1985 A00234534 84";

    @Test
    void testCreation() {
        assertSame("Tashi", s.getFirstName(s));
        assertSame("Delek", s.getLastName(s));
        assertEquals(1985, s.getBirthYear(s));
        assertSame("A00234534", s.getStudentNumber(s));
        assertEquals(84, s.getGradeAverage(s));
    }

    private void assertEquals(int i, Object birthYear) {
        // TODO Auto-generated method stub
        
    }

    private void assertSame(String string, Object firstName) {
        // TODO Auto-generated method stub

    }

    @Test
    void testFirstName() {
        s.setFirstName("Drolma");
        assertSame("Drolma", s.getFirstName(s));
    }

    @Test
    void testLastName() {
        s.setLastName("Rabten");
        assertSame("Rabten", s.getLastName(s));
    }

    @Test
    void testBirthYear() {
        s.setBirthYear(2001);
        assertEquals(2001, s.getBirthYear(s));
    }

    @Test
    void testStudentNumber() {
        s.setStudentNumber("A00384495");
        assertSame("A00384495", s.getStudentNumber(s));
    }

    @Test
    void testGradeAverage() {
        s.setGradeAverage(78);
        assertEquals(78, s.getGradeAverage(s));
    }

    @Test
    void testToString() {
        assertEquals(studentStr, s.toString());
    }

    private void assertEquals(String studentStr2, String string) {
        // TODO Auto-generated method stub
        
    }

}
