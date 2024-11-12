package objects;

import javax.swing.*;
import java.awt.*;

public class Pacman extends GeneralElement implements Speed {
    private double speed;
    private int life = 3;

    public Pacman(int x, int y) {
        setPoint(x, y);
    }

    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public void setPoint(int x, int y) {
        this.point.x = x;
        this.point.y = y;
    }


    @Override
    public boolean isEaten() {
        return isEaten;
    }

    @Override
    public Image getImage() {
        ImageIcon imagePacman = new ImageIcon("pacmanPicture.jpg");
        return imagePacman.getImage();
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public double getSpeed() {
        return speed;
    }
}