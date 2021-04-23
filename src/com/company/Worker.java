package com.company;

// Worker is a subclass that inherits from the super-class Bee
public class Worker extends Bee {
    public Worker(float health, boolean isAlive) {
        // Worker will inherit health and state properties from bee class
        super(health, isAlive);

    }
    // As the threshold for a bee to be defined differs for all three bees, this has been amended for all the classes

    @Override
    // takes an int as specified by the requirement

    public void Damage(int value) {
        float sum = 0;
        // Value needs to be within valid bounds, otherwise throw an exception.

        if(value > 100 || value < 0) {
            throw new IllegalArgumentException("Please enter a value between 0 - 100");
        }
        // As the Worker is pronounced to be dead below 70, the state of the worker will now be declared dead (false --> no longer alive)

        else if(super.getHealth() < 70) {
            System.out.println("Dead");
            // as it is below 70, the specific Worker bee is no longer alive
            super.setAlive(false);
        }
        else {
            // reduce the health by the value, the current health - the value provided
            this.setHealth(super.getHealth() - value);
            // obtain the new health again
            sum = super.getHealth();
            // the current sum is less than 0, mark as dead, and by default the health bar should be 0 (otherwise it will go to a negative value, which is logically wrong)

            if(sum < 0) {
                super.setAlive(false);
                // sets the health to 0

                setHealth(0);
            }
            // if the sum is less than the threshold value but the current health is still greater than 0, update the health, but pronounce the be to be dead
            if(sum < 70 && sum >= 0) {
                System.out.println("Dead");
                super.setAlive(false);
            }
            else  {
                // for debugging purposes, to see if the sums are calculated properly
                System.out.println(sum);
            }
        }
    }



}
