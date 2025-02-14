package org.example.setinterface.findsubsets;

import java.util.HashSet;
import java.util.Set;

import static org.example.setinterface.findsubsets.SubsetChecker.isSubset;

public class Main {
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(1);
        set2.add(2);
        set2.add(3);
        set2.add(4);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        System.out.println("Set1 is a subset of Set2: " + isSubset(set1, set2)); // Output: true

        Set<Integer> set3 = new HashSet<>();
        set3.add(2);
        set3.add(3);
        set3.add(5);

        System.out.println("Set3 is a subset of Set2: " + isSubset(set3, set2)); // Output: false

        Set<String> set4 = new HashSet<>();
        set4.add("apple");
        set4.add("banana");

        Set<String> set5 = new HashSet<>();
        set5.add("banana");
        set5.add("apple");
        set5.add("orange");

        System.out.println("Set4 is a subset of Set5: " + isSubset(set4, set5)); // Output: true


        Set<Integer> set6 = null;
        Set<Integer> set7 = new HashSet<>();
        System.out.println("Set6 is a subset of Set7: " + isSubset(set6, set7)); // Output: false
        System.out.println("Set6 is a subset of Set6: " + isSubset(set6, set6)); // Output: true (null is a subset of null)


    }
}
