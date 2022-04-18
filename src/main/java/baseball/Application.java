package baseball;

import baseball.constant.GameStatus;
import baseball.controller.BaseBallController;

public class Application {
    public static void main(String[] args) {
        BaseBallController baseBallController = new BaseBallController();
        do {
            baseBallController.gameStart();
        } while ( GameStatus.RESTART.equals( baseBallController.gameCheckRestart()) );
    }
}
