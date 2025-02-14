package org.example.listinterface.removeduplicates;

import java.util.ArrayList;
import java.util.List;

import static org.example.listinterface.removeduplicates.DuplicateRemove.removeDuplicatesOrdered;
import static org.example.listinterface.removeduplicates.DuplicateRemove.removeDuplicatesOrderedIterative;


public class Main{
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(3);
        numbers.add(1);
        numbers.add(2);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

        System.out.println("Original list: " + numbers);

        List<Integer> uniqueNumbers = removeDuplicatesOrdered(numbers);
        System.out.println("Unique numbers (LinkedHashSet): " + uniqueNumbers);

        List<Integer> uniqueNumbersIterative = removeDuplicatesOrderedIterative(numbers);
        System.out.println("Unique numbers (Iterative): " + uniqueNumbersIterative);

        List<String> strings = new ArrayList<>();
        strings.add("apple");
        strings.add("banana");
        strings.add("apple");
        strings.add("orange");

        System.out.println("Original string list: " + strings);
        List<String> uniqueStrings = removeDuplicatesOrdered(strings);
        System.out.println("Unique strings: " + uniqueStrings);


    }
}
