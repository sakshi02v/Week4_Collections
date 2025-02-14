package org.example.listinterface.elementsfrequencyfinding;

import java.util.List;
import java.util.Map;

import static org.example.listinterface.elementsfrequencyfinding.FrequencyCounter.countFrequencies;

public class Main{
public static void main(String[] args) {
    List<String> inputList = List.of("apple", "banana", "apple", "orange", "banana", "apple");
    Map<String, Integer> frequencies = countFrequencies(inputList);
    System.out.println(frequencies); // Output: {apple=3, banana=2, orange=1}

    List<String> emptyList = List.of();
    Map<String, Integer> emptyFrequencies = countFrequencies(emptyList);
    System.out.println(emptyFrequencies); // Output: {}

    List<String> nullList = null;
    Map<String, Integer> nullFrequencies = countFrequencies(nullList);
    System.out.println(nullFrequencies); // Output: {}

}
}