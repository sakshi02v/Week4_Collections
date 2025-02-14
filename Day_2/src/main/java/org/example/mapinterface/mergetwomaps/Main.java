package org.example.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

import static org.example.mapinterface.mergetwomaps.MapMerge.mergeMaps;

public class Main{
    public static void main(String[] args) {
        Map<String, Integer> map1 = new HashMap<>();
        map1.put("A", 1);
        map1.put("B", 2);

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("B", 3);
        map2.put("C", 4);

        Map<String, Integer> mergedMap = mergeMaps(map1, map2);
        System.out.println("Merged Map: " + mergedMap); // Output: {A=1, B=5, C=4}

        Map<String, Integer> map3 = new HashMap<>();
        map3.put("x", 10);
        map3.put("y", 20);

        Map<String, Integer> mergedMap2 = mergeMaps(map1, map3);
        System.out.println("Merged Map2: " + mergedMap2); // Output: {A=1, B=2, x=10, y=20}

        Map<String, Integer> emptyMap = new HashMap<>();
        Map<String, Integer> mergedEmptyMap = mergeMaps(map1, emptyMap);
        System.out.println("Merged Empty Map: " + mergedEmptyMap); // Output: {A=1, B=2}

        Map<String, Integer> nullMap = null;
        Map<String, Integer> mergedNullMap = mergeMaps(map1, nullMap);
        System.out.println("Merged Null Map: " + mergedNullMap); // Output: {A=1, B=2}

        Map<String, Integer> mergedNullMap2 = mergeMaps(nullMap, map1);
        System.out.println("Merged Null Map2: " + mergedNullMap2); // Output: {A=1, B=2}

        Map<String, Integer> mergedNullMap3 = mergeMaps(nullMap, nullMap);
        System.out.println("Merged Null Map3: " + mergedNullMap3); // Output: {}
    }
}

