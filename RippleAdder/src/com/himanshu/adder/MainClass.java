package com.himanshu.adder;

import com.himanshu.adder.test.TestRunner;

import java.util.Scanner;

/**
 * Main driver class for the program.
 */
public class MainClass {
    private static final int RUN_ADDER = 1;
    private static final int RUN_TEST = 2;
    private static final int EXIT = 3;

    public static void main(String[] args) {
        int selection;
        RippleAdder rippleAdder = new RippleAdder();
        TestRunner runner = new TestRunner();

        /** Shows menu items to user in cmd prompt.*/
        try {
            do {
                System.out.println("\nRipple Adder project, please select menu item");
                System.out.println("1: Add two integers, 2: Run Unit tests, 3: exit");
                Scanner scanner = new Scanner(System.in);
                selection = scanner.nextInt();
                if (selection == RUN_ADDER) {
                    System.out.println("Enter first number:");
                    int number1 = scanner.nextInt();
                    System.out.println("Enter second number:");
                    int number2 = scanner.nextInt();
                    try {
                        rippleAdder.setInputs(number1, number2);
                        System.out.println("Result:" + rippleAdder.getSum());
                    } catch (IllegalArgumentException iae) {
                        System.out.println(iae.getLocalizedMessage());
                    }
                } else if (selection == RUN_TEST) {
                    runner.runTests();
                } else if (selection == EXIT) {
                    return;
                }

            } while (selection != EXIT);
        } catch (Exception e) {
            System.out.println("There was an unexpected exception. " + e.getMessage());
        }
    }
}
