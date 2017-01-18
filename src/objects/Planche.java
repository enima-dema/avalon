package objects;

/**
 * Created by Human Booster on 18/01/2017.
 */
public class Planche {
    int playerNumber;
    int firstMission;
    int secondMission;
    int thirdMission;
    int fourthMission;
    int fifthMission;
    boolean twoFails;

    public Planche(int playerNumber, int firstMission, int secondMission, int thirdMission, int fourthMission, int fifthMission, boolean twoFails) {
        this.playerNumber = playerNumber;
        this.firstMission = firstMission;
        this.secondMission = secondMission;
        this.thirdMission = thirdMission;
        this.fourthMission = fourthMission;
        this.fifthMission = fifthMission;
        this.twoFails = twoFails;
    }

    public int getPlayerNumber() {
        return playerNumber;
    }

    public void setPlayerNumber(int playerNumber) {
        this.playerNumber = playerNumber;
    }

    public int getFirstMission() {
        return firstMission;
    }

    public void setFirstMission(int firstMission) {
        this.firstMission = firstMission;
    }

    public int getSecondMission() {
        return secondMission;
    }

    public void setSecondMission(int secondMission) {
        this.secondMission = secondMission;
    }

    public int getThirdMission() {
        return thirdMission;
    }

    public void setThirdMission(int thirdMission) {
        this.thirdMission = thirdMission;
    }

    public int getFourthMission() {
        return fourthMission;
    }

    public void setFourthMission(int fourthMission) {
        this.fourthMission = fourthMission;
    }

    public int getFifthMission() {
        return fifthMission;
    }

    public void setFifthMission(int fifthMission) {
        this.fifthMission = fifthMission;
    }

    public boolean isTwoFails() {
        return twoFails;
    }

    public void setTwoFails(boolean twoFails) {
        this.twoFails = twoFails;
    }

    @Override
    public String toString() {
        return "Planche{" +
                "playerNumber=" + playerNumber +
                ", firstMission=" + firstMission +
                ", secondMission=" + secondMission +
                ", thirdMission=" + thirdMission +
                ", fourthMission=" + fourthMission +
                ", fifthMission=" + fifthMission +
                ", twoFails=" + twoFails +
                '}';
    }
}
