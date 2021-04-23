package com.company;

public class Worker extends Bee {
    public Worker(float health, boolean isAlive) {
        super(health, isAlive);

    }
    @Override
    public void Damage(int value) {
        float sum = 0;
        if(value > 100 || value < 0) {
            throw new IllegalArgumentException("Please enter a value between 0 - 100");
        }
        else if(super.getHealth() < 70) {
            System.out.println("Dead");
            super.setAlive(false);
        }
        else {
            this.setHealth(super.getHealth() - value);
            sum = super.getHealth();
            if(sum < 0) {
                super.setAlive(false);
                setHealth(0);
            }
            if(sum < 70 && sum >= 0) {
                System.out.println("Dead");
            }
            else  {
                System.out.println(sum);
            }
        }
    }



}
