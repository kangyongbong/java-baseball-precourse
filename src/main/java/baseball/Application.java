package baseball;

import baseball.constant.GameStatus;
import baseball.controller.BaseBallController;
import baseball.model.Result;

public class Application {
    public static void main(String[] args) {
        BaseBallController baseBallController = new BaseBallController();
        Result result;
        do {
            result = baseBallController.gameStart();
        } while ( GameStatus.RESTART.equals( baseBallController.gameCheckRestart(result)) );
    }
}
