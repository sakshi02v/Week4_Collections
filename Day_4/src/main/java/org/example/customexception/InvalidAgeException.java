package org.example.customexception;

//custom exception class
public class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
class AgeCheck{
    public static void main(String[] args) {
        try {
            validateAge(12);
        } catch (InvalidAgeException e) {
            System.out.println("caught InvalidAgeException "+e.getMessage());
        }
    }
        public static void validateAge (int age) throws InvalidAgeException {
            if (age < 18) {
                throw new InvalidAgeException("Age must be 18 or older");
            }
        }
}
