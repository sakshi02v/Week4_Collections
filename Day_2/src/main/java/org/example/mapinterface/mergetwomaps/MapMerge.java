package org.example.mapinterface.mergetwomaps;

import java.util.HashMap;
import java.util.Map;

public class MapMerge {

    public static <K> Map<K, Integer> mergeMaps(Map<K, Integer> map1, Map<K, Integer> map2) {
        if (map1 == null && map2 == null) {
            return new HashMap<>(); // Both null, return empty map
        }
        if (map1 == null) {
            return new HashMap<>(map2); // map1 null, return copy of map2
        }
        if (map2 == null) {
            return new HashMap<>(map1); // map2 null, return copy of map1
        }


        Map<K, Integer> mergedMap = new HashMap<>(map1); // Start with a copy of map1

        for (Map.Entry<K, Integer> entry : map2.entrySet()) {
            K key = entry.getKey();
            Integer value = entry.getValue();

            if (mergedMap.containsKey(key)) {
                mergedMap.put(key, mergedMap.get(key) + value); // Sum values if key exists
            } else {
                mergedMap.put(key, value); // Add key-value pair if key doesn't exist
            }
        }

        return mergedMap;
    }
}
