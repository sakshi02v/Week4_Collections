package org.example.bankingsystem;

import java.util.*;

public class BankingSystem {

    private HashMap<String, Double> accounts = new HashMap<>();
    private TreeMap<Double, List<String>> sortedAccounts = new TreeMap<>();
    private Queue<WithdrawalRequest> withdrawalRequests = new LinkedList<>();

    static class WithdrawalRequest {
        String accountNumber;
        double amount;

        public WithdrawalRequest(String accountNumber, double amount) {
            this.accountNumber = accountNumber;
            this.amount = amount;
        }

        @Override
        public String toString() {
            return "Withdrawal Request{" +
                    "accountNumber='" + accountNumber + '\'' +
                    ", amount=" + amount +
                    '}';
        }
    }

    public void createAccount(String accountNumber, double initialBalance) {
        if (accounts.containsKey(accountNumber)) {
            System.out.println("Account with this number already exists.");
            return;
        }
        accounts.put(accountNumber, initialBalance);
        updateSortedAccounts(accountNumber, initialBalance);

    }

    public void deposit(String accountNumber, double amount) {
        if (!accounts.containsKey(accountNumber)) {
            System.out.println("Account not found.");
            return;
        }
        double balance = accounts.get(accountNumber);
        accounts.put(accountNumber, balance + amount);
        updateSortedAccounts(accountNumber, balance + amount);

    }


    public void requestWithdrawal(String accountNumber, double amount) {
        withdrawalRequests.offer(new WithdrawalRequest(accountNumber, amount));
    }

    public void processWithdrawals() {
        while (!withdrawalRequests.isEmpty()) {
            WithdrawalRequest request = withdrawalRequests.poll();
            String accountNumber = request.accountNumber;
            double amount = request.amount;

            if (!accounts.containsKey(accountNumber)) {
                System.out.println("Account not found for withdrawal request: " + request);
                continue;
            }

            double balance = accounts.get(accountNumber);
            if (balance >= amount) {
                accounts.put(accountNumber, balance - amount);
                updateSortedAccounts(accountNumber, balance - amount);
                System.out.println("Withdrawal successful: " + request);
            } else {
                System.out.println("Insufficient funds for withdrawal request: " + request);
            }
        }
    }

    private void updateSortedAccounts(String accountNumber, double balance) {

        for (Double b : sortedAccounts.keySet()) {
            if (sortedAccounts.get(b).contains(accountNumber)) {
                sortedAccounts.get(b).remove(accountNumber);
                if (sortedAccounts.get(b).isEmpty()) {
                    sortedAccounts.remove(b);
                }
                break;
            }
        }

        if (!sortedAccounts.containsKey(balance)) {
            sortedAccounts.put(balance, new ArrayList<>());
        }
        sortedAccounts.get(balance).add(accountNumber);
    }


    public void displayAccounts() {
        System.out.println("Accounts (HashMap): " + accounts);
        System.out.println("Sorted Accounts (TreeMap): " + sortedAccounts);
    }
}
