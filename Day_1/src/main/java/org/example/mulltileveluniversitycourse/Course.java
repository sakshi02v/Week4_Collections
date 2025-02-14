package org.example.mulltileveluniversitycourse;

import java.util.ArrayList;
import java.util.List;

class Course<T extends CourseType> {
    private List<T> courses = new ArrayList<>();

    public void addCourse(T course) {
        courses.add(course);
    }

    public T getCourse(int index) {
        return courses.get(index);
    }

    public void displayAllCourses() {
        for (T course : courses) {
            course.displayDetails();
        }
    }

    public void displayCourses(List<? extends CourseType> courses) {
        for (CourseType course : courses) {
            course.displayDetails();
        }
    }
}
