package com.himanshu.adder.test;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

/**
 * Main class to run JUnit test suit.
 */
public class TestRunner {
    public static void main(String[] args) {
        TestRunner runner = new TestRunner();
        runner.runTests();
    }

    public void runTests() {
        Result result = JUnitCore.runClasses(TestSuite.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        System.out.println("Test success:" + result.wasSuccessful());
    }

}
