package testMove;

import Graphic.GameFrame;

import javax.swing.*;
import java.awt.*;

public class MyPanel extends JPanel implements Runnable {
    private int x = 100;
    private int y = 100;
    private final int size = 50;

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.setColor(Color.GREEN);
        g.fillRect(x,y,size,size);
    }

    public void move(int dx, int dy){
        x += dx;
        y += dy;
        repaint();
    }


    @Override
    public void run() {

    }
}
