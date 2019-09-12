package com.rpg.mastershield.model;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @NotNull
    private String playerName;

    @ManyToOne
    @JoinColumn(name = "class_name", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Class class_;

    @ManyToOne
    @JoinColumn(name = "class_name", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Race race;

    public Character(String name, String playerName, Class class_, Race race) {
        this.name = name;
        this.playerName = playerName;
        this.class_ = class_;
        this.race = race;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public Class getClass_() {
        return this.class_;
    }

    public void setClass_(Class class_) {
        this.class_ = class_;
    }

    public Race getRace() {
        return this.race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
