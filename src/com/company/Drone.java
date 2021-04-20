package com.company;

public class Drone extends Bee {

    public Drone(float health) {
        super(health);
    }

    @Override
    public void Damage(int value) {
        float sum = 0;
        if(value > 100 || value < 0) {
            throw new IllegalArgumentException("Please enter a value between 0 - 100");
        }
        else {
            super.setHealth(super.getHealth() - value);
            sum = super.getHealth();
            if(sum < 50) {
                printMessage();
            }
            else  {
                System.out.println(sum);
            }
        }
    }

    @Override
    public void printMessage() {
        System.out.println("Dead");
    }

}


