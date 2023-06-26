package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Department {
    @Id
    private int deptId;
    private String deptName;
    @OneToMany(mappedBy = "department")
    private List<Employee> employeeList;
    public Department(int deptId, String deptName, List<Employee> employeeList) {
        this.deptId = deptId;
        this.deptName = deptName;
        this.employeeList = employeeList;
    }

    public Department() {

    }

    public int getDeptId() {
        return deptId;
    }

    public void setDeptId(int deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Department{" +
                "deptId=" + deptId +
                ", deptName='" + deptName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
