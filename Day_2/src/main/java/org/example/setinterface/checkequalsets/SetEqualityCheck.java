package org.example.setinterface.checkequalsets;

import java.util.HashSet;
import java.util.Set;

public class SetEqualityCheck {

    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        if (set1 == null || set2 == null) {
            return set1 == set2; // If both are null, they are equal, otherwise not
        }

        if (set1.size() != set2.size()) {
            return false; // If sizes are different, they can't be equal
        }

        return set1.equals(set2); // Efficient comparison using equals()
    }

}
