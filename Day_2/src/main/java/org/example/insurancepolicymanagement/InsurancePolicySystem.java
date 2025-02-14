package org.example.insurancepolicymanagement;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class InsurancePolicySystem {

    private HashSet<InsurancePolicy> policyHashSet = new HashSet<>();
    private LinkedHashSet<InsurancePolicy> policyLinkedHashSet = new LinkedHashSet<>();
    private TreeSet<InsurancePolicy> policyTreeSet = new TreeSet<>();

    public void storePolicy(InsurancePolicy policy) {
        policyHashSet.add(policy);
        policyLinkedHashSet.add(policy);
        policyTreeSet.add(policy);
    }

    public void displayAllPolicies() {
        System.out.println("All Unique Policies (HashSet):");
        policyHashSet.forEach(System.out::println);

        System.out.println("\nAll Unique Policies (LinkedHashSet - Insertion Order):");
        policyLinkedHashSet.forEach(System.out::println);

        System.out.println("\nAll Unique Policies (TreeSet - Sorted by Expiry Date):");
        policyTreeSet.forEach(System.out::println);
    }

    public void displayExpiringSoonPolicies(int days) {
        System.out.println("\nPolicies Expiring Soon (within " + days + " days):");
        LocalDate today = LocalDate.now();
        policyTreeSet.stream()
                .filter(policy -> ChronoUnit.DAYS.between(today, policy.expiryDate) <= days)
                .forEach(System.out::println);
    }

    public void displayPoliciesByCoverageType(String coverageType) {
        System.out.println("\nPolicies with Coverage Type '" + coverageType + "':");
        policyHashSet.stream()
                .filter(policy -> policy.coverageType.equals(coverageType))
                .forEach(System.out::println);
    }

    public void displayDuplicatePolicies() {
        System.out.println("\nDuplicate Policies (based on policy number):");
        Set<String> policyNumbers = new HashSet<>();
        policyHashSet.forEach(policy -> {
            if (!policyNumbers.add(policy.policyNumber)) { // If add() returns false, it's a duplicate
                System.out.println(policy);
            }
        });
    }

}
