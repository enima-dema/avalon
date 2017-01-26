package services;

import objects.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Human Booster on 18/01/2017.
 */
public interface PlayerService {

    public boolean addPlayer(Player player);

    public boolean removePlayer(int id);

    public List<Player> getAllPlayers();

    public boolean isPlayerValid(String login);

    public boolean voterDemo(int missionId);

    public boolean voterMission();
}
