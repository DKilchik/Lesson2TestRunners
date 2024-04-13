package org.lesson2;

public class TestRunner {
     public static void main(String[] args) {
        runTests();
    }

    public static void runTests() {
        // Test cases
        testAddition();
        testSubtraction();
        testMultiplication();
        testDivision();
        testInvalidOperator();
        testDivisionByZero();
    }

    public static void testAddition() {
        Calculator calculator = new Calculator(5, '+', 3);
        double result = calculator.calculate();
        System.out.println("Addition Test: " + (result == 8 ? "Passed" : "Failed"));
    }

    public static void testSubtraction() {
        Calculator calculator = new Calculator(10, '-', 7);
        double result = calculator.calculate();
        System.out.println("Subtraction Test: " + (result == 3 ? "Passed" : "Failed"));
    }

    public static void testMultiplication() {
        Calculator calculator = new Calculator(6, '*', 4);
        double result = calculator.calculate();
        System.out.println("Multiplication Test: " + (result == 24 ? "Passed" : "Failed"));
    }

    public static void testDivision() {
        Calculator calculator = new Calculator(15, '/', 5);
        double result = calculator.calculate();
        System.out.println("Division Test: " + (result == 3 ? "Passed" : "Failed"));
    }

    public static void testInvalidOperator() {
        Calculator calculator = new Calculator(5, '&', 3);
        double result = calculator.calculate();
        System.out.println("Invalid Operator Test: " + (result == 0 ? "Passed" : "Failed"));
    }

    public static void testDivisionByZero() {
        Calculator calculator = new Calculator(10, '/', 0);
        double result = calculator.calculate();
        System.out.println("Division by Zero Test: " + (result == 0 ? "Passed" : "Failed"));
    }
}


