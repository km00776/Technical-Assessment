package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener  {

    private JLabel label;


    public GUI() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JButton button = new JButton("Click me");
        button.addActionListener(this);
        panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
        panel.setLayout(new GridLayout(0, 1));
        panel.add(button);
        panel.add(label);
        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Bee Application GUI");
        frame.pack();
        frame.setVisible(true);
    }


    public static void main (String [] args) {
        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int random = (int) (Math.random() * 80);

    }
}
