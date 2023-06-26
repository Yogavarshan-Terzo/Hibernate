package org.practice;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import org.practice.Laptop;

@Entity
public class Student {
    @Id
    private int rollNo;
    private String name;
    private int marks;
    private Laptop laptop;

    public Student(int rollNo, String name, int marks, Laptop laptop) {
        this.rollNo = rollNo;
        this.name = name;
        this.marks = marks;
        this.laptop = laptop;
    }

    public int getRollNo() {
        return rollNo;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }



    @Override
    public String toString() {
        return "Student{" +
                "rollNo=" + rollNo +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                ", laptop=" + laptop +
                '}';
    }
}
