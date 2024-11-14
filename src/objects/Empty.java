package objects;

import javax.swing.*;
import java.awt.*;

public class Empty extends GeneralElement{

    public Empty(int x, int y) {
        point.x = x;
        point.y = y;
        image = new ImageIcon("src/pictures/SquareWhite.jpg");
    }

    @Override
    public Point getPoint() {
        return point;
    }

    @Override
    public void setPoint(int x, int y) {
        point.x =x;
        point.y = y;
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
