package baseball.model;

public class UserNumber {

    private int gameNum;
    private int restartNum;

    public int getGameNum() {
        return gameNum;
    }

    public void setGameNum(String gameNum) {
        this.gameNum = Integer.parseInt(gameNum);
    }

    public int getRestartNum() {
        return restartNum;
    }

    public void setRestartNum(int restartNum) {
        this.restartNum = restartNum;
    }
}
