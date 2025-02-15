package org.example.Calculator;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorClassTest {

    CalculatorClass calculator = new CalculatorClass();

    @Test
    void testAddition() {
        assertEquals(10, calculator.add(6, 4), "6 + 4 should be 10");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(6, 4), "6 - 4 should be 2");
    }

    @Test
    void testMultiplication() {
        assertEquals(24, calculator.multiply(6, 4), "6 * 4 should be 24");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(8, 4), "8 / 4 should be 2");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(ArithmeticException.class, () -> calculator.divide(8, 0));
        assertEquals("Cannot divide by zero", exception.getMessage());
    }
}

