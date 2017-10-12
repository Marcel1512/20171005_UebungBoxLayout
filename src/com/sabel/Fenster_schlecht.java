package com.sabel;

import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.security.PrivateKey;

public class Fenster_schlecht extends JFrame {

    private JPanel jPanelSouth;
    private JButton jbRed;
    private JButton jbGreen;
    private JButton jbBlau;

    private JPanel jPanelWest;
    private JRadioButton jbr1;
    private JRadioButton jbr2;
    private JRadioButton jbr3;

    private JPanel jPanelCenter;

    private ButtonGroup group;


    public Fenster_schlecht() {
        super("UebungLayout");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(300, 300);
        this.initEvents();
        this.initComponents();
        this.setVisible(true);
    }

    private void initEvents() {
    }

    private void initComponents() {
        jPanelSouth = new JPanel();
        jbRed = new JButton("Rot");
        jbGreen = new JButton("Grün");
        jbBlau = new JButton("Blau");

        jPanelSouth.add(jbBlau).setBackground(Color.BLUE);
        jPanelSouth.add(jbGreen).setBackground(Color.GREEN);
        jPanelSouth.add(jbRed).setBackground(Color.RED);

         jbr1 = new JRadioButton("Rot", true);
         jbr2 = new JRadioButton("Blau");
         jbr3 = new JRadioButton("Grün");


        group = new ButtonGroup();
        group.add(jbr1);
        group.add(jbr2);
        group.add(jbr3);

        jPanelWest = new JPanel();
        jPanelWest.add(jbr1);
        jPanelWest.add(jbr2);
        jPanelWest.add(jbr3);


        this.add(jPanelWest, BorderLayout.WEST);
        this.add(jPanelSouth, BorderLayout.SOUTH);
        this.add(jPanelCenter);



        jPanelCenter = new JPanel();




    }

}
