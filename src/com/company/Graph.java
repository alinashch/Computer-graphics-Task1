package com.company;

import javax.swing.*;
import java.awt.*;

public class Graph extends JPanel {
    @Override
    protected void paintComponent(Graphics g) {
        setBackground(Color.black);
        super.paintComponent(g);
        g.setColor(Color.RED);
        g.fillRect(0,0,250,300);
        g.setColor(Color.yellow);
        g.fillOval(400,100,300,400);
        g.setColor(Color.CYAN);
        g.drawLine(100,100,750,750);
        g.setColor(Color.green);
        g.drawLine(100,700,100,700);
    }
}
