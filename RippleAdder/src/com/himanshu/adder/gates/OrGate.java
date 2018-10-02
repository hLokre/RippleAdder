package com.himanshu.adder.gates;

/**
 * OR gate implementation
 */
public class OrGate extends Gate {

    /**
     * Constructor
     * @param inputA
     * @param inputB
     */
    public OrGate(boolean inputA, boolean inputB) {
        super(inputA, inputB);
    }

    /**
     * Result of OR operation on current input
     * @return OR'd value
     */
    @Override
    public boolean getOutput() {
        return getInputA() | getInputB();
    }
}
