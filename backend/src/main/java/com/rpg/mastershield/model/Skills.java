package com.rpg.mastershield.model;

import javax.persistence.*;

@Entity
@Table(name = "skills")
public class Skills {

    @Id
    private long id;

    @OneToOne
    @MapsId
    private Character character;

    private int acrobatics;
    private int arcanism;
    private int athletics;
    private int acting;
    private int bluff;
    private int stealth;
    private int history;
    private int bully;
    private int institution;
    private int research;
    private int handleAnimals;
    private int medicine;
    private int nature;
    private int perception;
    private int persuasion;
    private int sleightOfHand;
    private int religion;
    private int survival;

    public Skills() {

    }

    public Skills(int acrobatics, int arcanism, int athletics, int acting, int bluff, int stealth, int history,
                  int bully, int institution, int research, int handleAnimals, int medicine, int nature, int perception,
                  int persuasion, int sleightOfHand, int religion, int survival) {
        this.acrobatics = acrobatics;
        this.arcanism = arcanism;
        this.athletics = athletics;
        this.acting = acting;
        this.bluff = bluff;
        this.stealth = stealth;
        this.history = history;
        this.bully = bully;
        this.institution = institution;
        this.research = research;
        this.handleAnimals = handleAnimals;
        this.medicine = medicine;
        this.nature = nature;
        this.perception = perception;
        this.persuasion = persuasion;
        this.sleightOfHand = sleightOfHand;
        this.religion = religion;
        this.survival = survival;
    }

    public long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Character getCharacter() {
        return this.character;
    }

    public void setCharacter(Character character) {
        this.character = character;
    }

    public int getAcrobatics() {
        return acrobatics;
    }

    public void setAcrobatics(int acrobatics) {
        this.acrobatics = acrobatics;
    }

    public int getArcanism() {
        return arcanism;
    }

    public void setArcanism(int arcanism) {
        this.arcanism = arcanism;
    }

    public int getAthletics() {
        return athletics;
    }

    public void setAthletics(int athletics) {
        this.athletics = athletics;
    }

    public int getActing() {
        return acting;
    }

    public void setActing(int acting) {
        this.acting = acting;
    }

    public int getBluff() {
        return bluff;
    }

    public void setBluff(int bluff) {
        this.bluff = bluff;
    }

    public int getStealth() {
        return stealth;
    }

    public void setStealth(int stealth) {
        this.stealth = stealth;
    }

    public int getHistory() {
        return history;
    }

    public void setHistory(int history) {
        this.history = history;
    }

    public int getBully() {
        return bully;
    }

    public void setBully(int bully) {
        this.bully = bully;
    }

    public int getInstitution() {
        return institution;
    }

    public void setInstitution(int institution) {
        this.institution = institution;
    }

    public int getResearch() {
        return research;
    }

    public void setResearch(int research) {
        this.research = research;
    }

    public int getHandleAnimals() {
        return handleAnimals;
    }

    public void setHandleAnimals(int handleAnimals) {
        this.handleAnimals = handleAnimals;
    }

    public int getMedicine() {
        return medicine;
    }

    public void setMedicine(int medicine) {
        this.medicine = medicine;
    }

    public int getNature() {
        return nature;
    }

    public void setNature(int nature) {
        this.nature = nature;
    }

    public int getPerception() {
        return perception;
    }

    public void setPerception(int perception) {
        this.perception = perception;
    }

    public int getPersuasion() {
        return persuasion;
    }

    public void setPersuasion(int persuasion) {
        this.persuasion = persuasion;
    }

    public int getSleightOfHand() {
        return sleightOfHand;
    }

    public void setSleightOfHand(int sleightOfHand) {
        this.sleightOfHand = sleightOfHand;
    }

    public int getReligion() {
        return religion;
    }

    public void setReligion(int religion) {
        this.religion = religion;
    }

    public int getSurvival() {
        return survival;
    }

    public void setSurvival(int survival) {
        this.survival = survival;
    }
}
