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



        Configuration configuration = new Configuration().configure("hibernate.cfg.xml");
        configuration.addAnnotatedClass(Student.class);

        SessionFactory sf = configuration.buildSessionFactory();
        Session  session = sf.openSession();
        Query query = session.createQuery("");
                Transaction transaction = session.beginTransaction();
        transaction.commit();
    }
}