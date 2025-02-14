package org.example.setinterface.unionintersectionofsets;

import java.util.HashSet;
import java.util.Set;

import static org.example.setinterface.unionintersectionofsets.SetOperations.intersection;
import static org.example.setinterface.unionintersectionofsets.SetOperations.union;

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

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet); // Output: [1, 2, 3, 4, 5] (order may vary)

        Set<Integer> intersectionSet = intersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet); // Output: [3]

        // Example with strings
        Set<String> set3 = new HashSet<>();
        set3.add("apple");
        set3.add("banana");

        Set<String> set4 = new HashSet<>();
        set4.add("banana");
        set4.add("orange");

        System.out.println("Set3: " + set3);
        System.out.println("Set4: " + set4);

        Set<String> unionSetString = union(set3, set4);
        System.out.println("Union (Strings): " + unionSetString); // Output: [apple, banana, orange] (order may vary)

        Set<String> intersectionSetString = intersection(set3, set4);
        System.out.println("Intersection (Strings): " + intersectionSetString); // Output: [banana]


    }
}
