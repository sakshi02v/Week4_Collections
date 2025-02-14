package org.example.listinterface.listrotation;

import java.util.ArrayList;
import java.util.List;

public class ListRotator {

    public static <T> List<T> rotate(List<T> list, int positions) {
        if (list == null || list.isEmpty()) {
            return new ArrayList<>(); // Return empty list for null or empty input
        }

        int n = list.size();
        positions = positions % n; // Handle rotations larger than list size and negative rotations
        if (positions < 0) {
            positions = n + positions; // Adjust negative positions to positive
        }

        List<T> rotatedList = new ArrayList<>(n); // Create a new list with the same capacity

        // Method 1: Using subList and addAll (more concise)
        rotatedList.addAll(list.subList(positions, n));
        rotatedList.addAll(list.subList(0, positions));

        // Method 2: Iterative approach (more explicit)
        /*
        for (int i = 0; i < n; i++) {
            rotatedList.add(list.get((i + positions) % n));
        }
        */

        return rotatedList;
    }
}
