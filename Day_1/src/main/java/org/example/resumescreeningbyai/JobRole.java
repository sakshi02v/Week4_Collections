package org.example.resumescreeningbyai;

abstract class JobRole {
    private String candidateName;
    private String experience;

    public JobRole(String candidateName, String experience) {
        this.candidateName = candidateName;
        this.experience = experience;
    }

    public String getCandidateName() {
        return candidateName;
    }

    public String getExperience() {
        return experience;
    }

    public abstract void displayRoleDetails();
}

class SoftwareEngineer extends JobRole {
    private String programmingLanguages;

    public SoftwareEngineer(String candidateName, String experience, String programmingLanguages) {
        super(candidateName, experience);
        this.programmingLanguages = programmingLanguages;
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Software Engineer: " + getCandidateName() + ", Experience: " + getExperience() + ", Programming Languages: " + programmingLanguages);
    }
}

class DataScientist extends JobRole {
    private String toolsAndTechnologies;

    public DataScientist(String candidateName, String experience, String toolsAndTechnologies) {
        super(candidateName, experience);
        this.toolsAndTechnologies = toolsAndTechnologies;
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Data Scientist: " + getCandidateName() + ", Experience: " + getExperience() + ", Tools and Technologies: " + toolsAndTechnologies);
    }
}

class ProductManager extends JobRole {
    private String methodologies;

    public ProductManager(String candidateName, String experience, String methodologies) {
        super(candidateName, experience);
        this.methodologies = methodologies;
    }

    @Override
    public void displayRoleDetails() {
        System.out.println("Product Manager: " + getCandidateName() + ", Experience: " + getExperience() + ", Methodologies: " + methodologies);
    }
}
