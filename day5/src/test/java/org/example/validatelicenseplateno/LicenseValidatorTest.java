package org.example.validatelicenseplateno;

import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

class LicenseValidatorTest {

    private static final String REGEX = "^[A-Z]{2}[0-9_]{4}$";
    private static final Pattern pattern = Pattern.compile(REGEX);

    private boolean isValidLicensePlate(String input) {
        Matcher matcher = pattern.matcher(input);
        return matcher.matches();
    }

    @Test
    void testValidLicensePlate() {
        assertTrue(isValidLicensePlate("AB1234"), "AB1234 should be valid");
    }

    @Test
    void testInvalidLicensePlate() {
        assertFalse(isValidLicensePlate("A12345"), "A12345 should be invalid (only 1 letter)");
    }
}