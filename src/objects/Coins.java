package objects;

import java.awt.*;

public class Coins extends GeneralElement implements Eatable {
    protected int value;

    public Coins(int x, int y) {
        setPoint(x, y);
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
        return null;
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
