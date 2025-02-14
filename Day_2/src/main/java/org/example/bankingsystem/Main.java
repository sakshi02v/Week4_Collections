package org.example.bankingsystem;

public class Main{
    public static void main(String[] args) {
        BankingSystem bank = new BankingSystem();

        bank.createAccount("A123", 1000);
        bank.createAccount("B456", 500);
        bank.createAccount("C789", 2000);

        bank.deposit("A123", 500);
        bank.requestWithdrawal("B456", 600);
        bank.requestWithdrawal("A123", 200);
        bank.requestWithdrawal("D000", 100); // Non-existent account
        bank.requestWithdrawal("C789", 3000); // Insufficient funds

        bank.processWithdrawals();
        bank.displayAccounts();

    }
}
