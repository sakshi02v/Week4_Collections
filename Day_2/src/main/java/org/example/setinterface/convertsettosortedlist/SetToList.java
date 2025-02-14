package org.example.setinterface.convertsettosortedlist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetToList {

    public static void main(String[] args) {
        Set<Integer> inputSet = new HashSet<>();
        inputSet.add(5);
        inputSet.add(3);
        inputSet.add(9);
        inputSet.add(1);

        // Convert the Set to a List
        List<Integer> list = new ArrayList<>(inputSet);

        // Sort the List
        Collections.sort(list);

        System.out.println("Input Set: " + inputSet);
        System.out.println("Sorted List: " + list); // Output: [1, 3, 5, 9]
    }
}
