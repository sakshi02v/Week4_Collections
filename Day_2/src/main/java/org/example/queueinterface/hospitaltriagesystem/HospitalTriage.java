package org.example.queueinterface.hospitaltriagesystem;

import java.util.PriorityQueue;
import java.util.Comparator;

public class HospitalTriage {

    // Inner class to represent a patient
    static class Patient {
        String name;
        int severity;

        public Patient(String name, int severity) {
            this.name = name;
            this.severity = severity;
        }

        @Override
        public String toString() {
            return name + " (Severity: " + severity + ")";
        }
    }
}
