package org.example.stringutilitymethods;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;



class StringUtilsTest {

    @Test
    void testReverse() {
        assertEquals("olleH", StringUtils.reverse("Hello"), "Reverse of 'Hello' should be 'olleH'");
        assertNull(StringUtils.reverse(null), "Reverse of null should return null");
    }

    @Test
    void testIsPalindrome() {
        assertTrue(StringUtils.isPalindrome("madam"), "'madam' should be a palindrome");


    }

    @Test
    void testToUpperCase() {
        assertEquals("HELLO", StringUtils.toUpperCase("hello"), "'hello' should be converted to 'HELLO'");
        assertNull(StringUtils.toUpperCase(null), "Null should return null");
    }
}
