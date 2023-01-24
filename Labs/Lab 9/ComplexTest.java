package ca.bcit.comp1510.lab09;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ComplexTest {

    /**
     * Create new Complex objects to test.
     * 
     * @throws Exception
     */

    /** 3 + 4 I real part. */
    private static final int TEST1R = 3;

    /** 3 + 4 I imaginary part. */
    private static final int TEST1I = 4;

    /** 1 + I real part. */
    private static final int TEST2R = 1;

    /** 1 + I imaginary part. */
    private static final int TEST2I = 1;

    Complex z1 = new Complex(TEST1R, TEST1I);
    Complex z2 = new Complex(TEST2R, TEST2I);
    Complex z3;
    Complex z4;
    Complex z5;
    Complex z6;
    Complex z7;

    @Test
    void testHashCode() {
        Complex complex = new Complex(5, 6);
        assertEquals(56, complex.hashCode());
    }

    @Test
    void testComplex() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(6, 5);
    }

    @Test
    public void testPolarComplex() throws Exception {
        assertEquals(true,
                Complex.polarComplex(-1.96093086259, -2.27040748592));
    }

    @Test
    void testAbs() {
        Complex complex = new Complex(5, 6);
        assertEquals(61, complex.abs());
    }

    @Test
    void testArg() {
        Complex complex = new Complex(5, 6);
        assertEquals(Math.atan2(5, 6), complex.arg());
    }

    @Test
    void testConjugate() {
        Complex complex = new Complex(5, 6);
        assertEquals(new Complex(5, -6), complex.conjugate());
    }

    @Test
    void testAddComplex() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(5, 5);

        assertEquals(new Complex(4, 5), complex.add(complex2));
    }

    @Test
    void testAddDouble() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(6, 4), complex.add(3));

    }

    @Test
    void testSubtractComplex() {
        Complex complex = new Complex(5, 6);
        Complex complex2 = new Complex(1, 1);
        assertEquals(new Complex(4, 5), complex.subtract(complex2));
    }

    @Test
    void testSubtractDouble() {
        Complex complex = new Complex(5, 6);
        assertEquals(new Complex(3, 4), complex.subtract(2));
    }

    @Test
    void testMultiplyComplex() {
        Complex complex = new Complex(5, 6);
        Complex complex2 = new Complex(3, 4);
        assertEquals(new Complex(-2, 22), complex.multiply(complex2));
    }

    @Test
    void testMultiplyDouble() {
        Complex complex = new Complex(5, 6);
        assertEquals(new Complex(10, 12), complex.multiply(2));
    }

    @Test
    void testReciprocal1() throws IllegalArgumentException {
        Complex complex = new Complex(5, 6);
        Complex complex2 = new Complex(0.0, 0.0);
        assertEquals(new Complex(0.25, -0.36), complex.reciprocal());
        assertThrows(IllegalArgumentException.class,
                () -> complex2.reciprocal(), "tried to take reciprocal of 0");
    }
    
    @Test
    void testReciprocal2() throws IllegalArgumentException {
        Complex complex = new Complex(0.0, 0.0);
        assertEquals(new Complex(0.25, -0.36), complex.reciprocal());
        assertThrows(IllegalArgumentException.class,
                () -> complex.reciprocal(), "tried to take reciprocal of 0");
    }

    @Test
    void testDivideComplex1() {
        Complex complex = new Complex(3, 4);
        Complex complex2 = new Complex(1, 1);
        Complex complex3 = new Complex(0, 0);

        assertEquals(complex.multiply(complex2.reciprocal()),
                complex.divide(complex2));

        assertThrows(IllegalArgumentException.class,
                () -> complex.divide(complex3), "Tried to divide by zero.");
    }
    
    @Test
    void testDivideComplex2() {
        Complex complex = new Complex(0, 0);

        assertThrows(IllegalArgumentException.class,
                () -> complex.divide(complex), "Tried to divide by zero.");
    }

    @Test
    void testDivideDouble() {
        Complex complex = new Complex(5, 6);
        assertEquals(new Complex(5, 6), complex.divide(1));
        assertThrows(IllegalArgumentException.class, () -> complex.divide(0),
                "Tried to divide by zero");
    }

    @Test
    void testSqrt() {
        Complex complex = new Complex(3, 4);
        assertEquals(new Complex(2, 1), complex.sqrt());
    }

    @Test
    void testExp() {
        Complex complex = new Complex(5, 6);
        assertEquals(new Complex(142.501905518, -41.4689367899), complex.exp());
    }

    @Test
    void testLog() {
        Complex complex = new Complex(5, 6);
        assertEquals(new Complex(1.6094379124341003, 1.4056476493802699),
                complex.log());
    }

    @Test
    void testEqualsObject() {
        Object object = new Object();
        Complex complex = new Complex(5, 6);
        Complex complex2 = new Complex(1, 1);
        assertEquals(false, object instanceof Complex);
        assertEquals(false, ((Complex) object).re == complex.re
                && ((Complex) object).im == complex.im);
        
        assertEquals(true, ((Complex) object).re == complex2.re
                && ((Complex) object).im == complex2.im);
    }

    @Test
    void testToString1() {
        Complex complex = new Complex(8, 0);
        assertEquals("8.0", complex.toString());
    }
    
    @Test
    void testToString2() {
        Complex complex = new Complex(0, 8);
        assertEquals("8.0i", complex.toString());
    }

    @Test
    void testToString3() {
        Complex complex = new Complex(5, 6);
        assertEquals("5.0 + 6.0i", complex.toString());
    }
    
    @Test
    void testToString4() {
        Complex complex = new Complex(-6, 9);
        assertEquals("-6.0 + 9.0i", complex.toString());
    }
}
