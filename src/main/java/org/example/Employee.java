package org.example;

import jakarta.persistence.*;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String name;
    @ManyToOne
    private Department department;
    @ManyToOne
    private Role role;
    private int salary;

    public Employee(int employeeId, String name, Department department, Role role, int salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.role = role;
        this.salary = salary;
    }

    public Employee() {

    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", department=" + department +
                ", role=" + role +
                ", salary=" + salary +
                '}';
    }
}
