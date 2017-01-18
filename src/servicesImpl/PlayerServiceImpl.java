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

    private PlayerServiceImpl() {
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
    public boolean voterDemo(int missionId) {
        return false;
    }

    @Override
    public boolean voterMission() {
        return false;
    }
}
