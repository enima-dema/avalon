package services;

import objects.Board;
import objects.Characters;
import objects.Player;

import java.util.HashMap;
import java.util.List;

/**
 * Created by Human Booster on 18/01/2017.
 */
public interface GameService {

    public Board getBoard();
    public HashMap<Player, Characters> dispatchChar();
    public List<Characters> createCharList();
    public void displayInfo();

}
