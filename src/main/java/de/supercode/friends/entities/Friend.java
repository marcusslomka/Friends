package de.supercode.friends.entities;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    public Friend(long id, String firstName, String lastName, Date geburtstag) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.geburtstag = geburtstag;
    }

    private String firstName;
    private String lastName;
    private Date geburtstag;
    private String handynummer;
    private String email;
    private String beruf;
    private String verdienst;
    private boolean goodAtVolleyball;

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

    public String getVerdienst() {
        return verdienst;
    }

    public void setVerdienst(String verdienst) {
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
