package objects;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class Mission {
    int playerNumber;
    int gameTurn;
    int idMission;
    boolean depart;
    boolean success;

    public Mission(int playerNumber, int gameTurn, int idMission) {
        this.playerNumber = playerNumber;
        this.gameTurn = gameTurn;
        this.idMission = idMission;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getGameTurn() {
        return gameTurn;
    }

    public void setGameTurn(int gameTurn) {
        this.gameTurn = gameTurn;
    }

    public int getIdMission() {
        return idMission;
    }

    public void setIdMission(int idMission) {
        this.idMission = idMission;
    }

    public boolean isDepart() {
        return depart;
    }

    public void setDepart(boolean depart) {
        this.depart = depart;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    @Override
    public String toString() {
        return "Mission{" +
                "playerNumber=" + playerNumber +
                ", gameTurn=" + gameTurn +
                ", idMission=" + idMission +
                ", depart=" + depart +
                ", success=" + success +
                '}';
    }
}
