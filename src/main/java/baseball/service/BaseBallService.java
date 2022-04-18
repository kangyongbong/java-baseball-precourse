package baseball.service;

import baseball.constant.GameStatus;
import baseball.model.RandomNumber;
import baseball.model.Result;

public interface BaseBallService {

    public Result baseBall(String inputNumber);

    public GameStatus restartCheck(String inputRestart);

    public void makeRandom(RandomNumber randomNumber);
}
