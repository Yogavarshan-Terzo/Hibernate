package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.practice.Laptop;
import org.practice.Student;

import java.math.BigInteger;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Department.class);
        configuration.addAnnotatedClass(Role.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session  session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createQuery("from Employee ");
        List<Employee> employeeList = query.list();
        query = session.createQuery("from Department ");
        List<Department> departmentList = query.list();
        query = session.createQuery("from Role ");
        List<Role> roleList = query.list();
        transaction.commit();
        session.close();
        for(Employee employee : employeeList){
            System.out.println(employee.toString());
        }
        for(Department dept : departmentList){
            System.out.println(dept.toString());
        }
        for(Role role:roleList){
            System.out.println(role.toString());
        }
    }
}