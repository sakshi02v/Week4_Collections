package org.example.mapinterface.invertmap;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.example.mapinterface.invertmap.MapInverter.invertMap;

public class Main{
    public static void main(String[] args) {
        Map<String, Integer> inputMap = new HashMap<>();
        inputMap.put("A", 1);
        inputMap.put("B", 2);
        inputMap.put("C", 1);
        inputMap.put("D", 3);
        inputMap.put("E", 2);


        Map<Integer, List<String>> invertedMap = invertMap(inputMap);
        System.out.println("Original Map: " + inputMap);
        System.out.println("Inverted Map: " + invertedMap); // Output: {1=[A, C], 2=[B, E], 3=[D]}

        Map<String, String> map2 = new HashMap<>();
        map2.put("one", "value1");
        map2.put("two", "value2");
        map2.put("three", "value1");

        Map<String, List<String>> invertedMap2 = invertMap(map2);
        System.out.println("Original Map: " + map2);
        System.out.println("Inverted Map: " + invertedMap2); // Output: {value1=[one, three], value2=[two]}


        Map<String, Integer> emptyMap = new HashMap<>();
        Map<Integer, List<String>> invertedEmptyMap = invertMap(emptyMap);
        System.out.println("Original Map: " + emptyMap);
        System.out.println("Inverted Map: " + invertedEmptyMap); // Output: {}

        Map<String, Integer> nullMap = null;
        Map<Integer, List<String>> invertedNullMap = invertMap(nullMap);
        System.out.println("Original Map: " + nullMap);
        System.out.println("Inverted Map: " + invertedNullMap); // Output: {}

    }
}

