package objects;

public class BigCoins extends Coins implements Element{


    public BigCoins(int x, int y) {
        super(x, y);
    }

    @Override
    public int getValue() {
        this.value = 50;
        return value;
    }

    @Override
    public void setPoint(int x, int y) {
        this.point.x = x;
        this.point.y = y;
    }
}
