package baseball.service.impl;

import baseball.constant.InputDefinitionConstant;
import baseball.service.JudgmentService;
import baseball.view.OutputView;

public class JudgmentServiceImpl implements JudgmentService {

    private OutputView outputView;
    private int countStrike;
    private int countBall;

    public JudgmentServiceImpl(){
        countStrike = 0;
        countBall = 0;
    }

    @Override
    public boolean judgment(String random, String inputNumber) {
        String[] splitNumber = inputNumber.split("");

        for (int i = 0; i < splitNumber.length; i++) {
            isStrike(random.split("")[i], splitNumber[i]);
            isBall(random, splitNumber[i], i);
        }

        return validateGame();
    }

    @Override
    public void isStrike(String random, String input) {
        if (random.equals(input)) {
            countStrike++;
        }
    }

    @Override
    public void isBall(String random, String input, int i) {
        if (random.contains(input) && random.indexOf(input) != i) {
            countBall++;
        }
    }

    @Override
    public boolean validateGame() {
        if(validateEndGame()) return true;

        resultMsg();

        return false;
    }

    @Override
    public boolean validateEndGame() {
        if(countStrike == InputDefinitionConstant.NUM_SIZE) {
            outputView = new OutputView();
            outputView.strikeMsg(countStrike);
            outputView.endMsg();

            return true;
        }

        return false;
    }

    @Override
    public void resultMsg() {
        nothingMsg();
        strikeMsg();
        ballMsg();
        strikeAndBallMsg();
    }

    @Override
    public void nothingMsg(){
        if(countStrike == 0 && countBall == 0){
            outputView = new OutputView();
            outputView.nothingMsg();
        }
    }

    @Override
    public void strikeMsg(){
        if(countStrike > 0 && countBall == 0){
            outputView = new OutputView();
            outputView.strikeMsg(countStrike);
        }
    }

    @Override
    public void ballMsg(){
        if(countBall > 0 && countStrike == 0){
            outputView = new OutputView();
            outputView.ballMsg(countBall);
        }
    }

    @Override
    public void strikeAndBallMsg(){
        if(countBall > 0 && countStrike > 0){
            outputView = new OutputView();
            outputView.strikeAndBallMsg(countStrike, countBall);
        }
    }
}

