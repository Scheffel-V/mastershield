package com.rpg.mastershield.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "character")
public class Character {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotNull
    private String name;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    @JsonBackReference
    private User user;

    @ManyToOne
    @JoinColumn(name = "class_name", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Class class_;

    @ManyToOne
    @JoinColumn(name = "race_name", nullable = false)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Race race;

    private String antecedent;
    private String trend;
    private int experiencePoints;
    private int level;

    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private Skills skills;

    @OneToOne(mappedBy = "character", cascade = CascadeType.ALL)
    private AbilityPoints abilityPoints;

    private int armorClass;
    private int initiative;
    private int healthPoints;
    private int maxHealthPoints;
    private int age;
    private int heigth;
    private int weight;

    @Enumerated(EnumType.STRING)
    private Color skinColor;

    @Enumerated(EnumType.STRING)
    private Color hairColor;

    @Enumerated(EnumType.STRING)
    private Color eyesColor;

    public Character(String name, User user, Class class_, Race race, String antecedent, String trend,
                     int experiencePoints, int level, Skills skills, AbilityPoints abilityPoints, int healthPoints,
                     int age, int heigth, int weight) {
        this.name = name;
        this.user = user;
        this.class_ = class_;
        this.race = race;
        this.antecedent = antecedent;
        this.trend = trend;
        this.experiencePoints = experiencePoints;
        this.level = level;
        this.skills = skills;
        this.abilityPoints = abilityPoints;
        this.armorClass = 10;
        this.initiative = 0;
        this.healthPoints = healthPoints;
        this.maxHealthPoints = healthPoints;
        this.age = age;
        this.heigth = heigth;
        this.weight = weight;
        this.skinColor = Color.BLACK;
        this.hairColor = Color.BLACK;
        this.eyesColor = Color.BLACK;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAntecedent() {
        return antecedent;
    }

    public void setAntecedent(String antecedent) {
        this.antecedent = antecedent;
    }

    public String getTrend() {
        return trend;
    }

    public void setTrend(String trend) {
        this.trend = trend;
    }

    public int getExperiencePoints() {
        return experiencePoints;
    }

    public void setExperiencePoints(int experiencePoints) {
        this.experiencePoints = experiencePoints;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public Skills getSkills() {
        return skills;
    }

    public void setSkills(Skills skills) {
        this.skills = skills;
    }

    public AbilityPoints getAbilityPoints() {
        return abilityPoints;
    }

    public void setAbilityPoints(AbilityPoints abilityPoints) {
        this.abilityPoints = abilityPoints;
    }

    public int getArmorClass() {
        return armorClass;
    }

    public void setArmorClass(int armorClass) {
        this.armorClass = armorClass;
    }

    public int getInitiative() {
        return initiative;
    }

    public void setInitiative(int initiative) {
        this.initiative = initiative;
    }

    public int getHealthPoints() {
        return healthPoints;
    }

    public void setHealthPoints(int healthPoints) {
        this.healthPoints = healthPoints;
    }

    public int getMaxHealthPoints() {
        return maxHealthPoints;
    }

    public void setMaxHealthPoints(int maxHealthPoints) {
        this.maxHealthPoints = maxHealthPoints;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeigth() {
        return heigth;
    }

    public void setHeigth(int heigth) {
        this.heigth = heigth;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public Color getSkinColor() {
        return skinColor;
    }

    public void setSkinColor(Color skinColor) {
        this.skinColor = skinColor;
    }

    public Color getHairColor() {
        return hairColor;
    }

    public void setHairColor(Color hairColor) {
        this.hairColor = hairColor;
    }

    public Color getEyesColor() {
        return eyesColor;
    }

    public void setEyesColor(Color eyesColor) {
        this.eyesColor = eyesColor;
    }
}
