package com.company;

 abstract public class Bee {

     private float health = 0;
     private boolean isAlive = true;


    public Bee(float health, boolean isAlive) {
        this.health = 100;
        this.isAlive = isAlive;
    }


     public boolean isAlive() {
         return isAlive;
     }

     public void setAlive(boolean alive) {
         isAlive = alive;
     }

    public void setHealth(float health) {
        this.health = health;
    }

    public float getHealth() {
        return health;
    }

    public abstract void Damage(int value);







}
