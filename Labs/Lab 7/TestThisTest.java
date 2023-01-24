package ca.bcit.comp1510.lab07;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

/**
 * Simple test for TestThis
 * 
 * @author Gathrean Dela Cruz
 * @version 1
 *
 */
class TestThisTest {

    @Test
    void testLargestIntIntInt1() {
        TestThis large = new TestThis();
        assertEquals(3, large.largest(1, 2, 3));
    }
    
    @Test
    void testLargestIntIntInt2() {
        TestThis large = new TestThis();
        assertEquals(6, large.largest(4, 5, 6));
    }
    
    @Test
    void testLargestIntIntInt3() {
        TestThis large = new TestThis();
        assertEquals(9, large.largest(7, 8, 9));
    }

    @Test
    void testLargestListOfInteger1() {
        TestThis large = new TestThis();
        
        ArrayList<Integer> ints1 = new ArrayList<Integer>();
        
        ints1.add(1);
        ints1.add(2);
        ints1.add(3);
        assertEquals(large.largest(ints1), 3);
    }
    
    @Test
    void testLargestListOfInteger2() {
        TestThis large = new TestThis();
        
        ArrayList<Integer> ints2 = new ArrayList<Integer>();
        
        ints2.add(4);
        ints2.add(5);
        ints2.add(6);
        assertEquals(large.largest(ints2), 6);
    }
    
    @Test
    void testLargestListOfInteger3() {
        TestThis large = new TestThis();
        
        ArrayList<Integer> ints3 = new ArrayList<Integer>();
        
        ints3.add(7);
        ints3.add(8);
        ints3.add(9);
        assertEquals(large.largest(ints3), 9);
    }

}
