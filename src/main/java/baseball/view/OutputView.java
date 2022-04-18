package baseball.view;

import baseball.constant.ErrorMessage;
import baseball.constant.StateMessage;
import baseball.constant.ViewMessage;
import baseball.model.Result;

public class OutputView {

    public void outputResult(Result result) {
        if (result.getCntNothing() > 0) {
            outputNothing();
            return;
        }

        System.out.println(outputBallStrikeCnt(result));
    }

    public String outputBallStrikeCnt(Result result) {
        return outputBallCount(result) + outputStrikeCount(result);
    }

    public String outputBallCount(Result result) {
        if (result.getCntBall() > 0) {
            return result.getCntBall() + StateMessage.BALL.getMessage();
        }

        return "";
    }

    public String outputStrikeCount(Result result) {
        if (result.getCntStrike() > 0) {
            return result.getCntStrike() + StateMessage.STRIKE.getMessage();
        }

        return "";
    }

    public void outputNothing(){
        System.out.println(StateMessage.NOTHING.getMessage());
    }

    public void outputEnd() {
        System.out.println(ViewMessage.RESULT_END.getMessage());
    }

    public void outputError(ErrorMessage errorMessage) {
        System.out.println(errorMessage.getMessage());
    }
}
