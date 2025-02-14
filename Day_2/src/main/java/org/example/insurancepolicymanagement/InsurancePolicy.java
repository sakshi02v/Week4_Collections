package org.example.insurancepolicymanagement;

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

