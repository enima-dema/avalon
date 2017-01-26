package Servlets;

import objects.Player;
import services.PlayerService;
import servicesImpl.PlayerServiceImpl;

import java.io.IOException;

/**
 * Created by Seeder on 24-Jan-17.
 */
public class Lobby extends javax.servlet.http.HttpServlet {
    PlayerService ps;

    public void init(){
        ps = PlayerServiceImpl.getInstance();
    }

    protected void doPost(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {
        String login = request.getParameter("login");
        if(ps.isPlayerValid(login)){
            ps.addPlayer(new Player(login));
            request.setAttribute("players", ps.getAllPlayers());
            request.getRequestDispatcher("lobby.jsp").forward(request, response);
        }else {
            request.setAttribute("notValid", true);
            request.getRequestDispatcher("index.jsp").forward(request, response);
        }

    }

    protected void doGet(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws javax.servlet.ServletException, IOException {

    }
}
