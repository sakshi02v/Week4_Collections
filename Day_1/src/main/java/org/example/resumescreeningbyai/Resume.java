package org.example.resumescreeningbyai;

import java.util.ArrayList;
import java.util.List;

class Resume<T extends JobRole> {
    private List<T> resumes = new ArrayList<>();

    public void addResume(T resume) {
        resumes.add(resume);
    }

    public T getResume(int index) {
        return resumes.get(index);
    }

    public void displayAllResumes() {
        for (T resume : resumes) {
            resume.displayRoleDetails();
        }
    }

    public void processResumes(List<? extends JobRole> resumes) {
        for (JobRole resume : resumes) {
            resume.displayRoleDetails();
        }
    }
}

