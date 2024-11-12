package objects;

import java.awt.*;

public interface Element {
    public Point getPoint();
    public void setPoint(int x, int y);
    public boolean isEaten();
    public Image getImage();
    public int getWidth();
    public int getHeight();

}
