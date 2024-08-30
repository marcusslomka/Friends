package de.supercode.friends.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;

import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue
    private int id;

    @Column(unique = true)
    private String name;

    @OneToMany
    List<Friend> friends;

    public List<Friend> getFriends() {
        return friends;
    }

    public void addFriends(Friend friend) {
        this.friends.add(friend);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
