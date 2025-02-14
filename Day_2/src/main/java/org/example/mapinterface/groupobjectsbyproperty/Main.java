package org.example.mapinterface.groupobjectsbyproperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static org.example.mapinterface.groupobjectsbyproperty.Grouping.groupByDepartment;

public class Main{
    public static void main(String[] args) {
        Department hr = new Department("HR");
        Department it = new Department("IT");
        Department sales = new Department("Sales");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Alice", hr));
        employees.add(new Employee("Bob", it));
        employees.add(new Employee("Carol", hr));
        employees.add(new Employee("David", it));
        employees.add(new Employee("Eve", sales));


        Map<Department, List<Employee>> grouped = groupByDepartment(employees);
        System.out.println(grouped);
        /*
        Output:
        {HR=[Alice (HR), Carol (HR)], IT=[Bob (IT), David (IT)], Sales=[Eve (Sales)]}
        */

        List<Employee> emptyEmployees = new ArrayList<>();
        Map<Department, List<Employee>> groupedEmpty = groupByDepartment(emptyEmployees);
        System.out.println(groupedEmpty); //Output: {}

        List<Employee> nullEmployees = null;
        Map<Department, List<Employee>> groupedNull = groupByDepartment(nullEmployees);
        System.out.println(groupedNull); //Output: {}

    }
}

