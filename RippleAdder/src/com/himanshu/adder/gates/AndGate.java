package com.himanshu.adder.gates;

/**
 * Implements the Logic Gate AND
 */
public class AndGate extends Gate {

    public AndGate(boolean a, boolean b) {
        super(a, b);
    }

    @Override
    public boolean getOutput() {
        return getInputA() & getInputB();
    }
}
