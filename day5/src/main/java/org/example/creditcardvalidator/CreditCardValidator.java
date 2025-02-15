package org.example.creditcardvalidator;

import java.util.regex.Pattern;

public class CreditCardValidator {
    private static final String VISA_REGEX = "^4[0-9]{15}$";  // Visa: Starts with 4, exactly 16 digits
    private static final String MASTERCARD_REGEX = "^5[1-5][0-9]{14}$";  // MasterCard: Starts with 51-55, exactly 16 digits

    private static final Pattern VISA_PATTERN = Pattern.compile(VISA_REGEX);
    private static final Pattern MASTERCARD_PATTERN = Pattern.compile(MASTERCARD_REGEX);

    public static boolean isValidCreditCard(String cardNumber) {
        return VISA_PATTERN.matcher(cardNumber).matches() || MASTERCARD_PATTERN.matcher(cardNumber).matches();
    }

    public static void main(String[] args) {
        String cardNumber = "4123456789012345";  // Example Visa Card
        if (isValidCreditCard(cardNumber)) {
            System.out.println("Valid Credit Card: " + cardNumber);
        } else {
            System.out.println("Invalid Credit Card");
        }
    }
}

