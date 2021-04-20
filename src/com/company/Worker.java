package com.company;

public class Worker extends Bee {

    public Worker(float health) {
        super(health);

    }

    @Override
    public void Damage(int value) {
        float sum = 0;
        if(value > 100 || value < 0) {
            throw new IllegalArgumentException("Please enter a value between 0 - 100");
        }
        else {
            setHealth(getHealth() - value);
            sum = getHealth();
            if(sum < 70) {
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
