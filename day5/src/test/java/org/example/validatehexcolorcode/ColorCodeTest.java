package org.example.validatehexcolorcode;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class ColorCodeTest {

    private static final String REGEX = "^#[A-Fa-f0-9]{6}$";
    private static final Pattern pattern = Pattern.compile(REGEX);

    private boolean isValidColorCode(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    @Test
    void testValidColorCode() {
        assertTrue(isValidColorCode("#abf567"), "#abf567 should be valid");
    }

    @Test
    void testInvalidColorCode() {
        assertFalse(isValidColorCode("abf567"), "abf567 should be invalid (missing #)");
    }
}
