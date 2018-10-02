package com.himanshu.adder.test.gates;

import com.himanshu.adder.gates.OrGate;
import com.himanshu.adder.test.TestSuite;
import org.junit.Rule;
import org.junit.Test;

import static com.himanshu.adder.Constants.ONE;
import static com.himanshu.adder.Constants.ZERO;
import static org.junit.Assert.assertEquals;

public class OrGateTest {

    @Rule
    public TestSuite testSuite = new TestSuite();

    /**
     * Tests desired output of this gate.
     */
    @Test
    public void getOutput() {
        OrGate orGate = new OrGate(ZERO, ZERO);//0,0 = 0
        assertEquals(ZERO, orGate.getOutput());

        orGate.setInput(ZERO, ONE);//0,1 = 1
        assertEquals(ONE, orGate.getOutput());

        orGate.setInput(ONE, ZERO);//1,0 = 1
        assertEquals(ONE, orGate.getOutput());

        orGate.setInput(ONE, ONE);//1,1 = 1
        assertEquals(ONE, orGate.getOutput());
    }
}