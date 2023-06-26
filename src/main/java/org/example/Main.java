package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.practice.Laptop;
import org.practice.Student;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        List<Employee> employeeList = new ArrayList<>();
        Department department = new Department(2,"Manager",employeeList);
        Role role = new Role(13,"Junior",employeeList);
        Employee employee = new Employee(101,"Gokul",department,role,5000);
        employeeList.add(employee);
        employee = new Employee(102,"Yogavarshan",department,role,4000);
        employeeList.add(employee);


        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);
        configuration.addAnnotatedClass(Department.class);
        configuration.addAnnotatedClass(Role.class);
        SessionFactory sf = configuration.buildSessionFactory();
        Session  session = sf.openSession();
        Transaction transaction = session.beginTransaction();

        for(Employee e : employeeList){
            session.save(e);
        }

        transaction.commit();
        session.close();
    }
}