package org.practice;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Alien {
    @Id
    private int aid;
    private AlienName aname;

    public Alien(int aid, AlienName aname, String acolour) {
        this.aid = aid;
        this.aname = aname;
        this.acolour = acolour;
    }

    public AlienName getAname() {
        return aname;
    }

    public void setAname(AlienName aname) {
        this.aname = aname;
    }

    private String acolour;
    public int getAid() {
        return aid;
    }
    public void setAid(int aid) {
        this.aid = aid;
    }

    public String getAcolour() {
        return acolour;
    }
    public void setAcolour(String acolour) {
        this.acolour = acolour;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "aid=" + aid +
                ", aname='" + aname + '\'' +
                ", acolour='" + acolour + '\'' +
                '}';
    }
}