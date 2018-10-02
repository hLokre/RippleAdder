package com.himanshu.adder.test;

import com.himanshu.adder.test.gates.AndGateTest;
import com.himanshu.adder.test.gates.NandGateTest;
import com.himanshu.adder.test.gates.OrGateTest;
import com.himanshu.adder.test.gates.XorGateTest;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//JUnit Suite Test
@RunWith(Suite.class)
/**
 * Set of test classes to run the test for.
 */
@Suite.SuiteClasses({
        AndGateTest.class,
        OrGateTest.class,
        NandGateTest.class,
        XorGateTest.class,
        HalfAdderTest.class,
        FullAdderTest.class,
        RippleAdderTest.class
})

/**
 * Implements TestWatcher succeeded and failed methods to log the test cases been ran.
 */
public class TestSuite extends TestWatcher {

    @Override
    protected void succeeded(Description description) {
        System.out.println("Test method " + description.getMethodName()
                + " for class " + description.getClassName() + ": Success");
    }

    @Override
    protected void failed(Throwable e, Description description) {
        System.out.println("Test method " + description.getMethodName()
                + " for class " + description.getClassName() + ": Failed");
    }

}
