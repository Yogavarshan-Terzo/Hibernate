package org.example;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Role {
    @Id
    private int roleId;
    private String roleName;
    @OneToMany(mappedBy = "role")
    private List<Employee> employeeList = new ArrayList<Employee>();
    public Role(int roleId, String roleName,List<Employee> employeeList) {
        this.roleId = roleId;
        this.roleName = roleName;
        this.employeeList = employeeList;
    }

    public Role() {

    }

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleId=" + roleId +
                ", roleName='" + roleName + '\'' +
                ", employeeList=" + employeeList +
                '}';
    }
}
