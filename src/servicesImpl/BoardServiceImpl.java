package servicesImpl;

import objects.Board;
import objects.Game;

import java.util.ArrayList;
import java.util.List;

/**
 * Classe dont la majortié du code sera remplacé par de la database
 */
public class BoardServiceImpl{

    static List<Board> boards= new ArrayList<Board>();
    static Game g = Game.getInstance(10);

    public BoardServiceImpl() {
        //TEST DATA
        Board five = new Board(5,2,2,3,2,3,3, false);
        Board six = new Board(6, 2,2,3,4,3,4, false);
        Board seven = new Board(7,3,2,3,3,4,4, true);
        Board eight = new Board(8,3,3,4,4,5,5, true);
        Board nine = new Board(9,3,3,4,4,5,5, true);
        Board ten = new Board(10,4,3,4,4,5,5, true);
        boards.add(five);
        boards.add(six);
        boards.add(seven);
        boards.add(eight);
        boards.add(nine);
        boards.add(ten);
    }

    public static Board getBoard(){
        for (int i = 0; i < boards.size(); ++i){
            if (boards.get(i).getPlayerNumber() == g.getQtyPlayer()){
                return boards.get(i);
            }
        }
        return null;
    }
}
