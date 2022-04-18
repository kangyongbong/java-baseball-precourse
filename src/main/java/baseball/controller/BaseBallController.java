package baseball.controller;

import baseball.constant.GameStatus;
import baseball.model.Result;
import baseball.service.BaseBallService;
import baseball.service.impl.BaseBallServiceImpl;
import baseball.view.InputView;
import baseball.view.OutputView;

public class BaseBallController {

    private BaseBallService baseBallService;
    private InputView inputView;
    private OutputView outputView;

    public BaseBallController(){
        inputView = new InputView();
        outputView = new OutputView();
    }

    public Result gameStart() {
        String inputNumber = inputView.inputNumber();
        baseBallService = new BaseBallServiceImpl();
        Result result = baseBallService.baseBall(inputNumber);
        outputView.outputResult(result);

        return result;
    }

    public GameStatus gameCheckRestart(Result result) {
        baseBallService = new BaseBallServiceImpl();

        if (result.getCntStrike() != 3) {
            return GameStatus.RESTART;
        }

        outputView.outputEnd();
        String inputRestart = inputView.inputRestart();
        return baseBallService.restartCheck(inputRestart);
    }
}
