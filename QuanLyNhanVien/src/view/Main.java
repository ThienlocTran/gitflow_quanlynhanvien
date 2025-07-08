package view;

import model.*;

public class Main {
    public static void main(String[] args) {
        Department d = new Department("D01", "Phòng Kế Toán", "Tầng 2");

        d.addEmployee(new Staff("E01", "An", 25, "HN", 6000000, "D01"));
        d.addEmployee(new ViceManager("E02", "Bình", 30, "HCM", 7000000, "D01"));
        d.addEmployee(new Manager("E03", "Cường", 35, "ĐN", 8000000, "D01"));

        d.showEmployees();
        System.out.println("Tổng lương phòng: " + d.getTotalSalary());
    }
}
