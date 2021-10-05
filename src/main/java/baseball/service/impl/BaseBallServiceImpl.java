package baseball.service.impl;

import baseball.constant.GameStatusConstant;
import baseball.service.BaseBallService;
import baseball.service.InputValidationService;
import baseball.service.JudgmentService;
import baseball.view.InputView;

public class BaseBallServiceImpl implements BaseBallService {

    private InputView inputView;
    private InputValidationService inputValidationService;
    private JudgmentService judgmentService;

    @Override
    public void run(String random) {
        inputView = new InputView();
        String input = "";
        do {
            input = inputView.input();
        }while (!baseBall(random, input));
    }

    @Override
    public boolean baseBall(String random, String input) {
        if(!validation(input)) return false;

        return judgment(random, input);
    }

    @Override
    public boolean reRun() {
        inputView = new InputView();
        String input = "";
        do {
            input = inputView.reStart();
        }while (!reRunValidation(input));

        return rsRunJudgment(input);
    }

    @Override
    public boolean validation(String inputNumber) {
        inputValidationService = new InputValidationServiceImpl();
        return inputValidationService.inputValidation(inputNumber);
    }

    @Override
    public boolean reRunValidation(String inputNumber) {
        inputValidationService = new InputValidationServiceImpl();
        return inputValidationService.reStartValidate(inputNumber);
    }

    @Override
    public boolean judgment(String random, String inputNumber) {
        judgmentService = new JudgmentServiceImpl();
        return judgmentService.judgment(random, inputNumber);
    }

    @Override
    public boolean rsRunJudgment(String inputNumber) {
        if(inputNumber.equals(GameStatusConstant.PLAY)){
            return true;
        }

        return false;
    }
}
