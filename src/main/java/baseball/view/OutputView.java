package baseball.view;

import baseball.constant.ErrorMessageConstant;
import baseball.constant.GameMessageConstant;

public class OutputView {

    public void strikeMsg(int strike) {
        System.out.println(strike + GameMessageConstant.STRIKE_MSG);
    }

    public void ballMsg(int ball) {
        System.out.println(ball + GameMessageConstant.BALL_MSG);
    }

    public void nothingMsg() {
        System.out.println(GameMessageConstant.NOTHING_MSG);
    }

    public void strikeAndBallMsg(int strike, int ball) {
        System.out.println(strike + GameMessageConstant.STRIKE_MSG + " " +ball + GameMessageConstant.BALL_MSG);
    }

    public void endMsg(){
        System.out.println(GameMessageConstant.RESULT_MSG);
    }

    public void continueErrorMsg() {
        System.out.println(ErrorMessageConstant.CONTINUE_ERROR_MSG);
    }

    public void numberSizeErrorMsg() {
        System.out.println(ErrorMessageConstant.NUM_ERROR_MSG);
    }

    public void regErrorMsg() {
        System.out.println(ErrorMessageConstant.CHAR_ERROR_MSG);
    }

    public void emptyErrorMsg() {
        System.out.println(ErrorMessageConstant.EMPTY_ERROR_MSG);
    }
}
