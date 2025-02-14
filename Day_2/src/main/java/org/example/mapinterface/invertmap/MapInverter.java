package org.example.mapinterface.invertmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class MapInverter {

    public static <K, V> Map<V, List<K>> invertMap(Map<K, V> inputMap) {
        Map<V, List<K>> invertedMap = new HashMap<>();

        for (Map.Entry<K, V> entry : inputMap.entrySet()) {
            K key = entry.getKey();
            V value = entry.getValue();

            if (!invertedMap.containsKey(value)) {
                invertedMap.put(value, new ArrayList<>());
            }
            invertedMap.get(value).add(key);
        }

        return invertedMap;
    }
}
