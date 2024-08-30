package de.supercode.friends.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String firstName;
    private String lastName;
    private Date geburtstag;
    private String handynummer;
    private String email;
    private String beruf;
    private long verdienst;
    private boolean goodAtVolleyball;
    private Group group;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getGeburtstag() {
        return geburtstag;
    }

    public void setGeburtstag(Date geburtstag) {
        this.geburtstag = geburtstag;
    }

    public String getHandynummer() {
        return handynummer;
    }

    public void setHandynummer(String handynummer) {
        this.handynummer = handynummer;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getBeruf() {
        return beruf;
    }

    public void setBeruf(String beruf) {
        this.beruf = beruf;
    }

    public long getVerdienst() {
        return verdienst;
    }

    public void setVerdienst(long verdienst) {
        this.verdienst = verdienst;
    }

    public boolean isGoodAtVolleyball() {
        return goodAtVolleyball;
    }

    public void setGoodAtVolleyball(boolean goodAtVolleyball) {
        this.goodAtVolleyball = goodAtVolleyball;
    }
    public boolean getGoodAtVolleyball(){
        return this.goodAtVolleyball;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Friends{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", geburtstag=" + geburtstag +
                ", handynummer='" + handynummer + '\'' +
                ", email='" + email + '\'' +
                ", beruf='" + beruf + '\'' +
                ", verdienst='" + verdienst + '\'' +
                ", goodAtVolleyball=" + goodAtVolleyball +
                '}';
    }
}
