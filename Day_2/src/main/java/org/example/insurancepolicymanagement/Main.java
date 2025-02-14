package org.example.insurancepolicymanagement;

public class Main{
    public static void main(String[] args) {
        InsurancePolicySystem system = new InsurancePolicySystem();

        system.storePolicy(new InsurancePolicy("P123", "Alice", "2024-12-31", "Health", 1000));
        system.storePolicy(new InsurancePolicy("P456", "Bob", "2024-10-15", "Auto", 500));
        system.storePolicy(new InsurancePolicy("P789", "Carol", "2025-01-31", "Home", 750));
        system.storePolicy(new InsurancePolicy("P123", "Alice", "2024-12-31", "Health", 1000));//Duplicate
        system.storePolicy(new InsurancePolicy("P999", "David", "2024-10-01", "Health", 1200));

        system.displayAllPolicies();
        system.displayExpiringSoonPolicies(30);
        system.displayPoliciesByCoverageType("Health");
        system.displayDuplicatePolicies();

        // Add performance comparison code here if needed
    }
}
