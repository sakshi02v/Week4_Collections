package org.example.listinterface.elementsfrequencyfinding;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyCounter {

    public static Map<String, Integer> countFrequencies(List<String> strings) {
        Map<String, Integer> frequencyMap = new HashMap<>();

        if (strings == null || strings.isEmpty()) {
            return frequencyMap; // Handle empty or null input
        }

        for (String str : strings) {
            // Efficiently update counts:
            frequencyMap.put(str, frequencyMap.getOrDefault(str, 0) + 1);

            // The older way (less efficient):
            /*
            if (frequencyMap.containsKey(str)) {
                frequencyMap.put(str, frequencyMap.get(str) + 1);
            } else {
                frequencyMap.put(str, 1);
            }
            */
        }

        return frequencyMap;
    }
}
