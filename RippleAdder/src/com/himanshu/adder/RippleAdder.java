package com.himanshu.adder;

import static com.himanshu.adder.Constants.ZERO;

/**
 * 4 bit Ripple Adder implementation using 4 Adders.
 */
public class RippleAdder {

    /**
     * Number of bits this adder can handle. Could be changed to handle more bits.
     */
    private static final int MAX_BITS = 4;
    private FullAdder[] mAdders = new FullAdder[MAX_BITS];

    /**
     * Initialise and create full adders, with 0 as default input.
     */
    public RippleAdder() {
        for (int i = 0; i < mAdders.length; i++) {
            /** Full adder is initialised with 0 as default input. */
            mAdders[i] = new FullAdder();
        }
    }

    /**
     * Takes two integer as inputs's and set bit input's for the Adders
     *
     * @param opOne integer
     * @param opTwo integer
     */
    public void setInputs(int opOne, int opTwo) {
        boolean[] operandOne = intToBooleanArray(opOne);
        boolean[] operandTwo = intToBooleanArray(opTwo);

        /** Creates the Ripple Adder circuit, feeding i'th bit from operands into i'th adder */
        for (int i = 0; i < mAdders.length; i++) {
            if (i == 0) {
                /** First adder will have 0 as carry in. */
                mAdders[i].setInput(operandOne[i], operandTwo[i], ZERO);
            } else {
                /** Next adders will have carry from previous as the third input */
                mAdders[i].setInput(operandOne[i], operandTwo[i], mAdders[i - 1].getCarry());
            }
        }
    }

    /**
     * Calculates the sum on existing input values in adder.
     * Returns the result after converting output sum from bit to integer
     *
     * @return:sum as an integer
     */
    public int getSum() {
        boolean[] sum = new boolean[MAX_BITS + 1];
        for (int i = 0; i < mAdders.length; i++) {
            sum[i] = mAdders[i].getSum();
        }
        /** Last bit is the carry out (0 or 1) of last Full Adder in chain */
        sum[MAX_BITS] = mAdders[MAX_BITS - 1].getCarry();
        return booleanArrayToInt(sum);
    }

    /**
     * Convert integer into a bit representation in a boolean array.
     * Least significant bit is the first bit in array.
     *
     * @param integer
     * @return boolean array representing the number
     */
    public boolean[] intToBooleanArray(int toConvert) {
        String intBinaryString = Integer.toBinaryString(toConvert);
        int length = intBinaryString.length();
        if (length > MAX_BITS) {
            throw new IllegalArgumentException("This Ripple adder can only handle " + MAX_BITS + " bits");
        }
        boolean[] bitsArray = new boolean[MAX_BITS];
        /**
         * Fill in the bitsArray.
         */
        for (int i = 0; i < bitsArray.length; i++) {
            /** perform bitwise operation to get the ith bit value*/
            bitsArray[i] = (toConvert & (1 << i)) != 0;
        }
        return bitsArray;
    }

    /**
     * Converts a boolean array into corresponding integer value.
     *
     * @param boolean array representing a number
     * @return integer
     */
    public int booleanArrayToInt(boolean[] toConvert) {
        if (toConvert == null || toConvert.length == 0) {
            return -1;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = toConvert.length - 1; i >= 0; i--) {
            if (toConvert[i]) {
                sb.append('1');
            } else {
                sb.append('0');
            }
        }
        return Integer.parseInt(sb.toString(), 2);
    }
}
