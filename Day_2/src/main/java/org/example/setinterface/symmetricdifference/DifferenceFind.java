package org.example.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

public class DifferenceFind {

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> symmetricDiff = new HashSet<>();

        // Add elements from set1 that are NOT in set2
        for (T element : set1) {
            if (!set2.contains(element)) {
                symmetricDiff.add(element);
            }
        }

        // Add elements from set2 that are NOT in set1
        for (T element : set2) {
            if (!set1.contains(element)) {
                symmetricDiff.add(element);
            }
        }

        return symmetricDiff;

    }
}


