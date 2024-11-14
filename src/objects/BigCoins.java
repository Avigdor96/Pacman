package objects;

import javax.swing.*;
import java.awt.*;

public class BigCoins extends Coins implements Element{


    public BigCoins(int x, int y) {
        super(x, y);
        this.value = 50;
        image = new ImageIcon("src/pictures/BigCoinPicture.jpeg");
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setPoint(int x, int y) {
        this.point.x = x;
        this.point.y = y;
    }

}
