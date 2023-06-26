package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.math.BigInteger;

@Entity
public class Employee {
    @Id
    private int employeeId;
    private String name;
    private int deptId;
    private int roleId;
    private BigInteger salary;

    public Employee(int employeeId, String name, int deptId, int roleId, BigInteger salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.deptId = deptId;
        this.roleId = roleId;
        this.salary = salary;
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

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public BigInteger getSalary() {
        return salary;
    }

    public void setSalary(BigInteger salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "employeeId=" + employeeId +
                ", name='" + name + '\'' +
                ", deptId=" + deptId +
                ", roleId=" + roleId +
                ", salary=" + salary +
                '}';
    }
}
