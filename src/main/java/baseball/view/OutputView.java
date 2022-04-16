package baseball.view;

import baseball.constant.StateMessage;
import baseball.constant.ViewMessage;

public class OutputView {


    public void outputBallCount(int ballCount) {
        System.out.println(ballCount + StateMessage.BALL.getMessage());
    }

    public void outputStrikeCount(int strikeCount) {
        System.out.println(strikeCount + StateMessage.STRIKE.getMessage());
    }

    public void outputNothing(){
        System.out.println(StateMessage.NOTHING.getMessage());
    }

    public void outputResult() {
        System.out.println(ViewMessage.RESULT_END.getMessage());
    }
}
