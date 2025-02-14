package org.example.banktransactionsystem;

public class BankTransactionSystem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(5000); // Initial balance

        try {
            account.withdraw(6000); // Exceeds balance → Throws InsufficientBalanceException
        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(-100); // Negative amount → Throws IllegalArgumentException
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            account.withdraw(2000); // Valid withdrawal
        } catch (InsufficientBalanceException | IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
