package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.practice.Laptop;
import org.practice.Student;

import java.math.BigInteger;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(100,"Yusvanth", 0,10, 40000);
        Employee employee1 = new Employee(101,"Yogavarshan",1,11,30000);
        Employee employee2 = new Employee(102,"Gokul",2,12,40000);
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Employee.class);

        SessionFactory sf = configuration.buildSessionFactory();
        Session  session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(employee);
        session.save(employee1);
        session.save(employee2);
        transaction.commit();
        session.close();
        session.close();
    }
}