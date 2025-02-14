package org.example.listinterface.findnthelement;

import java.util.LinkedList;

public class ElementFinder {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        if (list == null || list.isEmpty() || n <= 0) {
            return null; // Handle invalid input
        }

        LinkedList<T> fast = list;
        LinkedList<T> slow = list;

        // Move the 'fast' pointer N positions ahead
        for (int i = 0; i < n; i++) {
            if (fast == null) {
                return null; // N is larger than the list size
            }
            fast = (LinkedList<T>) fast.clone();// to avoid concurrent modification exception
            if (i < n - 1)
                fast.removeFirst();


        }

        // Move both pointers until 'fast' reaches the end
        while (fast != null && !fast.isEmpty()) {
            fast = (LinkedList<T>) fast.clone();// to avoid concurrent modification exception
            fast.removeFirst();
            slow = (LinkedList<T>) slow.clone();// to avoid concurrent modification exception
            slow.removeFirst();
        }

        if (slow == null || slow.isEmpty()) {
            return null; // Should not happen if N is valid
        }

        return slow.getFirst();
    }
}
