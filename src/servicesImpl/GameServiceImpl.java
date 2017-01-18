package servicesImpl;

import com.sun.media.jfxmedia.events.PlayerStateListener;
import objects.Board;
import objects.Characters;
import objects.Game;
import objects.Player;
import services.CharactersService;
import services.GameService;
import services.PlayerService;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class GameServiceImpl implements GameService {
    Game g;
    CharactersService cs;
    PlayerService ps;
    BoardServiceImpl bs;

    public GameServiceImpl(){
        g  = Game.getInstance(10);
        cs = new CharactersServiceImpl();
        bs = new BoardServiceImpl();
        ps = PlayerServiceImpl.getInstance();
    }

    @Override
    public Board getBoard() {
        return BoardServiceImpl.getBoard();
    }

    @Override
    public HashMap<Player, Characters> dispatchChar() {
        HashMap<Player, Characters> dispatch = new HashMap<>();
        List<Player> players = ps.getAllPlayers();
        List<Characters> chars = createCharList();
        Collections.shuffle(players);
        int qtyPlayer = g.getQtyPlayer();
        for (int i = 0; i < qtyPlayer; ++i ){
            dispatch.put(players.get(i), chars.get(i));
        }
        return dispatch;
    }

    @Override
    public List<Characters> createCharList() {
        List<Characters> characters = new ArrayList<>();
        int nbreBadGuy = g.getBoard().getQtyBadGuys();
        for (int i = 0; i < nbreBadGuy; ++i){
            characters.add(cs.getCharactersById(2));
        }
        int nbreGoodGuy = g.getQtyPlayer() - nbreBadGuy;
        for (int i = 0; i < nbreGoodGuy; ++i){
            characters.add(cs.getCharactersById(1));
        }
        return characters;
    }

    @Override
    public void displayInfo() {

    }
}
