package baseball.model;

import java.util.Collections;
import java.util.List;

public class UserNumber {

    private List<Integer> gameNum;
    private int restartNum;

    public List<Integer> getGameNum() {
        return gameNum;
    }

    public void setGameNum(List<Integer> gameNum) {
        this.gameNum = gameNum;
    }

    public int getRestartNum() {
        return restartNum;
    }

    public void setRestartNum(int restartNum) {
        this.restartNum = restartNum;
    }
}
