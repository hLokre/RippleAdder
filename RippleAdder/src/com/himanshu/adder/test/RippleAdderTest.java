package com.himanshu.adder.test;

import com.himanshu.adder.RippleAdder;
import org.junit.Rule;
import org.junit.Test;

import static com.himanshu.adder.Constants.ONE;
import static com.himanshu.adder.Constants.ZERO;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

/**
 * RippleAdder test class.
 */
public class RippleAdderTest {

    @Rule
    public TestSuite testSuite = new TestSuite();

    @Test
    public void setInputsAndGetSum() {
        RippleAdder adder = new RippleAdder();
        adder.setInputs(2,3);
        assertEquals(5, adder.getSum());
        adder.setInputs(10,9);
        assertEquals(19, adder.getSum());
        try {
            adder.setInputs(-1,2);
            fail("Should through IllegalArgumentException");
        } catch (IllegalArgumentException ae) {
            assertEquals(ae.getMessage(), "This Ripple adder can only handle 4 bits");
        }
    }

    @Test
    public void intToBooleanArray() {
        RippleAdder adder = new RippleAdder();
        /** 0000 = 0, lsb starts at index 0 **/
        assertArrayEquals(new boolean[]{ZERO, ZERO, ZERO, ZERO}, adder.intToBooleanArray(0));
        /** 0001 = 1 **/
        assertArrayEquals(new boolean[]{ONE, ZERO, ZERO, ZERO}, adder.intToBooleanArray(1));
        /** 0011 = 3 **/
        assertArrayEquals(new boolean[]{ONE, ONE, ZERO, ZERO}, adder.intToBooleanArray(3));
        /** 0010 = 4 **/
        assertArrayEquals(new boolean[]{ZERO, ZERO, ONE, ZERO}, adder.intToBooleanArray(4));
        /** 0101 = 5 **/
        assertArrayEquals(new boolean[]{ONE, ZERO, ONE, ZERO}, adder.intToBooleanArray(5));
        /** 1100 = 12 **/
        assertArrayEquals(new boolean[]{ZERO, ZERO, ONE, ONE}, adder.intToBooleanArray(12));
        /** 1111 = 15 **/
        assertArrayEquals(new boolean[]{ONE, ONE, ONE, ONE}, adder.intToBooleanArray(15));
        try {
            adder.intToBooleanArray(-1);
            fail("Should throw IllegalArgumentException");
        } catch (IllegalArgumentException ae) {
            assertEquals(ae.getMessage(), "This Ripple adder can only handle 4 bits");
        }
        try {
            adder.intToBooleanArray(16);
            fail("Should through IllegalArgumentException");
        } catch (IllegalArgumentException ae) {
            assertEquals(ae.getMessage(), "This Ripple adder can only handle 4 bits");
        }
    }

    @Test
    public void booleanArrayToInt() {
        RippleAdder adder = new RippleAdder();

        /** 0 = 0000 **/
        assertEquals(0, adder.booleanArrayToInt(new boolean[]{ZERO, ZERO, ZERO, ZERO}));
        /** 1 = 0001 **/
        assertEquals(1, adder.booleanArrayToInt(new boolean[]{ONE, ZERO, ZERO, ZERO}));
        /** 7 = 0111 **/
        assertEquals(7, adder.booleanArrayToInt(new boolean[]{ONE, ONE, ONE, ZERO}));
        /** null **/
        assertEquals(-1, adder.booleanArrayToInt(null));
        /** empty array **/
        assertEquals(-1, adder.booleanArrayToInt(new boolean[0]));
    }

}