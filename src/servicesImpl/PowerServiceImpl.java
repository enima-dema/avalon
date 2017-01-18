package servicesImpl;

import objects.Characters;
import objects.Player;
import services.CharactersService;
import services.PlayerService;
import services.PowerService;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class PowerServiceImpl implements PowerService{
    Map<Characters, List<Characters>> rules;
    CharactersService cs;
    PlayerService ps;
    public PowerServiceImpl(){
        //TEST
        rules = new HashMap<>();
        cs = new CharactersServiceImpl();
        ps = PlayerServiceImpl.getInstance();

        //Rule for BBG
        List<Characters> bbg = new ArrayList<>();
        bbg.add(cs.getCharactersById(2));
        rules.put(cs.getCharactersById(2),bbg);
    }

    public List<Player> getInfo(int idChar){
        List<Characters> x = rules.get(cs.getCharactersById(idChar));
        //Iterate on the hashmap
        List<Player> p = ps.getAllPlayers();
        for (int i =0; i < x.size(); ++i){
            for (int y = 0; y < p.size(); ++y){

            }
        }
    }



}
