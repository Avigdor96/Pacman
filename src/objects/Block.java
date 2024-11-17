package objects;

import javax.swing.*;
import java.awt.*;

public class Block extends GeneralElement {


    public Block(int x, int y) {
        image = new ImageIcon("src/pictures/SquareBlue.jpg");
        setPoint(x, y);
    }




    public void paintBlock(Graphics g){
        g.setColor(Color.BLUE);
        g.fillOval(point.x, point.y, width, height);
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
    public int getHeight()eG {
        return height;
    }



}


