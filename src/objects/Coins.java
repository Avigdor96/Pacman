package objects;

import javax.swing.*;
import java.awt.*;

public class Coins extends GeneralElement implements Eatable {
    protected int value;

    public Coins(int x, int y) {
        point.x = x;
        point.y = y;
        value = 30;
        image = new ImageIcon("src/pictures/coinPicture.jpg");
    }

    @Override
    public int getValue() {
        return value;
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


}
