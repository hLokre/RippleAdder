package com.himanshu.adder.test.gates;

import com.himanshu.adder.gates.XorGate;
import com.himanshu.adder.test.TestSuite;
import org.junit.Rule;
import org.junit.Test;

import static com.himanshu.adder.Constants.ONE;
import static com.himanshu.adder.Constants.ZERO;
import static org.junit.Assert.assertEquals;

public class XorGateTest {

    @Rule
    public TestSuite testSuite = new TestSuite();

    /**
     * Tests desired output of this gate.
     */
    @Test
    public void getOutput() {
        XorGate xorGate = new XorGate(ZERO, ZERO);//0,0 = 0
        assertEquals(ZERO, xorGate.getOutput());

        xorGate.setInput(ZERO, ONE);//0,1 = 1
        assertEquals(ONE, xorGate.getOutput());

        xorGate.setInput(ONE, ZERO);//1,0 = 1
        assertEquals(ONE, xorGate.getOutput());

        xorGate.setInput(ONE, ONE);//1,1 = 0
        assertEquals(ZERO, xorGate.getOutput());
    }
}