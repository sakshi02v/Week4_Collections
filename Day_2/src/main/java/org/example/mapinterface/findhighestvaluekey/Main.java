package org.example.mapinterface.findhighestvaluekey;

import java.util.HashMap;
import java.util.Map;

import static org.example.mapinterface.findhighestvaluekey.HighestKeyValue.findKeyWithMaxValue;

public class Main{
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("A", 10);
        map.put("B", 20);
        map.put("C", 15);

        String maxKey = findKeyWithMaxValue(map);
        System.out.println("Key with maximum value: " + maxKey); // Output: B

        Map<String, Integer> map2 = new HashMap<>();
        map2.put("apple", 5);
        map2.put("banana", 12);
        map2.put("cherry", 8);

        String maxKey2 = findKeyWithMaxValue(map2);
        System.out.println("Key with maximum value: " + maxKey2); // Output: banana

        Map<String, Integer> emptyMap = new HashMap<>();
        String maxKeyEmpty = findKeyWithMaxValue(emptyMap);
        System.out.println("Key with maximum value (empty map): " + maxKeyEmpty); // Output: null

        Map<String, Integer> nullMap = null;
        String maxKeyNull = findKeyWithMaxValue(nullMap);
        System.out.println("Key with maximum value (null map): " + maxKeyNull); // Output: null

    }
}

