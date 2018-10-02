package com.himanshu.adder.gates;

/**
 * NAND gate implementation
 */
public class NandGate extends Gate {

    /**
     * Constructor
     * @param inputA
     * @param inputB
     */
    public NandGate(boolean inputA, boolean inputB) {
        super(inputA, inputB);
    }

    /**
     * Result of NAND operation on current input
     * @return XOR'd value
     */
    @Override
    public boolean getOutput() {
        return !(getInputA() & getInputB());
    }
}
