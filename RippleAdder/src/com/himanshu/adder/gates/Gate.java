package com.himanshu.adder.gates;

/**
 * Abstract class for implementing Logic Gates which takes two inputs.
 */
public abstract class Gate {

    private boolean mInputA;
    private boolean mInputB;

    /**
     * Constructor hidden to restrict gate creation without default inputs.
     * Although we can default to 0, its better for client to be explicit to avoid errors.
     */
    private Gate() {
    }

    /**
     * Constructor
     *
     * @param inputA
     * @param inputB
     */
    public Gate(boolean inputA, boolean inputB) {
        mInputA = inputA;
        mInputB = inputB;
    }

    /**
     * Sets the input for this gate.
     *
     * @param inputA
     * @param inputB
     */
    public void setInput(boolean inputA, boolean inputB) {
        mInputA = inputA;
        mInputB = inputB;
    }

    /**
     * Sets the input for this gate.
     *
     * @param inputGateA: Uses output of Gate 'A' as input a for this gate.
     * @param inputB:     input b
     */
    public void setInput(Gate inputGateA, boolean inputB) {
        setInput(inputGateA.getOutput(), inputB);
    }

    /**
     * Sets the input for this gate.
     *
     * @param inputA:input    a
     * @param inputGateB:Uses output of Gate 'B' as input b for this gate.
     */
    public void setInput(boolean inputA, Gate inputGateB) {
        setInput(inputA, inputGateB.getOutput());
    }

    /**
     * Sets the input for this gate.
     *
     * @param inputGateA:Uses output of Gate 'A' as input a for this gate.
     * @param inputGateB:Uses output of Gate 'b' as input b for this gate.
     */
    public void setInput(Gate inputGateA, Gate inputGateB) {
        setInput(inputGateA.getOutput(), inputGateB.getOutput());
    }

    /**
     * @return current input a for this gate
     */
    public boolean getInputA() {
        return mInputA;
    }

    /**
     * @return current input B for this gate
     */
    public boolean getInputB() {
        return mInputB;
    }

    /**
     * To be implemented by child classes.
     * <p>
     * Calculates the output of logical operation on current inputs for this gate.
     *
     * @return logical output
     */
    public abstract boolean getOutput();

}
