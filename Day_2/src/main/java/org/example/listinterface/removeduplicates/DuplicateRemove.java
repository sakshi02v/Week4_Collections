package org.example.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class DuplicateRemove {

    // Method 1: Using LinkedHashSet (Preserves Order)
    public static <T> List<T> removeDuplicatesOrdered(List<T> list) {
        Set<T> set = new LinkedHashSet<>(list); // LinkedHashSet maintains insertion order
        return new ArrayList<>(set); // Convert back to List
    }

    // Method 2: Iterative Approach with a Set (More Explicit)
    public static <T> List<T> removeDuplicatesOrderedIterative(List<T> list) {
        List<T> result = new ArrayList<>();
        Set<T> seen = new LinkedHashSet<>();  // Use LinkedHashSet for order
        for (T item : list) {
            if (seen.add(item)) { // add() returns true if the element was not already in the set
                result.add(item);
            }
        }
        return result;
    }
}
