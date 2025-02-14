package org.example.insurancepolicymap;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.*;

class InsurancePolicy implements Comparable<InsurancePolicy> {
    String policyNumber;
    String policyholderName;
    LocalDate expiryDate;
    String coverageType;
    double premiumAmount;

    public InsurancePolicy(String policyNumber, String policyholderName, String expiryDate, String coverageType, double premiumAmount) {
        this.policyNumber = policyNumber;
        this.policyholderName = policyholderName;
        this.expiryDate = LocalDate.parse(expiryDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        this.coverageType = coverageType;
        this.premiumAmount = premiumAmount;
    }

    @Override
    public String toString() {
        return "Policy{" +
                "number='" + policyNumber + '\'' +
                ", holder='" + policyholderName + '\'' +
                ", expiry=" + expiryDate +
                ", type='" + coverageType + '\'' +
                ", premium=" + premiumAmount +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        InsurancePolicy that = (InsurancePolicy) o;
        return policyNumber.equals(that.policyNumber); // Equality based on policy number
    }

    @Override
    public int hashCode() {
        return policyNumber.hashCode();
    }

    @Override
    public int compareTo(InsurancePolicy other) {
        return this.expiryDate.compareTo(other.expiryDate); // Sorting by expiry date
    }
}

 class InsurancePolicySystem {

    private HashMap<String, InsurancePolicy> policyHashMap = new HashMap<>();
    private LinkedHashMap<String, InsurancePolicy> policyLinkedHashMap = new LinkedHashMap<>();
    private TreeMap<LocalDate, List<InsurancePolicy>> policyTreeMap = new TreeMap<>();

    public void storePolicy(InsurancePolicy policy) {
        policyHashMap.put(policy.policyNumber, policy);
        policyLinkedHashMap.put(policy.policyNumber, policy);

        if (!policyTreeMap.containsKey(policy.expiryDate)) {
            policyTreeMap.put(policy.expiryDate, new ArrayList<>());
        }
        policyTreeMap.get(policy.expiryDate).add(policy);
    }

    public InsurancePolicy getPolicyByNumber(String policyNumber) {
        return policyHashMap.get(policyNumber);
    }

    public List<InsurancePolicy> getPoliciesExpiringSoon(int days) {
        List<InsurancePolicy> expiringSoon = new ArrayList<>();
        LocalDate today = LocalDate.now();

        for (Map.Entry<LocalDate, List<InsurancePolicy>> entry : policyTreeMap.entrySet()) {
            if (ChronoUnit.DAYS.between(today, entry.getKey()) <= days && !entry.getKey().isBefore(today)) {
                expiringSoon.addAll(entry.getValue());
            } else if (entry.getKey().isAfter(today)) {
                break; // Optimization: Stop iterating if expiry date is after the range
            }
        }
        return expiringSoon;
    }

    public List<InsurancePolicy> getPoliciesByPolicyholder(String policyholderName) {
        List<InsurancePolicy> policies = new ArrayList<>();
        for (InsurancePolicy policy : policyHashMap.values()) {
            if (policy.policyholderName.equals(policyholderName)) {
                policies.add(policy);
            }
        }
        return policies;
    }

    public void removeExpiredPolicies() {
        LocalDate today = LocalDate.now();

        // Efficiently remove from TreeMap
        policyTreeMap.entrySet().removeIf(entry -> entry.getKey().isBefore(today));

        // Remove from other maps (using policy numbers to avoid ConcurrentModificationException)
        Set<String> expiredPolicyNumbers = new HashSet<>();
        for (InsurancePolicy policy : policyHashMap.values()) {
            if (policy.expiryDate.isBefore(today)) {
                expiredPolicyNumbers.add(policy.policyNumber);
            }
        }
        expiredPolicyNumbers.forEach(policyHashMap::remove);
        expiredPolicyNumbers.forEach(policyLinkedHashMap::remove);


    }

    public void displayAllPolicies() {
        System.out.println("All Policies (HashMap):");
        policyHashMap.values().forEach(System.out::println);
        System.out.println("\nAll Policies (LinkedHashMap - Insertion Order):");
        policyLinkedHashMap.values().forEach(System.out::println);
        System.out.println("\nAll Policies (TreeMap - Sorted by Expiry Date):");
        policyTreeMap.values().stream().flatMap(Collection::stream).forEach(System.out::println);

    }

}
