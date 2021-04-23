package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener  {
    // initialise capacity to 10 per document
    private Worker [] workerBees = new Worker[10];
    // initialise capacity to 10 per document
    private Queen [] queenBees = new Queen[10];
    // initialise capacity to 10 per document
    private Drone [] droneBees = new Drone[10];
    // Create 10 labels for queenBees, which will show the current health
    private JLabel [] queenLabels = new JLabel[queenBees.length];
    // Create 10 labels for workerBees, which will show the current health
    private JLabel [] workerLabels = new JLabel[workerBees.length];
    // Create 10 labels for droneBees, which will show the current health
    private JLabel [] droneLabels = new JLabel[droneBees.length];
    private JPanel panel;
    private JButton button1;

    public GUI() {
        // upon calling the constructor create the 10 instances each of drone, worker and Queen bees.
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("Bee Application GUI");
//        frame.pack();
        frame.setVisible(true);

        // Go through the array of workerBees and add 10 instances of working bees
        for(int i = 0; i < workerBees.length; i++) {
            workerBees[i] = new Worker(100, true);
        }
        // Go through the array of queenBees and add 10 instances of queenBees
        for(int i = 0; i < queenBees.length; i++) {
            queenBees[i] = new Queen(100, true);
        }
        // Go through the array of droneBees and add 10 instances of dronebees
        for(int i = 0; i < droneBees.length; i++) {
            droneBees[i] = new Drone(100, true);
        }
        // get the current health of each of the current queenBees for each of the 10 instances of the queenBees
        for(int i = 0; i < queenLabels.length; i++) {
            queenLabels[i] = new JLabel("Queen Bee Heatlh " + String.valueOf(i + 1) + " " + queenBees[i].getHealth() + "%");
            panel.add(queenLabels[i]);
        }
        // get the current health of each of the current workerBees for each of the 10 instances of the workerBees
        for(int i = 0; i < workerLabels.length; i++) {
            workerLabels[i] = new JLabel("Worker Bee Heatlh " + String.valueOf(i + 1) + " " + workerBees[i].getHealth()+ "%");
            panel.add(workerLabels[i]);
        }
        // get the current health of each of the current droneBees for each of the 10 instances of the droneBees
        for(int i = 0; i < droneLabels.length; i++) {
            droneLabels[i] = new JLabel("Drone Bee Heatlh " + String.valueOf(i + 1) + " " + droneBees[i].getHealth() + "%");
            panel.add(droneLabels[i]);
        }

    }


    public static void main (String [] args) {
        new GUI();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // when the button is clicked, call the damage method
        // As the value is a random value between 0 - 80
        int max = 80;
        int min = 0;
        int range = max - min;
        for(int i = 0; i < droneBees.length; i++) {
            int random = (int)(Math.random() * range) + min;
            droneBees[i].Damage(random);
            // the value will be a randomised value between 0 - 80;
        }
        for(int i = 0; i < droneBees.length; i++) {
            if (droneBees[i].isAlive() == true) {
                // if its alive get the current health only
                droneLabels[i].setText("Drone Bee Heatlh " + String.valueOf(i + 1) + " " + droneBees[i].getHealth() + "%");
            }
            else {
                // otherwise get the current health plus + dead
                droneLabels[i].setText("Drone Bee Heatlh " + String.valueOf(i + 1) + " " + String.valueOf(droneBees[i].getHealth()) + "%" + " DEAD");
            }
        }
        for(int i = 0; i < queenBees.length; i++) {
            int random = (int)(Math.random() * range) + min;
            queenBees[i].Damage(random);
        }
        for(int i = 0; i < queenBees.length; i++) {
            if (queenBees[i].isAlive() == true) {
                // if its alive get the current health only
                queenLabels[i].setText("Queen Bee Heatlh " + String.valueOf(i + 1) + " " + queenBees[i].getHealth()+ "%");
            }
            else {
                // otherwise get the current health plus + dead
                queenLabels[i].setText("Queen Bee Heatlh " + String.valueOf(i + 1) + " " + queenBees[i].getHealth() + "%" + "DEAD");
            }
        }
        for(int i = 0; i < workerBees.length; i++) {
            int random = (int)(Math.random() * range) + min;
            workerBees[i].Damage(random);
        }
        for(int i = 0; i < workerBees.length; i++) {
            if (workerBees[i].isAlive() == true) {
                // if its alive get the current health only
                workerLabels[i].setText("Worker Bee Heatlh " + String.valueOf(i + 1) + " " + workerBees[i].getHealth() + "%");
            }
            else {
                // otherwise get the current health plus + dead
                workerLabels[i].setText("Worker Bee Heatlh " + String.valueOf(i + 1) + " " + workerBees[i].getHealth() + "%" + " " + "DEAD");
            }
        }
    }


}