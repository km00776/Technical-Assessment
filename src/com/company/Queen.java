package com.company;

public class Queen extends Bee {
    public Queen(float health, boolean isAlive) {
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
            if(sum < 0) {
                super.setAlive(false);
                setHealth(0);
            }
            if(sum < 20 && sum >= 0) {
                System.out.println("Dead");
                super.setAlive(false);
            }
            else  {
                System.out.println(sum);
            }
        }
    }




}
