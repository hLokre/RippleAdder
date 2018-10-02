package com.himanshu.adder.test.gates;

import com.himanshu.adder.gates.NandGate;
import com.himanshu.adder.test.TestSuite;
import org.junit.Rule;
import org.junit.Test;

import static com.himanshu.adder.Constants.ONE;
import static com.himanshu.adder.Constants.ZERO;
import static org.junit.Assert.assertEquals;

public class NandGateTest {

    @Rule
    public TestSuite testSuite = new TestSuite();

    /**
     * Tests desired output of this gate.
     */
    @Test
    public void getOutput() {
        NandGate nandGate = new NandGate(ZERO, ZERO);//0,0 = 1
        assertEquals(ONE, nandGate.getOutput());

        nandGate.setInput(ZERO, ONE);//0,1 = 1
        assertEquals(ONE, nandGate.getOutput());

        nandGate.setInput(ONE, ZERO);//1,0 = 1
        assertEquals(ONE, nandGate.getOutput());

        nandGate.setInput(ONE, ONE);//1,1 = 0
        assertEquals(ZERO, nandGate.getOutput());
    }
}