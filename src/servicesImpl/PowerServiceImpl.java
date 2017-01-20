package servicesImpl;

import objects.Characters;
import objects.Game;
import objects.Player;
import services.CharactersService;
import services.PlayerService;
import services.PowerService;

import java.util.*;

import static servicesImpl.BoardServiceImpl.g;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class PowerServiceImpl implements PowerService{
    Map<Characters, List<Characters>> rules;
    CharactersService cs;
    PlayerService ps;
    Game g;
    public PowerServiceImpl(){
        //TEST
        rules = new HashMap<>();
        cs = new CharactersServiceImpl();
        ps = PlayerServiceImpl.getInstance();
        g = Game.getInstance(10);

        //Rule for BBG
        List<Characters> bbg = new ArrayList<>();
        bbg.add(cs.getCharactersById(2));
        rules.put(cs.getCharactersById(2),bbg);
    }

    public List<Player> getInfo(int idChar){
        List<Characters> x = rules.get(cs.getCharactersById(idChar));
        Map<Player, Characters> distribution = g.getDistribution();
        List<Player> revealed = new ArrayList<>();
        System.out.println(distribution);
        for (int i =0; i < x.size(); ++i){
            for (Map.Entry entry : distribution.entrySet()) {
                Characters c = (Characters) entry.getValue();
               if (c.getId() == x.get(i).getId()){
                   Player p = (Player) entry.getKey();
                   revealed.add(p);
               }
            }
        }
        return revealed;
    }



}
