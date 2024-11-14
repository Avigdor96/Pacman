package objects;

import javax.swing.*;
import java.awt.*;

public class Ghost extends GeneralElement implements Eatable, Speed {
    private int value = 200;
    private double speed;
    protected ImageIcon image;
    protected Point point;


    public Ghost(int x, int y) {
        point.x = x;
        point.y = y;
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
class PinkGhost extends Ghost{

    public PinkGhost(int x, int y){
        super(x ,y);
        image = new ImageIcon("src/pictures/GhostPink.jpg");
    }
}

class YellowGhost extends Ghost{

    public YellowGhost(int x, int y){
        super(x, y);
        image = new ImageIcon("src/pictures/GhostYellow.jpg");
    }
}

class GreenGhost extends Ghost{

    public GreenGhost(int x, int y){
        super(x, y);
        image = new ImageIcon("src/pictures/GhostGreen.jpg");
    }
}

class BlueGhost extends Ghost{

    public BlueGhost(int x, int y){
        super(x, y);
        image = new ImageIcon("src/pictures/GhostBlue.jpg");
    }
}

