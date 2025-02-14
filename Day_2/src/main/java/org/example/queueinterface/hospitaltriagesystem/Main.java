package org.example.queueinterface.hospitaltriagesystem;

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main{
    public static void main(String[] args) {
        // Create a PriorityQueue with a custom Comparator to prioritize by severity (highest first)
        PriorityQueue<HospitalTriage.Patient> triageQueue = new PriorityQueue<>(Comparator.comparingInt(p -> -p.severity));

        // Add patients to the queue
        triageQueue.offer(new HospitalTriage.Patient("John", 3));
        triageQueue.offer(new HospitalTriage.Patient("Alice", 5));
        triageQueue.offer(new HospitalTriage.Patient("Bob", 2));
        triageQueue.offer(new HospitalTriage.Patient("David", 4));
        triageQueue.offer(new HospitalTriage.Patient("Eve", 1));


        System.out.println("Triage Queue:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll()); // Process patients in order of severity
        }

        //Example to show how to add a patient to the queue
        HospitalTriage.Patient newPatient = new HospitalTriage.Patient("Charlie", 6);
        triageQueue.offer(newPatient);
        System.out.println("\nAdd new patient to the queue: " + newPatient);

        System.out.println("\nTriage Queue after adding new patient:");
        while (!triageQueue.isEmpty()) {
            System.out.println(triageQueue.poll()); // Process patients in order of severity
        }


    }
}

