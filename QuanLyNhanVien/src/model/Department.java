package model;

import java.util.ArrayList;
import java.util.List;

public class Department {
    private String departmentId, departmentName, departmentAddress;
    private List<Employee> employees = new ArrayList<>();

    public Department(String id, String name, String address) {
        this.departmentId = id;
        this.departmentName = name;
        this.departmentAddress = address;
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void showEmployees() {
        for (Employee e : employees) {
            e.showInfo();
        }
    }

    public double getTotalSalary() {
        return employees.stream().mapToDouble(Employee::calculateSalary).sum();
    }
}
