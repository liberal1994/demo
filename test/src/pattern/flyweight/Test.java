package pattern.flyweight;

public class Test {
    public static void main(String[] args) {
        ChessFactory chessFactory=new ChessFactory();
        Chess chess1=chessFactory.getChess("white");
        chess1.ahead(new Coordinate(5,5));
        Chess chess2=chessFactory.getChess("black");
        chess2.ahead(new Coordinate(4,4));

    }
}
