package com.company;

/*
    1. Provides basic implementation that can be used by derived classes
    2. As Bee has multiple derived classes (Worker, Queen and Drone) I believe it would be best to keep Bee as an abstract class
    3. Can add more behaviour without breaking the code

 */

 abstract public class Bee {
    // Properties of bee

     // initial health will be set to 100;
     // field to be private and to be updated and accessed using getters and setters
     // float used as specified by the requirements
     private float health = 100;


     // by default all types of bees will be alive.
     private boolean isAlive = true;


     // constructor
     // each child has properties of health and the 'state' of the bee.
     // default value of Bee cannot be override outside
    public Bee(float health, boolean isAlive) {
        super();
        this.health = 100;
        this.isAlive = isAlive;
    }


    // returns currentState of all the types of Bees
     public boolean isAlive() {
         return isAlive;
     }

     // change the state of the Bee
     public void setAlive(boolean alive) {
         isAlive = alive;
     }

     // call this method to change the health upon calling the Damage() method.
     public void setHealth(float health) {
        this.health = health;
    }
    // this method will obtain current Health, should always be above 0.0;
     public float getHealth() {
        return health;
    }
    // abstract method to be implement by all the child classes (Worker, Queen, Drone)
     // void method, because the health to be changed
     public abstract void Damage(int value);







}
