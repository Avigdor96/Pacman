package objects;

import javax.swing.*;
import java.awt.*;

public class Pacman extends GeneralElement implements Speed {
    private double speed;
    private int life = 3;
    private int score = 0;


    public Pacman(int x, int y) {
        point.x = x;
        point.y = y;
        image = new ImageIcon("src/pictures/pacmanToLeft.jpg");
        score = 0;
        width = 23;
        height = 23;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setImagePacman(ImageIcon imagePacman) {
        this.image = imagePacman;
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
        return this.image.getImage();
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
