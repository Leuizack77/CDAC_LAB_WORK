// Employee.java
package com.Inheritance.beans;

import java.time.LocalDate;

public abstract class Employee {
    protected static int idCounter = 1000;
    protected int id;
    protected String name, mobile, email, department, designation;
    protected LocalDate dateOfJoining;

    public Employee(String name, String mobile, String email, String department, String designation, LocalDate doj) {
        this.id = idCounter++;
        this.name = name;
        this.mobile = mobile;
        this.email = email;
        this.department = department;
        this.designation = designation;
        this.dateOfJoining = doj;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }

    public abstract double calculateSalary();

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Designation: " + designation;
    }
}
