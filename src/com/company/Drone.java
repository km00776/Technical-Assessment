package com.company;

public class Drone extends Bee {

    public Drone(float health, boolean isAlive) {
        super(health, isAlive);
    }

    @Override
    public void Damage(int value) {
        float sum = 0;
        if(value > 100 || value < 0) {
            throw new IllegalArgumentException("Please enter a value between 0 - 100");
        }
        else if(super.getHealth() < 20) {
            System.out.println("Dead");
            super.setAlive(false);
        }
        else {
            super.setHealth(super.getHealth() - value);
            sum = super.getHealth();
            if(sum < 20) {
                System.out.println("Dead");
                super.setAlive(false);
            }
//            if(sum < 0) {
//                super.setAlive(false);
//                setHealth(0);
//            }
            else  {
                System.out.println(sum);
            }
        }

    }

}


