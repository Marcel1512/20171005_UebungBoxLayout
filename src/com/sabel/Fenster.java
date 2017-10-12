package com.sabel;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Fenster extends JFrame {

    private JPanel jpWest, jpSouth, jpCenter;
    private JButton jbtnRot, jbtnGruen, jbtnBlau;
    private JRadioButton jRadioButtonRot, jRadioButtonGruen, jRadioButtonBlau;


    public Fenster() {
        super("Übung Farbenspiel");
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        this.initComponents();
//        this.setSize(300, 300);
        this.pack();
        this.initEvents();
        this.setVisible(true);

    }

    private void initEvents() {
        this.jbtnRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });

        this.jbtnGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });

        this.jbtnBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blau();
            }
        });

        this.jRadioButtonRot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                red();
            }
        });

        this.jRadioButtonGruen.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                green();
            }
        });

        this.jRadioButtonBlau.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                blau();
            }
        });
    }

    private void red() {
        jpCenter.setBackground(Color.RED);
        jRadioButtonRot.setSelected(true);
    }

    private void blau() {
        jpCenter.setBackground(Color.BLUE);
        jRadioButtonBlau.setSelected(true);
    }

    private void green() {
        jpCenter.setBackground(Color.GREEN);
        jRadioButtonGruen.setSelected(true);
    }


    private void initComponents() {
        jpWest = new JPanel();
        jpWest.setLayout(new BoxLayout(jpWest, BoxLayout.Y_AXIS));
        jRadioButtonRot = new JRadioButton("Rot");
        jRadioButtonRot.setSelected(true);
        jRadioButtonGruen = new JRadioButton("Grün");
        jRadioButtonBlau = new JRadioButton("Blau");
        jpWest.add(jRadioButtonRot);
        jpWest.add(jRadioButtonBlau);
        jpWest.add(jRadioButtonGruen);
        ButtonGroup bg = new ButtonGroup();
        bg.add(jRadioButtonRot);
        bg.add(jRadioButtonBlau);
        bg.add(jRadioButtonGruen);


        jpSouth = new JPanel();
        jbtnRot = new JButton("Rot");
        jbtnBlau = new JButton("Blau");
        jbtnGruen = new JButton("Gruen");

        jpSouth.add(jbtnRot);
        jpSouth.add(jbtnBlau);
        jpSouth.add(jbtnGruen);


        jpCenter = new JPanel();
        jpCenter.setBackground(Color.RED);


        this.add(jpWest, BorderLayout.WEST);
        this.add(jpCenter, BorderLayout.CENTER);
        this.add(jpSouth, BorderLayout.SOUTH);


        this.add(jpWest, BorderLayout.WEST);
    }

    public static void main(String[] args) {
        new Fenster();
    }
}
