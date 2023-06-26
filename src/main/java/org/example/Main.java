package org.example;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.practice.Laptop;
import org.practice.Student;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Role role = new Role(10,"Developer");
        Role role1 = new Role(11,"Analyst");
        Role role2 = new Role(12,"Manager");
        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Role.class);

        SessionFactory sf = configuration.buildSessionFactory();
        Session  session = sf.openSession();
        Transaction transaction = session.beginTransaction();
        session.save(role);
        session.save(role1);
        session.save(role2);
        transaction.commit();
        session.close();
    }
}