package org.example.setinterface.findsubsets;

import java.util.HashSet;
import java.util.Set;

public class SubsetChecker {

    public static <T> boolean isSubset(Set<T> set1, Set<T> set2) {
        if (set1 == null || set2 == null) {
            return set1 == set2; // Handle null cases: if both null, they are equal (subset)
        }

        if (set1.size() > set2.size()) { // Optimization: if set1 is larger, it can't be a subset
            return false;
        }

        return set2.containsAll(set1); // Efficiently checks if set2 contains all elements of set1
    }
}
