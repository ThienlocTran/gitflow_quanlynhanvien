package model;

public abstract class Employee {
    protected String id, name, address, position, departmentId;
    protected int age;
    protected double baseSalary;

    public Employee(String id, String name, int age, String address, double baseSalary, String position, String departmentId) {
        this.id = id; this.name = name; this.age = age;
        this.address = address; this.baseSalary = baseSalary;
        this.position = position; this.departmentId = departmentId;
    }

    public abstract double calculateSalary();

    public void showInfo() {
        System.out.println("ID: " + id + ", Name: " + name + ", Salary: " + calculateSalary());
    }
}
