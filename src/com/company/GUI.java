package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener  {

    private Worker [] workerBees = new Worker[10];
    private Queen [] queenBees = new Queen[10];
    private Drone [] droneBees = new Drone[10];
    private JLabel [] queenLabels = new JLabel[queenBees.length];
    private JLabel [] workerLabels = new JLabel[workerBees.length];
    private JLabel [] droneLabels = new JLabel[droneBees.length];
    private JPanel panel;
    private JButton button1;

    public GUI() {
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

        for(int i = 0; i < workerBees.length; i++) {
            workerBees[i] = new Worker(100, true);
        }
        for(int i = 0; i < queenBees.length; i++) {
            queenBees[i] = new Queen(100, true);
        }
        for(int i = 0; i < droneBees.length; i++) {
            droneBees[i] = new Drone(100, true);
        }
        for(int i = 0; i < queenLabels.length; i++) {
            queenLabels[i] = new JLabel("Queen Bee Heatlh " + String.valueOf(i + 1) + " " + queenBees[i].getHealth());
            panel.add(queenLabels[i]);
        }
        for(int i = 0; i < workerLabels.length; i++) {
            workerLabels[i] = new JLabel("Worker Bee Heatlh " + String.valueOf(i + 1) + " " + workerBees[i].getHealth());
            panel.add(workerLabels[i]);
        }
        for(int i = 0; i < droneLabels.length; i++) {
            droneLabels[i] = new JLabel("Drone Bee Heatlh " + String.valueOf(i + 1) + " " + droneBees[i].getHealth());
            panel.add(droneLabels[i]);
        }

    }


    public static void main (String [] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int max = 80;
        int min = 0;
        int range = max - min;
        for(int i = 0; i < droneBees.length; i++) {
            int random = (int)(Math.random() * range) + min;
            droneBees[i].Damage(random);
        }
        for(int i = 0; i < droneBees.length; i++) {
            if (droneBees[i].isAlive() == true) {
                droneLabels[i].setText("Drone Bee Heatlh " + String.valueOf(i + 1) + " " + droneBees[i].getHealth());
            }
            else {
                droneLabels[i].setText("Drone Bee Heatlh " + String.valueOf(i + 1) + " " + String.valueOf(droneBees[i].getHealth()) + " DEAD");
            }
        }
        for(int i = 0; i < queenBees.length; i++) {
            int random = (int)(Math.random() * range) + min;
            queenBees[i].Damage(random);
        }
        for(int i = 0; i < queenBees.length; i++) {
            if (queenBees[i].isAlive() == true) {
                 queenLabels[i].setText("Queen Bee Heatlh " + String.valueOf(i + 1) + " " + queenBees[i].getHealth());
            }
            else {
                queenLabels[i].setText("Queen Bee Heatlh " + String.valueOf(i + 1) + " " + queenBees[i].getHealth() + " DEAD");
            }
        }
        for(int i = 0; i < workerBees.length; i++) {
            int random = (int)(Math.random() * range) + min;
            workerBees[i].Damage(random);
        }
        for(int i = 0; i < workerBees.length; i++) {
            if (workerBees[i].isAlive() == true) {
                workerLabels[i].setText("Worker Bee Heatlh " + String.valueOf(i + 1) + " " + workerBees[i].getHealth());
            }
            else {
                workerLabels[i].setText("Worker Bee Heatlh " + String.valueOf(i + 1) + " " + workerBees[i].getHealth() + " DEAD");
            }
        }
    }


}