package com.himanshu.adder;

import com.himanshu.adder.gates.AndGate;
import com.himanshu.adder.gates.XorGate;

import static com.himanshu.adder.Constants.ZERO;

/**
 * Implements a Half Adder using one AND and one XOR gate
 */
public class HalfAdder {

    private AndGate mAndGate;
    private XorGate mXorGate;

    /**
     * Initialises a half adder with 0 as default inputs
     */
    public HalfAdder() {
        mAndGate = new AndGate(ZERO, ZERO);
        mXorGate = new XorGate(ZERO, ZERO);
    }

    /**
     * Sets the inputs values for all the gates in Adder
     *
     * @param inputA
     * @param inputB
     */
    public void setInput(boolean inputA, boolean inputB) {
        mAndGate.setInput(inputA, inputB);
        mXorGate.setInput(inputA, inputB);
    }

    /**
     * Carry is output of AND gate for current input values.
     * @return carry
     */
    public boolean getCarry() {
        return mAndGate.getOutput();
    }

    /**
     * Sum is output of XOR gate for current input values.
     * @return sum
     */
    public boolean getSum() {
        return mXorGate.getOutput();
    }
}
