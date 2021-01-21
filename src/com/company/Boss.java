package com.company;

public class Boss {
    private int health;
    private int domage;
    private String typeOfProtection;


    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDomage() {
        return domage;
    }

    public void setDomage(int domage) {
        this.domage = domage;
    }

    public String getTypeOfProtection() {
        return typeOfProtection;
    }

    public void setTypeOfProtection(String typeOfProtection) {
        this.typeOfProtection = typeOfProtection;
    }

    public String info(){
        return health+" "+domage+" "+typeOfProtection;
    }
}
