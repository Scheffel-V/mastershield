package com.rpg.mastershield.model;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Class {

    @NotNull
    @Id
    @Column(unique = true)
    @Size(max = 100)
    private String name;

    public Class(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
