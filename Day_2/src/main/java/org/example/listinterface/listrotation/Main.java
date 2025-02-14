package org.example.listinterface.listrotation;

import java.util.ArrayList;
import java.util.List;

import static org.example.listinterface.listrotation.ListRotator.rotate;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);

        System.out.println("Original list: " + list);
        System.out.println("Rotated by 2: " + rotate(list, 2));   // Output: [30, 40, 50, 10, 20]
        System.out.println("Rotated by 7: " + rotate(list, 7));   // Output: [30, 40, 50, 10, 20] (same as rotating by 2)
        System.out.println("Rotated by -1: " + rotate(list, -1)); // Output: [50, 10, 20, 30, 40]
        System.out.println("Rotated by -6: " + rotate(list, -6)); // Output: [50, 10, 20, 30, 40] (same as rotating by -1)

        List<String> stringList = List.of("a", "b", "c", "d");
        System.out.println("Original string list: " + stringList);
        System.out.println("Rotated by 1: " + rotate(stringList, 1)); // Output: [b, c, d, a]

        List<Integer> emptyList = List.of();
        System.out.println("Rotated empty list: " + rotate(emptyList, 2)); // Output: []

        List<Integer> nullList = null;
        System.out.println("Rotated null list: " + rotate(nullList, 2)); // Output: []
    }
}
