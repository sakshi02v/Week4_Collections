package org.example.mapinterface.findhighestvaluekey;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HighestKeyValue {

    public static <K, V extends Comparable<V>> K findKeyWithMaxValue(Map<K, V> map) {
        if (map == null || map.isEmpty()) {
            return null; // Handle null or empty map
        }

        K maxKey = null;
        V maxValue = null;

        for (Entry<K, V> entry : map.entrySet()) {
            if (maxKey == null || entry.getValue().compareTo(maxValue) > 0) {
                maxKey = entry.getKey();
                maxValue = entry.getValue();
            }
        }

        return maxKey;
    }
}
