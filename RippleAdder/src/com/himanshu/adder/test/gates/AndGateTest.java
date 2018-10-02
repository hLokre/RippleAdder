package com.himanshu.adder.test.gates;

import com.himanshu.adder.gates.AndGate;
import com.himanshu.adder.test.TestSuite;
import org.junit.Rule;
import org.junit.Test;

import static com.himanshu.adder.Constants.ONE;
import static com.himanshu.adder.Constants.ZERO;
import static org.junit.Assert.assertEquals;

public class AndGateTest {

    @Rule
    public TestSuite testSuite = new TestSuite();

    /**
     * Tests desired output of this gate.
     */
    @Test
    public void getOutput() {
        AndGate andGate = new AndGate(ZERO, ZERO);//0,0 = 0
        assertEquals(ZERO, andGate.getOutput());

        andGate.setInput(ZERO, ONE);//0,1 = 0
        assertEquals(ZERO, andGate.getOutput());

        andGate.setInput(ONE, ZERO);//1,0 = 0
        assertEquals(ZERO, andGate.getOutput());

        andGate.setInput(ONE, ONE);//1,1 = 1
        assertEquals(ONE, andGate.getOutput());

    }
}