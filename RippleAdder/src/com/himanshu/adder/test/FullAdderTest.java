package com.himanshu.adder.test;

import com.himanshu.adder.FullAdder;
import org.junit.Rule;
import org.junit.Test;

import static com.himanshu.adder.Constants.ONE;
import static com.himanshu.adder.Constants.ZERO;
import static org.junit.Assert.assertEquals;

/**
 * FullAdder tests class
 */
public class FullAdderTest {

    @Rule
    public TestSuite testSuite = new TestSuite();

    /**
     * Tests input A, B against output Cout for carry bit
     *
     * Inputs 	        Outputs
     * A 	B 	Cin 	Cout 	S
     * 0 	0 	0 	    0   	0
     * 0 	0 	1 	    0   	1
     * 0 	1 	0   	0 	    1
     * 0 	1 	1 	    1 	    0
     * 1 	0 	0 	    0 	    1
     * 1 	0 	1   	1 	    0
     * 1 	1 	0 	    1 	    0
     * 1 	1 	1 	    1 	    1
     */
    @Test
    public void getCarry() {
        FullAdder fullAdder = new FullAdder();//0 ,0, 0 Carry = 0
        assertEquals(ZERO, fullAdder.getCarry());

        fullAdder.setInput(ZERO, ZERO, ONE);//0 ,0, 1 Carry = 0
        assertEquals(ZERO, fullAdder.getCarry());

        fullAdder.setInput(ZERO, ONE, ZERO);//0 ,1, 0 Carry = 0
        assertEquals(ZERO, fullAdder.getCarry());

        fullAdder.setInput(ZERO,ONE, ONE);//0 ,1, 1 Carry = 1
        assertEquals(ONE, fullAdder.getCarry());

        fullAdder.setInput(ONE, ZERO, ZERO);//1 ,0, 0 Carry = 0
        assertEquals(ZERO, fullAdder.getCarry());

        fullAdder.setInput(ONE, ZERO, ONE);//1 ,0, 1 Carry = 1
        assertEquals(ONE, fullAdder.getCarry());

        fullAdder.setInput(ONE, ONE, ZERO);//1 ,1, 0 Carry = 1
        assertEquals(ONE, fullAdder.getCarry());

        fullAdder.setInput(ONE, ONE, ONE);//1 ,1, 1 Carry = 1
        assertEquals(ONE, fullAdder.getCarry());

    }

    /**
     * Tests input A, B against output S for sum bit
     *
     * Inputs 	        Outputs
     * A 	B 	Cin 	Cout 	S
     * 0 	0 	0 	    0   	0
     * 0 	0 	1 	    0   	1
     * 0 	1 	0   	0 	    1
     * 0 	1 	1 	    1 	    0
     * 1 	0 	0 	    0 	    1
     * 1 	0 	1   	1 	    0
     * 1 	1 	0 	    1 	    0
     * 1 	1 	1 	    1 	    1
     */
    @Test
    public void getSum() {
        FullAdder fullAdder = new FullAdder();//0 ,0, 0 Sum = 0
        assertEquals(ZERO, fullAdder.getSum());

        fullAdder.setInput(ZERO, ZERO, ONE);//0 ,0, 1 Sum = 1
        assertEquals(ONE, fullAdder.getSum());

        fullAdder.setInput(ZERO, ONE, ZERO);//0 ,1, 0 Sum = 1
        assertEquals(ONE, fullAdder.getSum());

        fullAdder.setInput(ZERO,ONE, ONE);//0 ,1, 1 Sum = 0
        assertEquals(ZERO, fullAdder.getSum());

        fullAdder.setInput(ONE, ZERO, ZERO);//1 ,0, 0 Sum = 1
        assertEquals(ONE, fullAdder.getSum());

        fullAdder.setInput(ONE, ZERO, ONE);//1 ,0, 1 Sum = 0
        assertEquals(ZERO, fullAdder.getSum());

        fullAdder.setInput(ONE, ONE, ZERO);//1 ,1, 0 Sum = 0
        assertEquals(ZERO, fullAdder.getSum());

        fullAdder.setInput(ONE, ONE, ONE);//1 ,1, 1 Sum = 1
        assertEquals(ONE, fullAdder.getSum());
    }

}