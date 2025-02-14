package org.example.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;

import static org.example.listinterface.reverselist.ReverseList.*;

public class Main {
    public static void main(String[] args) {
        // Example with ArrayList
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        System.out.println("Original ArrayList: " + arrayList);
        System.out.println("Reversed ArrayList (new list): " + reverseIterative(arrayList));

        reverseArrayListInPlace(arrayList); // In-place reversal
        System.out.println("Reversed ArrayList (in-place): " + arrayList);


        // Example with LinkedList
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("A");
        linkedList.add("B");
        linkedList.add("C");

        System.out.println("Original LinkedList: " + linkedList);
        System.out.println("Reversed LinkedList: " + reverseLinkedList(linkedList));

        // Note:  The original linkedList is now empty after the reversal.
        System.out.println("Original LinkedList after reversal: " + linkedList); // Output: []

    }
}
