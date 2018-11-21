package pattern.flyweight;

public class Chess {
    private String color;
    private int size;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public Chess(String color) {
        this.color = color;
    }

    public Chess() {
    }

    public void ahead(Coordinate c) {//下棋
        String convertColor = "";
        if (this.color.equalsIgnoreCase(ChessColor.WHITE.getColor())) {
            convertColor = "白";
        }
        if (this.color.equalsIgnoreCase(ChessColor.BLACK.getColor())) {
            convertColor = "黑";
        }
        System.out.println(convertColor + "子走到了第" + c.getX() + "列，第" + c.getY() + "行的位置");
    }
}
