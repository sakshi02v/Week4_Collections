package org.example.setinterface.unionintersectionofsets;

import java.util.HashSet;
import java.util.Set;

public class SetOperations {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> unionSet = new HashSet<>(set1); // Create a copy of set1
        unionSet.addAll(set2); // Add all elements from set2 (duplicates are automatically handled)
        return unionSet;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> intersectionSet = new HashSet<>(set1); // Create a copy of set1
        intersectionSet.retainAll(set2); // Keep only the elements that are also in set2
        return intersectionSet;
    }
}
