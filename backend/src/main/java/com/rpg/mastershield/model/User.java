package com.rpg.mastershield.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Table(name = "users")
public class User {

    @Id
    @GeneratedValue(strategy =  GenerationType.IDENTITY)
    private Long id;

    @NotNull
    @Size(max = 100)
    @Column(unique = true)
    private String username;

    @NotNull
    @Size(max = 100)
    private String password;

    @OneToMany(mappedBy = "user")
    @JsonManagedReference
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Character> characters;

    public User() { }

    public User(long id, String username, String password) {
        super();
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<Character> getCharacters() {
        return this.characters;
    }

    public void setCharacters(List<Character> characters) {
        this.characters = characters;
    }

    public String toString() {
        return "ID:" + this.getId().toString() + " USERNAME:" + this.getUsername() + " PASSWORD: " + this.getPassword();
    }
}
