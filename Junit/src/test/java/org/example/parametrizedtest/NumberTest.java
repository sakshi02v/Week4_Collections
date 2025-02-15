package org.example.parametrizedtest;

import static org.junit.jupiter.api.Assertions.*;

//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.ValueSource;

class NumberTest {
    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 8, 10})  // Even numbers
    void testIsEven_WithEvenNumbers(int number) {
        assertTrue(Number.isEven(number), number + " should be even");
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, 7, 9})  // Odd numbers
    void testIsEven_WithOddNumbers(int number) {
        assertFalse(Number.isEven(number), number + " should be odd");
    }
}

