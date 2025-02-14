package org.example.mapinterface.groupobjectsbyproperty;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Department {
    String name;

    public Department(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    // Important: Override equals() and hashCode() for proper Map key behavior
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Department that = (Department) obj;
        return name.equals(that.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}

class Employee {
    String name;
    Department department;

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return name + " (" + department + ")";
    }
}


public class Grouping {

    public static Map<Department, List<Employee>> groupByDepartment(List<Employee> employees) {
        Map<Department, List<Employee>> groupedEmployees = new HashMap<>();

        if (employees == null) {  // Handle null input list
            return groupedEmployees; // Or you could throw an IllegalArgumentException if you prefer
        }

        for (Employee employee : employees) {
            if (employee != null && employee.department != null) { // Check for null employee AND department
                Department department = employee.department;

                if (!groupedEmployees.containsKey(department)) {
                    groupedEmployees.put(department, new ArrayList<>());
                }

                groupedEmployees.get(department).add(employee);
            }
        }

        return groupedEmployees;
    }


}
