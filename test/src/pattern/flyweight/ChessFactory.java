package pattern.flyweight;

import java.util.HashMap;
import java.util.Map;

public class ChessFactory {
    private Map<String, Chess> chessMap = new HashMap<>();

    public Chess getChess(String color) {
        Chess target = null;
        ChessColor chessColor=ChessColor.getColorEnum(color);
        if(null==chessColor){
            return null;
        }
        if (null == chessMap.get(color)) {
            target = new Chess(color);
            chessMap.put(color, target);
        } else {
            target = chessMap.get(color);
        }
        return target;
    }
}
