package pattern.flyweight;

public class Coordinate {
    private int x;
    private int y;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Coordinate(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Coordinate() {
    }

    private void checkCoordinateRange(int x, int y) {
        if (x <= 0 || x > 19 || y <= 0 || y > 19) {
            try {
                throw new LocationOutOfBoundException("你要下的位置超出了棋盘");
            } catch (LocationOutOfBoundException e) {
                e.printStackTrace();
            }
        }
    }
}
