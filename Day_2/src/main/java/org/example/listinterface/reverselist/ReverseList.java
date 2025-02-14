package org.example.listinterface.reverselist;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ReverseList {

    // Iterative reversal for both ArrayList and LinkedList (creates a new list)
    public static <T> List<T> reverseIterative(List<T> list) {
        List<T> reversedList = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }


    // In-place reversal for ArrayList (more efficient)
    public static <T> void reverseArrayListInPlace(ArrayList<T> list) {
        int left = 0;
        int right = list.size() - 1;
        while (left < right) {
            // Swap elements at left and right indices
            T temp = list.get(left);
            list.set(left, list.get(right));
            list.set(right, temp);

            left++;
            right--;
        }
    }

    // Reversal for LinkedList (by manipulating links - more efficient)
    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        while (!list.isEmpty()) {
            reversedList.addFirst(list.removeFirst()); // Add to front of reversed list
        }
        return reversedList;
    }

}
