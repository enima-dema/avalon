package objects;

import servicesImpl.BoardServiceImpl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class Game {
    int id = 0;
    int qtyPlayer;
    int pNumber = 0;
    Board board;
    List<Player> players;
    List<Characters> characters;
    List<Mission> missions;
    Map<Player, Characters> distribution;
    int nbreTour = 0;

    BoardServiceImpl bs = new BoardServiceImpl();

    private static Game game;

    private Game(int qtyPlayer) {
        ++id;
        this.qtyPlayer = qtyPlayer;
        players = new ArrayList<>();
        characters = new ArrayList<>();
        missions = new ArrayList<>();
        distribution = new HashMap<>();
        nbreTour++;
    }

    public static Game getInstance(int qtyPlayer){
        if (game == null){
            game = new Game(qtyPlayer);
        }
        return game;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQtyPlayer() {
        return qtyPlayer;
    }

    public void setQtyPlayer(int qtyPlayer) {
        this.qtyPlayer = qtyPlayer;
    }

    public int getpNumber() {
        return pNumber;
    }

    public void setpNumber(int pNumber) {
        this.pNumber = pNumber;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    public List<Mission> getMissions() {
        return missions;
    }

    public void setMissions(List<Mission> missions) {
        this.missions = missions;
    }

    public Map<Player, Characters> getDistribution() {
        return distribution;
    }

    public void setDistribution(Map<Player, Characters> distribution) {
        this.distribution = distribution;
    }

    public int getNbreTour() {
        return nbreTour;
    }

    public void setNbreTour(int nbreTour) {
        this.nbreTour = nbreTour;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    @Override
    public String toString() {
        return "Game{" +
                "id=" + id +
                ", qtyPlayer=" + qtyPlayer +
                ", pNumber=" + pNumber +
                ", players=" + players +
                ", missions=" + missions +
                ", distribution=" + distribution +
                ", nbreTour=" + nbreTour +
                '}';
    }
}
