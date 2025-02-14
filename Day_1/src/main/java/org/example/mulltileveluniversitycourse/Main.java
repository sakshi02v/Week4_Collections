package org.example.mulltileveluniversitycourse;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Course<CourseType> courseCatalog = new Course<>();

        courseCatalog.addCourse(new ExamCourse("Math 101", "2025-05-20"));
        courseCatalog.addCourse(new AssignmentCourse("History 201", 5));
        courseCatalog.addCourse(new ResearchCourse("Physics 301", "Quantum Mechanics"));

        System.out.println("Displaying all courses:");
        courseCatalog.displayAllCourses();

        List<CourseType> courses = new ArrayList<>();
        courses.add(new ExamCourse("Biology 101", "2025-06-15"));
        courses.add(new AssignmentCourse("Art 102", 3));
        courses.add(new ResearchCourse("Chemistry 401", "Organic Chemistry"));

        System.out.println("Displaying courses from a list:");
        courseCatalog.displayCourses(courses);
    }
}

