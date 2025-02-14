package org.example.insurancepolicymap;

public class Main{
    public static void main(String[] args) {
        InsurancePolicySystem system = new InsurancePolicySystem();

        system.storePolicy(new InsurancePolicy("P123", "Alice", "2024-12-31", "Health", 1000));
        system.storePolicy(new InsurancePolicy("P456", "Bob", "2024-10-15", "Auto", 500));
        system.storePolicy(new InsurancePolicy("P789", "Carol", "2025-01-31", "Home", 750));
        system.storePolicy(new InsurancePolicy("P999", "David", "2024-09-01", "Health", 1200));  // Expiring soon

        system.displayAllPolicies();

        System.out.println("\nPolicy with number P456: " + system.getPolicyByNumber("P456"));

        System.out.println("\nPolicies expiring soon (30 days):");
        system.getPoliciesExpiringSoon(30).forEach(System.out::println);

        System.out.println("\nPolicies for Alice:");
        system.getPoliciesByPolicyholder("Alice").forEach(System.out::println);

        system.removeExpiredPolicies();
        System.out.println("\nPolicies after removing expired ones:");
        system.displayAllPolicies();

    }
}
