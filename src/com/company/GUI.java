package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener  {

    private JLabel label;
    private Worker [] workerBees = new Worker[11];
    private Queen [] queenBees = new Queen[11];
    private Drone [] droneBees = new Drone[11];
    private JLabel [] queenLabels = new JLabel[queenBees.length];
    private JLabel [] workerLabels = new JLabel[workerBees.length];
    private JLabel [] droneLabels = new JLabel[droneBees.length];

    public GUI() {

        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);

//        panel.add(label);


        for(int i = 0; i < workerBees.length; i++) {
           workerBees[i] = new Worker(100);
        }
        for(int i = 0; i < queenBees.length; i++) {
            workerBees[i] = new Worker(100);
        }
        for(int i = 0; i < droneBees.length; i++) {
            workerBees[i] = new Worker(100);
        }



        frame.add(panel, BorderLayout.CENTER);
//        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.setTitle("Bee Application GUI");
//        frame.pack();
        frame.setVisible(true);
    }


    public static void main (String [] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < workerBees.length; i++) {
                workerBees[i].Damage((int) Math.random() * 80);
                workerBees[i].getHealth();
        }

    }
}
