package org.example.mulltileveluniversitycourse;

abstract class CourseType {
    private String courseName;

    public CourseType(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseName() {
        return courseName;
    }

    public abstract void displayDetails();
}

class ExamCourse extends CourseType {
    private String examDate;

    public ExamCourse(String courseName, String examDate) {
        super(courseName);
        this.examDate = examDate;
    }

    @Override
    public void displayDetails() {
        System.out.println("Exam Course: " + getCourseName() + ", Exam Date: " + examDate);
    }
}

class AssignmentCourse extends CourseType {
    private int numberOfAssignments;

    public AssignmentCourse(String courseName, int numberOfAssignments) {
        super(courseName);
        this.numberOfAssignments = numberOfAssignments;
    }

    @Override
    public void displayDetails() {
        System.out.println("Assignment Course: " + getCourseName() + ", Number of Assignments: " + numberOfAssignments);
    }
}

class ResearchCourse extends CourseType {
    private String researchTopic;

    public ResearchCourse(String courseName, String researchTopic) {
        super(courseName);
        this.researchTopic = researchTopic;
    }

    @Override
    public void displayDetails() {
        System.out.println("Research Course: " + getCourseName() + ", Research Topic: " + researchTopic);
    }
}

