package org.example.resumescreeningbyai;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Resume<JobRole> resumeScreening = new Resume<>();

        resumeScreening.addResume(new SoftwareEngineer("Alice", "5 years", "Java, Python"));
        resumeScreening.addResume(new DataScientist("Bob", "3 years", "R, Python, SQL"));
        resumeScreening.addResume(new ProductManager("Charlie", "7 years", "Agile, Scrum"));

        System.out.println("Displaying all resumes:");
        resumeScreening.displayAllResumes();

        List<JobRole> resumes = new ArrayList<>();
        resumes.add(new SoftwareEngineer("Dave", "4 years", "C++, Go"));
        resumes.add(new DataScientist("Eve", "6 years", "Hadoop, Spark"));
        resumes.add(new ProductManager("Frank", "5 years", "Lean, Kanban"));

        System.out.println("Processing resumes from a list:");
        resumeScreening.processResumes(resumes);
    }
}
