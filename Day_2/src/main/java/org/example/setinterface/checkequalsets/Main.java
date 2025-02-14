package org.example.setinterface.checkequalsets;

import java.util.HashSet;
import java.util.Set;

import static org.example.setinterface.checkequalsets.SetEqualityCheck.areSetsEqual;

public class Main{
    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Set<Integer> set2 = new HashSet<>();
        set2.add(3);
        set2.add(2);
        set2.add(1);

        Set<Integer> set3 = new HashSet<>();
        set3.add(1);
        set3.add(2);
        set3.add(4);

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Set3: " + set3);

        System.out.println("Set1 and Set2 are equal: " + areSetsEqual(set1, set2)); // Output: true
        System.out.println("Set1 and Set3 are equal: " + areSetsEqual(set1, set3)); // Output: false

        Set<String> set4 = new HashSet<>();
        set4.add("apple");
        set4.add("banana");

        Set<String> set5 = new HashSet<>();
        set5.add("banana");
        set5.add("apple");

        System.out.println("Set4 and Set5 are equal: " + areSetsEqual(set4, set5)); // Output: true

        Set<Integer> set6 = null;
        Set<Integer> set7 = new HashSet<>();
        System.out.println("Set6 and Set7 are equal: " + areSetsEqual(set6, set7)); // Output: false
        System.out.println("Set6 and Set6 are equal: " + areSetsEqual(set6, set6)); // Output: true

    }
}