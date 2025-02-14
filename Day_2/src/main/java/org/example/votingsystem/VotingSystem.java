package org.example.votingsystem;

import java.util.*;

public class VotingSystem {

    private HashMap<String, Integer> votes = new HashMap<>();
    private TreeMap<Integer, List<String>> sortedResults = new TreeMap<>(Comparator.reverseOrder()); // Descending order
    private LinkedHashMap<String, Integer> voteOrder = new LinkedHashMap<>(); // Maintain vote order

    public void castVote(String candidate) {
        votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
        voteOrder.put(candidate, voteOrder.size() + 1); // Add vote and maintain order

        updateSortedResults(candidate);
    }

    private void updateSortedResults(String candidate) {
        int voteCount = votes.get(candidate);

        // Remove from previous count if exists
        for (Integer count : sortedResults.keySet()) {
            if (sortedResults.get(count).contains(candidate)) {
                sortedResults.get(count).remove(candidate);
                if (sortedResults.get(count).isEmpty()) {
                    sortedResults.remove(count);
                }
                break;
            }
        }

        // Add to new count
        if (!sortedResults.containsKey(voteCount)) {
            sortedResults.put(voteCount, new ArrayList<>());
        }
        sortedResults.get(voteCount).add(candidate);
    }


    public void displayResults() {
        System.out.println("Voting Results (Sorted by Votes - Descending):");
        for (Map.Entry<Integer, List<String>> entry : sortedResults.entrySet()) {
            for (String candidate : entry.getValue()) {
                System.out.println(candidate + ": " + entry.getKey() + " votes");
            }
        }
    }

    public void displayVoteOrder() {
        System.out.println("\nVote Order:");
        for (Map.Entry<String, Integer> entry : voteOrder.entrySet()) {
            System.out.println("Vote " + entry.getValue() + ": " + entry.getKey());
        }
    }

}
