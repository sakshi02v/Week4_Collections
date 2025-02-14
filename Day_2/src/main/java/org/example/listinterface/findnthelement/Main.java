package org.example.listinterface.findnthelement;

import java.util.LinkedList;

import static org.example.listinterface.findnthelement.ElementFinder.findNthFromEnd;

public class Main{
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        list.add("E");

        System.out.println("List: " + list);
        System.out.println("2nd from end: " + findNthFromEnd(list, 2)); // Output: D
        System.out.println("1st from end: " + findNthFromEnd(list, 1)); // Output: E
        System.out.println("5th from end: " + findNthFromEnd(list, 5)); // Output: A
        System.out.println("6th from end: " + findNthFromEnd(list, 6)); // Output: null (invalid input)
        System.out.println("0th from end: " + findNthFromEnd(list, 0)); // Output: null (invalid input)
        System.out.println("-1th from end: " + findNthFromEnd(list, -1)); // Output: null (invalid input)

        LinkedList<Integer> intList = new LinkedList<>();
        intList.add(1);
        intList.add(2);
        intList.add(3);
        System.out.println("List: " + intList);
        System.out.println("2nd from end: " + findNthFromEnd(intList, 2)); // Output: 2
    }
}
