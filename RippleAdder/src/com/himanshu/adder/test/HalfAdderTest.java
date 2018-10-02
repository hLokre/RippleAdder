package com.himanshu.adder.test;

import com.himanshu.adder.HalfAdder;
import org.junit.Rule;
import org.junit.Test;

import static com.himanshu.adder.Constants.ONE;
import static com.himanshu.adder.Constants.ZERO;
import static org.junit.Assert.assertEquals;

/**
 * HalfAdder Test class
 */
public class HalfAdderTest {

    @Rule
    public TestSuite testSuite = new TestSuite();

    /**
     * Tests input A, B against output Cout for carry bit
     * <p>
     * Inputs 	     Outputs
     * A 	B 	 	Cout 	S
     * 0 	0 	    0   	0
     * 0 	0 	    0   	1
     * 0 	1 	   	0 	    1
     * 0 	1 	    1 	    0
     *
     **/
    @Test
    public void getCarry() {
        HalfAdder halfAdder = new HalfAdder();//0,0 ; C=0,S=0
        assertEquals(ZERO, halfAdder.getCarry());

        halfAdder.setInput(ONE, ZERO);//1,0 ; C=0,S=1
        assertEquals(ZERO, halfAdder.getCarry());

        halfAdder.setInput(ZERO, ONE);//0,1 ; C=0,S=1
        assertEquals(ZERO, halfAdder.getCarry());

        halfAdder.setInput(ONE, ONE);//1,1 ; C=1,S=0
        assertEquals(ONE, halfAdder.getCarry());
    }

    /**
     * Tests input A, B against output S for sum bit
     * <p>
     * Inputs 	     Outputs
     * A 	B 	 	Cout 	S
     * 0 	0 	    0   	0
     * 0 	0 	    0   	1
     * 0 	1 	   	0 	    1
     * 0 	1 	    1 	    0
     *
     **/
    @Test
    public void getSum() {
        HalfAdder halfAdder = new HalfAdder();//0,0 ; C=0,S=0
        assertEquals(ZERO, halfAdder.getSum());

        halfAdder.setInput(ONE, ZERO);//1,0 ; C=0,S=1
        assertEquals(ONE, halfAdder.getSum());

        halfAdder.setInput(ZERO, ONE);//0,1 ; C=0,S=1
        assertEquals(ONE, halfAdder.getSum());

        halfAdder.setInput(ONE, ONE);//1,1 ; C=1,S=0
        assertEquals(ZERO, halfAdder.getSum());

    }

}