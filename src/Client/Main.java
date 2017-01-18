package Client;

import objects.Game;
import objects.Player;
import services.GameService;
import services.PlayerService;
import servicesImpl.BoardServiceImpl;
import servicesImpl.GameServiceImpl;
import servicesImpl.PlayerServiceImpl;

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

        //Ajout utilisateur for testing
        PlayerService ps = PlayerServiceImpl.getInstance();
        ps.addPlayer(new Player("Amine"));
        ps.addPlayer(new Player("Samy"));
        ps.addPlayer(new Player("Adrien"));
        ps.addPlayer(new Player("Laurence"));
        ps.addPlayer(new Player("Robin"));
        ps.addPlayer(new Player("Eric"));
        ps.addPlayer(new Player("Bob"));
        ps.addPlayer(new Player("Safia"));
        ps.addPlayer(new Player("Aziz"));
        ps.addPlayer(new Player("Nicolas"));

        //Dispatch characters
        g.setDistribution(gs.dispatchChar());
        System.out.println(g.getDistribution());

        //See mission
        System.out.println(g.getBoard());


    }
}
