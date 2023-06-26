package org.practice;

import jakarta.persistence.Embeddable;

@Embeddable
public class Laptop {
    private int laptopId;
    private String laptopName;

    public Laptop(int laptopId, String laptopName) {
        this.laptopId = laptopId;
        this.laptopName = laptopName;
    }

    public Laptop() {

    }

    @Override
    public String toString() {
        return "Laptop{" +
                "laptopId=" + laptopId +
                ", laptopName='" + laptopName + '\'' +
                '}';
    }

    public int getLaptopId() {
        return laptopId;
    }

    public void setLaptopId(int laptopId) {
        this.laptopId = laptopId;
    }

    public String getLaptopName() {
        return laptopName;
    }

    public void setLaptopName(String laptopName) {
        this.laptopName = laptopName;
    }
}
