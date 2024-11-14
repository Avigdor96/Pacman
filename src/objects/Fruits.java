package objects;

import javax.swing.*;
import java.awt.*;

public class Fruits extends GeneralElement implements Eatable {
    private int value = 200;

    public Fruits(int x, int y) {
       point.x = x;
       point.y = y;
       image = new ImageIcon("src/pictures/Cherry.jpg");
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
        return true;
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
    public int getValue() {
        return value;
    }


}
