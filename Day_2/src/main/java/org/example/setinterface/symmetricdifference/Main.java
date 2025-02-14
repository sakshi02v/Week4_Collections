package org.example.setinterface.symmetricdifference;

import java.util.HashSet;
import java.util.Set;

import static org.example.setinterface.symmetricdifference.DifferenceFind.symmetricDifference;

public class Main{
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(4);
        set2.add(5);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> symmetricDiff = symmetricDifference(set1, set2);
        System.out.println("Symmetric Difference: " + symmetricDiff); // Output: [1, 2, 4, 5] (order may vary)

        Set<String> set3 = new HashSet<>();
        set3.add("apple");
        set3.add("banana");

        Set<String> set4 = new HashSet<>();
        set4.add("banana");
        set4.add("orange");
        set4.add("grape");

        System.out.println("Set3: " + set3);
        System.out.println("Set4: " + set4);
        Set<String> symmetricDiffString = symmetricDifference(set3, set4);
        System.out.println("Symmetric Difference (Strings): " + symmetricDiffString); // Output: [apple, orange, grape] (order may vary)

    }
}

