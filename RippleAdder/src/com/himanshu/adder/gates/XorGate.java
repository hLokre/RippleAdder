package com.himanshu.adder.gates;

/**
 * XOR gate implementation
 */
public class XorGate extends Gate {

    /**
     * Constructor
     * @param inputA
     * @param inputB
     */
    public XorGate(boolean inputA, boolean inputB) {
        super(inputA, inputB);
    }

    /**
     * Result of XOR operation on current input
     * @return XOR'd value
     */
    @Override
    public boolean getOutput() {
        return getInputA()^ getInputB();
    }
}
