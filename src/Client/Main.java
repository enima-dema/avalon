package Client;

import objects.Game;
import objects.Player;
import services.GameService;
import services.PlayerService;
import services.PowerService;
import servicesImpl.BoardServiceImpl;
import servicesImpl.GameServiceImpl;
import servicesImpl.PlayerServiceImpl;
import servicesImpl.PowerServiceImpl;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class Main {

    public static void main(String[] args){
        int qtyPlayer = 10;

        //Création de serveur
        System.out.println("CREATION SERVEUR");
        Game g = Game.getInstance(qtyPlayer);
        GameService gs = new GameServiceImpl();
        System.out.println(g.getId());

        //Assignation de la board à la game
        g.setBoard(BoardServiceImpl.getBoard());

        //Dispatch characters
        g.setDistribution(gs.dispatchChar());
        System.out.println(g.getDistribution());

        //See mission
        System.out.println(g.getBoard());

        //See what sees the good guy
        PowerService pows = new PowerServiceImpl();
        List<Player> pl = pows.getInfo(1);
        if (!pl.isEmpty()){
            System.out.println(pl);
        }else {
            System.out.println("Vous ne voyez personne.");
        }

        //See what sees the bad guy
        pows = new PowerServiceImpl();
        pl = pows.getInfo(2);
        if (!pl.isEmpty()){
            System.out.println(pl);
        }else {
            System.out.println("Vous ne voyez personne.");
        }


    }
}
