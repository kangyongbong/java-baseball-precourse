package baseball.view;

import baseball.constant.GameMessageConstant;
import nextstep.utils.Console;

public class InputView {

    public String input(){
        System.out.print(GameMessageConstant.INPUT_MSG);
        return Console.readLine();
    }

    public String reStart(){
        System.out.print(GameMessageConstant.CONTINUE_MSG);
        return Console.readLine();
    }
}
