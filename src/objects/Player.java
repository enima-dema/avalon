package objects;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class Player {
    int id;
    String login;
    int compteur = 0;

    public Player(String login) {
        id = compteur++;
        this.login = login;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id=" + id +
                ", login='" + login + '\'' +
                '}';
    }
}
