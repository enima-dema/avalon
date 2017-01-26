package servicesImpl;

import objects.Player;
import services.PlayerService;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class PlayerServiceImpl implements PlayerService {
    //TEST DATA
    List<Player> players = new ArrayList<Player>();
    private static PlayerServiceImpl ps;
    int counter = 0;

    private PlayerServiceImpl() {
        //FOR TESTING
        addPlayer(new Player("Amine"));
        addPlayer(new Player("Samy"));
        addPlayer(new Player("Adrien"));
        addPlayer(new Player("Laurence"));
        addPlayer(new Player("Robin"));
        /*ps.addPlayer(new Player("Eric"));
        ps.addPlayer(new Player("Bob"));
        ps.addPlayer(new Player("Safia"));
        ps.addPlayer(new Player("Aziz"));
        ps.addPlayer(new Player("Nicolas"));*/
    }

    public static PlayerServiceImpl getInstance() {
        if (ps == null) {
            ps = new PlayerServiceImpl();
        }
        return ps;
    }


    @Override
    public boolean addPlayer(Player player) {
        try {
            player.setId(++counter);
            players.add(player);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean removePlayer(int id) {
        try {
            for (int i = 0; i < players.size(); ++i) {
                if (id == players.get(i).getId()) {
                    players.remove(i);
                    return true;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public List<Player> getAllPlayers() {
        return players;
    }

    @Override
    public boolean isPlayerValid(String login) {
        for (Player player : players){
            if (player.getLogin().equals(login)){
                return false;
            }
        }
        return true;
    }

    @Override
    public boolean voterDemo(int missionId) {
        return false;
    }

    @Override
    public boolean voterMission() {
        return false;
    }
}
