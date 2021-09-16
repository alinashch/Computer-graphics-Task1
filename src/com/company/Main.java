package com.company;

import javax.swing.*;

public class Main extends JFrame{
    public Main(){
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setSize(800,800);
        setLocation(400,0);
        setVisible(true);
        add(new Graph());
    }
    public static void main(String[] args) {
        Main main=new Main();
    }
}
