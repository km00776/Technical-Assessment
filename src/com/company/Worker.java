package com.company;

public class Worker extends Bee {

    public Worker(float health) {
        super(health);
    }

    @Override
    public void Damage(int value) {
        if(value > 100 || value < 0) {
            throw new IllegalArgumentException("Please enter a value between 0 - 100");
        }
        else if(super.getHealth() < 70) {
            System.out.println("Dead");
        }
        else {
            super.setHealth(super.getHealth() - value);
        }
    }


}
