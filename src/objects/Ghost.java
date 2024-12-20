package objects;

import javax.swing.*;
import java.awt.*;

public class Ghost extends GeneralElement implements Eatable, Speed {
    private int value = 200;
    private double speed;
    private ImageIcon image;


    public Ghost(ImageIcon image) {
        this.image = image;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public Point getPoint() {
        return null;
    }

    @Override
    public void setPoint(int x, int y) {
        this.point.x = x;
        this.point.y = y;
    }


    @Override
    public boolean isEaten() {
        return false;
    }

    @Override
    public Image getImage() {
        return image.getImage();
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
