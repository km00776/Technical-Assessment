package com.company;

 abstract public class Bee {

    private float health = 100;

    private boolean isDead = false;

    public Bee(float health) {
        this.health = 100;

    }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getHealth() {
        return health;
    }

    public abstract void Damage(int value);

    public abstract void printMessage();





}
