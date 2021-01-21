package com.company;

public class Hero {
    private int health;
    private int domage;
    private String superpowers;


    public Hero(int health, int domage, String superpowers) {
        this.health = health;
        this.domage = domage;
        this.superpowers = superpowers;
    }

    public Hero(int domage, int health) {
        this.domage = domage;
        this.health = health;
    }

    public int getHealth() {
        return health;
    }

    public int getDomage() {
        return domage;
    }

    public String getSuperpowers() {
        return superpowers;
    }
}
