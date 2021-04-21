package com.company;

public class Queen extends Bee {
    public Queen(float health) {
        super(health);
    }

    @Override
    public void Damage(int value) {
        if(value > 100 || value < 0) {
            throw new IllegalArgumentException("Please enter a value between 0 - 100");
        }
        else if(super.getHealth() < 70) {
            super.setHealth(-1);
        }
        else {
            super.setHealth(super.getHealth() - value);
        }
    }
    // assessment says floating point






}
