package pattern.flyweight;

import java.util.Enumeration;

public enum ChessColor {
    RED("red"),
    BLACK("black"),
    WHITE("white"),;
    private String color;
    ChessColor(String color){
        this.color=color;
    }
    public String getColor(){
        return this.color;
    }
    public static ChessColor getColorEnum(String color){
        ChessColor cc[]=ChessColor.values();
        for(ChessColor chess:cc){
            if(chess.color==color){
                return chess;
            }
        }
        return null;
    }
}
