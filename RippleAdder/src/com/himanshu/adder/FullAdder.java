package com.himanshu.adder;

import com.himanshu.adder.gates.AndGate;
import com.himanshu.adder.gates.OrGate;
import com.himanshu.adder.gates.XorGate;

import static com.himanshu.adder.Constants.ZERO;

/**
 * Full Adder implementation using 2 AND, 2XOR and 1 OR gate.
 * <p>
 * Refer below for circuit details:
 * https://en.wikipedia.org/wiki/Adder_(electronics)#/media/File:Fulladder.gif
 */
public class FullAdder {

    /**
     * Gates needed to implement this adder
     */
    private XorGate mXorGateOne;
    private XorGate mXorGateTwo;
    private AndGate mAndGateOne;
    private AndGate mAndGateTwo;
    private OrGate mOrGate;

    /**
     * Initialises gates in the full adder circuit with 0 as default inputs for A, B and Cin
     * <p>
     * Refer: https://en.wikipedia.org/wiki/Adder_(electronics)#/media/File:Fulladder.gif
     */
    public FullAdder() {
        mXorGateOne = new XorGate(ZERO, ZERO);
        mXorGateTwo = new XorGate(mXorGateOne.getOutput(), ZERO /*carry in*/);
        mAndGateOne = new AndGate(ZERO/*carry in*/, mXorGateOne.getOutput());
        mAndGateTwo = new AndGate(ZERO, ZERO);
        mOrGate = new OrGate(mAndGateOne.getOutput(), mAndGateTwo.getOutput());
    }

    /**
     * Sets the inputs values for all the gates in Adder and corresponding values in circuit.
     * <p>
     * Refer: https://en.wikipedia.org/wiki/Adder_(electronics)#/media/File:Fulladder.gif
     *
     * @param inputA:  Input a for adder
     * @param inputB:  Input b for adder
     * @param carryIn: Input carry in
     */
    public void setInput(boolean inputA, boolean inputB, boolean carryIn) {
        mXorGateOne.setInput(inputA, inputB);
        mXorGateTwo.setInput(mXorGateOne, carryIn);
        mAndGateOne.setInput(carryIn, mXorGateOne);
        mAndGateTwo.setInput(inputA, inputB);
        mOrGate.setInput(mAndGateOne, mAndGateTwo);
    }

    /**
     * Returns the carry bit of result on current input values.
     *
     * @return carry
     */
    public boolean getCarry() {
        return mOrGate.getOutput();
    }

    /**
     * Returns the sum bit of result on current input values.
     *
     * @return sum
     */
    public boolean getSum() {
        return mXorGateTwo.getOutput();
    }
}
